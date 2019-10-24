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
public class Bola extends BangunRuang{

    @Override
    public double HitungVolume() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double volume = (4*Math.PI*this.getR()*this.getR()*this.getR())/3;
        return volume;
    }
    
    
}
