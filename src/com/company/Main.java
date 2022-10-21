package com.company;

public class Main {

    public static void main(String[] args) {
        Driver myDriver = new Driver("Petr", 18);
        Car myCar = new Car("BMW", "owps59", 159, true);

        myDriver.drive(myCar);
        myCar.setEngineOn(false);
        myDriver.drive(myCar);
    }

}
