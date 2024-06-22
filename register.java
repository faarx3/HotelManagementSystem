import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
class Register implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6;
JTextField tf1,tf2;
JPasswordField pf1,pf2;
JButton b1,b2;
JFrame f;
JPanel p;
Register()
{
 p=new JPanel();
 l6=new JLabel();
f=new JFrame("REGISTER FORM");
l1=new JLabel("NAME");
l2=new JLabel("EMAIL");
l3=new JLabel("PASSWORD");
l4=new JLabel("CONFIRM-PASSWORD");
l5=new JLabel("REGISTER FORM");
tf1=new JTextField(50);
tf2=new JTextField(50);
pf1=new JPasswordField();
pf2=new JPasswordField();
b1=new JButton("cancel");
b2=new JButton("submit");
b2.addActionListener(this);
l6.setIcon(new ImageIcon("F:\\New folder\\bb.jpg"));
l6.setBounds(0,0,1500,1500);
l5.setBounds(130,10,150,10);
l1.setBounds(30,40,150,30);
l2.setBounds(30,80,150,30);
l3.setBounds(30,120,150,30);
l4.setBounds(30,160,150,30);
tf1.setBounds(180,40,150,30);
tf2.setBounds(180,80,150,30);
pf1.setBounds(180,120,150,30);
pf2.setBounds(180,160,150,30);
b1.setBounds(60,230,90,30);
b2.setBounds(180,230,90,30);
p.add(l5);
l6.add(p);
p.add(l1);
p.add(l2);
p.add(l3);
p.add(l4);
p.add(tf1);
p.add(tf2);
p.add(pf1);
p.add(pf2);
p.add(b1);
p.add(b2);
p.setBackground(new Color(0,0,0,10));
p.setBounds(500,200,500,300);
p.setLayout(null);
p.setVisible(true);
f.add(l6);
f.getContentPane().setBackground(Color.PINK);
f.setSize(1500,1500);
f.setLayout(null);
f.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e)
{

String s1=tf1.getText();
 String s2=tf2.getText();
 String s3=pf1.getText();
 try {
 Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
 PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?)");
 ps.setString(1,"2");
 ps.setString(2,s1);
 ps.setString(3,s2);
 ps.setString(4,s3);
 ps.executeUpdate();
 System.out.print("hello");
 }catch(Exception ee){}
}
public static void main(String s[])
{
new Register();
}
}
