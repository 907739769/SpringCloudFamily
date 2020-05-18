package cn.jackding.springcloud.eurekaservesingle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaservesingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaservesingleApplication.class, args);
    }

}
