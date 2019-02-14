package com.cloud.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //标记这是一个Eureka服务器 可以接受服务提供者发布服务，也可以让消费者来消费服务
public class CloudApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CloudApplication.class);
    }
}

