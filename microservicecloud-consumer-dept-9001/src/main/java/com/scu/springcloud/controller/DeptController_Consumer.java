package com.scu.springcloud.controller;

import com.scu.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class DeptController_Consumer {

//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/dept/get")
    @ResponseBody
    public Dept getDept(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get", Dept.class);
    }

}
