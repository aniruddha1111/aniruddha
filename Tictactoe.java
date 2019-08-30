/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ANDYM.K
 */
class tic extends JFrame
{   
       Tictactoe  main=new  Tictactoe ();
    public final JButton b1=new JButton("");
     public final JButton b2=new JButton("");
       public final JButton b3=new JButton("");
         public final JButton b4=new JButton("");
           public final JButton b5=new JButton("");
             public final JButton b6=new JButton("");
               public final JButton b7=new JButton("");
                 public final JButton b8=new JButton("");
                   public final JButton b9=new JButton("");
         
     private final JFrame jf=new JFrame();
   
     public tic(){
           
        jf.setSize(400,350);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(3,3));
        jf.setVisible(true);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        jf.add(b7);
        jf.add(b8);
        jf.add(b9);
        jf.setLayout(new GridLayout(3,3));
           b1.addActionListener(new mylisten1());
           
             b2.addActionListener(new mylisten2());
                  b3.addActionListener(new mylisten3());
                      b4.addActionListener(new mylisten4());
                           b5.addActionListener(new mylisten5());
                                 b6.addActionListener(new mylisten6());
                                      b7.addActionListener(new mylisten7());
                                           b8.addActionListener(new mylisten8());
                                                b9.addActionListener(new mylisten9());
     }
     
     
    private class mylisten1 implements ActionListener
            {
          
        public void actionPerformed(ActionEvent e) {
            //To change body of generated methods, choose Tools | Templates.
               b1.setText("");
            if(b1.getText().equals(""))
            {
               
                if(Tictactoe.playerTurn==true)
                {
                    b1.setText("X");
                    Tictactoe.check();
                    Tictactoe.playerTurn=false;
                }
                else
                {
                    
                    b1.setText("O");
                    Tictactoe.check();
                    Tictactoe.playerTurn=true;
                }
            }
         
        }
        
    }
          
    private class mylisten2 implements ActionListener
            {
          
        public void actionPerformed(ActionEvent e) {
            //To change body of generated methods, choose Tools | Templates.
               b2.setText("");
            if(b2.getText().equals(""))
            {
               
                if(Tictactoe.playerTurn==true)
                {
                    b2.setText("X");
                    Tictactoe.check();
                    Tictactoe.playerTurn=false;
                }
                else
                {
                    
                    b2.setText("O");
                    Tictactoe.check();
                    Tictactoe.playerTurn=true;
                }
            }
         
        }
        
    }
          
    private class mylisten3 implements ActionListener
            {
          
        public void actionPerformed(ActionEvent e) {
            //To change body of generated methods, choose Tools | Templates.
               b3.setText("");
            if(b3.getText().equals(""))
            {
               
                if(Tictactoe.playerTurn==true)
                {
                    b3.setText("X");
                    Tictactoe.check();
                    Tictactoe.playerTurn=false;
                }
                else
                {
                    
                    b3.setText("O");
                    Tictactoe.check();
                    Tictactoe.playerTurn=true;
                }
            }
         
        }
        
    }
     private class mylisten4 implements ActionListener
            {
          
        public void actionPerformed(ActionEvent e) {
            //To change body of generated methods, choose Tools | Templates.
               b4.setText("");
            if(b4.getText().equals(""))
            {
               
                if(Tictactoe.playerTurn==true)
                {
                    b4.setText("X");
                    Tictactoe.check();
                    Tictactoe.playerTurn=false;
                }
                else
                {
                    
                    b4.setText("O");
                    Tictactoe.check();
                    Tictactoe.playerTurn=true;
                }
            }
         
        }
        
    }
      private class mylisten5 implements ActionListener
            {
          
        public void actionPerformed(ActionEvent e) {
            //To change body of generated methods, choose Tools | Templates.
               b5.setText("");
            if(b5.getText().equals(""))
            {
               
                if(Tictactoe.playerTurn==true)
                {
                    b5.setText("X");
                    Tictactoe.check();
                    Tictactoe.playerTurn=false;
                }
                else
                {
                    
                    b5.setText("O");
                    Tictactoe.check();
                    Tictactoe.playerTurn=true;
                }
            }
         
        }
        
    }   
       private class mylisten6 implements ActionListener
            {
          
        public void actionPerformed(ActionEvent e) {
            //To change body of generated methods, choose Tools | Templates.
               b6.setText("");
            if(b6.getText().equals(""))
            {
               
                if(Tictactoe.playerTurn==true)
                {
                    b6.setText("X");
                    Tictactoe.check();
                    Tictactoe.playerTurn=false;
                }
                else
                {
                    
                    b6.setText("O");
                    Tictactoe.check();
                    Tictactoe.playerTurn=true;
                }
            }
         
        }
        
    }
      private class mylisten7 implements ActionListener
            {
          
        public void actionPerformed(ActionEvent e) {
            //To change body of generated methods, choose Tools | Templates.
               b7.setText("");
            if(b7.getText().equals(""))
            {
               
                if(Tictactoe.playerTurn==true)
                {
                    b7.setText("X");
                    Tictactoe.check();
                    Tictactoe.playerTurn=false;
                }
                else
                {
                    
                    b7.setText("O");
                    Tictactoe.check();
                    Tictactoe.playerTurn=true;
                }
            }
         
        }
        
    }
       private class mylisten8 implements ActionListener
            {
          
        public void actionPerformed(ActionEvent e) {
            //To change body of generated methods, choose Tools | Templates.
               b8.setText("");
            if(b8.getText().equals(""))
            {
               
                if(Tictactoe.playerTurn==true)
                {
                    b8.setText("X");
                    Tictactoe.check();
                    Tictactoe.playerTurn=false;
                }
                else
                {
                    
                    b8.setText("O");
                    Tictactoe.check();
                    Tictactoe.playerTurn=true;
                }
            }
         
        }
        
    }
        private class mylisten9 implements ActionListener
            {
          
        public void actionPerformed(ActionEvent e) {
            //To change body of generated methods, choose Tools | Templates.
               b9.setText("");
            if(b9.getText().equals(""))
            {
               
                if(Tictactoe.playerTurn==true)
                {
                    b9.setText("X");
                    Tictactoe.check();
                    Tictactoe.playerTurn=false;
                }
                else
                {
                    
                    b9.setText("O");
                    Tictactoe.check();
                    Tictactoe.playerTurn=true;
                }
            }
         
        }
        
    }
}

public class Tictactoe {

    /**
     * @param args the command line arguments
     */
      public static  tic board= new tic();
      public static boolean playerTurn=true;
      public static boolean playerwon=false;
      public static boolean computerwon=false;
    public static void main(String[] args) {
        // TODO code application logic here
    // if(board.isVisible()==false)
     {
      //   board.setVisible(true);
     }
       
    }
    public static void check()
    {
        if(board.b1.getText().equals("X"))
        {
            if(board.b4.getText().equals("X"))
            {
                if(board.b7.getText().equals("X"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
        if(board.b1.getText().equals("X"))
        {
            if(board.b5.getText().equals("X"))
            {
                if(board.b9.getText().equals("X"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
        if(board.b1.getText().equals("X"))
        {
            if(board.b2.getText().equals("X"))
            {
                if(board.b3.getText().equals("X"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
        if(board.b4.getText().equals("X"))
        {
            if(board.b5.getText().equals("X"))
            {
                if(board.b6.getText().equals("X"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
        
        
    
    if(board.b7.getText().equals("X"))
        {
            if(board.b8.getText().equals("X"))
            {
                if(board.b9.getText().equals("X"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
        
        if(board.b3.getText().equals("X"))
        {
            if(board.b6.getText().equals("X"))
            {
                if(board.b9.getText().equals("X"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
        if(board.b3.getText().equals("X"))
        {
            if(board.b5.getText().equals("X"))
            {
                if(board.b7.getText().equals("X"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
        if(board.b2.getText().equals("X"))
        {
            if(board.b5.getText().equals("X"))
            {
                if(board.b8.getText().equals("X"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
        if(board.b2.getText().equals("O"))
        {
            if(board.b5.getText().equals("O"))
            {
                if(board.b8.getText().equals("O"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
         if(board.b1.getText().equals("O"))
        {
            if(board.b2.getText().equals("O"))
            {
                if(board.b3.getText().equals("O"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
          if(board.b1.getText().equals("O"))
        {
            if(board.b4.getText().equals("O"))
            {
                if(board.b7.getText().equals("O"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
           if(board.b1.getText().equals("O"))
        {
            if(board.b5.getText().equals("O"))
            {
                if(board.b9.getText().equals("O"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
            if(board.b3.getText().equals("O"))
        {
            if(board.b6.getText().equals("O"))
            {
                if(board.b9.getText().equals("O"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
             if(board.b4.getText().equals("O"))
        {
            if(board.b5.getText().equals("O"))
            {
                if(board.b6.getText().equals("O"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        }
          if(board.b7.getText().equals("O"))
        {
            if(board.b8.getText().equals("O"))
            {
                if(board.b9.getText().equals("O"))
                {
                    playerwon=true;
                    computerwon=false;
                    System.out.println("palyerwon");
                }
            }
        } 
          
    }

}