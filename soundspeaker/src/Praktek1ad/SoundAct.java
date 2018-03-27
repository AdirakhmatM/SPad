/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek1ad;

/**
 *
 * @author Adrama
 */
public class SoundAct {
    public static void main(String[] args){
       Soundspeaker Gedung = new Soundspeaker(); 
       
       Gedung.merk="Blaster X";
       Gedung.harga=1.150 ;
       Gedung.type="Portable";
       Gedung.jenis="Full Range";
       Gedung.kualitas="Terbaik";
       
       Gedung.listensound();
    }            
}
