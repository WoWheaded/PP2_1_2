import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name= "helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="Cat")
    @Scope("prototype")
    public Cat getHelloCat() {
        Cat cat1 = new Cat();
        cat1.setMessage("Myau");
        return cat1;
    }
}