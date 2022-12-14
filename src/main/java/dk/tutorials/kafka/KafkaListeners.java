package dk.tutorials.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "myTopic", groupId = "groupID")
    void listener(String data) {
        System.out.println("Listener received: " + data + " ☺.");
    }
}
