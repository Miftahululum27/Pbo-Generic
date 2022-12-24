
package genericp9;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ListDeque {
    public static void main(String[] args) {
        System.out.println("\t Array DEQUE");
        ArrayDeque <String> deque = new ArrayDeque<>();
        deque.add("Miftahul");
        deque.add("ulum");
        for(String i:deque){
            System.out.println(i);
        }
        System.out.println("\n\n");
        
        //Penggunaan ArrayList
        System.out.println("\t Array LIST");
        ArrayList<String> list = new ArrayList<>();
        
        list.add("ulum");
        list.add("Miftahul");
        list.add("jj");
        
        for(int i = 0; i<3; i++){
            System.out.println(list.get(i));
        }
    }
}
