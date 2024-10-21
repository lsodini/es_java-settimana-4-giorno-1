package LucaSodini.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private int calories;
    private List<Topping> toppings;

    public Pizza(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
        this.price += topping.getPrice();
        this.calories += topping.getCalories();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" - €").append(price).append(" - ").append(calories).append(" kcal\nToppings: ");
        for (Topping t : toppings) {
            sb.append(t.getName()).append(" ");
        }
        return sb.toString();
    }
}
