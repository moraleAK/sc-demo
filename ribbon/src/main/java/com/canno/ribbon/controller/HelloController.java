package com.canno.ribbon.controller;

import com.canno.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Canno
 * @since 2018/7/4 17:08
 */
@RestController
@RequestMapping("/client")
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/ok")
    public String ok(){
        return helloService.ok();
    }
}
