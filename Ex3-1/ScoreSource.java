import java.util.ArrayList;
import java.util.List;

public class ScoreSource {
    private List<ScoreListener> listeners;
    
    public ScoreSource() {
        listeners = new ArrayList<>();
    }
    
    public void register(ScoreListener listener) {
        listeners.add(listener);
    }
    
    public void unregister(ScoreListener listener) {
        listeners.remove(listener);
    }
    
    public void setScoreLine(String score) {
        fireScoreEvent(new ScoreEvent(score));
    }
    
    private void fireScoreEvent(ScoreEvent event) {
        for(ScoreListener listener : listeners) {
            listener.scoreChange(event);
        }
    }
}
