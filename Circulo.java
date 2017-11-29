/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author USUARIO
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double area(){
        return Math.PI*(radio*radio);
    }
    public double perimetro(){
        return (2*Math.PI)*radio;
    }
}
