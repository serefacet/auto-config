package com.obss.tukks.demo.democonsumer;

import com.obss.tukks.demo.democonfig.KafkaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoConsumerApplication {

    @Autowired
    private KafkaConfig kafkaConfig;

    public static void main(String[] args) {
        SpringApplication.run(DemoConsumerApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String autoConfigurationDemo() {
        System.out.println(kafkaConfig.toString());
        return kafkaConfig.toString();
    }
}
