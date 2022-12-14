package dk.tutorials.kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaWithREST {

    public static void main(String[] args) {
        SpringApplication.run(KafkaWithREST.class, args);
    }

    // change later to REST-full
    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            for (int i = 0; i < 100; i++) {
                kafkaTemplate.send("myTopic", "message");
            }
        };
    }

}
