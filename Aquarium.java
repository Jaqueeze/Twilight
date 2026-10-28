import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;


public class Aquarium {
    public static void main(String[] args) {
        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");


        // Creates the beggining template for the twilight scene
        PainterAPI painter = canvas.getPainter();
        canvas.setBackgroundColor(Color.DARK_GRAY);
        painter.liftPen(); 
        painter.moveTo(-400,-150);
        painter.setPenColor(new Color(69, 110, 43)); 
        painter.lowerPen(); 
        painter.startFill(new Color(69, 110, 43)); 
        painter.forward(800); 
        painter.turnRight(90); 
        painter.forward(150); 
        painter.turnRight(90); 
        painter.forward(800); 
        painter.turnRight(90);
        painter.forward(150); 
        painter.finishFill(); 

        // Creates the different level of trees throughout the grass, all at random y heights so the trees aren't at the same level
        int xSpanningGrass = -400;
        int min = -175;
        int max = -150;
        while (xSpanningGrass < 380) {
            // Generates a random number from 5 to 10 (inclusive)
            int randomYNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            int randomXNum = ThreadLocalRandom.current().nextInt(20, 30);

            painter.liftPen(); 
            painter.moveTo(xSpanningGrass, randomYNum); 
            painter.lowerPen(); 
            
            for (int i = 0; i <= 4; i++) {
                painter.setPenColor(new Color(107, 73, 43));
                painter.startFill(new Color(107, 73, 43));
                painter.forward(30); 

                //Leafs
                painter.turnLeft(120);
                painter.setPenColor(new Color(0,100,0));
                painter.forward(20);
                painter.backward(20);
                painter.setPenColor(new Color(107, 73, 43)); 
                painter.turnRight(120); 

                painter.turnRight(90); 
                painter.forward(10); 

                // Leaves
                painter.turnRight(30);
                painter.setPenColor(new Color(0,100,0));
                painter.forward(20);
                painter.backward(20);
                painter.setPenColor(new Color(107, 73, 43)); 
                painter.turnLeft(30); 

                painter.turnRight(90);
                painter.forward(30);
                painter.turnRight(90);
                painter.forward(10);
                painter.finishFill(); 
                painter.turnRight(90); 
                painter.forward(30); 
            }

            painter.liftPen(); 
            painter.moveTo(xSpanningGrass + randomXNum, randomYNum);
            painter.lowerPen(); 
            xSpanningGrass += randomXNum; 
            
        }
        

    }
}