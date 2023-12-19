/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

import ifce.atividade2.Cachorro;
import ifce.atividade2.Cavalo;
import ifce.atividade2.Preguiça;
import ifce.atividade2.Veterinario;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Cavalo cavalo = new Cavalo();
        Preguiça preguiça = new Preguiça();
        Veterinario veterinario = new Veterinario();
        
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguiça);
        
        
        
    }
    
}
