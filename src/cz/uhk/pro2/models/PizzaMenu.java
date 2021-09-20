package cz.uhk.pro2.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private final List<PizzaMenuItem> items;
    private LocalDateTime lastUpdate;

    public PizzaMenu() {
        items = new ArrayList<>();
    }

    public List<PizzaMenuItem> getItems() {
        return items;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void addItem(PizzaMenuItem item) {
        items.add(item);
        lastUpdate = LocalDateTime.now();
    }
}
