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

//Esta es una subclase de la clase "opciones" en la que se muestran distintos métodos para distintas escenas

public class Escenario extends Opciones {

    protected String[] Cuestion = {"Estudiar un rato", "hacer ejercicio", "salir al parque", "quedarte acostado"};
    protected String[] decision = {"estudiar matematicas", "estudiar historia", "estudiar un instrumento", "aprender algo nuevo"};
    protected int seleccioner;
    protected String[] decision2 = {"salir a correr", "ir al gimnasio", "calistenia", "bailar"};

    /*
    Esta escena muestra Diálogos y opciones que se pueden tomar en casa con el mismo funcionamiento que los switch
    anteriores, solo que hay switch en los que aún se están trabajando
     */
    public void EscenaCasa() {

        int seleccioneh = JOptionPane.showOptionDialog(null, " " + "Estas en tu casa en una tarde de verano y te aburres  ¿Que haces para no estarlo?", "Tarde de verano",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, Cuestion, Cuestion[0]);

        switch (seleccioneh) {
            case 0:
                seleccioner = JOptionPane.showOptionDialog(null, " " + "¿Que es lo que decides estudiar?", "Tarde de verano",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, decision, decision[0]);
                if (seleccioner == 0) {
                    super.inteligencia += 3;
                    JOptionPane.showMessageDialog(null, "Tu inteligencia a subido a nivel " + super.inteligencia);
                }

                break;

            case 1:
                seleccioner = JOptionPane.showOptionDialog(null, " " + "¿Que tipo de ejercicio haras?", "Tarde de verano",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, decision2, decision2[0]);
                if (seleccioner == 0) {

                    JOptionPane.showMessageDialog(null, "tu fuerza ha aumentado a nivel  " + fuerza + "¡Que fuerte!");

                }

                break;

            case 2:

                break;

            case 3:

                break;

            default:

                break;
            //continuara....

        }
    }
}
