package com.programmingsharing.kafkaspringboot.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class DemoStringConsumer {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DemoStringConsumer.class);

    @KafkaListener(id = "demoGroup", topics = "programmingsharing.topic1")
    public void listen(String message) {
        log.info("Received: " + message);
    }

    @KafkaListener(id = "demoGroup2", topics = "receiving-topic")
    public void listenFromReceivingTopic(String message) {
        log.info("Received: " + message);
    }
}
