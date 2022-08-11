//Classes Imported:
import java.sql.*;
import javax.swing.JOptionPane;

//Home Page:
Staff Login Button-
this.dispose();
new Staff_Login().setVisible(true);

//Exit Button-
System.exit(0);

//Staff Login Page:
//Login Button-
String user,pass,user1 = null,pass1 = null;
        int x=0;
        user=jTextField1.getText();
        pass=jPasswordField1.getText();
        try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root"," ");
            Statement s=conn.createStatement();
            String q="Select * from staff_login";
            ResultSet r=s.executeQuery(q);
            while (r.next())
            {
                user1=r.getString(1);
                pass1=r.getString(2);
                
                if((user.equals(user1))&&(pass.equals(pass1)))
                {
                    x=1;
                }                
            }               
            if(x==1)
            {
                this.dispose();
                new Staff_Security().setVisible(true);
            }
            else JOptionPane.showMessageDialog(null,"Wrong Username/Password. Please try again!!!");
            r.close();
            s.close();
            conn.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
//Create User Button-
this.dispose();
new Staff_New().setVisible(true);
Show Existing User Button-
String pass=JOptionPane.showInputDialog(null, "Enter Manager's Password");
        if(pass.equals("$$$$"))
        {
            this.dispose();
            new Staff_Details().setVisible(true);
        }
//Exit Button-
System.exit(0);


//Security Page:
//Proceed Button-
String a=jPasswordField1.getText();
        if((a.equals("thenationalbank")) || (a.equals("  ")))
        {
            this.dispose();
            new Cust_Details().setVisible(true);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Wrong Password Entered and Program will Terminate Now!!!");
            this.dispose();
        }

//New Staff Page:
//Register Button-
int id;
        String name,address,email,dd,mm,yy,user,pass,re_pass,contact;
        id=Integer.parseInt(jTextField1.getText());
        name=jTextField2.getText();
        address=jTextField3.getText();
        contact=jTextField4.getText();
        email=jTextField5.getText();
        user=jTextField7.getText();
        pass=jPasswordField1.getText();
        re_pass=jPasswordField2.getText();
        dd=jComboBox1.getSelectedItem().toString();
        mm=jComboBox2.getSelectedItem().toString();
        yy=jTextField6.getText();
        String date=yy+"-"+mm+"-"+dd;
        try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root"," ");
            Statement s=conn.createStatement();
            if(pass.equals(re_pass))
            {
                String q="insert into staff_details values("+id+",'"+name+"','"+address+"',"+contact+",'"+email+"','"+date+"','2015-11-12')";
                String q1="insert into staff_login values('"+user+"','"+pass+"')";
                int x=s.executeUpdate(q);
                int x1=s.executeUpdate(q1);
                if((x>0)&&(x1>0))
                {
                    JOptionPane.showMessageDialog(null,"Record Added");
                }
            }
            else JOptionPane.showMessageDialog(null,"Please Check Password");
            s.close();
            conn.close();
        }       
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

//Back Button-
this.dispose();
new Staff_Login().setVisible(true);

//Exit Button-
System.exit(0);

//formWindowOpened-
try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root"," ");
            Statement s=conn.createStatement();
            String q="select max(id) from staff_details";
            ResultSet r=s.executeQuery(q);
            if(r.next())
            {
                int i=r.getInt(1);
                i++;
                jTextField1.setText(""+i);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

//Staff Details Page:
//Back Button-
this.dispose();
new Staff_Login().setVisible(true);

//formWindowOpened-
int contact,id;
        String name,address, dob, doj, email;
        Double amt;
        DefaultTableModel t=(DefaultTableModel)jTable1.getModel();
        try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root"," ");
            Statement s=conn.createStatement();
            String q="select * from staff_details";
            ResultSet r=s.executeQuery(q);
            while(r.next())
            {
                id=r.getInt(1);
                name=r.getString(2);
                address=r.getString(3);
                contact=r.getInt(4);
                email=r.getString(5);
                dob=r.getString(6);
                doj=r.getString(7);
                t.addRow(new Object[]{id,name,address,contact,email,dob,doj});               
            }
            jTable1.setModel(t);
            r.close();
            s.close();
            conn.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

//Customer Details Page:
//Add Customer Button-
this.dispose();
new Cust_Add().setVisible(true);

//Update Details/Delete Account Button-
this.dispose();
new Cust_Update().setVisible(true);

//Logout Button-
JOptionPane.showMessageDialog(null, "You had Successfully Logged Out!!!");
this.dispose();
new Staff_Login().setVisible(true);



//Customer Update Page:
//Show Button-
int acc,contact = 0;
        String name = null,address = null,acc_type = null,balance = null;
        Double amt = null;
        acc=Integer.parseInt(jTextField7.getText());
        try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root"," ");
            Statement s=conn.createStatement();
            String q="select * from cust_details where acc_no="+acc;
            ResultSet r=s.executeQuery(q);
            while (r.next())
            {
                name=r.getString(2);
                address=r.getString(3);
                contact=r.getInt(4);
                acc_type=r.getString(5);
                amt=r.getDouble(6);
                balance=r.getString(7);
            }
            jTextField1.setText(""+name);
            jTextField2.setText(""+address);
            jTextField3.setText(""+contact);
            jTextField4.setText(""+acc_type);
            jTextField5.setText(""+amt);
            jTextField6.setText(""+balance);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

//Update Button-
int acc,contact = 0;
        String name = null,address = null,acc_type = null,balance = null;
        Double amt = null;
        acc=Integer.parseInt(jTextField7.getText());
        name=jTextField1.getText();
        address=jTextField2.getText();
        contact=Integer.parseInt(jTextField3.getText());
        acc_type=jTextField4.getText();
        amt=Double.parseDouble(jTextField5.getText());
        balance=jTextField6.getText();
        try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root"," ");
            Statement s=conn.createStatement();
            String q="update cust_details set name='"+name+"',address='"+address+"',contact_no="+contact+",acc_type='"+acc_type+"',amount="+amt+",balance='"+balance+"' where acc_no="+acc;
            int x=s.executeUpdate(q);
            if(x==1)
            {
                JOptionPane.showMessageDialog(null,"Record Updated!!!");
            }
            else JOptionPane.showMessageDialog(null, "ERROR!!!");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

//Delete Button-
int acc,contact = 0;
        String name = null,address = null,acc_type = null,balance = null;
        Double amt = null;
        acc=Integer.parseInt(jTextField7.getText());
        name=jTextField1.getText();
        address=jTextField2.getText();
        contact=Integer.parseInt(jTextField3.getText());
        acc_type=jTextField4.getText();
        amt=Double.parseDouble(jTextField5.getText());
        balance=jTextField6.getText();
        try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root"," ");
            Statement s=conn.createStatement();
            String q="update cust_details set name='"+name+"',address='"+address+"',contact_no="+contact+",acc_type='"+acc_type+"',amount="+amt+",balance='"+balance+"' where acc_no="+acc;
            int x=s.executeUpdate(q);
            if(x==1)
            {
                JOptionPane.showMessageDialog(null,"Record Updated!!!");
            }
            else JOptionPane.showMessageDialog(null, "ERROR!!!");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

//Back Button-
this.dispose();
new Cust_Details().setVisible(true);

//Customer Add Page:
Proceed Button-
int acc=Integer.parseInt(jTextField1.getText());
        String name=jTextField2.getText();
        String address=jTextField3.getText();
        int contact=Integer.parseInt(jTextField4.getText());
        String acc_type=(String)jComboBox1.getSelectedItem();
        try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root"," ");
            Statement s=conn.createStatement();
            String q="insert into cust_details values("+acc+",'"+name+"','"+address+"',"+contact+",'"+acc_type+"',null,null)";
            int x=s.executeUpdate(q);
            if(x>0)
                {
                    JOptionPane.showMessageDialog(null,"Record Added");
                }
            s.close();
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

//Back Button-
this.dispose();
new Cust_Details().setVisible(true);

formWindowOpened-
try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root"," ");
            Statement s=conn.createStatement();
            String q="select max(acc_no) from cust_details";
            ResultSet r=s.executeQuery(q);
            if(r.next())
            {
                int i=r.getInt(1);
                i++;
                jTextField1.setText(""+i);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
