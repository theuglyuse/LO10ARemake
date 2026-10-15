import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyDrawing extends JPanel {
	private Cat cat;
	private Mouse mouse;
	private SpecialMouse sm;
	public MyDrawing() 
	{
		// Add critters to the drawing
		cat = new Cat();
		mouse = new Mouse();
		sm = new SpecialMouse();
	}
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	public void paintComponent(Graphics g) {
<<<<<<< .merge_file_CtaaK8
		cat.draw(g, 240, 150);
		mouse.draw(g, 50, 200);
		sm.draw(g, 150, 200);
=======
		cat.draw(g, 50, 150);
		mouse.draw(g, 150, 200);
		sm.draw(g, 230, 220);
>>>>>>> .merge_file_cLfAlZ
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Create a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		// Program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size (otherwise only title bar displays)
		frame.setSize(400, 400);
		
		// Frame will not display until you set visible true
		frame.setVisible(true);
	}

}
