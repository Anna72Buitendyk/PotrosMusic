/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potromusic.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.potromusic.entidades.Album;
import mx.itson.potromusic.entidades.Artista;
import mx.itson.potromusic.entidades.Cancion;
import mx.itson.potromusic.enums.Genero;

/**
 *
 * @author alumnog
 */
public class Main {
    
    public static void main(String[] args) {
        
        Album adu = new Album();
        adu.setNombre("Audencia de Uno");
        
        Artista ad1 = new Artista();
        ad1.setNombre("Audencia de Uno");
        ad1.setDescripcion("Colosenses 3:23");
        ad1.setSitioWeb("www.youtube.com/@audienciadeuno1550");
        
        adu.setArtista(ad1);
        adu.setGenero(Genero.CRISTIANO_CONTEMPORIANO);
        adu.setLanzamiento(2020);
        
        List<Cancion> canciones = new ArrayList<>();
        
        Cancion CC = new Cancion();
        CC.setNombre("Camino a Casa");
        CC.setDuracion(196);
        CC.setOrden(1);
        
        Cancion SLD = new Cancion();
        SLD.setNombre("Se Llama Dios");
        SLD.setDuracion(323);
        SLD.setOrden(2);
        
        Cancion F_M = new Cancion();
        F_M.setNombre("Fantasma del Mar");
        F_M.setDuracion(145);
        F_M.setOrden(3);
        
        Cancion MF = new Cancion();
        MF.setNombre("Es mas Facil");
        MF.setDuracion(257);
        MF.setOrden(4);
        
        

        
    }
}
