import java.util.Scanner;

/**
 * Created by mosharrofrubel on 10/2/16.
 */
public class MyJava {

    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        // i want to keep taking inputs from console, so i used hasnext
        while(i.hasNext()){
            String s = i.next();
            System.out.println("I inserted: "+s);

        }

    }

}
