package com.kafka.Producer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish/{message}")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @GetMapping
    public String publish(@PathVariable("message") String publishMessage){

        kafkaTemplate.send("sample-event-topic",publishMessage);
        return "Message Published "+ publishMessage;
    }
}
