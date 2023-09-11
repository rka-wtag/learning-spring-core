package org.DemoProject1.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

        College college = context.getBean("collegeBean", College.class);
        System.out.println("running ok");
    }
}