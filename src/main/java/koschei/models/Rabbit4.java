package koschei.models;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    private Duck5 duck;

    @Override
    public String toString() {
        return ", в зайце 3 утки " + duck.toString();
    }

    @Autowired
    public void setDuck(Duck5 duck) {
        this.duck = duck;
    }
}
