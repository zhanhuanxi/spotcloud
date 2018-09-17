package com.spot.spotuser.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class HelloController {

    @Value("${nickName}")
    private String nickName;

    @RequestMapping("/hello")
    public String hello() {
        return "hello " + nickName;
    }

}