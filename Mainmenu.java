import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    private JPanel panelMain;
    private JButton LOADSAVEDGAMEButton1;
    private JButton PLAYButton;
    private JButton EXITButton;
    private JButton OPTIONSButton;
    private JLabel ImageLogo;
    private JPanel mainTextPanel;
    private JPanel choiceButtonPanel;
    private JButton Choice1;
    private JButton Choice2;
    private JButton Choice3;
    private JTextArea TextArea;
    private JLabel ImageLogo1;


    public Game() {
        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource() == EXITButton) {
                    System.exit(0);
                }
            }
        });
        PLAYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource() == PLAYButton) {
                    createGameScreen();

                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Horror Game");
        frame.setContentPane(new Game().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1000, 1000);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        ImageLogo = new JLabel(new ImageIcon("horror7.png"));


    }


    public void createGameScreen() {


        JFrame frame = new JFrame("Scene 1");
        frame.setContentPane(new Game().mainTextPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1000, 1000);

    }
}
