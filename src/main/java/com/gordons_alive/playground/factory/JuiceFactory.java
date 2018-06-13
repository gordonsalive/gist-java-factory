package com.gordons_alive.playground.factory;

public class JuiceFactory {
    public static Juice getJuice(JuiceKind juiceKind) {
        //(no need to break as all options return)
        switch(juiceKind) {
            case BANANA:
                return new BananaJuice();
            case STRAWBERRY:
                return new StrawberryJuice();
            default:
                return null;//ho hum...
        }
    }
}
