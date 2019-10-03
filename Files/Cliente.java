package main.java.com.banus;
import java.lang.Exception;

import javax.swing.JOptionPane;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String usuario;
    private String contrasenia;
    private double dinero;


    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String usuario, String contrasenia, double dinero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.dinero = dinero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public double getDinero() {
        return this.dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void ingresarDinero(double cantidad) {
        this.dinero += cantidad;
    }

    public void retirarDinero(double cantidad) {
        if (cantidad > this.dinero)
            throw new Error("La cantidad introducida es mayor al dinero que tienes");

        this.dinero -= cantidad;
    }

	public static void ingresarDatos(Cliente cliente) {  
	    cliente.setUsuario(JOptionPane.showInputDialog(null, "Introduzca su usuario: ", "Ingresar datos", JOptionPane.INFORMATION_MESSAGE));   
	    cliente.setContrasenia(JOptionPane.showInputDialog(null, "Introduzca su contraseña: ", "Ingresar datos", JOptionPane.INFORMATION_MESSAGE));
	}


}