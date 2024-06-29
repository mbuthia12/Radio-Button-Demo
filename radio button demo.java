









import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetSelection extends JFrame {
    private JRadioButton birdButton;
    private JRadioButton catButton;
    private JRadioButton dogButton;
    private JRadioButton rabbitButton;
    private JRadioButton pigButton;
    private ButtonGroup group;
    private JLabel imageLabel;
    private ImageIcon birdIcon;
    private ImageIcon catIcon;
    private ImageIcon dogIcon;
    private ImageIcon rabbitIcon;
    private ImageIcon pigIcon;

    public PetSelection() {
        setTitle("RadioButtonDemo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Group the radio buttons
        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Set up the image icons
        birdIcon = new ImageIcon("bird.jpg");
        catIcon = new ImageIcon("cat.jpg");
        dogIcon = new ImageIcon("dog.jpg");
        rabbitIcon = new ImageIcon("rabbit.jpg");
        pigIcon = new ImageIcon("pig.jpg");

        // Create a panel for the radio buttons
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(5, 1));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);

        // Create a label to display the images
        imageLabel = new JLabel();
        add(radioPanel, BorderLayout.WEST);
        add(imageLabel, BorderLayout.CENTER);

        // Add action listeners to the radio buttons
        birdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(birdIcon);
                JOptionPane.showMessageDialog(null, "You selected Bird");
            }
        });
        catButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(catIcon);
                JOptionPane.showMessageDialog(null, "You selected Cat");
            }
        });
        dogButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(dogIcon);
                JOptionPane.showMessageDialog(null, "You selected Dog");
            }
        });
        rabbitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(rabbitIcon);
                JOptionPane.showMessageDialog(null, "You selected Rabbit");
            }
        });
        pigButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(pigIcon);
                JOptionPane.showMessageDialog(null, "You selected Pig");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PetSelection().setVisible(true);
            }
        });
    }
}