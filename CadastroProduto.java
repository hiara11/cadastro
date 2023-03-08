import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroProduto extends JFrame {
    private JTextField txtCodigo;
    private JTextField txtDescricao;
    private JTextField txtPreco;
    private JTextField txtQuantidadeEstoque;
    private JLabel lblCodigo;
    private JLabel lblDescricao;
    private JLabel lblPreco;
    private JLabel lblQuantidadeEstoque;
    private JButton enviar1Button;
    private JPanel pnlCadastroProduto;

    public CadastroProduto() {
        criarListeners();
        initComponetns();
    }
    public void criarListeners() {
        enviar1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String descricao = txtDescricao.getText();
                String preco = txtPreco.getText();
                String quantidadeEstoque = txtQuantidadeEstoque.getText();

                JOptionPane.showMessageDialog(enviar1Button, "O seguinte usuario foi cadastrado!"
                        + "codigo " + codigo + "\n"
                        + "descricao " + descricao + "\n"
                        + "preco " + preco + "\n"
                        + "quantidadeEstoque " + quantidadeEstoque
                );
            }
        });
    }
    public void initComponetns() {
        setTitle("Tela de Cadastro de produto");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlCadastroProduto);
        setVisible(true);
    }
    public static void main(String[] args) {
        CadastroProduto Menu = new CadastroProduto();
    }
}

