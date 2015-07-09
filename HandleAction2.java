import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandleAction2 extends JFrame implements ActionListener {

	JButton b1 = new JButton("b1");
	JLabel msg1 = new JLabel("");
	JLabel msg2 = new JLabel("");

	// ---------------------------------------------------------------------
	// main
	// ---------------------------------------------------------------------

	public static void main(String[] args) {
		HandleAction2 x = new HandleAction2(); // instantiate a program object

	}

	// ---------------------------------------------------------------------
	// constructor
	// ---------------------------------------------------------------------

	public HandleAction2() {

		// //super("Miller Light"); //call JFrame constructor
		// //and populate the title bar
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		// JPanel panel = new JPanel();
		// setContentPane(panel); //set contentPanel to panel
		// pack(); //since no window size was given,
		// //we must pack the components
		// setVisible(true);
		JFrame win = new JFrame("Address Book");
		Toolkit UI = win.getToolkit(); // get ref to UI environment

		Dimension dim = UI.getScreenSize(); // get width & height of monitor

		System.out.println(dim); // print the monitor screen size
		win.setBounds(dim.width / 4, dim.height / 4, dim.width / 2,
				dim.height / 2);

		Container pane = win.getContentPane(); // either get ref to the
												// contentPane

		JPanel pane1 = new JPanel(); // or create a JPanel
		JPanel pane2 = new JPanel(); // or create a JPanel
		win.setContentPane(pane); // and assign it to the contentPane

		FlowLayout flow = new FlowLayout(); // create a FlowLayout manager
		pane.setLayout(flow);
		pane1.setLayout(flow); // use it to layout the panel
								// JFrame defaults to BorderLayout
								// JPanel defaults to FlowLayout

		pane2.setLayout(flow); // use it to layout the panel

		JLabel fnameLabel = new JLabel("First Name: "); // define all fields
		JTextField fname = new JTextField(15); // to be displayed
		JLabel lnameLabel = new JLabel("Last Name: "); // define all fields
		JTextField lname = new JTextField(15); // to be displayed

		msg1.setSize(250, 10);

		pane1.add(fnameLabel); // add the components
		pane1.add(fname);
		pane1.add(lnameLabel);
		pane1.add(lname);
		pane2.add(b1);
		pane2.add(msg1);
		pane2.add(msg2);
		pane.add(pane1); // add the panels to the window
		pane.add(pane2);
		Color c = new Color(200, 255, 255); // create an RGB color object
		pane1.setBackground(c); // set the background color

		win.setSize(900, 600); // set window size
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // action when you
		// press X
		win.setVisible(true); // make window visible
		win.setResizable(false); // do not allow resizing
		b1.addActionListener(this); // register an actionListener for button

	}

	// --------------------------------------------------------------------------------------
	// Define an actionPerformed method that will be called by JVM when action
	// is performed
	// Method receives an event object
	// --------------------------------------------------------------------------------------
	public void actionPerformed(ActionEvent evt) {

		Object source = evt.getSource(); // get a reference to the object
											// that caused the event
		System.out.println(evt.getSource());

		if (source == b1) {
			JButton item = (JButton) source;
//			System.out.println("good");
//			String optChosen = item.getText();
			// msg1.setText("You have chosen: ");
			// msg2.setText(optChosen);
			//Search();
			printtester();
		}
		// repaint();
	}


}
