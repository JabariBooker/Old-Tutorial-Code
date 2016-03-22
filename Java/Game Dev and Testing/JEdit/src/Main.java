import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.util.HashMap;

public class Main extends JFrame{
	JPanel contentPanel;
	JTextArea typingSpace;
	HashMap<String, JButton> buttons;
	
	int width = 800, height = 600;
	
	public Main(){
		setUp();
		
		contentPanel = new JPanel();
		add(contentPanel);
		
		typingSpace = new JTextArea();
		typingSpace.setOpaque(true);
		contentPanel.add(typingSpace);
	}
	
	private void setUp(){
		setTitle("JEdit");
		setSize(width, height);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		new Main();
	}
}
