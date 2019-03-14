package com.obss.tukks.demo.democonfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix="kafka")
@PropertySource("classpath:kafka.properties")
public class KafkaConfig {

    private int retry;
    private String topic;

    public int getRetry() {
        return retry;
    }

    public void setRetry(int retry) {
        this.retry = retry;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "KafkaConfig{" +
                "retry=" + retry +
                ", topic='" + topic + '\'' +
                '}';
    }
}
