package br.com.jkalango.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JCadastroJogador extends JFrame {
    public JCadastroJogador() {
        setTitle("Faça parte do JKalango!");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 450);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField(20);

        add(lblNome);
        add(txtNome);

        JButton btnCadastrar = new JButton("Cadastrar");

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText().trim();

                if (nome.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Posso favor preencher espaco em branco!", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso, Parabens por fazer o cadastro no JKalangoAPP!");
                }
            }
        });

        add(btnCadastrar);
        setVisible(true);
    }
}
