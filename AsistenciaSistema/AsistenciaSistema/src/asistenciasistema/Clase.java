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
public class Clase {
    String curso;
    private Alumno[] alumnos = new Alumno[10];
    int actual=0;
    
    Clase() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Clase(String curso) {
        this.curso = curso;
    }

    
    public void ingresarAsistencia(int i,boolean asistio, String fecha){
       this.alumnos[i].ingresarAsistencia(asistio, fecha);
       this.actual=this.alumnos[i].getActual();
    }
    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
    
}
