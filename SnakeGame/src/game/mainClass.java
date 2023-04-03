package game;

import java.awt.Dimension;
import javax.swing.JFrame;

public class mainClass {

	public static void main(String[] args){
		JFrame frame = new JFrame("Snake Game | @xqnone");
		frame.setContentPane(new gamePanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.setResizable(false);
		frame.pack();
		
		frame.setPreferredSize(new Dimension(gamePanel.WIDTH, gamePanel.HEIGHT));;
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
}
