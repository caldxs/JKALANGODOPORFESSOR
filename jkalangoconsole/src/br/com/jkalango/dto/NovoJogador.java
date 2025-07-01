package br.com.jkalango.dto;

import javax.swing.JOptionPane;

public class NovoJogador {

    private String nome;

    public NovoJogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarNome() {
        if (nome == null || !nome.contains("java")) {
            JOptionPane.showMessageDialog(null, "E necessario conter o nome JAVA vinculado ao seu nome'.");
        } else {
            JOptionPane.showMessageDialog(null, "Bem vindo, SuperJava");
        }
    }
}