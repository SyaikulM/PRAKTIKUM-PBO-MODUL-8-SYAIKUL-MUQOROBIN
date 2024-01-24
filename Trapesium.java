/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ACER
 */
public class Trapesium extends BangunDatar implements Keliling, Simetri {
    // attributes
    public int sisi1;
    public int sisi2;
    public int tinggi;

    // methods

    @Override
    public double hitungLuas() {
        return ((sisi1 + sisi2) * tinggi) / 2.0;
    }

    @Override
    public double hitungKeliling() {
        return sisi1 + sisi2 + tinggi + Math.sqrt(sisi1 * sisi1 + sisi2 * sisi2);
    }

    @Override
    public double hitungSimPutar() {
        return 3.0;
    }

    @Override
    public double hitungSimLipat() {
        return 3.0;
    }

    @Override
    public void tampilHasil() {
        System.out.println("Trapesium");
        System.out.println("------------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
        System.out.println("Sim. Lipat: " + this.hitungSimLipat());
        System.out.println("Sim. Putar: " + this.hitungSimPutar());
}
}
