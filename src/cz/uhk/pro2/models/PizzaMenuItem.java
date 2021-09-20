package cz.uhk.pro2.models;

public class PizzaMenuItem {

    private String name;
    private String description;
    private int price;

    public PizzaMenuItem(String name, String description,  int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "nazev: " + name + ", popis: " + description + ", cena: " + price + "Kč";
    }
}
