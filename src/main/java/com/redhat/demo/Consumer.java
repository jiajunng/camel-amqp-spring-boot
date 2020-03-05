package com.redhat.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    private static final Logger LOG = LoggerFactory.getLogger(Consumer.class);

    @JmsListener(destination = "MyQueue0")
    public void processMsg(String message) {
        LOG.info("============= Received: " + message);
    }
}
