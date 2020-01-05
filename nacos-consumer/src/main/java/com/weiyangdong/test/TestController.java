package com.weiyangdong.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

//    @Autowired
//    RestTemplate restTemplate;

    @GetMapping("/hi-rt")
    public String helloRestTemplate(){
//        return restTemplate.getForObject("http://nacos-provider/hello?name=胡汉三",String.class);
        return "Hello";
    }
}
