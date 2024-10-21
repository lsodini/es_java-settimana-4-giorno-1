package LucaSodini.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizzas;
    private List<Drink> drinks;

    public Menu(List<Pizza> pizzas, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.drinks = drinks;
    }

    public void stampaMenu() {
        System.out.println("Pizzas:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
        System.out.println("\nDrinks:");
        for (Drink drink : drinks) {
            System.out.println(drink);
        }
    }
}
