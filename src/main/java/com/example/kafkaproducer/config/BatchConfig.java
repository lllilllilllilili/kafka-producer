package com.example.kafkaproducer.config;

import com.example.kafkaproducer.entity.WebLog;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    //JobRepository
    private final JobRepository jobRepository;
    //PlatformTransactionManager
    private final PlatformTransactionManager platformTransactionManager;
    //kafka template <String, WebLog>
    private final KafkaTemplate<String, WebLog> kafkaTemplate;

    @Autowired
    public BatchConfig(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager, KafkaTemplate<String, WebLog> kafkaTemplate) {
        this.jobRepository = jobRepository;
        this.platformTransactionManager = platformTransactionManager;
        this.kafkaTemplate = kafkaTemplate;
    }
    //Job
    //Step
        //reader (WebLog Generation --> faker 임의값을 넣어서 object 대량으로 생성)
        //writer (gen 된 webLog 를 Kafka 에 Produce)
    //Step-2
}
