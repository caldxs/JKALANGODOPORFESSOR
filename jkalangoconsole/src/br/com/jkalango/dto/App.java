package br.com.jkalango.dto;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o nome do jogador:");

        NovoJogador jogador = new NovoJogador(nome);

        jogador.verificarNome();
    }
}
