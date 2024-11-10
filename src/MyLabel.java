import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyLabel extends JLabel {
    
    MyLabel(){
        
        // JLabel = a GUI component to display for text/image or both
        
        ImageIcon image = new ImageIcon("codingDude.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);

        this.setText("Bro, do you even code?"); // sets text of the label
        this.setIcon(image);// sets icon of the label
        this.setHorizontalTextPosition(JLabel.CENTER); // sets text LEFT, CENTER, RIGHT of image
        this.setVerticalTextPosition(JLabel.TOP); // sets text TOP, CENTER, BOTTOM of image
        this.setForeground(new Color(0x00ff00)); //sets font colour of text
        this.setFont(new Font("MV Boli", Font.PLAIN, 20)); // sets font of text
        this.setIconTextGap(0); //sets gap between the image and text
        this.setBackground(new Color(123,50,250)); // sets background colour of label
        this.setOpaque(true); // must be be used with setBackground()
        this.setBorder(border);
        this.setVerticalAlignment(JLabel.CENTER); // sets the vertical poisition of label
        this.setHorizontalAlignment(JLabel.CENTER); // sets the horizontal position of label
        /*
        sets the top left corner position of the label
         * sets the size of the label
         * Layout used by the frame must be set to null.
         */
        //this.setBounds(0,0, 350,350); 

    }
}
