package com.lvh.creational.factory;

public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
