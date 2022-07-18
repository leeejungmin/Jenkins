package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class testController {
    @GetMapping("/")
    public String test(){
        return "this is deploy test by test";
    }
    @GetMapping("/jung")
    public String jung(){
        return "this is deploy test by jung";
    }
}
