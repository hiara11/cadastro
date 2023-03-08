import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame{
    private JPanel TelaInicial;
    private JTextField textUsuario;
    private JPasswordField pswSenha;
    private JButton btnOK;
    private JLabel lblUsuario;
    private JLabel lblSenha;
public TelaLogin() {
    iniciarComponentes();
    criarListeners();
}
    public void iniciarComponentes(){
        setTitle("Tela de login");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(TelaInicial);
        setVisible(true);
    }
public void criarListeners(){
    btnOK.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            validarLogin();
        }
    });
}
    private void validarLogin(){
        String usuario = textUsuario.getText();
        String senha = new String(pswSenha.getPassword());

        if (usuario.equals("admin") && senha.equals("admin")){
            telaMenu menu = new telaMenu();
            menu.setVisible(true);
            dispose();
        }else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorreta");
        }}

    public static void main(String[] args) {
    TelaLogin iniciar = new TelaLogin();

}
}
