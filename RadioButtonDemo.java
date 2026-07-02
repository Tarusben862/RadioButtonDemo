import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class RadioButtonDemo extends JFrame implements ActionListener
{
    JRadioButton bird, cat, dog, rabbit, pig;
    ButtonGroup pets;
    JLabel picture;

    ImageIcon birdPic = new ImageIcon("bird.jpg");
    ImageIcon catPic = new ImageIcon("cat.jpg");
    ImageIcon dogPic = new ImageIcon("dog.jpg");
    ImageIcon rabbitPic = new ImageIcon("rabbit.jpg");
    ImageIcon pigPic = new ImageIcon("pig.jpg");

    public RadioButtonDemo()
    {
        setTitle("RadioButtonDemo");
        setSize(600,350);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        pets = new ButtonGroup();

        pets.add(bird);
        pets.add(cat);
        pets.add(dog);
        pets.add(rabbit);
        pets.add(pig);

        bird.addActionListener(this);
        cat.addActionListener(this);
        dog.addActionListener(this);
        rabbit.addActionListener(this);
        pig.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1));

        panel.add(bird);
        panel.add(cat);
        panel.add(dog);
        panel.add(rabbit);
        panel.add(pig);

        picture = new JLabel();

        add(panel);
        add(picture);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(bird.isSelected())
        {
            picture.setIcon(birdPic);
            JOptionPane.showMessageDialog(null,"You selected Bird");
        }

        if(cat.isSelected())
        {
            picture.setIcon(catPic);
            JOptionPane.showMessageDialog(null,"You selected Cat");
        }

        if(dog.isSelected())
        {
            picture.setIcon(dogPic);
            JOptionPane.showMessageDialog(null,"You selected Dog");
        }

        if(rabbit.isSelected())
        {
            picture.setIcon(rabbitPic);
            JOptionPane.showMessageDialog(null,"You selected Rabbit");
        }

        if(pig.isSelected())
        {
            picture.setIcon(pigPic);
            JOptionPane.showMessageDialog(null,"You selected Pig");
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        new RadioButtonDemo();
    }
}
