import java.util.Scanner;

class Mahasiswa {
    public void tampilkan(){
        System.out.println("Daftar Mahasiswa :");
    }
}

class NamaMahasiswa extends Mahasiswa {
    public void tampilkan(){
        String[] daftarnama = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris yang diinginkan (maks 5) : ");
        int jb = sc.nextInt();
        while (jb >= 6){
            System.out.println("Jumlah yang dimasukkan terlalu banyak!");
            System.out.print("Masukkan jumlah baris yang diinginkan (maks 5) : ");
            jb = sc.nextInt();
        }
        int i = 0;
        while (i <= jb){
            if (i >= 1) {
                System.out.print("Masukkan nama ke-" + i + " : ");
            }
            daftarnama[i] = sc.nextLine();
            i = i + 1;
        }
        System.out.println("");
        super.tampilkan();
        for (i = 1; i <= jb; i++){
            System.out.println(i +". " + daftarnama[i]);
        }
    }
}

public class Main {

    static void plusminus(int angka1, int angka2){
        int plus = angka1 + angka2;
        int minus = angka1 - angka2;

        System.out.println(angka1 + " + " + angka2 + " = " + plus);
        System.out.println(angka1 + " - " + angka2 + " = " + minus);
    }

    static void divtime(int angka1, int angka2){
        int x = angka1 * angka2;
        double div = angka1 / angka2;

        System.out.println(angka1 + " * " + angka2 + " = " + x);
        System.out.println(angka1 + " / " + angka2 + " = " + div);
    }

    public static void main(String args[]){
        String[] baris = new String[10];
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Pilihan : \n1. Array + Pengulangan\n" +
                "2. Overriding\n" +
                "3. Method");
        System.out.println("Pilih salah satu : "); int pilihan = sc.nextInt();
        switch (pilihan){
            case 1:
                System.out.print("Masukkan jumlah baris yang diinginkan (maks 10) : ");
                int jb = sc.nextInt();
                while (jb >= 11){
                    System.out.println("Jumlah yang dimasukkan terlalu banyak!");
                    System.out.print("Masukkan jumlah baris yang diinginkan (maks 10) : ");
                    jb = sc.nextInt();
                }
                while (i <= jb){
                    if (i >= 1) {
                        System.out.print("Masukkan kata/kalimat apapun ke baris " + i + " : ");
                    }
                    baris[i] = sc.nextLine();
                    i = i + 1;
                }
                System.out.println("");
                for (i = 1; i <= jb; i++){
                    System.out.println("Baris ke-" + i +" : " + baris[i]);
                }
                break;
            case 2:
                NamaMahasiswa nama = new NamaMahasiswa();
                nama.tampilkan();
                break;
            case 3:
                System.out.print("Masukkan angka pertama : ");
                int angka1 = sc.nextInt();
                System.out.print("Masukkan angka kedua : ");
                int angka2 = sc.nextInt();
                System.out.print("Pilih metode penghitungan : \n1. Penjumlahan dan pengurangan\n" +
                        "2. Perkalian dan Pembagian\n" +
                        "Pilihan anda : ");
                pilihan = sc.nextInt();

                if (pilihan == 1){
                    plusminus(angka1, angka2);
                } else if (pilihan == 2){
                    divtime(angka1, angka2);
                }
                break;
            default:
                break;
        }

    }
}
