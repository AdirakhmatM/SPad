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
       Soundspeaker Rumah = new Soundspeaker();
       Soundspeaker Kamar = new Soundspeaker();
       
       Gedung.merk="Blaster X";
       Gedung.harga=1.150 ;
       Gedung.type="Portable";
       Gedung.jenis="Full Range";
       Gedung.kualitas="Terbaik";
       
       Rumah.merk="Sanken";
       Rumah.harga=770;
       Rumah.type="Portable";
       Rumah.jenis="Mid Range";
       Rumah.kualitas="Lumayan";
       
       Kamar.merk="Logitech";
       Kamar.harga=500 ;
       Kamar.type="Bluetooth";
       Kamar.jenis="Woofer";
       Kamar.kualitas="Terbaik The Best";
       
       Gedung.listensound();
       Rumah.listensound();
       Kamar.listensound();
    }            
}
