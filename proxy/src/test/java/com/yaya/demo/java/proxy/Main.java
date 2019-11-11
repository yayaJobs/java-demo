package com.yaya.demo.java.proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = new HelloWorldImpl();
        LogProxy logProxy = new LogProxy(helloWorldInterface);
        helloWorldInterface = (HelloWorldInterface) Proxy.newProxyInstance(helloWorldInterface.getClass().getClassLoader(),
                helloWorldInterface.getClass().getInterfaces(),
                logProxy);
        helloWorldInterface.sayHello();
    }
}
