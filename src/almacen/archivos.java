/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen;

import informacion.convertir;
import informacion.datos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GAARA
 */
public class archivos {
    List<datos> contenido = new ArrayList<>();
    
    public List<datos> leer(){
        String linea;
        try { 
            FileReader archivo = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(archivo);
            while((linea = br.readLine()) != null){
                System.out.println("valor de linea = " + linea);
            }
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        return null;
    }
    public boolean grabar(datos cadena){
        convertir convertir = new convertir();
        boolean estado = true;
        try {
            FileWriter archivo = new FileWriter("datos.txt",true);
            BufferedWriter bw = new BufferedWriter(archivo);
            bw.write(convertir.ajson(cadena)+"\n");
            bw.close();
            archivo.close();
            
        } catch (IOException ex) {
           ex.printStackTrace();
           estado = false;
        }
        return estado;
    }

}
