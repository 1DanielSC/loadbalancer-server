package com.example.loadbalancerserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping(value = "loadbalancer")
public class LbController {
    
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value = "/sayHi")
    public ResponseEntity<?> testProduct(){
        return restTemplate.getForEntity("http://PRODUCT/product/sayHi", String.class);
    }

    @GetMapping(value = "/sayHi2")
    public ResponseEntity<?> testReview(){
        return restTemplate.getForEntity("http://REVIEW/review/sayHi", String.class);
    }

    @GetMapping(value = "/sayHi3")
    public ResponseEntity<?> testSales(){
        return restTemplate.getForEntity("http://SALES/order/sayHi", String.class);
    }
}
