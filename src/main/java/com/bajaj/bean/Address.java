package com.bajaj.bean;

public class Address {
    private String addressLine1;
    private String addressLine2;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    Address() {

        System.out.println("In non parameterized construtor");
    }

     Address(String addressLine1, String addressLine2) {
        //super();
         System.out.println("In parameterized constructor");
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                '}';
    }


}
