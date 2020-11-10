/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebasunitarias;

/**
 *
 * @author USER-PC
 */
public class MetodosPrueba {
    
    public boolean lessThanOrEqualToZero(int value){
        return value <= 0;
    }
    
    public String stutter(String word){
        String repeat = "" + word.charAt(0) + word.charAt(1) + ".. ";
        return repeat + repeat + word + "?";
    }
    
    public int totalCups(int coups){
        int freeCoups = coups / 6;
        return coups + freeCoups;
    }
    
    public int countWords(String word){
        return word.split("\\s+|\n|,").length;
    }
}
