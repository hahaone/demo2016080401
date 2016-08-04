package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by enyeah on 2016/8/4.
 *
 */

@RestController
public class hello {
    @RequestMapping("/")
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name){
        return "Hello " + name;
    }
}
