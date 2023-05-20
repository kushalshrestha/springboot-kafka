package com.kushal.springkafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "topicA")
    public void receive(@Payload String eventAsString) {
        System.out.println("-----------Receiver received an Email Event----------");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = null;
        try {
            actualObj = mapper.readTree(eventAsString);
            String subject = actualObj.get("subject").textValue();
            String message = actualObj.get("message").textValue();
            System.out.println("-------OUTPUT---------");
            System.out.println(subject);
            System.out.println(message);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
