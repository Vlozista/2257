
package mx.unam.aragon.fes.persistencia;

import java.util.ArrayList;
import mx.unam.aragon.fes.Empleado;


public class ArchivoEmpleado {
    private String archivo;

    public ArchivoEmpleado() {
    }

    public ArchivoEmpleado(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    public void guardarEmpleados(ArrayList<Empleado> datos){
        //aqui el codigo para grabar el Disco Duro
    }
    
    public ArrayList<Empleado> LeerEmpleados(){
        ArrayList<Empleado> tmp=null;
        
        //Leer del disco duro
        //se sube el ArrayList tmp
   
        return tmp;
    
    }
    
}
