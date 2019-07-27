package com.xiao.config;

import com.xiao.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    // 方法名，对应原beans.xml的组件id
    @Bean
    public HelloService helloService(){
        System.out.println("给容器添加组件");
        return new HelloService();
    }
}
