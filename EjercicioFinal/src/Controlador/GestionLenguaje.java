/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author cartagena 
 */
import Modelo.LenguajeProgramacion;
public class GestionLenguaje {
    private static int contadorLenguaje =0;
    private static final int FACTOR_CRECIMIENTO = 2;
    private static LenguajeProgramacion[] arregloLenguaje = new LenguajeProgramacion[FACTOR_CRECIMIENTO];
    
    public static void AgregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion){
        if(contadorLenguaje==arregloLenguaje.length){
            LenguajeProgramacion[] lenguajeExtendido=new LenguajeProgramacion[arregloLenguaje.length*FACTOR_CRECIMIENTO];
            System.arraycopy(arregloLenguaje,0,lenguajeExtendido,0,arregloLenguaje.length);
            arregloLenguaje=lenguajeExtendido;
        }
         LenguajeProgramacion nuevoLenguaje = new LenguajeProgramacion(anioCreacion,caracteristicaPrincipal, nombre, utilizacion);
         arregloLenguaje[contadorLenguaje] = nuevoLenguaje;
         
        contadorLenguaje++;
    }
    
    public static LenguajeProgramacion BuscarLenguaje(String nombre){
        for(int i=0; i<contadorLenguaje;i++){
            if(arregloLenguaje[i].getNombre().equalsIgnoreCase(nombre)){
                return arregloLenguaje[i];
            }        
        }
        return null ;
    }
    public static boolean EliminarLenguaje (String nombre){
        for (int i = 0; i < contadorLenguaje; i++) {
            if (arregloLenguaje[i].getNombre().equalsIgnoreCase(nombre)) {
                // Desplazar elementos hacia la izquierda
                for (int j = i; j < contadorLenguaje - 1; j++) {
                    arregloLenguaje[j] = arregloLenguaje[j + 1];
                }
                arregloLenguaje[contadorLenguaje - 1] = null; 
                contadorLenguaje--; 
                return true; 
            }
        }
        return false; 
    }
    
    public static void ImprimirLenguaje(){
        for(int i=0;i<contadorLenguaje;i++){
            if(arregloLenguaje[i]!=null){
            System.out.println(arregloLenguaje[i]);
            }
        }
    }
    public static LenguajeProgramacion[] getArregloLenguaje() {
        return arregloLenguaje;
    }
    
}
