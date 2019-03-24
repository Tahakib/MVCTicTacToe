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
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


class controller extends view implements ActionListener
{
 private int totalmoves=0;
 private boolean turn=false;
 private model myModel = new model();
 
 public controller()
 {
  
  for(int i=0; i<9; i++)//action listener is added from view class to buttons
   super.buttons[i].addActionListener(this);
 }
 
 
 public void playagain()
 {

  int reply = JOptionPane.showConfirmDialog (null, "Do you want to play again ?", "Spooky game" , JOptionPane.YES_NO_OPTION);
      
  if (reply == JOptionPane.YES_OPTION)
  {
      if(turn==true)//player switches after one player wins
      {
        super.player1.setText("          Player 1: O");
        super.player2.setText("          Player 2: X");
      }
      else
      {
        super.player1.setText("          Player 1: X");
        super.player2.setText("          Player 2: O");
      }
   myModel.resetGame();
   super.Restartgame();
  }
  else//this is for closing the game.
  {
   dispose();
   System.exit(0);
  }
 }
 
 
 public void actionPerformed (ActionEvent event)
 {
  Object objClicked=event.getSource();


  for(int i=0; i<9; i++)
  {
   if(objClicked==super.buttons[i])
   {
    if (super.buttons[i].getText()=="")
    {
     if (turn==false)
     {
      
      super.buttons[i].setText("X");
      super.buttons[i].setFont(new Font("Comic Sans Ms",Font.BOLD,50));//to change font
      super.buttons[i].setForeground(Color.GREEN);
      myModel.setClick(i,1);
      turn=true;  // change to O's turn
      
      totalmoves=myModel.computeresult();
 
     }
     else
     {
      super.buttons[i].setText("O"); 
      super.buttons[i].setFont(new Font("Comic Sans Ms",Font.BOLD,50));//to change font
      super.buttons[i].setForeground(Color.orange);
      myModel.setClick(i,2);
      turn=false; // change to X's turn 
      
      totalmoves=myModel.computeresult();
     }
    }
   }
   else if(objClicked==super.restartgame)
   {
        myModel.resetGame();
        super.Restartgame();
   }
  }
  if(totalmoves==1)
  {
      JOptionPane.showMessageDialog(null, "X wins :X");
      playagain();
  }
  else if(totalmoves==2)
  {
      JOptionPane.showMessageDialog(null, "O wins :O");
      playagain();
  }
  else if (totalmoves==3)
  {
      JOptionPane.showMessageDialog(null, "No one won,it's a draw uwu");
      playagain();
  }
  else if(totalmoves!=0)
  {
      playagain();
  }

 }
}