import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.lang.*;
import uk.ac.leedsbeckett.oop.TurtleGraphics;
public class MainClass {

    public static void main(String[] args) 
    {
            TurtleGraphics gp = new TurtleGraphics();
            JFrame MainFrame = new JFrame();
              MainFrame.add(gp);
              MainFrame.setSize(640, 480);
              MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             JMenuBar mb = new JMenuBar();
             JMenu m1 = new JMenu("File");
             JMenu m2 = new JMenu("Help");
             mb.add(m1);
             mb.add(m2);
             JMenu m1_1 =new JMenu("New");
             JMenu m1_2 = new JMenu("Load");
             JMenu m1_3 = new JMenu("Save");
             JMenu m1_4 = new JMenu("Exit");
             JMenu m2_1 = new JMenu("About");
             m1.add(m1_1);
             m1.add(m1_2);
             m1.add(m1_3);
             m1.add(m1_4);
             m2.add(m2_1);
             JPanel panel = new JPanel();
             JLabel label = new JLabel("Enter command text here:");
             JTextField mt= new JTextField(20);
             JButton run = new JButton("Run");
             JButton clearc = new JButton("Clear");
             panel.add(label);
             panel.add(mt);
             panel.add(run);
             panel.add(clearc);
             mt.setHorizontalAlignment(JTextField.CENTER);
             MainFrame.getContentPane().add(BorderLayout.SOUTH,panel);
             MainFrame.getContentPane().add(BorderLayout.NORTH, mb);
             MainFrame.getContentPane().add(BorderLayout.CENTER,gp);    
             MainFrame.setVisible(true);
             gp.reset();
             Boolean f = true;
             while(f) 				//Recursively repeat the task until Exit is entered or pressed.
             { 	
            
            	 public void actionPerformed(ActionEvent evt) {
            		    String r = mt.getText();
            		    textArea.append(text + '\n');
            		    textField.selectAll();
            		}
         		if(r.equalsIgnoreCase("about"))
         		{
         			gp.about();
         			continue;
         		}
         		if(r.equalsIgnoreCase("clear"))
         		{
         			gp.clear();
         			continue;
         		}
         		if(r.equalsIgnoreCase("PenUp"))
         		{
         			gp.penUp();
         			continue;
         		}
         		if(r.equalsIgnoreCase("PenDown"))
         		{
         			gp.penDown();
         			continue;
         		}
         		if(r.equalsIgnoreCase("Black"))
         		{
         			gp.setPenColour(Color.black);
         			continue;
         		}
         		if(r.equalsIgnoreCase("Green"))
         		{
         			gp.setPenColour(Color.GREEN);
         			continue;
         		}
         		if(r.equalsIgnoreCase("RED"))
         		{
         			gp.setPenColour(Color.RED);
         			continue;
         		}
         		if(r.equalsIgnoreCase("reset"))
         		{
         			gp.reset();
         			continue;
         		}
         		if(r.startsWith("turnleft"))
         		{
         			if(r.length()==8)
         			{
         				gp.turnLeft();
         			}
         			else
         			{
         			String str = r.substring(8);
         			int deg = Integer.valueOf(str);
         			gp.turnLeft(deg);
         			}
         			continue;
         		}
         		if(r.startsWith("turnright"))
         		{
         			if(r.length()==9)
         			{
         				gp.turnRight();
         			}
         			else
         			{
         				String str = r.substring(9);
             			int deg = Integer.valueOf(str);
             			gp.turnRight(deg);
         			}
         			continue;
         		}
         		if(r.startsWith("forward"))
         		{
         			String str = r.substring(8);
         			int deg = Integer.valueOf(str);
         			gp.forward(deg);
         			continue;
         		}
         		if(r.startsWith("backward"))
         		{
         			String str = r.substring(9);
         			int dir = gp.getDirection();
         			int deg = Integer.valueOf(str);
         			
         			continue;
         		}
             }
         		
             
    }
    }