package com.banus;

import java.util.Scanner;
import java.lang.Exception;
import javax.swing.JOptionPane;

import main.java.com.banus.Cliente;

/**
 * Hello world!
 */
public final class App {

    public static void elegirOpcion() {
        JOptionPane.showInputDialog(null, "1.- Ingresar dinero\n2.- Retirar dinero\n3.- Salir", "Menú banco", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void ingresarDatos(Cliente cliente) { 
    	JOptionPane.showMessageDialog(null, "Para ingresar en la cuenta;\nuser: maK\npassword: maK12", "Info", JOptionPane.INFORMATION_MESSAGE);
        cliente.setUsuario(JOptionPane.showInputDialog(null, "Introduzca su usuario: ", "Ingresar datos", JOptionPane.INFORMATION_MESSAGE));   
        cliente.setContrasenia(JOptionPane.showInputDialog(null, "Introduzca su contraseña: ", "Ingresar datos", JOptionPane.INFORMATION_MESSAGE));
    }

    public static void mostrarDinero(Cliente cliente) {
        JOptionPane.showMessageDialog(null, "Cantidad actual de dinero: " + cliente.getDinero() + " euros", "Info de dinero", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String user = "Hello", password = "123";
        Cliente cliente1 = new Cliente();
        int opcion;

        ingresarDatos(cliente1);

        try {
            if (cliente1.getUsuario().equals(user) && cliente1.getContrasenia().equals(password)) {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Ingresar dinero\n2.- Retirar dinero\n3.- Salir", "Menú banco", JOptionPane.INFORMATION_MESSAGE));
                
                while(opcion != 3) {
                    switch(opcion) {
    
                        case 1:
                            cliente1.ingresarDinero(Double.parseDouble(JOptionPane.showInputDialog(null, "Cantidad de dinero para ingresar: ", "Ingresar dinero", JOptionPane.INFORMATION_MESSAGE)));
                            break;
                        case 2:
                            cliente1.retirarDinero(Double.parseDouble(JOptionPane.showInputDialog(null, "Dinero actual: " + cliente1.getDinero() + 
                            "\nDinero para retirar: ", "Ingresar dinero", JOptionPane.INFORMATION_MESSAGE)));
                            break;
                    }
                    
                    mostrarDinero(cliente1);
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Ingresar dinero\n2.- Retirar dinero\n3.- Salir", "Menú banco", JOptionPane.INFORMATION_MESSAGE));
                }
                
            }else {
                JOptionPane.showMessageDialog(null, "Error en uno o más datos ingresados", "Error al ingresar datos", JOptionPane.ERROR_MESSAGE);
            }
        }catch (Error e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        

    }
}
