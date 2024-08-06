

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Sumar enteros
        int sumaEnteros2 = calc.sumar(2, 3);
        int sumaEnteros3 = calc.sumar(1, 2, 3);

        // Sumar decimales
        double sumaDecimales2 = calc.sumar(2.5, 3.5);
        double sumaDecimales3 = calc.sumar(1.1, 2.2, 3.3);

        System.out.println("Suma de 2 enteros: " + sumaEnteros2);
        System.out.println("Suma de 3 enteros: " + sumaEnteros3);
        System.out.println("Suma de 2 decimales: " + sumaDecimales2);
        System.out.println("Suma de 3 decimales: " + sumaDecimales3);
    }
}
