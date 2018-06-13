package com.gordons_alive.playground.factory;

public class BananaJuice implements Juice {
    @Override
    public int getJuiciness() {
        return 3;
    }

    @Override
    public String getName() {
        return "Banana Juice";
    }
}
