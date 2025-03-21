package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
//import com.toedter.calendar.JDateChooser;
import java.util.*;

public class Facility extends JFrame implements ActionListener{
    
   
    
    JButton b1,b2,b3;
    
    public static void main(String[] args){
        new Facility().setVisible(true);
    }

    Facility(){
        
        setTitle("FACILITEIES");
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/Facility.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 650, 500);
        add(l3);
      
        b1 = new JButton("KYC");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
         b1.setBounds(120,125,200,50);
        add(b1);
        
        b1.addActionListener(this); 
        
        b2 = new JButton("LOAN");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
         b2.setBounds(320,325,200,50);
        add(b2);
        
        b2.addActionListener(this); 
        
       /*  b3 = new JButton("KYC");
        b3.setFont(new Font("Raleway", Font.BOLD, 14));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
         b3.setBounds(520,525,200,50);
        add(b3);
        
        b3.addActionListener(this); 
        
        */
      
        setLayout(null);
      
        
        
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(650,500);
        setLocation(250,20);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        
       try{
             if(ae.getSource()== b1) {
                  this.setVisible(false);
                  new Signup().setVisible(true);
              
            }
            if(ae.getSource()== b2) {
                  this.setVisible(false);
                  new Loan("").setVisible(true);
              
            }
        }catch(Exception e){
             e.printStackTrace();
        }
       
    } 
}