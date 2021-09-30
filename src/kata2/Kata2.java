package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = new int[15];
        for (int i=0; i<data.length; i++) {
           data[i] = (int) ((Math.random())*5);
        }
        
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (int key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
    
}
