import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Subscriber implements PropertyChangeListener {
    private String name;
    
    public Subscriber(String name) {
        this.name = name;
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("scoreLine")) {
            System.out.println("live result: " + evt.getNewValue());
        }
    }
}
