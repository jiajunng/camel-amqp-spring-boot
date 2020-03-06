package com.redhat.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringBootAmqpConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAmqpConsumerApplication.class, args);
    }

}