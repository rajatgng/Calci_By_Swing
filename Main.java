import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
class Main
{
  public static void main(String[] args)  {
    Calculator calci = new Calculator();

  }
}
class Calculator extends JFrame implements ActionListener {

    Container c;
    JButton[] btn = new JButton[17];
    JTextField text = new JTextField();
    JButton delb = new JButton("X");
    //JTextField result_text = new JTextField();
    JLabel view = new JLabel();
    Calculator()
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
        Font font2 = new Font("Arial",Font.PLAIN,15);
      c.add(text);
      c.add(view);
      view.setBounds(30,2,340,20);
      view.setFont(font2);
      text.setBounds(30,20,340,50);
      //c.add(result_text);
      //result_text.setBounds(250,15,130,50);
      Font font = new Font("Arial",Font.BOLD,28);
      text.setFont(font);
      //result_text.setFont(font);
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
      c.add(delb);
      delb.setFont(font);
        //This is a test of github account
        //Second test
      delb.setBounds(210,80,70,70);
      btn[16].setBounds(30,80,160,70);
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

      //Events

      for(int i=0;i<17;i++)
      btn[i].addActionListener(this);
      delb.addActionListener(this);
      text.addActionListener(this);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e )
    {


      if( e.getSource() == btn[0] )
      {
        text.replaceSelection("0");
        view.setText(view.getText()+"0");
      }
      if( e.getSource() == btn[1] )
      {
        text.replaceSelection("1");
        view.setText(view.getText()+"1");
      }
      if( e.getSource() == btn[2] )
      {
        text.replaceSelection("2");
        view.setText(view.getText()+"2");
      }

      if( e.getSource() == btn[3] )
      {
        text.replaceSelection("3");
        view.setText(view.getText()+"3");
      }
      if( e.getSource() == btn[4] )
      {
        text.replaceSelection("4");
        view.setText(view.getText()+"4");
      }
      if( e.getSource() == btn[5] )
      {
        text.replaceSelection("5");
        view.setText(view.getText()+"5");
      }
      if( e.getSource() == btn[6] )
      {
        text.replaceSelection("6");
        view.setText(view.getText()+"6");
      }
      if( e.getSource() == btn[7] )
      {
        text.replaceSelection("7");
        view.setText(view.getText()+"7");
      }
      if( e.getSource() == btn[8] )
      {
        text.replaceSelection("8");
        view.setText(view.getText()+"8");
      }
      if( e.getSource() == btn[9] )
      {
        text.replaceSelection("9");
        view.setText(view.getText()+"9");
      }
      if( e.getSource() == btn[10] )
      {
        text.replaceSelection("+");
        view.setText(view.getText()+"+");
      }
      if( e.getSource() == btn[11] )
      {
        text.replaceSelection("-");
        view.setText(view.getText()+"-");
      }
      if( e.getSource() == btn[12] )
      {
        text.replaceSelection("*");
        view.setText(view.getText()+"*");
      }
      if( e.getSource() == btn[13] )
      {
        text.replaceSelection("/");
        view.setText(view.getText()+"/");
      }
      if( e.getSource() == btn[14] )
      {
        text.replaceSelection(".");
        view.setText(view.getText()+".");
      }
      if( e.getSource() == btn[15] )
      {

        view.setText(view.getText()+"=");
        // String n1="",n2="";
        //
        // char c='+';
        //   boolean flag=true;
        // for(int i=0;i<result.length();i++)
        // {
        //
        //   if((Character.isDigit(result.charAt(i)) || result.charAt(i)=='.') && flag)
        //   {
        //     n1=n1+result.charAt(i);
        //   }
        //   else if((Character.isDigit(result.charAt(i)) || result.charAt(i)=='.') && !flag)
        //   {
        //     n2=n2+result.charAt(i);
        //   }
        //   else
        //   {
        //     c = result.charAt(i);
        //     flag=false;
        //   }
        //
        // }
        //
        // if(c == '+')
        // {
        //   res = Double.parseDouble(n1)+Double.parseDouble(n2);
        // }
        // else if(c == '-')
        // {
        //   res = Double.parseDouble(n1)- Double.parseDouble(n2);
        // }
        // else if(c == '*')
        // {
        //   res = Double.parseDouble(n1) *  Double.parseDouble(n2);
        // }
        // else if(c == '/')
        // {
        //   res = Double.parseDouble(n1) / Double.parseDouble(n2);
        // }
        //

        calValue();


      }
      if( e.getSource() == btn[16] )
      {
        text.setText("");
        view.setText("");
        //result_text.setText("");
      }
      if( e.getSource() == delb )
      {
        //text.setText("");
        String t = text.getText();
        String t2 = t.substring(0,t.length()-1);
        text.setText(t2);
        view.setText(t2);

      }
      if( e.getSource() == text )
      {
        //text.setText("");

      calValue();
      }



    }
    public void calValue() {
      try{
      ScriptEngineManager mgr = new ScriptEngineManager();
      ScriptEngine engine = mgr.getEngineByName("JavaScript");
      String result = text.getText();
      //result_text.setText(String.valueOf(engine.eval(result)));
      text.setText(String.valueOf(engine.eval(result)));
    }
    catch(ScriptException ex)
    {
      //System.out.println("Error");
      text.setText("Invalid");
    }

    }

}
