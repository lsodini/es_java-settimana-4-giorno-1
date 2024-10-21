package LucaSodini;

import LucaSodini.entities.Drink;
import LucaSodini.entities.Menu;
import LucaSodini.entities.Pizza;
import LucaSodini.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MenuConfig {

    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 2.0, 100);
    }

    @Bean
    public Topping ananas() {
        return new Topping("Ananas", 1.5, 50);
    }

    @Bean
    public Pizza margherita() {
        Pizza pizza = new Pizza("Margherita", 5.0, 600);
        return pizza;
    }

    @Bean
    public Pizza hawaiianPizza() {
        Pizza pizza = new Pizza("Hawaiian", 5.0, 600);
        pizza.addTopping(prosciutto());
        pizza.addTopping(ananas());
        return pizza;
    }

    @Bean
    public Drink cola() {
        return new Drink("Cola", 2.0, 150);
    }

    @Bean
    public Drink acqua() {
        return new Drink("Acqua", 1.0, 0);
    }

    @Bean
    public Menu menu() {
        List<Pizza> pizzas = Arrays.asList(margherita(), hawaiianPizza());
        List<Drink> drinks = Arrays.asList(cola(), acqua());
        return new Menu(pizzas, drinks);
    }
}
