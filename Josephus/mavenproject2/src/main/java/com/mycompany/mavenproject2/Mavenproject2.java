/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Administrator
 */

import java.util.ArrayList;
import java.util.List;

public class Mavenproject2 {

    public static void main(String[] args) {
        int numDePessoas = 20;
        int numDePulos = 2;

        List<Integer> sobreviventes = new ArrayList<>();
        for (int i = 1; i <= numDePessoas; i++) {
            sobreviventes.add(i);
        }

        int indiceAtual = 0;
        while (sobreviventes.size() > 1) {
            for (int i = 0; i < numDePulos; i++) {
                indiceAtual = (indiceAtual + 1) % sobreviventes.size();
            }
            int pessoaEliminada = sobreviventes.remove(indiceAtual);
            System.out.println("Pessoa " + pessoaEliminada + " foi eliminada.");
        }

        System.out.println("Pessoa sobrevivente é: " + sobreviventes.get(0));
    }
}
