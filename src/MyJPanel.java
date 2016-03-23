
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class MyJPanel extends JPanel implements MouseMotionListener{
	
	private Square square = new Square(100);
	private Point mouse = new Point(50, 50);
	
	public MyJPanel(){
		addMouseMotionListener(this);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		// TODO Draw square and fill it with random color decided by method getRandomColor()
		// You should use fillRect()
		g.setColor(square.getRandomColor());
		g.fillRect(square.getCenterX(mouse.x), square.getCenterY(mouse.y), square.getShapeWidth(), square.getShapeHeight());
		repaint();
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Get mouse dragged position and change suqare's position
		mouse.x = e.getXOnScreen();
		mouse.y = e.getYOnScreen();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
}
