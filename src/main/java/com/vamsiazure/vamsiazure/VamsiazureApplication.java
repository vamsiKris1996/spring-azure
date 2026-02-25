package com.vamsiazure.vamsiazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VamsiazureApplication {
    @GetMapping("/message")
    public String message(){
        return "I am Deploying My First SpringBoot Application in Azure";
    }

    public static void main(String[] args) {
        SpringApplication.run(VamsiazureApplication.class, args);
    }

}
