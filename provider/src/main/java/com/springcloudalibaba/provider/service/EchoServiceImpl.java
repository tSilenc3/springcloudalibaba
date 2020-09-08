package com.springcloudalibaba.provider.service;

import com.springcloudalibaba.api.service.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String message) {
        return "[echo] Hello, " + message;
    }
}
