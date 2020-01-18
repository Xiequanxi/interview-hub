package com.xqx.interview.web.apiController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/test")
    public String testBack(){
        System.out.println("被调用");
        return port;
    }
}
