package com.company;

public class Car{

    public String name;
    public String SPZ;
    public int hP;
    public boolean engineOn;

    public Car(String name, String SPZ, int hP, boolean engineOn) {
        this.name = name;
        this.SPZ = SPZ;
        this.hP = hP;
        this.engineOn = engineOn;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSPZ() {
        return SPZ;
    }

    public void setSPZ(String SPZ) {
        this.SPZ = SPZ;
    }

    public int gethP() {
        return hP;
    }

    public void sethP(int hP) {
        this.hP = hP;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }
}
