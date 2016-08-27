import javax.swing.*;

public class Msg {

	public static void main(String[] args) {

		String msg = new StringBuilder()
			.append("ola, mundo!")
			.toString();

		JOptionPane.showMessageDialog(null, msg);
	}
}

