package com.programmingsharing.kafkaspringboot.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class SimpleScheduledProducer {
    private final KafkaTemplate<Object, Object> template;

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SimpleScheduledProducer.class);

    public SimpleScheduledProducer(KafkaTemplate<Object, Object> template) {
        this.template = template;
    }

    @Scheduled(fixedDelay = 2000)
    public void sendFoo() {
        log.info("producing message to Kafka, topic=receiving-topic");
        this.template.send("receiving-topic", Instant.now().toString());
    }
}
