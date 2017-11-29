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
public class Triangulo extends Figura{
    private double altura;
    private double base;
    private double ladoA;
    private double ladoB;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    public double area(){
        return (base*altura)/2;
    }

    public Triangulo(double base, double ladoA, double ladoB) {
        this.base = base;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    
    public double perimetro(){
        return base+ladoA+ladoB;
    }
    
}
