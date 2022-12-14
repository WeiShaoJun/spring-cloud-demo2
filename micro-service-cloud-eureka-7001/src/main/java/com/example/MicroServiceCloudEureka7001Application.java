package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServiceCloudEureka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudEureka7001Application.class, args);
    }

}
