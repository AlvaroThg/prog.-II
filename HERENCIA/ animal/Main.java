/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args){
        Animal animal = new Animal();
        try{
            animal.setNombre("Luis");
            System.out.println(animal.getNombre());
            
            animal.setPatas(4);
            System.out.println(animal.getPatas());
           
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(null, 
                e.getMessage(),
                "Error",    
                JOptionPane.ERROR_MESSAGE
            );
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, 
                e.getMessage(),
                "Error",    
                JOptionPane.ERROR_MESSAGE
            );    
        }
        System.out.println("Fin");
    }
    
}
