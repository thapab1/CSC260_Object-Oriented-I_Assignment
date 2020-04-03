import java.util.Scanner;

class QuadraticOOP {
    private double a, b, c;
    private double discriminant;
    private double r1, r2;

    public QuadraticOOP(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

        public double getDiscriminant() {
            return this.discriminant = b*b - 4*a*c;

        }
        public double getSolution1() {
            return (-b + Math.sqrt(discriminant)) / 2 * a;

        }

        public double getSolution2() {
           return (-b - Math.sqrt(discriminant)) / 2 * a;
        }



}

public class QuadraticOOPTest {
    public static void main(String[] args) {
        QuadraticOOP q = new QuadraticOOP(1, 3, 1);
        System.out.println(q.getDiscriminant());
        System.out.println(q.getSolution1());
        System.out.println(q.getSolution2());
    }
}

/**
 * Copy output here
 * 5.0
 * -0.3819660112501051
 * -2.618033988749895
 */
