import java.util.*;

public class Gravitacija {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);     
        
        double v = sc.nextDouble();

        double a = izracun(v);

        izpis(v, a);

    }

    public static double izracun (double v) {

        double CM = 398571280000000.0;
        double r = 6371000.0;

        double rv2 = Math.pow(r + v, 2);

        double result = CM / rv2;

        return result;
    }

    public static void izpis(double v, double a) {
        System.out.println(v);
        System.out.println(a);

    }

}