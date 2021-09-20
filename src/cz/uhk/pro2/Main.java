package cz.uhk.pro2;

import cz.uhk.pro2.models.PizzaMenu;
import cz.uhk.pro2.models.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world!");
        PizzaMenu menu = new PizzaMenu();
        menu.addItem(new PizzaMenuItem("Pizza 1", "Pizza jednicka", 256));
        menu.addItem(new PizzaMenuItem("Pizza 2", "Pizza dvojka", 256));

        System.out.println("posledni zmena:" + menu.getLastUpdate());

        for (PizzaMenuItem item : menu.getItems())
        {
            System.out.println(item.toString());
        }
    }
}
