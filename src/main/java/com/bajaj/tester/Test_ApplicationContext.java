package com.bajaj.tester;

import com.bajaj.bean.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bajaj.bean.Employee;

public class Test_ApplicationContext {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = (Employee)ac.getBean("employee");
        System.out.println(employee);
        Employee employee1 = (Employee)ac.getBean("e");
        System.out.println(employee1);
        Address address = (Address) ac.getBean("address");
        System.out.println(address);


    }

}
