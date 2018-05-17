import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog("When is your Birthday?");
	
			
			if (birthday.equals("05/17")) {
				JOptionPane.showMessageDialog(null, "Happy Birthday!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Oh ok bye");
			}
			
}
}
