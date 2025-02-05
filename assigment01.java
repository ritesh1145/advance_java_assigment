import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class assigment01 {
   /*
   The Collection Framework in Java is like a well-organized toolbox for handling groups of objects.
    It provides a set of ready-to-use interfaces and classes that help you store, manage, and process data
    efficiently.Think of it as a structured way to work with different types of collections, such as lists,
    sets, and maps,without having to build everything from scratch. Since it's part of the java.util package,
    you can easily use these data structures to make your programs more efficient and easier to manage.
    */
    public static void main (String[] args){
        //Implementation of List.
        List<String> list = new ArrayList<>();
        list.add("I");
        list.add("am");
        list.add("Learning");
        list.add("Java");
        list.add("Java!");

        for(int i=0; i<list.size(); i++){
             System.out.print(list.get(i) +" ");
        }
        list.remove(3);
        System.out.println(list);

        //implementation of Set.

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Grapes");
        set.add("Grapes");
        set.add("Potato");

        System.out.println(set);
        System.out.println(set.contains("Apple"));
        set.remove("Potato");
        System.out.println(set);

    }
}
