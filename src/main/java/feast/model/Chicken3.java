package feast.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chicken3 {

    private Pig4 pig4;

    @Autowired
    public void setPig4(Pig4 pig4) {
        this.pig4 = pig4;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a pig, " + pig4.toString();
    }

}
