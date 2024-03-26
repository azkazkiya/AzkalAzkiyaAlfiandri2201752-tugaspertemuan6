/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbopert6;

/**
 *
 * @author azkiy
 */
public class PersegiPanjang {
    private int panjang;
    private int lebar;
    
    public PersegiPanjang(){
        panjang = 0;
        lebar = 0;
    }
    
    //konstruktor
    public PersegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
    }
    
    //method luas
    public int getLuas(){
        return panjang * lebar;
    }
 
    //method keliling
    public int getKeliling(){    
        return 2 * (panjang + lebar);
    }
    
    public void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    
    public void setLebar(int lebarBaru){
        lebar = lebarBaru;
    }
    

}

