package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.crypto.EncryptedPrivateKeyInfo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class SignUp extends JFrame implements ActionListener {

    JTextField textName;
    JTextField textFName;
    JTextField textFieldEmail;
    JTextField textMS;
    JTextField textAdd,textCity, textPin, textState;

    JDateChooser dateChooser;
    JRadioButton radioButton1;
    JRadioButton radioButton2,radioButton3,radioButton4,radioButton5;
    JButton next;

    Random ran=new Random();
    long first4=(ran.nextLong() % 9000L) + 1000L;
    String first = " "+Math.abs(first4);


    SignUp()
    {
        super("Application Form");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3=new JLabel("Personal Details:");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName=new JLabel("Name :");
        labelName.setFont(new Font("Ralway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Ralway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFName=new JLabel("Father's Name :");
        labelFName.setFont(new Font("Ralway",Font.BOLD,20));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFName=new JTextField();
        textFName.setFont(new Font("Ralway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel DOB=new JLabel("Date Of Birth :");
        DOB.setFont(new Font("Ralway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG=new JLabel("Gender");
        labelG.setFont(new Font("Ralway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        radioButton1=new JRadioButton("Male");
        radioButton1.setFont(new Font("Ralway",Font.BOLD,14));
        radioButton1.setBackground(new Color(222,255,228));
        radioButton1.setBounds(300,290,60,30);
        add(radioButton1);

        radioButton2=new JRadioButton("Female");
        radioButton2.setFont(new Font("Ralway",Font.BOLD,14));
        radioButton2.setBackground(new Color(222,255,228));
        radioButton2.setBounds(450,290,90,30);
        add(radioButton2);

        ButtonGroup buttonGroup=new ButtonGroup();   //buttonGroup is used for select one radio button
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);


        JLabel labelEmail=new JLabel("Email Address :");
        labelEmail.setFont(new Font("Ralway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textFieldEmail=new JTextField();
        textFieldEmail =new JTextField();
        textFieldEmail.setFont(new Font("Ralway",Font.BOLD,14));
        textFieldEmail.setBounds(300,390,400,30);
        add( textFieldEmail);

        JLabel labelMS=new JLabel("Marital Stauts :");
        labelMS.setFont(new Font("Ralway",Font.BOLD,20));
        labelMS.setBounds(100,440,200,30);
        add( labelMS);

        radioButton3=new JRadioButton("Married");
        radioButton3.setFont(new Font("Ralway",Font.BOLD,14));
        radioButton3.setBackground(new Color(222,255,228));
        radioButton3.setBounds(300,440,100,30);
        add(radioButton3);

        radioButton4=new JRadioButton("Unmarried");
        radioButton4.setFont(new Font("Ralway",Font.BOLD,14));
        radioButton4.setBackground(new Color(222,255,228));
        radioButton4.setBounds(450,440,100,30);
        add(radioButton4);

        radioButton5=new JRadioButton("Other");
        radioButton5.setFont(new Font("Ralway",Font.BOLD,14));
        radioButton5.setBackground(new Color(222,255,228));
        radioButton5.setBounds(635,440,100,30);
        add(radioButton5);

        ButtonGroup buttonGroup1=new ButtonGroup();   //buttonGroup is used for select one radio button
        buttonGroup1.add(radioButton3);
        buttonGroup1.add(radioButton4);
        buttonGroup1.add(radioButton5);



        JLabel labelAdd=new JLabel("Address :");
        labelAdd.setFont(new Font("Ralway",Font.BOLD,20));
       labelAdd.setBounds(100,490,200,30);
        add( labelAdd);

        textAdd=new JTextField();
        textAdd =new JTextField();
        textAdd.setFont(new Font("Ralway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelCity=new JLabel("City :");
        labelCity.setFont(new Font("Ralway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity=new JTextField();
        textCity =new JTextField();
        textCity.setFont(new Font("Ralway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelPin=new JLabel("PIN Code:");
        labelPin.setFont(new Font("Ralway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin=new JTextField();
        textPin =new JTextField();
        textPin.setFont(new Font("Ralway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add( textPin);

        JLabel labelState=new JLabel("State:");
        labelState.setFont(new Font("Ralway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState=new JTextField();
        textState =new JTextField();
        textState.setFont(new Font("Ralway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(  textState);

        next=new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name=textName.getText();
        String fname=textFName.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(radioButton1.isSelected())
        {
            gender="Male";
        }
        else if(radioButton2.isSelected()){
            gender="Female";

        }
        String email=textFieldEmail.getText();
        String marital=null;
        if(radioButton3.isSelected())
        {
            marital="Married";
        }
        else if(radioButton4.isSelected())
        {
            marital="Unmarried";
        }
        else if(radioButton5.isSelected())
        {
            marital="Other";
        }

        String address=textAdd.getText();
        String city=textCity.getText();
        String  pincode=textPin.getText();
        String state=textState.getText();

        try{
            if(textName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else{
                Con con1=new Con();
                String q="insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new SignUp2(formno);
                setVisible(false);
            }

        }
        catch(Exception E)
        {
            E.printStackTrace();
        }


    }
    public static void main(String[] args) {
        new SignUp();

    }


}
