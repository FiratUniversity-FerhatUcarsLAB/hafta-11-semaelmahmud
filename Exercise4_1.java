// Dosya adı: Main.java
class Main {

    public static void printAmerican(String day, String month, int date, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, String month, int date, int year) {
        // Örnek: Wednesday, 11 April 2007  -> 11 April 2007, Wednesday
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {
        String day = "Wednesday";
        String month = "April";
        int date = 11;
        int year = 2007;

        printAmerican(day, month, date, year);
        printEuropean(day, month, date, year);
    }
}

}
