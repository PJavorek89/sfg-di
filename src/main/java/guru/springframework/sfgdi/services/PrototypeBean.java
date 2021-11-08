package guru.springframework.sfgdi.services;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

@Component(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("!!!!!!Creating a prototype bean!!!!!!");
    }

    public String getMyScope(){
        return "I am prototype";
    }
}
