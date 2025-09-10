/**Poem Assignment
* @author Julia Lee
* Fall Semester 2025
* CSCI 1130-51
*/

/**Import */
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Poem_LeeJulia extends JFrame {
    private Image backgroundImage;

    public static void main(String[] args) {
        Poem_LeeJulia frame = new Poem_LeeJulia(); //create the window frame
        frame.setSize(800,600); //set window size to 800x600  pixels
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE); //close app when window is closed
        frame.loadImage(); // load the background image
        frame.setVisible(true); //make window visible

    }

    public void loadImage() {
        try {
            //load image from path "images/sunset.jpg"
            backgroundImage = ImageIO.read(new File("images/sunset.jpg"));
        } catch (IOException e) {
            // Shows error dialog if image loading fails
            JOptionPane.showMessageDialog(this, "Error loading image: " + e.getMessage());
            e.printStackTrace(); //print error details to console
        }
        }
 @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        // Draw the background image scaled to fit the window
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
        
         g.setFont(new Font("Serif", Font.PLAIN, 18));
        // Poem title
        g.setColor(Color.BLACK);
        g.drawString("On Friendship", 100, 80);
     
        // Poem lines with different colors
        g.setColor(new Color(173, 216, 230)); // Light blue
        g.drawString("Your friend is your needs answered.", 100, 120);
        
        g.setColor(Color.GREEN);
        g.drawString("He is your field which you sow with love and reap with thanksgiving.", 100, 150);
        
        g.setColor(new Color(255, 200, 100)); // Light orange
        g.drawString("And he is your board and your fireside.", 100, 180);
        
        g.setColor(Color.CYAN);
        g.drawString("for you come to him with your hunger, and you seek hime for peace.", 100, 210);
        
        g.setColor(new Color(220, 180, 220)); // Light purple
        g.drawString("When your friend speaks his mind, you fear not 'nay' or 'ay' in your mind.", 100, 240);
        
        g.setColor(Color.PINK);
        g.drawString("And when he is silent your heart ceases not to listen to your heart;", 100, 270);
        
        g.setColor(new Color(200, 255, 200)); // Light green
        g.drawString("For without words, in friendship, all thoughts, all desires,", 100, 300);

        g.setColor(new Color(128,0,128)); //purple
        g.drawString("all expectations are born and shared, with joy that is unaclaimed.",100,330);
        
        g.setColor(new Color(180, 180, 255)); // Lavender
        g.drawString("When you part from your friend, you grieve not;", 100, 360);
        
        g.setColor(Color.ORANGE);
        g.drawString("For that which you love most in him may be clearer", 100, 390);
        
        g.setColor(Color.WHITE);
        g.drawString("in his absence, as the mountain to climber is clearer from the plain.", 100, 420);
        
        // Author attribution
        g.setColor(Color.BLACK);
        g.drawString("- Kahlil Gibran", 500, 450);
    }
}