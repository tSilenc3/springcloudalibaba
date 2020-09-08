package com.springcloudalibaba.consumer.controller;

import com.springcloudalibaba.api.service.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    private RestTemplate restTemplate;

    @Reference
    private EchoService echoService;

    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://service-provider:8070/echo/" + str, String.class);
    }

    @RequestMapping(value = "/dubbo/echo")
    public String dubboecho(String message) {
        return echoService.echo(message);
    }

}
