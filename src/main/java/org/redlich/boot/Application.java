package org.redlich.boot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class,args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String beanName : beanNames) {
            System.out.println("* " + beanName);
            }
        System.out.println();
        System.out.println("Server running on port 8080...");
        System.out.println("Available endpoints include:");
        System.out.println("* /health");
        System.out.println("* /beans");
        System.out.println("* /info");
        System.out.println("* /metrics");
        System.out.println();
        System.out.println("Please refer to the documentation for more information...");
        }
    }

