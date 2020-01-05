package com.weiyangdong.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",defaultValue = "WeiYangDong",required = false) String name) {
        return "Hello " + name;
    }
}
