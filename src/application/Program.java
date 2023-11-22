package application;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a =leia.nextDouble();
        x.b =leia.nextDouble();
        x.c =leia.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a =leia.nextDouble();
        y.b =leia.nextDouble();
        y.c =leia.nextDouble();

        // CHAMANDO O MÉTODO

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Tiangle X area: %.4f%n", areaX);
        System.out.printf("Tiangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Large area: X");
        }
        else {
            System.out.println("Large area: Y");
        }

        leia.close();

    }

}
