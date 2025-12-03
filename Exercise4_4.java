public class Main {

    // 1. Değer döndüren metot
    public static int square(int x) {
        return x * x;
    }

    // 2. Void metot
    public static void printBoo() {
        System.out.println("boo!");
    }

    public static void main(String[] args) {

        // ----------------------
        // SORU 1: Değer döndüren metodu çağırıp sonucu kullanmamak
        // ----------------------
        square(5);  // Sonuç kullanılmadı, ama geçerli. Java hata vermez.
        
        // İsteğe bağlı olarak sonucu kullanırsak:
        int sonuc = square(5);
        System.out.println("square(5) = " + sonuc);  // Çıktı: square(5) = 25


        // ----------------------
        // SORU 2: Void metodu bir ifadenin içinde kullanmak
        // ----------------------

        printBoo(); // Normal kullanım, çıktı: boo!

        // HATA VEREN ÖRNEK (yorum satırı olarak bırakıldı)
        // printBoo() + 7; 
        // Derleme hatası: 
        // error: bad operand types for binary operator '+'
        // first type:  void
        // second type: int
        // printBoo() + 7;

        // Çözüm: Void metotları yalnızca tek başına çağırabiliriz.
    }
}
