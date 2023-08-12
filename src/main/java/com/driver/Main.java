package com.driver;

public class Main {

    public static void main(String args[])
    {
        RWOnly obj = new RWOnly();
        //obj.name = "Ankush";
        // name has private variable this not directly assign value need setters
         obj.setName("Ankush");
         obj.getName();
    }
}