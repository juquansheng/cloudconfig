package com.malaxiaoyugan.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${foo}")
    String foo;

    @Value("${democonfigclient.message}")
    String host;


    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }



    @RequestMapping(value = "/hi1")
    public String host(){
        return host;
    }
}
