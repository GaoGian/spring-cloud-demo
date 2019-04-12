package com.gian.test.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaojian on 2019/4/12.
 */
@RestController
public class TestController {

    @RequestMapping("getService/{type}")
    public String getService(@PathVariable String type){
        return "spring cloud client: " + type;
    }

}