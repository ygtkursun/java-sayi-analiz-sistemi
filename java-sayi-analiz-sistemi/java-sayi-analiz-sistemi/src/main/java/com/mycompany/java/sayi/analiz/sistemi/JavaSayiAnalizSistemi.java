package com.mycompany.java.sayi.analiz.sistemi;

import java.util.Scanner;

public class JavaSayiAnalizSistemi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        int pozitif = 0;

        int negatif = 0;

        int tek = 0;

        int cift = 0;

        int sayi = 0;

        int toplam = 0;

        double ortalama = 0;

        int buyuk = 0;

        int kucuk = 0;

        while (true) {

            System.out.println("Bir sayi girin: ");
            number = input.nextInt();

            if (number == 0) {

                System.out.println("Cikis yapildi.");

                break;

            }

            boolean asal = true;

            int bolen;

            if (number <= 1) {

                asal = false;

            } 
            
            else {

                for (bolen = 2; bolen < number; bolen++) {

                    if (number % bolen == 0) {

                        asal = false;
                        break;

                    }

                }

            }

            if (asal == true) {

                System.out.println("Sayi asaldir.");

            } 
            
            else {

                System.out.println("Sayi asal degildir.");

            }

            boolean mukemmel = true;

            int bolenToplam = 0;

            if (number <= 1) {

                mukemmel = false;

            } 
            
            else {

                for (bolen = 1; bolen < number; bolen++) {

                    if (number % bolen == 0) {

                        bolenToplam = bolenToplam + bolen;

                    }

                }

                if (bolenToplam == number) {

                    mukemmel = true;

                } 
                
                else {

                    mukemmel = false;

                }

            }

            if (mukemmel == true) {

                System.out.println("Sayi mukemmeldir.");

            } 
            
            else {

                System.out.println("Sayi mukemmel degildir.");

            }
            
            int basamak = 0;
            
            int geciciSayi = number;
            
            while(geciciSayi != 0) {
                
                geciciSayi = geciciSayi / 10;
                
                basamak++;
                
            }
            
            System.out.println("Basamak sayisi: " + basamak);

            if (number > 0) {

                pozitif++;
            } 
            
            else {

                negatif++;

            }

            if (number % 2 != 0) {

                tek++;

            } 
            
            else {

                cift++;

            }

            sayi++;

            toplam = toplam + number;

            if (sayi == 1) {

                buyuk = number;

                kucuk = number;

            }

            if (number > buyuk) {

                buyuk = number;

            }

            if (number < kucuk) {

                kucuk = number;

            }

        }

        if (sayi > 0) {

            ortalama = (double) toplam / sayi;
            
            System.out.println("Pozitif sayi adedi: " + pozitif);
        
            System.out.println("Negatif sayi adedi: " + negatif);
        
            System.out.println("Tek sayi adedi: " + tek);
        
            System.out.println("Cift sayi adedi: " + cift);
        
            System.out.println("Girilen sayi adedi: " + sayi);
        
            System.out.println("Sayilarin toplam degeri: " + toplam);
        
            System.out.println("Ortalama: " + ortalama);
        
            System.out.println("En buyuk sayi: " + buyuk);
        
            System.out.println("En kucuk sayi: " + kucuk);

        }
    }
}