package Giris;

import java.util.Scanner;

public class ikininKuvvetleri {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("sayi : ");
        number = input.nextInt();

        System.out.println("4'e bolunenler");
        for (int i = 1 ; i<=number ; i*=4){
            System.out.println(i);
        }
        System.out.println("5'e bolunenler");
        for (int i = 1 ; i<=number ; i*=5){
            System.out.println(i);
        }
    }
}
