// Superclass (induk)
class Kendaraan {
    String merk = "Toyota";
    
    void jalan() {
        System.out.println("Kendaraan bergerak");
    }
}

// Subclass (anak)
class Mobil extends Kendaraan {
    String model = "Camry";
    
    void tampilkanDetail() {
        System.out.println(merk + " " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobilSaya = new Mobil();
        mobilSaya.jalan();  // Output: Kendaraan bergerak
        mobilSaya.tampilkanDetail();  // Output: Toyota Camry
    }
}
