package com.gordons_alive.playground.factory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        JuiceFactory juiceFactory = new JuiceFactory();
        Juice bananaJuice = juiceFactory.getJuice(JuiceKind.BANANA);
        Juice strawberryJuice = juiceFactory.getJuice(JuiceKind.STRAWBERRY);
        System.out.println(bananaJuice.getName() + ", juiciness=" + bananaJuice.getJuiciness());
        System.out.println(strawberryJuice.getName() + ", juiciness=" + strawberryJuice.getJuiciness());
    }
}
