package com.lvh.creational.factory;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by land in a truck");
    }
}
