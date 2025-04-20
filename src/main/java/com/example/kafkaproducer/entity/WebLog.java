package com.example.kafkaproducer.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WebLog {
    private String userId;
    private String url;
    private String IpAddress;
    private String timestamp;
    private String sessionId;
}
