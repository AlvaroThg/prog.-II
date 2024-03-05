/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Usuario
 */
public class Animal {
    private String nombre = "lucho"; 
    private int patas = 4; 
    
    public String getNombre(){
        return "Mi nombre es " + this.nombre;
    }
    
    public void setNombre(String value)throws Exception{
        if (value.length() > 10){
            throw new Exception("Fuera de rango");
        }
        this.nombre = value; 
    }
    
    public String getPatas(){
        return "Tengo " + this.patas; 
    }
    
    public void setPatas(int value)throws Exception{
        if (value == 3 || value < 2){
            throw new RuntimeException("Que animal tiene 3 o menos de 2 patas?");
        }
        this.patas = value;
    }
    
    
}
