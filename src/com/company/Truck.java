package com.company;

public class Truck implements Vehicle{
    @Override
    public String ignitionMethod() {
        return "90 fuel";
    }

    @Override
    public String maxSpeed() {
        return "170km/h";
    }
}
