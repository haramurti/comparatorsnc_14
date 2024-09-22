package comparatorsnc_14;
import java.util.Comparator;

public class bookcomparator implements Comparator<book>{
    

    @Override  
    public int compare (book b1, book b2){
        return b1.getTitle().compareTo(b2.getTitle());
    }
}