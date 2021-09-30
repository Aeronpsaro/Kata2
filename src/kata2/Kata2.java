package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = new int[15];
        for (int i=0; i<data.length; i++) {
           data[i] = (int) ((Math.random())*5);
        }
        
        HashMap<Integer, Integer> histogram = new HashMap<>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) +1 : 1);
        }
        
        for (int key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
    
}
