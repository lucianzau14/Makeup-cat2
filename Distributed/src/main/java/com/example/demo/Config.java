package com.example.demo;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

    @Profile({"hello-world"})
    @Configuration
    public class Config {

        @Bean
        public Queue hello() {
            return new Queue("hello");
        }

        @Profile("receive")
        @Bean
        public Receive receive() {
            return new Receive();
        }

        @Profile("send")
        @Bean
        public Send send() {
            return new Send();
        }
    }


