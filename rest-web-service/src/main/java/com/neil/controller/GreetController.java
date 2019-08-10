package com.neil.controller;

import com.neil.response.ResponseMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greet")
public class GreetController {

    private static final String template = "Hello, %S";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public ResponseMessage greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new ResponseMessage(counter.incrementAndGet(), String.format(template, name));
    }
}
