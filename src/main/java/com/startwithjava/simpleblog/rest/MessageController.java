package com.startwithjava.simpleblog.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MessageController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("message")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        System.out.println("aaaaaaaaa");
        return new String("Hello World");
    }

}