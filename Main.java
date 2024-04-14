import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main extends JFrame {
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");

    private JButton jButtonSair = new JButton("Sair");

    public Main() {
        this.setTitle("Lotofácil - GUI");
        this.setSize(400, 250);
        this.painel.setLayout(new FlowLayout(1, 100, 20));
        this.painel.setBackground(new Color(255, 255, 255));
        this.painel.add(this.jButtonAposta1);
        this.painel.add(this.jButtonAposta2);
        this.painel.add(this.jButtonAposta3);
        this.painel.add(this.jButtonSair);
        this.jButtonAposta1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String aposta1 = JOptionPane.showInputDialog((Component)null, "Digite um número de 0 a 100");
                Random rnd = new Random();
                int sorteio = rnd.nextInt(101);
                int numeroApostado = Integer.parseInt(aposta1);
                if (numeroApostado == sorteio) {
                    JOptionPane.showMessageDialog((Component)null, "Você ganhou!");
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Você perdeu! O número sorteado foi " + sorteio);
                }

            }
        });
        this.jButtonAposta2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String aposta2 = JOptionPane.showInputDialog((Component)null, "Digite uma letra de A à Z: ");
                char letraSorteada = 'B';
                char letraApostada = aposta2.charAt(0);
                if (Character.isLetter(letraApostada)) {
                    char letraApostadaMaiusculo = Character.toUpperCase(letraApostada);
                    if (letraApostadaMaiusculo == letraSorteada) {
                        JOptionPane.showMessageDialog((Component)null, "Você ganhou 500 reais.");
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "Você perdeu! A letra sorteada foi: " + letraSorteada);
                    }
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Não é uma letra válida.");
                }

            }
        });
        this.jButtonAposta3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String aposta3 = JOptionPane.showInputDialog((Component)null, "Digite um número: ");
                int numeroApostado = Integer.parseInt(aposta3);
                if (numeroApostado % 2 == 0) {
                    JOptionPane.showMessageDialog((Component)null, "Você ganhou 100 reais.");
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Você perdeu!");
                }

            }
        });

        this.jButtonSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        this.getContentPane().add(this.painel);
        this.setLocationRelativeTo((Component)null);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
