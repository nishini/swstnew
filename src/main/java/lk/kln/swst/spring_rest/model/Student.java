package lk.kln.swst.spring_rest.model;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class Student {
    private  String name;
    private String address;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws IllegalThreadStateException {
        if(age>100||age<=0){
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }
}
