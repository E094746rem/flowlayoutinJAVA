package flowlayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Layout MAnager = defines the natural layout for components within a contianer

		// Flow layout = Place components in row, sized at their preferred size,
		// If the horizontal space in the contianer is too small,the flow layout class
		// uses the newt available row.

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 6, 10));// we can set the button how they willbe and
																	// horizontal
																	// and vertical gap
		frame.setSize(500, 500);

		// short cut JButton button1 = new JButton();
		// after this we should put the visibilty to true after the button so that it
		// show as immedietly

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250, 250)); // to change W,H of the button the we should change the no of
															// the dimension
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout());// by defualt panel uses a flowlayout

		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		panel.add(new JButton("10"));

//		frame.add(new JButton("2"));

		frame.add(panel);
		frame.setVisible(true);

	}

}
