package com.example.demo;

public class Person {
    private String name;
    private int id;
    private int[] access;

    public Person(String name, int id, int[] access) {
        this.name = name;
        this.id = id;
        this.access = access;
    }

    public String getInformation()  {

        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Access: " + access);
        String personInfo = "Name: " + name + " , Id:" + id + ", Access: " + access;

        return personInfo;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getAccess() {
        return access;
    }

    public void setAccess(int[] access) {
        this.access = access;
    }
}
