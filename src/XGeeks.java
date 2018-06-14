//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {
		String Kevin = "Invisible";
		String Diego = "Super Lucky";
		String Yen = "Levatation";
		String Tra = "Super Tall";
		String Daniel = "Super Strong";

		String name = JOptionPane.showInputDialog("Enter a name of someone at your table");

		if (name.equals("Kevin")) {
			JOptionPane.showMessageDialog(null, Kevin);
		}
		if (name.equals("Diego")) {
			JOptionPane.showMessageDialog(null, Diego);
		}

		if (name.equals("Yen")) {
			JOptionPane.showMessageDialog(null, Yen);
		}
		
		if (name.equals("Tra")) {
				JOptionPane.showMessageDialog(null, Tra);
		}
		
		if (name.equals("Daniel")) {
		JOptionPane.showMessageDialog(null, Daniel);
		
		}
	}
}
// 1. Save the superpower for each person in a variable.

// 2. Ask the user to enter a name. Store their answer in a variable.

// 3. Show the superpower in a pop-up, depending on the name entered.
