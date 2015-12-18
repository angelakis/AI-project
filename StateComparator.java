import java.util.Comparator;

public class StateComparator implements Comparator<State> {
    
    public int compare(State a, State b) {
        int best = (a.getG() + a.getH()) - (b.getG() + b.getH());
        return (ans == 0)? (a.getH() - b.getH()): ans;
    }
}
