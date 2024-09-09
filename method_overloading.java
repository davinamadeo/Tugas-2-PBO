class Calculator {
    // Overloading metode 'tambah' dengan parameter yang berbeda
    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    double tambah(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.tambah(2, 3));           // Output: 5
        System.out.println(calc.tambah(2, 3, 4));        // Output: 9
        System.out.println(calc.tambah(2.5, 3.5));       // Output: 6.0
    }
}
