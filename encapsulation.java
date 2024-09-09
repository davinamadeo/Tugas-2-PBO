class Manusia {
    // Atribut private
    private String nama;
    private int umur;

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk umur
    public int getUmur() {
        return umur;
    }

    // Setter untuk umur
    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur harus lebih dari 0");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        manusia.setNama("Budi");
        manusia.setUmur(25);
        
        System.out.println("Nama: " + manusia.getNama());  // Output: Nama: Budi
        System.out.println("Umur: " + manusia.getUmur());  // Output: Umur: 25
    }
}
