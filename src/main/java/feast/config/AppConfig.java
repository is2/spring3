package feast.config;

import feast.TraditionalFeast;
import feast.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("feast")
public class AppConfig {
    @Bean
    public Duck2 getDuck2(Chicken3 chicken3) {
        return new Duck2(chicken3);
    }
    @Bean
    public Lamb5 getLamb5(Goat6 goat6) {
        return new Lamb5(goat6);
    }
    @Bean
    public Camel8 getCamel8() {
        return new Camel8();
    }
}
