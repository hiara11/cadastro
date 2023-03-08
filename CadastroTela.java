import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroTela extends JFrame {
    private JTextField textNome;
    private JTextField textSobreNome;
    private JTextField textSetor;
    private JTextField textFuncao;
    private JTextField textLogin;
    private JTextField textSenha;
    private JLabel lblSenha;
    private JLabel lblLogin;
    private JLabel lblFuncao;
    private JLabel lblSetor;
    private JLabel lblSobrenome;
    private JLabel lblNome;
    private JButton enviarButton;
    private JPanel pnlCadastroTela;

    public CadastroTela(){
        criarListeners();
        initComponetns();
    }
    public void criarListeners() {
    enviarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = textNome.getText();
            String sobreNome = textSobreNome.getText();
            String setor = textSetor.getText();
            String funcao = textFuncao.getText();
            String login = textLogin.getText();
            String senha = textSenha.getText();

            JOptionPane.showMessageDialog(enviarButton, "O seguinte usuario foi cadastrado!"
             + "nome: " + nome + "\n"
             + "sobrenome: " + sobreNome + "\n"
             + "setor: " + setor + "\n"
             + "funcao: " + funcao + "\n"
             + "login: " + login + "\n"
             + "senha: " + senha
            );
        }
    });
    }

    public void initComponetns() {
        setTitle("Tela de Cadastro de produto");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlCadastroTela);
        setVisible(true);
    }
    public static void main(String[] args) {
        CadastroTela Menu = new CadastroTela();
    }
}