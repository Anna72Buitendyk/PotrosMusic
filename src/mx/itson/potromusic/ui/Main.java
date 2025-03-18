/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potromusic.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
       
        Scanner scanner = new Scanner(System.in);
        Album album = new Album();
        System.out.println("Ingrese el nombre del album: ");
        String nombreAlbum = scanner.nextLine();
        album.setNombre(nombreAlbum);
               
        System.out.println("Ingrese el año de lancamiento del album");
        try{
            int year = scanner.nextInt();
            scanner.nextLine();
            album.setLanzamiento(year);
        }
        catch (Exception ex){
            System.out.println("El anio no se pudo configurar, 2000 por defaulto");
            album.setLanzamiento(2000);
        }
        
        int x = 1;
        System.out.println("Seleciona el Genero del Album");
        for ( Genero i: Genero.values()){
            System.out.println(x + ": " + i);
            x += 1;
        }
        int genero = 7;
        try {
        genero = scanner.nextInt();
        scanner.nextLine();
        }
        catch (Exception ex){
            System.out.println("Genero selecionando no valido, valor por defaulto OTRO");
            scanner.nextLine();
            
        }
        switch (genero){
            case 1 :
            album.setGenero(Genero.POP);
            break;
            case 2 :
            album.setGenero(Genero.ROCK);
            break;
            case 3 :
            album.setGenero(Genero.COUNTRY);
            break;
            case 4 :
            album.setGenero(Genero.SALSA);
            break;
            case 5 :
            album.setGenero(Genero.CRISTIANO_CONTEMPORIANO);
            break;
            case 6 :
            album.setGenero(Genero.OTRO);
            break;
            default :
            album.setGenero(Genero.OTRO);
                   
        }
        
        Artista artista = new Artista();
        System.out.println("Ingrese nombre del Artista: ");
        String nombreArtista = scanner.nextLine();
        artista.setNombre(nombreArtista);
        System.out.println("Ingrese descripcion del artista: ");
        String discripcion = scanner.nextLine();
        artista.setDescripcion(discripcion);
        System.out.println("Ingrese sitio web del artista: ");
        String sitio = scanner.nextLine();
        artista.setSitioWeb(sitio);
          
        
        album.setArtista(artista);
        
       
        List<Cancion> canciones = new ArrayList<>();
        int a = 0;
        while(true){
            try{
            System.out.println("\n\nTienes " +(a) +" canciones en tu album.");
            System.out.println("Si quieres añidir una cancion al album, ingrese 1, si no, ingrese 0 ");
            int add = scanner.nextInt();
            scanner.nextLine();
            if ( add == 0){
                break;
            }
            canciones.add( new Cancion());
            System.out.println("Ingrese el nombre del cancion:");
            String nombreCancion = scanner.nextLine();
            canciones.get(a).setNombre(nombreCancion);
            System.out.println("Ingrese el duracion (en segundos) del cancion:");
            int duracionCancion = scanner.nextInt();
            canciones.get(a).setDuracion(duracionCancion);
            System.out.println("Ingrese el orden del cancion:");
            int ordenCancion = scanner.nextInt();
            canciones.get(a).setOrden(ordenCancion);
            a +=1;
            }
            catch ( Exception ex ){
                System.out.println("Habia un error en procesar el dato ingresado, se va salir del ciclo de anidir canciones");
                break;
            }
        }
        
        album.setCanciones(canciones);
        
        
        System.out.println("\n\n\n\n#######" + album.getNombre().toUpperCase() + "#######");
        System.out.println("Artisa: " + album.getArtista().getNombre() + "  --   Lanzamiento: " + album.getLanzamiento() + "  --  Genero: " + album.getGenero() );
         for (int i = 0; i < canciones.size(); i++){
        System.out.println(album.getCanciones().get(i).getOrden() + ". " + album.getCanciones().get(i).getNombre() + "  --  " + album.getCanciones().get(i).getDuracion() + " ( segundos)");
        }
        System.out.println("\n\n\n\n");
        System.out.println("####### INFO DEL ARTISTA #######");
        System.out.println("NOMBRE: " + artista.getNombre());
        System.out.println("DESCRIPCION: " + artista.getDescripcion());
        System.out.println("SITIO WEB: " + artista.getSitioWeb());
   
        
        
       
        
    }
}