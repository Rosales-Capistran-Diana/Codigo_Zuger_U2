/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no_game_no_life;

import javax.swing.JOptionPane;

/**
 *
 * @author 52614
 */
public class No_Game_No_Life {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Método principal que se ejecuta al iniciar el programa.

        // Se muestra un mensaje de bienvenida y se pide el nombre del personaje.
        JOptionPane.showMessageDialog(null, "¡BIENVENIDO A NO GAME NO LIFE!");
        String respuesta = JOptionPane.showInputDialog(null, "Escribe el nombre de tu personaje");
        JOptionPane.showMessageDialog(null, respuesta + " " + "es hora de que comiences tu aventura en este mundo ¡Primero selecciona una estadistica base!");

        //objetos de las clases y subclases
        Opciones opciones = new Opciones();
        opciones.mostrarOpciones();
        Escenario Esc = new Escenario();
        Esc.EscenaCasa();
    }
}
