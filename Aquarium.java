import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {
    public static void main(String[] args) {
        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");


        // Creates the beggining template for the twilight scene
        PainterAPI painter = canvas.getPainter();
        canvas.setBackgroundColor(Color.DARK_GRAY);
        painter.liftPen(); 
        painter.moveTo(-400,-150);
        painter.setPenColor(Color.GREEN); 
        painter.lowerPen(); 
        painter.startFill(Color.GREEN); 
        painter.forward(800); 
        painter.turnRight(90); 
        painter.forward(150); 
        painter.turnRight(90); 
        painter.forward(800); 
        painter.turnRight(90);
        painter.forward(150); 
        painter.finishFill(); 
        

    }
}