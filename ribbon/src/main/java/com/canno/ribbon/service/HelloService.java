package com.canno.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Canno
 * @since 2018/7/4 17:06
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/client/hello?name=" + name,String.class);
    }

    public String ok(){
        return restTemplate.getForObject("http://EUREKA-CLIENT/client/ok",String.class);
    }
}
