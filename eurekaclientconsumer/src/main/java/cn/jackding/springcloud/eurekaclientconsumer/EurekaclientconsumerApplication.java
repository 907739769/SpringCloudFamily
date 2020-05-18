package cn.jackding.springcloud.eurekaclientconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaclientconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientconsumerApplication.class, args);
    }

}