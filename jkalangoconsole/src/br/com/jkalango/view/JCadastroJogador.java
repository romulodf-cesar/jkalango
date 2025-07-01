package br.com.jkalango.view;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

//extends é herança
public class JCadastroJogador extends JFrame{
    //Construtor inicializa os componentes do formulário
    public JCadastroJogador(){
       //Título da Janela 
       setTitle("Faça parte do JKalango!");
       //Garante que a aplicação não seja finalizada
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
       //tamanho
       setSize(400,450);
       //posição ao centro
       setLocationRelativeTo(null);
       setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
       JLabel lblNome = new JLabel("Nome:");
       JTextField txtNome = new JTextField(20);
       //'JPasswordField
       add(lblNome);
       add(txtNome);
       JButton btnCadastrar = new JButton("Cadastrar");
       btnCadastrar.addActionListener(new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            String nome = txtNome.getText();
            if(nome == null || nome.trim().isEmpty()){
                JOptionPane.showMessageDialog(null,"o campo não pode ser vazio ou nullo","Erro no Sistema", JOptionPane.ERROR_MESSAGE);
            }else{
                //NovoJogador jogador = new NovoJogador(nome);
                JOptionPane.showMessageDialog(null,"Parabéns! Por participar do JKalango Community","Sistema ok",JOptionPane.INFORMATION_MESSAGE); 
            }  
        
        }
        
       });
       add(btnCadastrar);
       setVisible(true);
    }
    
}
