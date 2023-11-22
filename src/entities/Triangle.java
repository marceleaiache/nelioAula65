package entities;

public class Triangle {

    // DECLARAÇÃO DOS ATRIBUTOS DA CLASSE

    public double a;
    public double b;
    public double c;

    // DECLARAÇÃO DO MÉTODO DA ÁREA DO TRIAÂNGULO

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

}


