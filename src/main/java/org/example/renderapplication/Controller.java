package org.example.renderapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/v1/")
public class Controller {
    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }
}
