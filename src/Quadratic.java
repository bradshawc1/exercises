import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = (Math.pow(b, 2) - 4 * a * c);

        if (discriminant < 0) {
            System.out.println("The equation has no real roots");
        }
        else if (discriminant == 0) {
            double r1 = -b / (2 * a);
            System.out.println("The equation has one root " + r1);
        }
        else { // (discriminant > 0)
            double sqrt = Math.sqrt(discriminant);
            double r1 = (-b + sqrt) / (2 * a);
            double r2 = (-b - sqrt) / (2 * a);
            System.out.println("The equation has two roots " + r1 + " " + r2);
        }
    }
}

/**
 Enter a, b, c: 1.0
 3
 1
 The equation has two roots -0.3819660112501051 -2.618033988749895
 */
