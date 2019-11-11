package com.yaya.demo.java.proxy;

public class HelloWorldImpl implements HelloWorldInterface {
    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}

interface HelloWorldInterface {
    void sayHello();
}
