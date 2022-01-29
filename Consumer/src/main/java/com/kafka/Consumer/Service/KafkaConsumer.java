package com.kafka.Consumer.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "sample-event-topic",groupId = "consumer-group")
    public void consume(String message) {
        System.out.println("Message Consumed : " + message);
    }

}
