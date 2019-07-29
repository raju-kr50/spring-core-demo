package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("InitializingBean method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("DisposableBean method");
    }

    public void customInit() {
        System.out.println("This is custom init method");
    }

    public void customDestroy() {
        System.out.println("This is custom destroy method");
    }
}
