package boundaries.swing;

import java.awt.EventQueue;

import model.User;
import boundaries.swing.ChatGUI;
import boundaries.swing.ChatWindow;

public class ChatWindowTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatWindow frame = new ChatWindow(ChatGUI.getInstance(), new User("it's Me"));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
