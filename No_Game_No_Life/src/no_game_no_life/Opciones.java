/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no_game_no_life;

import javax.swing.JOptionPane;

/**
 *
 * @author 52614
 */
// Esta clase "opciones" , sirve para comenzar con el juego.

public class Opciones {
    //atributos con "protected ya que es mas conveniente para su uso en otras clases

    private String[] yesOrnO = {"Si", "No"};
    protected int atributosPerso;
    protected int inteligencia;
    protected int fuerza;
    protected int pereza;
    protected int haSocial;

    public void mostrarOpciones() {

        /* 
        Esta parte del código hace que  se muestre una pregunta en pantalla haciendo uso de un string con 
        las opciones además usa la biblioteca JOptionPane para poder mostrar el texto y las opciones en 
        pantalla, guardando la respuesta en un número entero
         */
        
        String[] opciones = {"+5 puntos inteligencia", "+5 puntos fuerza", "+ 5 puntos habilidad social", "+5 puntos pereza"};
        int seleccion = JOptionPane.showOptionDialog(null, " " + "Selecciona una opción", "Opciones",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        /*
        Al estar guardadas las opciones en un entero hace posible el uso de un switch y así, dependiendo de la opción 
        elegida se mostrara otra pantalla de opciones distinta, así funciona para todos los casos
         */
        
        switch (seleccion) {
            case 0:
                atributosPerso = JOptionPane.showOptionDialog(null, " " + "¿Estas seguro que quieres esos puntos?", "YesOrnO",
                        JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, yesOrnO, yesOrnO[0]);
                if (atributosPerso == JOptionPane.YES_OPTION) {
                    inteligencia += 5;
                    JOptionPane.showMessageDialog(null, "Felicidades ahora tienes inteligencia nivel " + inteligencia);
                } else if (atributosPerso == JOptionPane.NO_OPTION) {
                    mostrarOpciones();
                }

                break;

            case 1:
                atributosPerso = JOptionPane.showOptionDialog(null, " " + "¿Estas seguro que quieres esos puntos?", "YesOrnO",
                        JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, yesOrnO, yesOrnO[0]);
                if (atributosPerso == JOptionPane.YES_OPTION) {
                    fuerza += 5;
                    JOptionPane.showMessageDialog(null, "Felicidades ahora tienes fuerza nivel " + fuerza);
                } else if (atributosPerso == JOptionPane.NO_OPTION) {
                    mostrarOpciones();
                }

                break;
            case 2:
                atributosPerso = JOptionPane.showOptionDialog(null, " " + "¿Estas seguro que quieres esos puntos?", "YesOrnO",
                        JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, yesOrnO, yesOrnO[0]);
                if (atributosPerso == JOptionPane.YES_OPTION) {
                    haSocial += 5;
                    JOptionPane.showMessageDialog(null, "Felicidades ahora tienes habilidad social nivel " + haSocial);
                } else if (atributosPerso == JOptionPane.NO_OPTION) {
                    mostrarOpciones();
                }
                break;
            case 3:
                atributosPerso = JOptionPane.showOptionDialog(null, " " + "¿Estas seguro que quieres esos puntos?", "YesOrnO",
                        JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, yesOrnO, yesOrnO[0]);
                if (atributosPerso == JOptionPane.YES_OPTION) {
                    pereza += 5;
                    JOptionPane.showMessageDialog(null, "¿Felicidades? ¿se supone que eso es bueno? tienes pereza nivel " + pereza);
                } else if (atributosPerso == JOptionPane.NO_OPTION) {
                    mostrarOpciones();
                }

                break;
            default:
                JOptionPane.showMessageDialog(null, "No has seleccionado ninguna opción");
                break;
        }
    }
}
