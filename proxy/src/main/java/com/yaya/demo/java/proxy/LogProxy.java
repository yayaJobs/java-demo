package com.yaya.demo.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogProxy implements InvocationHandler {

    private Object targetObject;

    public LogProxy(Object targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke ...");
        Object result = method.invoke(targetObject, args);
        System.out.println("after invoke ...");
        return result;
    }
}
