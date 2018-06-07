import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("What is always coming but never arrives?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equals("tommorow")) {
	JOptionPane.showMessageDialog(null,"Correct!");
	score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong!");
}
		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog("Which weights more? A pound of feathers or a pound of bricks?");
		// 2. Make a pop up to show the score.
		
	}
}

