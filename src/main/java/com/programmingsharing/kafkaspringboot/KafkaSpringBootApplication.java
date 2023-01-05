package com.programmingsharing.kafkaspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSpringBootApplication.class, args);
    }

}
