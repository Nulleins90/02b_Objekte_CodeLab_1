package com.cc.java;

public class App {
    public static void main(String[] args) {
        // Konti generieren
        Konto konto1 = new Konto("Konto 1", 10000);
        Konto konto2 = new Konto("Konto 2", 10000);
        Konto konto3 = new Konto("Konto 3", 10000);
        
        // Anfangswert der Konti
        konto1.currentKontostand();
        konto2.currentKontostand();
        konto3.currentKontostand();

        // Werte mit direkter Multiplikation
        konto1.setKontostand(konto1.getKontostand() * 2);
        konto2.setKontostand(konto2.getKontostand() * 3);
        konto3.setKontostand(konto3.getKontostand() * 10);

        System.out.println("--------------------------------------------");

        // Schlusswert der Konti
        konto1.currentKontostand();
        konto2.currentKontostand();
        konto3.currentKontostand();
    }

    // Multiplikator
    public static Integer multiplyBy(int value, int multiplier) {
        return value * multiplier;
    }
    
    // public static void output(String outputStr){
    //     System.out.println(outputStr);
    // }

}
