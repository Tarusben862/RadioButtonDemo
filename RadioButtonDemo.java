import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    JRadioButton bird, cat, dog, rabbit, pig;
    JLabel display;

    public RadioButtonDemo() {
        
        setTitle("RadioButtonDemo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        
        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        
        ButtonGroup pets = new ButtonGroup();
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

        
        display = new JLabel("Please select a pet");

       
        add(bird);
        add(cat);
        add(dog);
        add(rabbit);
        add(pig);
        add(display);

        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        String pet = e.getActionCommand();

       
        display.setText("Selected Pet: " + pet);

       
        JOptionPane.showMessageDialog(this,
                "You selected: " + pet,
                "Pet Selection",
                JOptionPane.INFORMATION_MESSAGE);
    }

    
    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
