/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Taha
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class view extends JFrame
{
protected JPanel boardPanel;
public JButton buttons[];
protected JLabel OwnName;
public JLabel player1;
public JLabel player2;
public JButton restartgame;

 view()//constructor
 {
  super("TIC TAC TOE xD"); 
  //this.setLayout(new BorderLayout());  
  //this.setLocationRelativeTo(null);
  //this.setTitle("Tic-Tac-Toe");
  
  boardPanel=new JPanel();
  boardPanel.setLayout(new GridLayout(4,4));
  //display= new GridLayout(3,3,5,5);
  boardPanel.setBackground(Color.white);
  setSize(700,700);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  player1=new JLabel();
  player1.setText("          Player 1: X");
  player1.setFont(new Font("Comic Sans Ms",Font.BOLD,15));//to change font
  
  player2=new JLabel();
  player2.setText("          Player 2: O");
  player2.setFont(new Font("Comic Sans Ms",Font.BOLD,15));
  
  restartgame=new JButton();
  restartgame.setText("Restart");
  
  OwnName=new JLabel();
  OwnName.setText("         Taha Kibria");
  OwnName.setFont(new Font("Comic Sans Ms",Font.BOLD,50));//to change font
  OwnName.setForeground(Color.red);
  
  //setLayout(display);
  buttons = new JButton[9];//9 since we have 3x3 board.
  addbuttons();
  this.setLayout(new BorderLayout());
  this.setLocationRelativeTo(null);
  this.add(boardPanel,BorderLayout.CENTER);
  this.add(OwnName,BorderLayout.NORTH);
  boardPanel.add(player1);
  restartgame.setBackground(Color.PINK);
  boardPanel.add(restartgame);
  boardPanel.add(player2);
  this.setVisible(true);//setting the display as true hence they will show.
 }
 
 public void addbuttons()
 {
     for(int i=0; i<9; i++)//making 9 buttons.
  {
        buttons[i] = new JButton();
        buttons[i].setBackground(Color.white);
        boardPanel.add(buttons[i]);
  }
        
 }
 
 
 public void Restartgame()//this function is to restart the game.
 {
  for(int i=0; i<9; i++)
  {
   buttons[i].setText("");
  }
 }
}