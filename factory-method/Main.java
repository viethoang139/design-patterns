package com.lvh.creational.factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("App: Launched with the RoadLogistics.");
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        System.out.println("\nApp: Launched with the SeaLogistics.");
        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}
