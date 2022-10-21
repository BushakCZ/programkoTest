package com.company;

public class Driver {

    private static String name;
    private static int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void drive(Car myCar) {
        if (myCar.isEngineOn()) {
            System.out.println(name + " is driving " + myCar.getName() + " " + myCar.getSPZ() + " with " + myCar.gethP() + "hp");
        } else {
            System.out.println("Turn on your car!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
