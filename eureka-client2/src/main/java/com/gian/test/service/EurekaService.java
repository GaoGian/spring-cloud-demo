package com.gian.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gaojian on 2019/4/12.
 */
@Service
public class EurekaService {

    @Value("${app.service-url}")
    private String appServiceUrl;

    @Autowired
    private RestTemplate restTemplate;

    public String callService(String type){
        ResponseEntity response = restTemplate.postForEntity(appServiceUrl + "getService/" + type, null, String.class);
        return response.getBody().toString();
    }


}