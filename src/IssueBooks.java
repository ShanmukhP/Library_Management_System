import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class IssueBooks extends JFrame implements ActionListener
{
	JTextField t1,t2;
	JButton b1;
	JLabel l1,l2,l3,mainl;
	JPanel cp;
	
	IssueBooks()
	{
		setTitle("Issuing Books");
		setSize(1500,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cp = new JPanel();
		cp.setSize(1500,800);
		cp.setLayout(null);
		cp.setBackground(new Color(175,238,238));
		setContentPane(cp);
		
		mainl = new JLabel("ISSUING BOOKS");
		mainl.setForeground(new Color(0,0,0));
		mainl.setFont(new Font("Tahoma", Font.PLAIN, 30));
		mainl.setBounds(600,50,500,50);
		cp.add(mainl);
		
		l1 = new JLabel("Student ID");
		l1.setForeground(new Color(128,128,128));
		l1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l1.setBounds(500,200,100,20);
		cp.add(l1);
		
		t1 = new JTextField(20);
		t1.setBounds(500,220,100,20);
		cp.add(t1);
		
		l2 = new JLabel("Book ID");
		l2.setForeground(new Color(128,128,128));
		l2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		l2.setBounds(800,200,100,20);
		cp.add(l2);
		
		t2 = new JTextField(20);
		t2.setBounds(800,220,100,20);
		cp.add(t2);
		
		b1 = new JButton("Issue");
		b1.setBounds(650,300,100,40);
		b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b1.addActionListener(this);
		cp.add(b1);
		
		l3 = new JLabel();
		l3.setBounds(550,350,500,40);
		l3.setForeground(new Color(128,128,128));
		l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cp.add(l3);
		
	}
	
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		l3.setText("Student \"" + t1.getText() + "\" is issued Book \"" + t2.getText() +"\"");
	}
	
	
	
	
	

	public static void main(String[] args) {
		try {
			SwingUtilities.invokeLater(new Runnable(){
				public void run()
				{
					IssueBooks i1 = new IssueBooks();
				}
			});
		}catch(Exception e) {}
		

	}

}
