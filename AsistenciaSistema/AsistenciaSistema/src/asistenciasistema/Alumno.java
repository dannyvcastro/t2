/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistenciasistema;

/**
 *
 * @author danny
 */
public class Alumno {
    private Asistencia[] asistencias = new Asistencia[100];
    private String Nombre ;
    private int actual=0;

    public Asistencia[] getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(Asistencia[] asistencias) {
        this.asistencias = asistencias;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
    
    public Alumno(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void ingresarAsistencia(boolean asistio, String fecha){
        Asistencia nueva = new Asistencia(asistio,fecha);
        this.asistencias[this.actual]=nueva;
        this.actual++;
    }
}
