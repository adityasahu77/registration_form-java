import java.awt.*;
import java.awt.event.*;
class registration extends Frame{
   
  registration(){


     setLayout(null);
      //Gui code
      Color bg = new Color(46,2,45);
      setBackground(bg);
      setForeground(Color.WHITE);

      Label l1 = new Label("Registration Form");
      add(l1);
      l1.setBounds(400,30,100,50);
      Label l2 = new Label("First Name");
      add(l2);
      l2.setBounds(250,100,100,10);

      TextField t1 = new TextField(15);
      add(t1);
      t1.setBounds(400,100,150,30);
      t1.setForeground(Color.WHITE);


      Label l3 = new Label("Last Name");
      add(l3);
      l3.setBounds(250,150,100,10);

      TextField  t2= new TextField(10);
      add(t2);
      t2.setBounds(400,150,150,30);
      t2.setForeground(Color.WHITE);

      Label l4 = new Label("Address");
      add(l4);
      l4.setBounds(250,200,100,10);

      TextArea a = new TextArea(10,10);
      add(a);
      a.setBounds(400,200,300,50);
      a.setForeground(Color.WHITE);

      Label l6 = new Label("Gender");
      add(l6);
      l6.setBounds(250,250,100,30);

      CheckboxGroup cbg = new CheckboxGroup();
      Checkbox c4 = new Checkbox("male",cbg,false);
      add(c4);
      c4.setBounds(400,250,100,30);

      Checkbox c5 = new Checkbox("female",cbg,false);
      add(c5);
      c5.setBounds(500,250,100,30);

      /*Checkbox c6 = new Checkbox("other",cbg,true);
      add(c6);
      c6.setBounds(500,250,100,30);*/


     Label l5 = new Label("Hobbies");
     add(l5);
     l5.setBounds(250,300,100,30);

     Checkbox c1 = new Checkbox("Cricket");
     add(c1);
     c1.setBounds(400,300,100,30);

     Checkbox c2 = new Checkbox("volleyball");
     add(c2); 
     c2.setBounds(400,330,100,30);

     Checkbox c3 = new Checkbox("Reading");
     add(c3);
     c3.setBounds(400,360,100,30);
     
     Checkbox c6 = new Checkbox("others");
     add(c6);
     c6.setBounds(400,390,100,30);
   
   Label l7 = new Label("Subject");
   add(l7);
  l7.setBounds(250,420,100,30);

   List l = new List(4);
   l.add("java");
   l.add("C++");
   l.add("AI & DS");
   l.add("DSA");
   add(l);
  l.setBackground(bg);
  l.setBounds(400,425,100,40);
  l.setForeground(Color.WHITE);

   Label l8 = new Label("Cities");
   add(l8);
  l8.setBounds(250,480,100,30);

   Choice c = new Choice();
   c.add("Nashik");
   c.add("Vidisha");
   c.add("Bhopal");
   add(c);
      c.setBackground(bg);
  c.setBounds(400,480,100,30);
   c.setForeground(Color.WHITE);
  Button b1 = new Button("Submit");
  add(b1);
  b1.setBounds(550,540,80,30);
  b1.setForeground(Color.BLACK);


        //closing frame
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });





       setVisible(true);
       setTitle("Registration form");
       setSize(800,800);
       //setLayout(new FlowLayout());

  }
  public static void main(String[] args){
    
    registration rpage = new registration();

  }

}