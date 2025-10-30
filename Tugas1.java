public class Tugas1 {
    public static void main(String[] args) {

        // 1. Mendeklarasikan variabel dengan tipe data integer yang bernama strukturbaris
        int strukturbaris = 50;
        System.out.println("ini adalah integer = " + strukturbaris);

        //2. Buatlah sebuah deklarasi variabel dengan tipe data string yang bernama ‘KataBaru’ yang berisi kata ‘Deklarasi tipe data String’? 
        String KataBaru = "Deklarasi tipe data String";
        System.out.println("ini adalah string = " + KataBaru);   

        //3. Buatlah pendeklarasian array satu dimensi dengan nama ‘empatAngka’, tipe data integer, yang berisi angka (07, 10, 20, 23)? Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.
        int[] empatAngka = new int[4];
        empatAngka[0] = 07;
        empatAngka[1] = 10;
        empatAngka[2] = 20;
        empatAngka[3] = 23;
        System.out.println("ini adalah aray satu dimensi = " + empatAngka[0] + ", " + empatAngka[1] + ", " + empatAngka[2] + ", " + empatAngka[3]);

        //Buatlah pendeklarasian array dua dimensi dengan nama ‘Angka’, tipe data String, yang terdiri dari tiga baris dan tiga kolom
    
        String[][] Angka = {
            {"1", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "29"}
        };
        System.out.println("ini adalah array dua dimensi = ");
        for (int i = 0; i < Angka.length; i++) {
            for (int j = 0; j < Angka[i].length; j++) {
                System.out.print(Angka[i][j] + " ");
            }
            System.out.println();
        }
    }
}
