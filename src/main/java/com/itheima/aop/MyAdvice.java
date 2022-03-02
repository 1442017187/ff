package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;

//功能增强类，用来增强目标方法的。
public class MyAdvice {

    public void print(){
        System.out.println("执行了MyAdvice的print方法~！");
    }

    /**
     *
     * @param joinPoint 真正执行的目标方法
     * @return
     */
    public Object around (ProceedingJoinPoint joinPoint) throws Throwable {

        // 让目标方法执行
        //没有参数的目标方法
        //joinPoint.proceed();

        print();

        //有参数的目标方法
        Object o = joinPoint.proceed(joinPoint.getArgs());

        print();

        return o;

    }
}
