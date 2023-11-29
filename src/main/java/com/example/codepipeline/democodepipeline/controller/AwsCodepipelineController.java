package com.example.codepipeline.democodepipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AwsCodepipelineController {

    @GetMapping("/publish")
    public String display(){
        return "Hello CodePipeline";
    }

    @GetMapping("/messages")
    public String getMessage() {
        return "Hello from Docker!";
    }
}
