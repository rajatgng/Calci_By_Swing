import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Main
{
  public static void main(String[] args) {
    Calculator calci = new Calculator();

  }
}
class Calculator extends JFrame
{
    Container c;
    JButton[] btn = new JButton[17];
    JTextField text = new JTextField();
    JTextField result_text = new JTextField();
    {
      ImageIcon icon=new ImageIcon("CalciImage.png");
		  this.setIconImage(icon.getImage());
      this.setTitle("Calculator");
      this.setBounds(100,100,420,520);
      c=this.getContentPane();
      c.setLayout(null);
      //this.setResizable(false);
      //c.setBackground(Color.BLUE);
      //Adding Text Field
      c.add(text);
      text.setBounds(30,15,200,50);
      c.add(result_text);
      result_text.setBounds(250,15,130,50);
      Font font = new Font("Arial",Font.BOLD,30);
      text.setFont(font);
      result_text.setFont(font);
      //Adding num button
      for(int i=0;i<17;i++)
      {
        if(i>=0 && i<=9)
        {
          String s = Integer.toString(i);
          btn[i]=new JButton(s);
        }
        else
        {
          if(i==10)
          btn[i]=new JButton("+");
          else if (i==11)
          btn[i]=new JButton("-");
          else if(i==12)
          btn[i]=new JButton("*");
          else if(i==13)
          btn[i]=new JButton("/");
          else if(i==14)
          btn[i]=new JButton(".");
          else if(i==15)
          btn[i]=new JButton("=");
          else if(i==16)
          btn[i]=new JButton("Clear");


        }
      }
      for(int i=0;i<17;i++)
      btn[i].setFont(font);
      c.add(btn[0]);
      c.add(btn[1]);
      c.add(btn[2]);
      c.add(btn[3]);
      c.add(btn[4]);
      c.add(btn[5]);
      c.add(btn[6]);
      c.add(btn[7]);
      c.add(btn[8]);
      c.add(btn[9]);
      c.add(btn[10]);
      c.add(btn[11]);
      c.add(btn[12]);
      c.add(btn[13]);
      c.add(btn[14]);
      c.add(btn[15]);
      c.add(btn[16]);

        //This is a test of github account
      btn[16].setBounds(30,80,250,70);
      btn[13].setBounds(300,80,70,70);

      btn[7].setBounds(30,160,70,70);
      btn[8].setBounds(120,160,70,70);
      btn[9].setBounds(210,160,70,70);
      btn[12].setBounds(300,160,70,70);

      btn[4].setBounds(30,240,70,70);
      btn[5].setBounds(120,240,70,70);
      btn[6].setBounds(210,240,70,70);
      btn[11].setBounds(300,240,70,70);

      btn[1].setBounds(30,320,70,70);
      btn[2].setBounds(120,320,70,70);
      btn[3].setBounds(210,320,70,70);
      btn[10].setBounds(300,320,70,70);

      btn[0].setBounds(30,400,70,70);
      btn[14].setBounds(120,400,70,70);
      btn[15].setBounds(210,400,160,70);


      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
