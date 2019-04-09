package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot r2d2 = new Robot();
		//2. Set the speed to 100
		r2d2.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1", "Color 2", "Color 3"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 0) {
			r2d2.setPenColor(255,0,0);
		}
		if(colorChoice == 1) {
			r2d2.setPenColor(0,0,255);
		}
		if(colorChoice == 2) {
			r2d2.setPenColor(0,255,0);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String polygonNum = JOptionPane.showInputDialog("How many polygons do you want R2D2 to draw?");
		//5. Use the robot to draw the number of polygons the user requested.
		int polyNum = Integer.parseInt(polygonNum);
		r2d2.penDown();
		for(int j=0; j< polyNum; j++) {
		for (int i = 0; i < 3; i++) {
			
			r2d2.move(100);
			r2d2.turn(360/3);
		}	
		r2d2.penUp();
		r2d2.move(110);
		r2d2.penDown();
		}
		//6. Make it so your shapes do not overlap
		
		//7. Challenge: add more colors to the Option Dialog.
	}
}

