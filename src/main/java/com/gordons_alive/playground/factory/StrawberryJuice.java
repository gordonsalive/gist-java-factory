package com.gordons_alive.playground.factory;

public class StrawberryJuice implements Juice {
    @Override
    public int getJuiciness() {
        return 4;
    }

    @Override
    public String getName() {
        return "Strawberry Juice";
    }
}
