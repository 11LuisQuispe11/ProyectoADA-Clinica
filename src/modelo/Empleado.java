/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author luigg
 */
public class Empleado extends Persona{
    
    private String especialidad;

    public Empleado(String especialidad, String codigo, String nombre, String apellidoP, String apellidoM, String dni, char sexo, String celular, String correo, boolean estado) {
        super(codigo, nombre, apellidoP, apellidoM, dni, sexo, celular, correo, estado);
        this.especialidad = especialidad;
    }
    
    
}