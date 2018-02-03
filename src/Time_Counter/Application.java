package Time_Counter;

import javax.swing.JFrame;

public class Application extends JFrame{

	private static final long serialVersionUID = 1L;

	public Application(){
        this.setContentPane(new Timer());
        this.setTitle("Time passed");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 80);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setVisible(true);
        
    }
  
    public static void main(String[] args) {
        new Application();

    }
    
}