package com.canno.eureka.client.eureka.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String hi(){
        return "I'm client, from" +  serverPort;
    }
}
