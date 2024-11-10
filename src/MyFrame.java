import javax.swing.*;

 /* Secondary way to create a JFrame GUI window 
  * uses a BorderLayout
 */
public class MyFrame extends JFrame {
    //JFrame = A GUI component that displays a window and hold hold other components
    
    MyFrame(){
        
        this.setTitle("JFrame title goes here!!"); // set the title of the frame
        this.setSize(750,750); // sets the x dim and y dim
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits the application
        //this.setResizable(false); // prevents the resizing of frame
        //this.setLayout(null);

        ImageIcon image = new ImageIcon("hammock.png"); // creates and ImageIcon
        this.setIconImage(image.getImage()); // changes the icon of the frame
        //this.getContentPane().setBackground(new Color(123,50,250)); //changes background colour takes words, rgb and hex values
        
        this.setVisible(true); // makes the frame visible
    }
}
