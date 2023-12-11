/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exampleapp.login;

import java.io.Serializable;

/**
 * Clase modelo para los empleados
 */
public class EmpleadoModel implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int id_empleado;
    private String nombre;
    private String correo;
    private String telefono;

    public EmpleadoModel() {
    }
    
    public EmpleadoModel(int id, String nombre,String correo,String telefono){
        this.id_empleado = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public int getIdEmpleado(){
        return this.id_empleado;
    }
    
    public void setIdEmpleado(int id){
        this.id_empleado = id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getCorreo(){
        return this.correo;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}
