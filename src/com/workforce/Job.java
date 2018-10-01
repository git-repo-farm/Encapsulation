package com.workforce;

public class Job {

    public static void main(String args[]) {

        Employee obj = new Employee();

        obj.setEmpAge(20);
        obj.setEmpLastName("Richardson");
        obj.setEmpMemberYearSince(2018);
        obj.setEmpName("James");
        obj.setEmpPassword(2222);
        obj.setEmpSsn(1111111);

        System.out.println("This is the employees age:" + obj.getEmpAge());
        System.out.println("This is the employees last name:" + obj.getEmpLastName());
        System.out.println("This is the employees year of membership:" + obj.getEmpMemberYearSince());
        System.out.println("This is the employees First name:" + obj.getEmpName());
        System.out.println("This is the employees Password:" + obj.getEmpPassword());
        System.out.println("This is the employees SSN:" + obj.getEmpSsn());
    }
}
