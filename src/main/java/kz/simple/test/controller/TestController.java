package kz.simple.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author timur_ab on 14.12.2023
 */

@RestController
public class TestController {
    private int data;

    @GetMapping("/")
    public String sayHello (){
        data += 1;
        return "Hello";
    }

    @GetMapping("/data")
    public int getData (){
        return data;
    }
}
