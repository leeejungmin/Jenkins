package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class testController {
    @GetMapping("/jung")
    public String test(){
        return "this is deploy test by jung";
    }
}
