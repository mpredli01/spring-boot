package org.redlich.boot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AppController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
        }
    }
