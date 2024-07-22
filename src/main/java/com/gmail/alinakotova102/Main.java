package com.gmail.alinakotova102;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        PersonBean bean = context.getBean("personBean", PersonBean.class);
        System.out.println(bean);

        context.close();
    }
}
