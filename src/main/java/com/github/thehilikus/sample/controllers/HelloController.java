package com.github.thehilikus.sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The MVC controller
 *
 * @author hilikus
 */
@RestController
public class HelloController {

    @GetMapping
    public String index() {
        return "Greetings from Spring Boot";
    }
}
