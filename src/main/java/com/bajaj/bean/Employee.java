package com.bajaj.bean;

public class Employee {

    private int eId;
    private String name;
    private int salary;

    public String toString(){
        return "Employee [eId=" + eId +",name="+name + ",salary="+salary+"]";
    }
    public int geteId(){
        return eId;
    }
    public void seteId(int eId){
        this.eId=eId;
    }
    public String getName(){
        return name;
    }

   Employee() {
       System.out.println("In non parameterized constructor");
    }

    Employee(int eId,String name,int salary) {
        super();
        System.out.println("In parameterized constructor");
        this.eId = eId;
        this.name=name;
        this.salary=salary;
    }

    public void setName(String name){
        this.name=name;
    }
    public int getSalary(){
        return salary;
    }


    public void setSalary(int salary){
        this.salary=salary;
    }
}

