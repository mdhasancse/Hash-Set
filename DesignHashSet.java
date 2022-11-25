import java.util.HashSet;
import java.util.Iterator;
public class DesignHashSet{
    public static void main(String[] args) {
        

        // Creation
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        //  Size
        System.out.println("Size of set is : "+set.size());

        // Print all elemets
        System.out.println((set));


        // Search - contain
        // if(set.contains(1))
        // {
        //     System.out.println("Set contains 1");
        // }
        // if( !set.contains(6))
        // {
        //     System.out.println("Does not contain 6");
        // }

        // // Delete  
        // set.remove(1); //Hash set will consisder only unique not duplicate in the set series
        // if( !set.contains(1))
        // {
        //     System.out.println("Does not contain 1 - we deleted 1");
        // }


        //Iterator
        Iterator it = set.iterator();
        // It having two fun  1->HasNext, 2->next  It will start always fron "null"
        // HashNext will reaturn True or False
        // next will rturn elements

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
}