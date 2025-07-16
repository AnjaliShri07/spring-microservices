package com.docker.docker_beginner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerHelloController {

    @GetMapping("/")
    public String helloDocker() {
        return "Hello Docker!";
    }

}
