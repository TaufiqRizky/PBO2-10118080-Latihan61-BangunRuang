/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan61.bangunruang;

/**
 *
 * @author USER
 */
public abstract class BangunRuang {
    private double r,h;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

  
   //public abstract double HitungVolume(int r);
   public abstract double HitungVolume();
}
