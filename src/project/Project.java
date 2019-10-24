package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener,KeyListener {
    JPanel pan1,pan2,pan3,pan4,pan5,pan6,pan7,pan8,pan9;
    
    JButton bon1,bon2,bon3,bon4,bon5,bon6,bon7,bon8,bon9,bon0,bondt,
    bonback,bonc,bonce,bonmplus,bonms,bonmr,bonmc,bonmminus,bonplus,bonminus,bonmul,bondiv,bonequal,bonDivx,bonmod,bonsqrt,
    bonfact,bon10x,bonx2,bonx3,bonxy,bonpi,bonexp,bonsin,boncos,bontan,bonsinh,boncosh,bontanh,
    bonsqrt3,bonsqrtx,bonlog,bonplusminus,bonabs,bonround;
 
    JTextArea text;  
    Double number1,number2,res;
    int adde=0,subt=0,multi=0,divid=0,sqrts=0,modu=0,facto=0,divideX=0,x2=0,x3=0,xy=0,expo=0,pi=0,pow10x=0;
    int sin=0,cos=0,tan=0,sinh=0,cosh=0,tanh=0,sqrt3=0,sqrtx=0,log=0,hexai=0,round=0,plusminus=0,abs=0;      
      
    public Project()
    {
        getContentPane().setBackground(Color.BLACK);
        this.setTitle("Calculator");
        this.setSize(600,400);
        this.setVisible(true);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new GridLayout(9,5,20,5));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text = new JTextArea(1,20);
        text.setFont(new Font ("Arial",Font.BOLD,16));
        text.setBackground(Color.lightGray);
        text.setForeground(Color.black);
        
        bon1 = new JButton("1");
        bon1.setBackground(Color.GRAY);
        bon1.setForeground(Color.WHITE);
        bon2 = new JButton("2");
        bon2.setBackground(Color.GRAY);
        bon2.setForeground(Color.WHITE);
        bon3 = new JButton("3");
        bon3.setBackground(Color.GRAY);
        bon3.setForeground(Color.WHITE);
        bon4 = new JButton("4");
        bon4.setBackground(Color.GRAY);
        bon4.setForeground(Color.WHITE);
        bon5 = new JButton("5");
        bon5.setBackground(Color.GRAY);
        bon5.setForeground(Color.WHITE);        
        bon6 = new JButton("6");
        bon6.setBackground(Color.GRAY);
        bon6.setForeground(Color.WHITE);
        bon7 = new JButton("7");
        bon7.setBackground(Color.GRAY);
        bon7.setForeground(Color.WHITE);
        bon8 = new JButton("8");
        bon8.setBackground(Color.GRAY);
        bon8.setForeground(Color.WHITE);
        bon9 = new JButton("9");
        bon9.setBackground(Color.GRAY);
        bon9.setForeground(Color.WHITE);
        bon0 = new JButton("0");
        bon0.setBackground(Color.GRAY);
        bon0.setForeground(Color.WHITE);
        bondt = new JButton(".");
        bondt.setBackground(Color.GRAY);
        bondt.setForeground(Color.WHITE);
        bonc = new JButton("C");
        bonc.setBackground(Color.RED);
        bonc.setForeground(Color.WHITE);
        bondiv = new JButton("/");
        bondiv.setBackground(Color.DARK_GRAY);
        bondiv.setForeground(Color.WHITE);
        bonplus = new JButton("+");
        bonplus.setBackground(Color.DARK_GRAY);
        bonplus.setForeground(Color.WHITE);
        bonminus = new JButton("-");
        bonminus.setBackground(Color.DARK_GRAY);
        bonminus.setForeground(Color.WHITE);
        bonmul = new JButton("*");
        bonmul.setBackground(Color.DARK_GRAY);
        bonmul.setForeground(Color.WHITE);
        bonequal = new JButton("=");
        bonequal.setBackground(Color.RED);
        bonequal.setForeground(Color.WHITE);
        bonDivx = new JButton("1/x");
        bonDivx.setBackground(Color.DARK_GRAY);
        bonDivx.setForeground(Color.WHITE);
        bonfact = new JButton("n!");
        bonfact.setBackground(Color.DARK_GRAY);
        bonfact.setForeground(Color.WHITE);
        bon10x = new JButton("10^x");
        bon10x.setBackground(Color.DARK_GRAY);
        bon10x.setForeground(Color.WHITE);
        bonx2 = new JButton("x^2");
        bonx2.setBackground(Color.DARK_GRAY);
        bonx2.setForeground(Color.WHITE);
        bonx3 = new JButton("x^3");
        bonx3.setBackground(Color.DARK_GRAY);
        bonx3.setForeground(Color.WHITE);
        bonxy = new JButton("x^y");
        bonxy.setBackground(Color.DARK_GRAY);
        bonxy.setForeground(Color.WHITE);
        bonexp = new JButton("Exp");
        bonexp.setBackground(Color.DARK_GRAY);
        bonexp.setForeground(Color.WHITE);
        bonpi = new JButton("π");
        bonpi.setBackground(Color.DARK_GRAY);
        bonpi.setForeground(Color.WHITE);
        bonmod = new JButton("%");
        bonmod.setBackground(Color.DARK_GRAY);
        bonmod.setForeground(Color.WHITE);
        bonsqrt = new JButton("√");
        bonsqrt.setBackground(Color.DARK_GRAY);
        bonsqrt.setForeground(Color.WHITE);
        bonback = new JButton("←");
        bonback.setBackground(new Color(255, 128, 0));
        bonback.setForeground(Color.WHITE);
        bonsin = new JButton("sin");
        bonsin.setBackground(Color.DARK_GRAY);
        bonsin.setForeground(Color.WHITE);
        boncos = new JButton("cos");
        boncos.setBackground(Color.DARK_GRAY);
        boncos.setForeground(Color.WHITE);
        bontan = new JButton("tan");
        bontan.setBackground(Color.DARK_GRAY);
        bontan.setForeground(Color.WHITE);
        bonsinh = new JButton("sinh");
        bonsinh.setBackground(Color.DARK_GRAY);
        bonsinh.setForeground(Color.WHITE);
        boncosh = new JButton("cosh");
        boncosh.setBackground(Color.DARK_GRAY);
        boncosh.setForeground(Color.WHITE);
        bontanh = new JButton("tanh");
        bontanh.setBackground(Color.DARK_GRAY);
        bontanh.setForeground(Color.WHITE);
        bonsqrt3 = new JButton("3√");
        bonsqrt3.setBackground(Color.DARK_GRAY);
        bonsqrt3.setForeground(Color.WHITE);
        bonsqrtx = new JButton("x√");
        bonsqrtx.setBackground(Color.DARK_GRAY);
        bonsqrtx.setForeground(Color.WHITE);
        bonlog = new JButton("log");
        bonlog.setBackground(Color.DARK_GRAY);
        bonlog.setForeground(Color.WHITE);
        bonplusminus = new JButton("±");
        bonplusminus.setBackground(Color.DARK_GRAY);
        bonplusminus.setForeground(Color.WHITE);
        bonabs = new JButton("Abs");
        bonabs.setBackground(Color.DARK_GRAY);
        bonabs.setForeground(Color.WHITE);
        bonround = new JButton("Round");
        bonround.setBackground(Color.DARK_GRAY);
        bonround.setForeground(Color.WHITE);
 
        pan1 = new JPanel(new GridLayout(1,1));
        pan1.add(text);
        pan1.setBackground(Color.BLACK);
        pan2 = new JPanel(new GridLayout(1,5,10,5));
        pan2.add(bonx2);pan2.add(bonx3);pan2.add(bonxy);pan2.add(bon10x);pan2.add(bonplusminus);
        pan2.setBackground(Color.BLACK);       
        pan3 = new JPanel(new GridLayout(1,5,10,5));
        pan3.add(bonfact);pan3.add(bonmod);pan3.add(bonback);pan3.add(bonc);pan3.add(bonsqrt);
        pan3.setBackground(Color.BLACK);
        pan4 = new JPanel(new GridLayout(1,5,10,5));
        pan4.add(bon7);pan4.add(bon8);pan4.add(bon9);pan4.add(bondiv);pan4.add(bonsqrt3);
        pan4.setBackground(Color.BLACK);
        pan5 = new JPanel(new GridLayout(1,5,10,5));
        pan5.add(bon4);pan5.add(bon5);pan5.add(bon6);pan5.add(bonmul);pan5.add(bonsqrtx);
        pan5.setBackground(Color.BLACK);
        pan6 = new JPanel(new GridLayout(1,5,10,5));
        pan6.add(bon1);pan6.add(bon2);pan6.add(bon3);pan6.add(bonminus);pan6.add(bonDivx);
        pan6.setBackground(Color.BLACK);
        pan7 = new JPanel(new GridLayout(1,5,10,5));
        pan7.add(bon0);pan7.add(bondt);pan7.add(bonequal);pan7.add(bonplus);pan7.add(bonpi);
        pan7.setBackground(Color.BLACK);
        pan8 = new JPanel(new GridLayout(1,5,10,5));
        pan8.add(bonsin);pan8.add(boncos);pan8.add(bontan);pan8.add(bonsinh);pan8.add(boncosh);
        pan8.setBackground(Color.BLACK);
        pan9 = new JPanel(new GridLayout(1,5,10,5));
        pan9.add(bontanh);pan9.add(bonround);pan9.add(bonabs);pan9.add(bonlog);pan9.add(bonexp);
        pan9.setBackground(Color.BLACK);

        
        this.add(pan1);
        this.add(pan8);      
        this.add(pan9);
        this.add(pan2);      
        this.add(pan3);      
        this.add(pan4);      
        this.add(pan5);      
        this.add(pan6);      
        this.add(pan7);      
        

        bon1.addActionListener(this);
        bon2.addActionListener(this);
        bon3.addActionListener(this);
        bon4.addActionListener(this);
        bon5.addActionListener(this);
        bon6.addActionListener(this);
        bon7.addActionListener(this);
        bon8.addActionListener(this);
        bon9.addActionListener(this);
        bon0.addActionListener(this);
        bondt.addActionListener(this);
        bonplus.addActionListener(this);
        bonminus.addActionListener(this);
        bondiv.addActionListener(this);
        bonmul.addActionListener(this);
        bonequal.addActionListener(this);
        bonc.addActionListener(this);
        bonback.addActionListener(this);
        bonsqrt.addActionListener(this);
        bonmod.addActionListener(this);
        bonDivx.addActionListener(this);
        bonfact.addActionListener(this);
        bonx2.addActionListener(this);
        bonx3.addActionListener(this);
        bonxy.addActionListener(this);
        bonexp.addActionListener(this);
        bonpi.addActionListener(this);
        bon10x.addActionListener(this);
        bonsin.addActionListener(this);
        boncos.addActionListener(this);
        bontan.addActionListener(this);
        bonsinh.addActionListener(this);
        boncosh.addActionListener(this);
        bontanh.addActionListener(this);
        bonsqrt3.addActionListener(this);
        bonsqrtx.addActionListener(this);
        bonlog.addActionListener(this);
        bonabs.addActionListener(this);
        bonplusminus.addActionListener(this);
        bonround.addActionListener(this);
      
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    
}

    public static void main(String[] args) {
 
       Project p = new Project();
       
       }

    @Override
    public void actionPerformed(ActionEvent ae) {
       Object obj = ae.getSource();
       
       if(obj == bon1)
       {
           text.append("1");
       }
       if(obj == bon2)
       {
           text.append("2");
       }
       if(obj == bon3)
       {
           text.append("3");
       }
       if(obj == bon4)
       {
           text.append("4");
       }
       if(obj == bon5)
       {
           text.append("5");
       }
       if(obj == bon6)
       {
           text.append("6");
       }
       if(obj == bon7)
       {
           text.append("7");
       }
       if(obj == bon8)
       {
           text.append("8");
       }
       if(obj == bon9)
       {
           text.append("9");
       }
       if(obj == bon0)
       {
           text.append("0");
       }
       if(obj == bondt)
       {
           text.append(".");
       }
       if(obj == bonplus)
       {
          number1 = number_reader();
          text.setText("");
          adde=1;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          plusminus=0;
          abs = 0;
       }
       if(obj == bonminus)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=1;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          abs = 0;
          plusminus=0;
       }
       if(obj == bondiv)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=1;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          abs = 0;
          plusminus=0;
       }
       if(obj == bonmul)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=1;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          abs = 0;
          plusminus=0;
       }
       if(obj == bonsqrt)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=1;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          abs = 0;
          plusminus=0;
       }
       if(obj == bonfact)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=1;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          abs = 0;
          plusminus=0;
       }
       if(obj == bonmod)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=1;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          abs = 0;
          plusminus=0;
       }
       if(obj == bonx2)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=1;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          abs = 0;
          plusminus=0;
       }
        if(obj == bonx3)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=1;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          abs = 0;
          plusminus=0;
       }
       if(obj == bonxy)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=1;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          abs = 0;
          plusminus=0;
       }
       
       if(obj == bonDivx)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=1; 
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          abs = 0;
          plusminus=0;
       }
       if(obj == bon10x)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0; 
          pi=0;
          pow10x=1;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          plusminus=0;
          abs = 0;
       }
       if(obj == bonsin)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0; 
          pi=0;
          pow10x=0;
          sin=1;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          plusminus=0;
          abs = 0;
       }
       if(obj == boncos)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0; 
          pi=0;
          pow10x=0;
          sin=0;
          cos=1;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          plusminus=0;
          abs = 0;
       }
       if(obj == bontan)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0; 
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=1;   
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          plusminus=0;
          abs = 0;
       }
       if(obj == bonsinh)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=1;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          plusminus=0;
          abs = 0;
       }
       if(obj == boncosh)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=1;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          plusminus=0;
          abs = 0;
       }
       if(obj == bontanh)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=1;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          plusminus=0;
          abs = 0;
       }
       if(obj == bonsqrt3)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=1;
          sqrtx=0;
          log=0;
          round=0;
          plusminus=0;
          abs = 0;
       }
       if(obj == bonsqrtx)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=1;
          log=0;
          round=0;
          plusminus=0;
          abs = 0;
       }
       if(obj == bonlog)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=1;
          round=0;
          plusminus=0;
          abs = 0;
       }
       if(obj == bonplusminus)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=0;
          plusminus=1;
          abs = 0;
       }
       if(obj == bonabs)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          abs=1;
          round=0;
          plusminus=0;
       }
       if(obj == bonround)
       {
          number1 = number_reader();
          text.setText("");
          adde=0;
          subt=0;
          multi=0;
          divid=0;
          sqrts=0;
          modu=0;
          facto=0;
          divideX=0;
          x2=0;
          x3=0;
          xy=0;
          expo=0;
          pi=0;
          pow10x=0;
          sin=0;
          cos=0;
          tan=0;
          sinh=0;
          cosh=0;
          tanh=0;
          sqrt3=0;
          sqrtx=0;
          log=0;
          round=1;
          plusminus=0;
          abs = 0;
       }
       
       if(obj == bonDivx)
       {
           text.setText("" + (1/number1));
       }
       if(obj == bonsqrt)
       {
           text.setText( "" + Math.sqrt(number1));  
       }
       if(obj == bonx2)
       {
           text.setText("" + Math.pow(number1, 2));
       }
       if(obj == bonx3)
       {
           text.setText("" + Math.pow(number1, 3));
       }
       if(obj == bon10x)
       {
           text.setText("" + Math.pow(10,number1));
       }
       if(obj == bonexp)
       {
           text.setText("" + Math.E);
       }
       if(obj == bonpi)
       {
           text.setText("" + Math.PI);
       }
       if(obj == bonsin)
       {
           number1 = Math.toRadians(number1);
           text.setText("" + Math.sin(number1));
       }
       if(obj == boncos)
       {
           number1 = Math.toRadians(number1);
           text.setText("" + Math.cos(number1));
       }
       if(obj == bontan)
       {
           number1 = Math.toRadians(number1);
           text.setText("" + Math.tan(number1));
       }
       if(obj == bonsinh)
       {
           number1 = Math.toRadians(number1);
           text.setText("" + Math.sinh(number1));
       }
       if(obj == boncosh)
       {
           number1 = Math.toRadians(number1);
           text.setText("" + Math.cosh(number1));
       }
       if(obj == bontanh)
       {
           
           number1 = Math.toRadians(number1);
           text.setText("" + Math.tanh(number1));
       }
       if(obj == bonsqrt3)
       {   
           text.setText("" + Math.cbrt(number1));
       }
       if(obj == bonlog)
       {
           text.setText("" + Math.log10(number1));
       }
       if(obj == bonplusminus)
       {
           text.setText("" + (number1 * -1));           
       }
       if(obj == bonabs)
       {
           text.setText("" + Math.abs(number1));           
       }
       if(obj == bonround)
       {
           text.setText("" + Math.round(number1));
       }
       if(obj == bonequal)
       {
           
           number2 = number_reader();
           if(xy > 0)
           {
               res = Math.pow(number1, number2);
               text.setText(Double.toString(res));
           }
           if(adde>0)
           {
               res = number1 + number2;
               text.setText(Double.toString(res));
           }
           if(subt>0)
           {
               res = number1 - number2;
               text.setText(Double.toString(res));
           }
           if(multi>0)
           {
               res = number1 * number2;
               text.setText(Double.toString(res));
           }
           if(divid>0)
           {
               res = number1 / number2;
               text.setText(Double.toString(res));
           }
           if(modu > 0)
           {
               res = number1 % number2;
               text.setText(Double.toString(res));
           }
           if(sqrtx > 0)
           {
               res = Math.pow(number1, (1/number2));
               text.setText(Double.toString(res));
           }
        }
       if(obj == bonfact)
       {
           double f = fact(number1);
           text.setText(String.valueOf(f));
       }
       if(obj == bonc){
           number1 = 0.0;
           number2 = 0.0;
           text.setText("");
       }
       if(obj == bonback)
       {
           String s;
           if(text.getText().length()>0)
           {
               StringBuilder sr = new StringBuilder(text.getText());
               sr.deleteCharAt(text.getText().length()-1);
               s = sr.toString();
               text.setText(s);
           }
       }
   
    }
       
    public double number_reader()
    {
       Double num1;
       String s;
       s = text.getText();
       num1 = Double.valueOf(s);
       
       return num1;
    }
    public double fact(double n)
    {
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    
     @Override
    public void keyPressed(KeyEvent e) { 
        switch(e.getKeyChar()) {
            case '0':
                text.append("0");
                break;
            case '1':
                text.append("1");
                break;
            case '2':
                text.append("2");
                break;
            case '3':
                text.append("3");
                break;
            case '4':
                text.append("4");
                break;
            case '5':
                text.append("5");
                break;
            case '6':
                text.append("6");
                break;
            case '7':
                text.append("7");
                break;
            case '8':
                text.append("8");
                break;
            case '9':
                text.append("9");
                break;
            case '+':
                text.append("+");
                break;
            case '-':
                text.append("-");
                break;
            case '*':
            case '×':
                text.append("*");
                break;
            case '/':
            case '÷':
                text.append("/");
                break;
            case '%':
                text.append("%");
                break;
            case '^':
                text.append("^");
                break;
            case '.':
                text.append(".");
                break;
            }
    } 
    @Override
    public void keyTyped(KeyEvent e) {    
    }
    
    @Override
    public void keyReleased(KeyEvent e) { 
    }
}