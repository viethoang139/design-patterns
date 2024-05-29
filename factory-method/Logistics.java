package com.lvh.creational.factory;

public abstract class Logistics {

    public abstract Transport createTransport();

    public void planDelivery(){
        Transport transport = createTransport();
        transport.deliver();
    }

}
