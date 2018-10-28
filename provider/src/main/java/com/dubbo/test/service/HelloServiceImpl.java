package com.dubbo.test.service;

import com.dubbo.test.HelloService;
import org.springframework.stereotype.Service;

/**
 * 提供者
 */
@Service
public class HelloServiceImpl implements HelloService {
    /**
     * 测试消息提供者
     *
     * @param name
     * @return
     */
    public String testHello(String name) {
        return "This is Provider ,  do you copy :" + name;
    }
}
