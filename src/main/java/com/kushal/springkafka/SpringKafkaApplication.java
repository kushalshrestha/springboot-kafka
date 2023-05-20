package com.kushal.springkafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.producer.internals.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringKafkaApplication implements CommandLineRunner {

    @Autowired
    ProducerService sender;

    private Integer secondsToSleep = 3;

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        EmailEvent emailEvent = new EmailEvent("Email Subject", "Email Message 1");
        ObjectMapper objectMapper = new ObjectMapper();
        String emailEventAsString = objectMapper.writeValueAsString(emailEvent);
        System.out.println("Message trying to send-------------------");
        sender.sendMessage("topicA", emailEventAsString);
        System.out.println("Message has been sent-------------------");

        try {
            Thread.sleep(secondsToSleep * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread()
                  .interrupt();
        }
        System.out.println("Receiver is running and waiting for messages==============");
		System.out.println("END");
    }
}
