/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_ianlagos;

/**
 *
 * @author ian
 */
public class Usuarios {
    private String nombre;
    private String User;
    private int edad;
    private String contraseña;
    private String nacimiento;

    public Usuarios(String nombre, String User, int edad, String contraseña, String nacimiento) {
        this.nombre = nombre;
        this.User = User;
        this.edad = edad;
        this.contraseña = contraseña;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
}
