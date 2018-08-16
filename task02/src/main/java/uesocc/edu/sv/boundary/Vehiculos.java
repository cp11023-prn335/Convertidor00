/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.boundary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author william
 */
@LocalBean
@Stateless
public class Vehiculos implements Serializable  {
     FileReader archivo;
     BufferedReader lector;    
     List<String> listaPlacas=new ArrayList<>();   
    // String direccion="/home/william/Escritorio/PlacasGuia2";

     
         
//Metodo para convertir el archivo cargado en lista de tipo Strint List<String>
 public List<String>crearLista(){
   
        
        try {
            archivo=new FileReader("");
            
            if(archivo.ready()){
               lector=new BufferedReader(archivo);
               String linea;
                while ( (linea=lector.readLine()) !=null  ){
               //Se añada a la 
                    listaPlacas.add(linea);
                }
            }else{
                System.out.println("El archivo no esta listo para ser leído");
            }
            
            
        } catch (Exception e) {
            System.err.println("Error: "+e.getMessage());
        }
      return listaPlacas;
    }
 
 //recorrer lista de placas
 


//Metodo que valide la lista de placas

//met

    
//Metodo 4 lista de placas repetidas 
//Listado con todas las placas válidas y el número de veces que se repite.    
    
 
 
 
 
 
 
 
 
    
}
