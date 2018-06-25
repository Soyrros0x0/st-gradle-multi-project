package io.github.chiangfai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chiangfai
 * @created: created in 5:09 PM 25/06/2018
 * @description:
 **/
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello World!";
    }
}
