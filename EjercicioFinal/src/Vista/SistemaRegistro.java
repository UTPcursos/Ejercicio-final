/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
/**
 *
 * @author cartagena 
 */
import Controlador.GestionLenguaje;
import Modelo.LenguajeProgramacion;
import java.util.Scanner;
public class SistemaRegistro {
    
    public static void main(String[] args) {
        int opcion;
        Scanner lector = new Scanner(System.in);
        GestionLenguaje.AgregarLenguaje(1995, "POO", "Java", "Aplicaciones");
        GestionLenguaje.AgregarLenguaje(1991, "POO", "Payton", "IA");
        GestionLenguaje.AgregarLenguaje(1995, "desarroll", "PHP", "IA");
        GestionLenguaje.AgregarLenguaje(1957, "calculo", "Fortran", "Analisis");
        GestionLenguaje.AgregarLenguaje(2010, "desarrollo", "Rust", "Seguridad");
        GestionLenguaje.AgregarLenguaje(1987, "Archivos", "Perl", "Administracion");
        do{
            Menu();
            opcion = lector.nextInt();
            switch(opcion){
                case 1 -> {
                    System.out.println("##################################");
                    System.out.print("Ingrese el anio de Creacion: ");  
                    int anio = lector.nextInt();  
                    lector.nextLine();  
                    System.out.print("Ingrese una caracteristica Principal: ");  
                    String caracteristica = lector.nextLine();  
                    System.out.print("Ingrese el nombre del Lenguaje: ");  
                    String nombre = lector.nextLine();  
                    System.out.print("Ingrese la utilizacon: ");  
                    String utilizacion = lector.nextLine();  
                    GestionLenguaje.AgregarLenguaje(anio, caracteristica, nombre, utilizacion);
                    System.out.println("Lenguaje Agregados ");
                    System.out.println("##################################");
                    System.out.println("");
                }
                case 2 -> {
                    lector.nextLine();                     
                    System.out.println("##################################");
                    System.out.print("Ingresar lenguaje a buscar: ");
                    LenguajeProgramacion lenguajeBuscado = GestionLenguaje.BuscarLenguaje(lector.nextLine());  
                    if (lenguajeBuscado != null) {  
                        System.out.println(lenguajeBuscado);  
                    } 
                    else {  
                        System.out.println("Lenguaje no encontrado");  
                    }  
                    System.out.println("##################################");
                }
                case 3 -> {
                    lector.nextLine();
                    System.out.println("##################################");
                    System.out.print("Ingresar lenguaje a eliminar: ");
                    if (GestionLenguaje.EliminarLenguaje( lector.nextLine())) {  
                        System.out.println("Lenguaje eliminado");  
                    }
                    else {  
                        System.out.println("Lenguaje no encontrado");  
                    }                          
                    System.out.println("#################################");               
                }                    
                case 4 -> {
                    System.out.println("############################################  REPORTE LENGUAJE PROGRAMACION  ##########################################");
                    GestionLenguaje.ImprimirLenguaje();
                    System.out.println("#######################################################################################################################");
                }
                case 5 -> {
                    System.out.println("#################################");
                    System.out.println("Cerrando aplicacion...");
                }
                default -> {
                    System.out.println("#################################");
                    System.out.println("Opcion incorrecta");
                }
            }
        }while(opcion!=5);
    }
    private static void Menu(){
          String menu = """
                    ###### Seleccione#######
                    ##1.-Agregar Lenguaje ##
                    ##2.-Buscar lenguaje  ##
                    ##3.-Eliminar lenguaje##
                    ##4.-Imprimir         ## 
                    ##5.-Salir            ##  
                    ########################
                    """;
          System.out.println(menu);
    
    }   
}
