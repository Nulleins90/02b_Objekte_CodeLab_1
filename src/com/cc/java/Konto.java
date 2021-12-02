package com.cc.java;

public class Konto {
    // Variablen
    private String kontoName;
    private int kontostand;
    
    // Konstruktor
    public Konto(String kontoName, int kontostand) {
        this.kontostand = kontostand;
        this.kontoName = kontoName;
    }

    // Wie viel ist im Moment auf dem Konto
    public void currentKontostand() {
        System.out.println("Derzeitiger Kontostand von " + kontoName + " ist: " + kontostand);
    }

    //Getter und Setter
    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }
   
}
