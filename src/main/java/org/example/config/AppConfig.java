package org.example.config;

import org.example.TraditionalFeast;
import org.example.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "feast")
public class AppConfig {

    @Bean
    public Pig4 getPig4(Lamb5 lamb5) {
        return new Pig4(lamb5);
    }

    @Bean
    public Chicken3 getChicken3(Pig4 pig4) {
        return new Chicken3(pig4);
    }

    @Bean
    public Duck2 getDuck(Chicken3 chicken) {
        return new Duck2(chicken);
    }

    @Bean
    public Fish1 getFish1(Duck2 duck2) {
        return new Fish1(duck2);
    }

    @Bean
    public Goat6 getGoat6(Horse7 horse7) {
        return new Goat6(horse7);
    }

    @Bean
    public Horse7 getHorse7(Camel8 camel8) {
        return new Horse7(camel8);
    }

    @Bean
    public Lamb5 getLamb5(Goat6 goat6) {
        return new Lamb5(goat6);
    }

    @Bean
    public Camel8 getCamel8() {
        return new Camel8();
    }

    @Bean
    public TraditionalFeast getTraditionalFeast(Fish1 fish1) {
        TraditionalFeast feast = new TraditionalFeast();
        feast.setFish(fish1);
        return feast;
    }
}
