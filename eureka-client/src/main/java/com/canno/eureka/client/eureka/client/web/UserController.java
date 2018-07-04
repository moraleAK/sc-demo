package com.canno.eureka.client.eureka.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangzhipeng on 2017/8/2.
 */
@RestController
@RequestMapping("/client")
public class UserController {

    @Value("${server.port}")
    String serverPort;
    @GetMapping("/hello")
    public String hi(@RequestParam String name){
        return "hello "+ name + ",I am " +  serverPort;
    }

    @RequestMapping("/ok")
    public String ok(){
        return "Im ok by " + serverPort;
    }

}
