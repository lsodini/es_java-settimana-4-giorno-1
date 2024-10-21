package LucaSodini;

import LucaSodini.entities.Menu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MenuConfig.class);

        Menu menu = context.getBean(Menu.class);
        menu.stampaMenu();
    }
}
