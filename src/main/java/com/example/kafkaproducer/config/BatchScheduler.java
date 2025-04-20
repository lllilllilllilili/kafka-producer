package com.example.kafkaproducer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class BatchScheduler {

    @Scheduled(fixedDelay = 10000) //10초에 한번씩 작업 수행
    public void runBatchJob() {

    }
}
