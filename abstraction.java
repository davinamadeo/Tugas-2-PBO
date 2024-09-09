// Abstraksi menggunakan abstract class
abstract class Hewan {
    // Abstrak method (tidak memiliki implementasi)
    abstract void suara();
    
    // Non-abstrak method (memiliki implementasi)
    void tidur() {
        System.out.println("Hewan sedang tidur");
    }
}

class Kucing extends Hewan {
    // Implementasi dari method abstrak
    void suara() {
        System.out.println("Kucing mengeong");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.suara();  // Output: Kucing mengeong
        hewan.tidur();  // Output: Hewan sedang tidur
    }
}
