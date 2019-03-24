/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.JOptionPane;

/**
 *
 * @author Taha
 */
class model
{
 int arr[] = new int[9];
 int clickcounter=0;
 
 public void setClick(int position, int OorX)
 { 
  arr[position]=OorX; // 1 or 2 added to the position of array
  clickcounter++; // increase the turns of game
 }
 


 public void resetGame()
 {
  clickcounter=0;//reset clickcounter
  for(int i=0; i<9; i++)//reset array
  {
   arr[i]=0;
  }
 }
 
 public int computeresult()
 { 
  //this is for horizontal
    if ((arr[0]==1 && arr[1]==1 && arr[2]==1) ||(arr[3]==1 && arr[4]==1 && arr[5]==1) || (arr[6]==1 && arr[7]==1 && arr[8]==1))
     return 1; // O win  
   if ((arr[0]==2 && arr[1]==2 && arr[2]==2)||(arr[3]==2 && arr[4]==2 && arr[5]==2)||(arr[6]==2 && arr[7]==2 && arr[8]==2))
    return 2; // X win 

  
   
  //this is for vertical

  if ((arr[0]==1 && arr[3]==1 && arr[6]==1)||(arr[1]==1 && arr[4]==1 && arr[7]==1)||(arr[2]==1 && arr[5]==1 && arr[8]==1))
  {
     return 1; // O win  
  }
  if ((arr[0]==2 && arr[3]==2 && arr[6]==2)||(arr[1]==2 && arr[4]==2 && arr[7]==2)||(arr[2]==2 && arr[5]==2 && arr[8]==2))
   return 2; // X win
   
  //this is for diagonal
  
   if ((arr[0]==1 && arr[4]==1 && arr[8]==1)||(arr[2]==1 && arr[4]==1 && arr[6]==1))
     return 1; // O win
   if ((arr[0]==2 && arr[4]==2 && arr[8]==2)||(arr[2]==2 && arr[4]==2 && arr[6]==2))
   return 2; // X win
  
  if (clickcounter==9)
   return 3; //game over, no one wins

  return 0; // nobody has won currently
 }
}
