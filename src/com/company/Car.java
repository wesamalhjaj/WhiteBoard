package com.company;

public class Car implements Vehicle{
    @Override
    public String maxSpeed() {
        return "250km/h";
    }

    @Override
    public String ignitionMethod() {
        return "gas";
    }
}
