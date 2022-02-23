import java.util.*;

public class Gravitacija {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);     
        

        double CM = 398571280000000.0;
        double r = 6371000.0;

        double v = sc.nextDouble();

        double rv2 = Math.pow(r + v, 2);


        double result = CM / rv2;
        
        System.out.println(result + "m/s2");
    }

}