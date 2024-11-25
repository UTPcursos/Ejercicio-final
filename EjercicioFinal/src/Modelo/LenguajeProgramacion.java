/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cartagena 
 */
public class LenguajeProgramacion {
    private int anioCreacion;
    private String caracteristecaPrincipal;
    private String nombre;
    private String utilizacion;

  public LenguajeProgramacion(int anioCreacion, String caracteristecaPrincipal, String nombre, String utilizacion){
     this.anioCreacion = anioCreacion;
     this.caracteristecaPrincipal = caracteristecaPrincipal;
     this.nombre = nombre;
     this.utilizacion = utilizacion;
  }
    
  @Override
  public String toString(){
      return  "- Lenguaje programacion = " +
              " Anio creacion: " + anioCreacion +
              "  Caracteristica principar: " + caracteristecaPrincipal +
              "  Nombre: " + nombre +
              "  Utilizacion: " + utilizacion +
              "-";
                    
  }
    public int getAnioCreacion() {
        return anioCreacion;
    }
    public void setAnioCreacion(int AnioCreacion) {
        this.anioCreacion = AnioCreacion;
    }


    public String getCaracteristecaPrincipal() {
        return caracteristecaPrincipal;
    }
    public void setCaracteristecaPrincipal(String CaracteristecaPrincipal) {
        this.caracteristecaPrincipal = CaracteristecaPrincipal;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }


    public String getUtilizacion() {
        return utilizacion;
    }
    public void setUtilizacion(String Utilizacion) {
        this.utilizacion = Utilizacion;
    }
    
            
    
}
