package com.gian.test.controller;

import com.gian.test.service.EurekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaojian on 2019/4/12.
 */
@RestController
public class EurekaClient2Controller {

    @Autowired
    public EurekaService service;

    @GetMapping("getService")
    public String consumption(String type){
        String result = service.callService(type);
        return result;
    }


}