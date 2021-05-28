package calculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame extends JFrame  implements ItemListener  {
        String s1;
        double num1,num2,res2;
        char ope;
        JPanel p=new JPanel();          //of frame
        JPanel p1=new JPanel();         //of exit
        JPanel p2=new JPanel();         //of numbers
        JPanel p3=new JPanel();         //of function
        JButton del =new JButton("DEL");
        JButton clr =new JButton("CLR");
        JButton ans =new JButton("ANS");
        JButton exit =new JButton("EXIT");
        JTextField t1 =new JTextField();
        JButton b1 =new JButton("7");
        JButton b2 =new JButton("8");
        JButton b3 =new JButton("9");
        JButton b4 =new JButton("+");
        JButton b5 =new JButton("4");
        JButton b6 =new JButton("5");
        JButton b7 =new JButton("6");
        JButton b8 =new JButton("-");
        JButton b9 =new JButton("1");
        JButton b10 =new JButton("2");
        JButton b11 =new JButton("3");
        JButton b12 =new JButton("*");
        JButton b13 =new JButton("0");
        JButton b14 =new JButton(".");
        JButton b15 =new JButton("±");
        JButton b16 =new JButton("/");    
        JButton bb1 =new JButton("x^2");
        JButton bb2 =new JButton("x^3");
        JButton bb3 =new JButton("x^y");
        JButton bb4 =new JButton("1/x");
        JButton bb5 =new JButton("(");
        JButton bb6 =new JButton("√ ");
        JButton bb7 =new JButton("3√");
        JButton bb8 =new JButton("x√");
        JButton bb9 =new JButton("n!");
        JButton bb10 =new JButton(")");
        JButton bb11 =new JButton("sin");
        JButton bb12 =new JButton("cos");
        JButton bb13 =new JButton("tan");
        JButton bb14 =new JButton("exp");
        JButton bb15 =new JButton("nPr");
        JButton bb16 =new JButton("asin");
        JButton bb17 =new JButton("acos");
        JButton bb18 =new JButton("atan");
        JButton bb19 =new JButton("log");
        JButton bb20 =new JButton("nCr");
        JButton bb21 =new JButton("sinh");
        JButton bb22 =new JButton("cosh");
        JButton bb23=new JButton("tanh");
        JButton bb24 =new JButton("log10");
        JButton bb25 =new JButton("π");
        JCheckBox CB=new JCheckBox("Scientific");
        JLabel l1=new JLabel("Scientific");
        JMenu m1 = new JMenu ("File");
        JMenu m2 = new JMenu ("Help");
        JMenuBar MB=new JMenuBar();
        String sAll;
        private void all(String s){
                s1=t1.getText();
                sAll=s1 +s;
                t1.setText(sAll);
       }
        private void operation(char c){
         num1=Double.parseDouble(t1.getText());
         t1.setText(" ");
         ope=c;
        }
    public Frame()  {
        frame ();
        panel1();
        bar ();
        menu1 ();
        panel2 ();
        panel3 ();
        check ();
        CB.addItemListener(this);
        
        exit.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
            System.exit(0);
            }
        });
        
        clr.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
            t1.setText(" ");
            s1=" ";
            }
        });
        
        del.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
//                String str =null;
                StringBuilder strb =new StringBuilder(t1.getText());
                strb.deleteCharAt(t1.getText().length()-1);
                t1.setText(strb.toString());
                
               
            }
        });
        ans.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                num2=Double.parseDouble(t1.getText());
                switch(ope){
                    case '+':
                        res2=num1+num2;
                        t1.setText(String.valueOf(res2));
                        break;
                    case '-':
                        res2=num1-num2;
                        t1.setText(String.valueOf(res2));
                        break;
                    case '*':
                        res2=num1*num2;
                        t1.setText(String.valueOf(res2));
                        break;
                    case '/':
                            if(num2==0){
//                                t1.setText("math error");
                              System.out.println("math error");
                              System.exit(0);
                            }
                            else{
                       
                            res2=num1/num2;
                            t1.setText(String.valueOf(res2));
                       
                            }
                            break;
                         
                    case 'p':
                        if(num1>num2){
                            int t2=(int)num1;
                            int t3=(int)num2;
                            int a=fact(t2)/fact(t2-t3);
                            res2=(double)a;
                            sAll=String.valueOf(res2);
                            t1.setText(sAll);
                        }
                        else{
                        System.exit(0);
                        }
                        break;
                            case 'n':
                        if(num1>num2){
                            int t2=(int)num1;
                            int t3=(int)num2;
                            int a=fact(t2)/(fact(t2-t3)*fact(t3));
                            res2=(double)a;
                            sAll=String.valueOf(res2);
                            t1.setText(sAll);
                        }
                        else{
                        System.exit(0);
                        }
                        break;
                        
                            case 's':
                                if(num1 >0 && num2 !=0 && num2>0 ){
                                num2=1/num2;
                                res2 = Math.pow(num1,num2);
                                sAll=String.valueOf(res2);
                                 t1.setText(sAll);
                                }
                                else{
                                System.exit(0);
                                }
                                 break;
                                 case 'w':
                                res2 = Math.pow(num1,num2);
                                sAll=String.valueOf(res2);
                                 t1.setText(sAll);
                                 break;
                        }
                }
               
            
       });

        
        b1.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                all("7");
            }
        });
        
        b2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                all("8");
            }
        });
        b3.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                all("9");
            }
        });
        b4.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                operation('+');

            }
        });
        b5.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                all("4");
            }
        });
        b6.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                all("5");
            }
        });
        b7.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                all("6");
            }
        });
        b8.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                operation('-');
//                t1.setText("-");
            }
        });
        b9.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 all("1");
            }
        });
        b10.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 all("2");
            }
        });
        b11.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 all("3");
            }
        });
        b12.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 operation('*');

            }
        });
         b13.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 all("0");
            }
        });
          b14.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 all(".");
            }
        });
           b15.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 x*=-1;
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
            }
        });
           b16.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                operation('/');
            }
        });
           bb1.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 x=Math.pow(x, 2);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
            }
        });
           bb2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 x=Math.pow(x, 3);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
            }
        });
        bb3.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 operation ('w');
            }
        });
        bb4.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                   if(x==0){
                            System.exit(0);
                            }
                   else{
                      x=1/x;
                      sAll=String.valueOf(x);
                      t1.setText(sAll);
                   }
            }
        });
        bb5.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
//                 all('(');
            }
        });
        bb6.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 if(x<0){
                 System.exit(0);
                 }
                 else{
                 x=Math.sqrt(x);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
                 }
            }
        });
        bb7.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 if(x<0){
                 System.exit(0);
                 }
                 else{
                 x=Math.pow(x, 0.3333333333);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);}
            }
        });
        bb8.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 operation('s');
            }
        });
        bb9.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 int t;
                 t=(int)x;
                 sAll=String.valueOf(fact(t));
                 t1.setText(sAll);
            }
        });
        bb10.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
//                 all(')');
            }
        });
        
        bb11.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 x=Math.sin(x);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
            }
        });
        
        bb12.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 x=Math.cos(x);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
            }
        });
        
        bb13.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 x=Math.tan(x);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
            }
        });
        
        bb14.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 x=Math.exp(x);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
            }
        });
        bb15.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                    operation('p');
            }
        });
        bb16.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 x=Math.asin(x);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
            }
        });
        bb17.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 x=Math.acos(x);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
            }
        });
        bb18.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 x=Math.atan(x);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
            }
        });
        bb19.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 if(x>0){
                 x=Math.log(x);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
                 }
                 else {
                 System.out.println("Math error");
                 System.exit(0);
                         }
                 
            }
        });
        bb20.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 operation('n');
            }
        });
        bb21.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 x=Math.sinh(x);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
            }
        });
        bb22.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 x=Math.cosh(x);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
            }
        });
        bb23.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 x=Math.tanh(x);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
            }
        });bb24.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x=Double.parseDouble(sAll);
                 if(x>0){
                 x=Math.log10(x);
                 sAll=String.valueOf(x);
                 t1.setText(sAll);
                 }
                 else{
                 System.exit(0);
                 }
            }
        });
        bb25.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                 double x;
                 x=Math.PI;
                 all(String.valueOf(x));
            }
        });  
    }
    private void frame (){
//       this.setSize(900,525);
        this.setSize(420,525);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.setResizable(false);
        this.setLocation(500,200);
        setLayout(null);
    }
    private void panel1 (){
        p.setLayout(null);
//        p.setBounds(0,0,900,525);
        p.setBounds(0,0,420,525);
        p.setBackground(Color.lightGray);
        this.add(p);
    }
    private void bar (){
        p.setLayout(null);
//        MB.setBounds(0,2,900,35);
//        m1.setBounds(0,2,900,35);
//        m2.setBounds(0,2,900,35);
        MB.setBounds(0,2,420,35);
        m1.setBounds(0,2,420,35);
        m2.setBounds(0,2,420,35);
        MB.add(m1);
        MB.add(m2);
        p.add(MB);
    }
    private void menu1 (){
//      t1.setBounds(2,47,890,40);
        t1.setBounds(2,47,410,40);
        p.add(t1);
        p1.setLayout(null);
//        p1.setBounds(2,97,890,65);
        p1.setBounds(2,97,410,65);
        p1.setBackground(Color.DARK_GRAY);
        p.add(p1);
//        del.setBounds(4,12,80,41);
//        clr.setBounds(88,12,80,41);
//        ans.setBounds(712,12,80,41);
//        exit.setBounds(796,12,80,41);
        del.setBounds(4,12,80,41);
        clr.setBounds(88,12,80,41);
        ans.setBounds(236,12,80,41);
        exit.setBounds(320,12,80,41);
        p1.add(del);
        p1.add(clr);
        p1.add(ans);
        p1.add(exit);
    }
    private void panel2 (){
         p2.setBounds(2,180,410,255);
         p2.setBackground(Color.DARK_GRAY);         
         p2.setLayout(new GridLayout(4,4,8,8));
         p.add(p2);
         p2.add(b1);
         p2.add(b2);
         p2.add(b3);
         p2.add(b4);
         p2.add(b5);
         p2.add(b6);
         p2.add(b7);
         p2.add(b8);
         p2.add(b9);
         p2.add(b10);
         p2.add(b11);
         p2.add(b12);
         p2.add(b13);
         p2.add(b14);
         p2.add(b15);
         p2.add(b16);
    }
    private void panel3 (){
         p3.setBounds(435,180,450,255);
         p3.setBackground(Color.DARK_GRAY);
         p3.setVisible(false);
         p.add(p3);
         p3.setLayout(new GridLayout(5,5,8,8));
         p3.add(bb1);
         p3.add(bb2);
         p3.add(bb3);
         p3.add(bb4);
         p3.add(bb5);
         p3.add(bb6);
         p3.add(bb7);
         p3.add(bb8);
         p3.add(bb9);
         p3.add(bb10);
         p3.add(bb11);
         p3.add(bb12);
         p3.add(bb13);
         p3.add(bb14);
         p3.add(bb15);
         p3.add(bb16);
         p3.add(bb17);
         p3.add(bb18);
         p3.add(bb19);
         p3.add(bb20);
         p3.add(bb21);
         p3.add(bb22);
         p3.add(bb23);
         p3.add(bb24);
         p3.add(bb25);
    }
    private void check (){
//        CB.setBounds(5,455,20,15);
        CB.setBounds(5,455,20,15);
        p.add(CB);       
//        l1.setBounds(35,455,100,15);
        l1.setBounds(35,455,100,15);
        p.add(l1);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (CB.isSelected()){
       this.setSize(900,525);
       p3.setVisible(true);
       p.setSize(900, 525);
       p.setLayout(null);
       t1.setBounds(2,47,890,40);
        MB.setBounds(0,2,900,35);
        m1.setBounds(0,2,900,35);
        m2.setBounds(0,2,900,35);
        p1.setBounds(2,97,888,65);
        del.setBounds(4,12,80,41);
        clr.setBounds(88,12,80,41);
        ans.setBounds(712,12,80,41);
        exit.setBounds(796,12,80,41);
        }
        else{
        p3.setVisible(false);
        this.setSize(420,525);
        p.setSize(420, 525);
        p.setLayout(null);
        p1.setBounds(2,97,410,65);
        del.setBounds(4,12,80,41);
        clr.setBounds(88,12,80,41);
        ans.setBounds(236,12,80,41);
        exit.setBounds(320,12,80,41);
        t1.setBounds(2,47,410,40);
        
        }
   }
        private int fact (int num){
        int factnum=1,i=1;
        if(num>0){
        for(;i<=num;i++){
          factnum*=i;
        }
        }
        else {
        System.exit(0);
        }
                      return factnum;

        }
}
    
    

