package com.bajaj.tester;

import com.bajaj.bean.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_BeanFactory {
    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = (Employee)bf.getBean("employee");
        System.out.println(employee);
    }
}
