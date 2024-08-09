import java.util.Scanner;

public class Luaslayanglayang {
    System.out.println("Selamat datang di program luas kayang-layang");
    double diagonal1,diagonal2,hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan diagonal1 layang-layang: ");
        diagonal1 = input.nextDouble();
        System.out.println("Masukkan diagonal2: ");
        diagonal2 = input.nextDouble();
        hasil = diagonal1*diagonal2*1/2;
        System.out.println("Hasil luas layang-layang adalah: "+hasil);
}
