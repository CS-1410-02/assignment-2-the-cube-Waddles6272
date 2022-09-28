import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

class Chatbot extends JFrame {
   private JTextArea area = new JTextArea();
   private JTextField field = new JTextField();
   private JButton button = new  JButton();
   private JLabel label =  new JLabel();

   Chatbot() {
      JFrame frame = new JFrame();

      frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setResizable(false);
      frame.setLayout(null);
      frame.setSize(400,400);
      frame.setTitle("ChatBot");
      frame.add(area);
      frame.add(field);
      frame.add(button);
      frame.add(label);

      area.setSize(300,310);
      area.setLocation(1, 1);

      field.setSize(300,20);
      field.setLocation(1,320);

      label.setText("SEND");
      button.add(label);
      button.setSize(400,20);
      button.setLocation(300, 320);

      button.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
            if (e.getSource()==button) {
               String text = field.getText().toLowerCase();
               area.append("You ->" + text + "\n");
               field.setText("");
               if(text.contains("hi")) {
                  reply("Hello there");
               } // End of if
               else if(text.contains("how are you")) {
                  reply("I'm doing good, thank you. How about yourself?");
               } // End of else-if
               else if(text.contains("bye")) {
                  reply("Goodbye, I hope you have a good day!");
               } // End of else-if
               else {
                  reply("I don't understand");
               } // End of else
            } // End of if
         } // End of action event
      }); // End of listener
   } // End of Chatbot

   public void reply(String s) {
      area.append("ChatBot -->" + s + "\n");
   }
} // End of JFrame

public class Bot {
   public static void main(String[] args) {

   new Chatbot();

   } // End of main
} // End of class
