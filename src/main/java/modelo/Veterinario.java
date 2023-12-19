/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

import modelo.Animal;

/**
 *
 * @author Alunos
 */
public class Veterinario {

    /**
     * @param animal
     */
    public void examinar(Animal animal) {
        System.out.println("Examinando animal");
        animal.emitirSom();
    }
    
}
