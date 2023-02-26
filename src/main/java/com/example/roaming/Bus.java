package com.example.roaming;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bus {
    @GetMapping("/mubus")
    public String getData(){
        return "Please book yourBus ticket, Akotkar Express";
    }
}
