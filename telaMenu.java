import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaMenu extends JFrame{
    private JButton btnCadProdutos;
    private JButton btnCadUsuario;
    private JPanel pnlTelaMenu;
    public telaMenu() {
        initComponetns();
        createListeners();
    }
    public void initComponetns() {
      setTitle("Tela de Cadastro de produto");
      setSize(300, 150);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(pnlTelaMenu);
      setVisible(true);
    }
    public void createListeners(){
        btnCadUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastroTela cadUsuario = new CadastroTela();
                cadUsuario.setVisible(true);
                dispose();
            }
        });
        btnCadProdutos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastroProduto cadProduto = new CadastroProduto();
                cadProduto.setVisible(true);
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        telaMenu Menu = new telaMenu();
  }}

