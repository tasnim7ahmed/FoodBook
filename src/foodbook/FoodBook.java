/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodbook;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tasnim Ahmed
 */
public class FoodBook extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static Login login = new Login();
    public static Login2 login2 = new Login2();
    public static Login3 login3 = new Login3();
    public static Search search = new Search();
    public static Review review = new Review();
    public static Table table = new Table();
    public static addFood add = new addFood();
    public static REVIEWTABLE reviewtable = new REVIEWTABLE();
    public static Give_review give = new Give_review();
    public static AddUser adduser = new AddUser();
    public static Vendor vendor = new Vendor();
    FoodBook()
    {
        initialize();
    }
    public void initialize()
    {
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("FoodBook");
        this.add(login, BorderLayout.CENTER);
        this.pack();
        this.validate();
        this.setVisible(true);  
        search.jTextField2.setText("0");
        setAction();
    }
    
        public static long hash(String a, String b) {
        String str = a + b;
        long prime = 3797;
        long MOD = 1000000007;
        long Hash = 0;
        for (int i = 0; i < str.length(); i++) {
            Hash = (prime * Hash) % MOD + str.charAt(i);
            Hash = Hash % MOD;
        }
        return Hash;
    }
    public void setAction()
    {
        login.jButton2.addActionListener(e -> {
        
        
            this.remove(login);
            this.add(login2, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
        
        login.jButton1.addActionListener(e -> {
        
        
            this.remove(login);
            this.add(login3, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
        
        login2.jButton6.addActionListener(e -> {
        
        
            this.remove(login2);
            this.add(login, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
        
        login3.jButton6.addActionListener(e -> {
        
        
            this.remove(login3);
            this.add(login, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
        
        
        review.jButton6.addActionListener(e -> {
        
        
            this.remove(review);
            this.add(search, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
        
        
        table.jButton6.addActionListener(e -> {
        
        
            this.remove(table);
            this.add(search, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
        
        search.jButton6.addActionListener(e -> {
        
        
            this.remove(search);
            this.add(login2, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
        
        add.jButton6.addActionListener(e -> {
        
        
            this.remove(add);
            this.add(vendor, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
        
        search.jButton1.addActionListener(e -> {
        
        
            this.remove(search);
            this.add(review, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
        
        review.jButton1.addActionListener(e -> {
        
        
            this.remove(review);
            this.add(give, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
        
         give.jButton7.addActionListener(e -> {
        
        
            this.remove(give);
            this.add(review, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
        
         
         reviewtable.jButton6.addActionListener(e -> {
        
        
            this.remove(reviewtable);
            this.add(review, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
         
         login2.jButton1.addActionListener(e -> {
        
             adduser.jTextField1.setText("");
             adduser.jTextField2.setText("");
             adduser.jTextField3.setText("");
             adduser.jTextField4.setText("");
            this.remove(login2);
            this.add(adduser, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
         
       adduser.jButton6.addActionListener(e -> {
        
        
            this.remove(adduser);
            this.add(login2, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        }); 
       
       
       adduser.jButton1.addActionListener(e -> {
        
        
           String name,password,username,email;
           name = adduser.jTextField1.getText();
           password = adduser.jTextField3.getText();
           username = adduser.jTextField2.getText();
           email = adduser.jTextField4.getText();
           
           try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","foodbook","1234");
            Statement st = con.createStatement();
            String query = "insert into user001 values ( '"+name+"','"+username+"','"+password+"','"+email+"')";
            ResultSet rs = st.executeQuery(query);
            query = "commit";
            rs = st.executeQuery(query);
            JOptionPane.showMessageDialog(null,"Account Successfully Added!" ,"OK!",JOptionPane.INFORMATION_MESSAGE);
            rs.close();
            st.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
           
           
            this.remove(adduser);
            this.add(login2, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        }); 
         
         
         
        
        login2.jButton2.addActionListener(e -> {
            
            
            
        String username = login2.jTextField1.getText();
        String password = login2.jPasswordField1.getText();
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","foodbook","1234");
            Statement st = con.createStatement();
            String query = "Select * from user001";
            ResultSet rs = st.executeQuery(query);
            int flag = 0;
            while(rs.next())
            {
                String usr = rs.getString(2);
                String pass = rs.getString(3);
                String name = rs.getString(1);
                if(usr.equals(username) && pass.equals(password))
                {
                    flag = 1;
                    search.jLabel2.setText(name);
                    
                    this.remove(login2);
                    this.add(search, BorderLayout.CENTER);
                    this.revalidate();
                    this.repaint();
                    this.pack();
                    login2.jTextField1.setText("");
                    login2.jPasswordField1.setText("");
                    
                }
            }
            rs.close();
            st.close();
            con.close();
            if(flag==0)
            {
                JOptionPane.showMessageDialog(null,"Username or Password doesn't match, Try Again!" ,"ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        });
        
        
        login3.jButton3.addActionListener(e -> {
        
        
            this.remove(login3);
            this.add(vendor, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
        
        
        });
        
        vendor.jButton2.addActionListener(e -> {
            
            
            
        String username = login3.jTextField1.getText();
        String password = login3.jPasswordField1.getText();
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","foodbook","1234");
            Statement st = con.createStatement();
            String query = "Select * from vendor001";
            ResultSet rs = st.executeQuery(query);
            int flag = 0;
            while(rs.next())
            {
                String usr = rs.getString(2);
                String pass = rs.getString(3);
                String name = rs.getString(1);
                if(usr.equals(username) && pass.equals(password))
                {
                    flag = 1;
                     this.remove(vendor);
            this.add(add, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
            this.pack();
                    login3.jTextField1.setText("");
                    login3.jPasswordField1.setText("");
                    
                }
            }
            rs.close();
            st.close();
            con.close();
            if(flag==0)
            {
                JOptionPane.showMessageDialog(null,"Username or Password doesn't match, Try Again!" ,"ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        });
        
        
        vendor.jButton1.addActionListener(e -> {
        
        
        DefaultTableModel model = (DefaultTableModel) reviewtable.jTable1.getModel();

                int row = model.getRowCount();
                while (row > 0) {
                    model.removeRow(model.getRowCount() - 1);
                    row = model.getRowCount();
                }
        
        String customer,food,restaurant,taste,quantity,environment;
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","foodbook","1234");
            Statement st = con.createStatement();
            String query = "Select * from review001";
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {   
                    customer = rs.getString(1);
                    food = rs.getString(2);
                    restaurant = rs.getString(3);
                    taste = rs.getString(4);
                    quantity = rs.getString(5);
                    environment = rs.getString(6);
                    
                    model.addRow(new Object[]{customer,food,restaurant,taste,quantity,environment}); 
                    
                    
                    
                
            }
            
            this.remove(vendor);
                    this.add(reviewtable, BorderLayout.CENTER);
                    this.revalidate();
                    this.repaint();
                    this.pack();
            rs.close();
            st.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        });
        
        
        add.jButton1.addActionListener(e->{
        String name,type,restaurant,location;
        int price;
        int id;
        name = add.jTextField5.getText();
        type = add.jTextField1.getText();
        restaurant = add.jTextField2.getText();
        location = add.jTextField3.getText();
        price = Integer.parseInt(add.jTextField4.getText());
        id = (int)hash(type,restaurant);
        double rate = 5.0;
        name = name.toUpperCase();
        location = location.toUpperCase();
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","foodbook","1234");
            Statement st = con.createStatement();
            String query = "insert into food001 values ( "+id+",'"+name+"','"+type+"','"+restaurant+"','"+location+"',"+price+","+rate+")";
            ResultSet rs = st.executeQuery(query);
            query = "commit";
            rs = st.executeQuery(query);
            JOptionPane.showMessageDialog(null,"Food Successfully Added!" ,"OK!",JOptionPane.INFORMATION_MESSAGE);
            rs.close();
            st.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        
        });
        
        
        
        search.jButton5.addActionListener(e -> {
            
            
        DefaultTableModel model = (DefaultTableModel) table.jTable1.getModel();

                int row = model.getRowCount();
                while (row > 0) {
                    model.removeRow(model.getRowCount() - 1);
                    row = model.getRowCount();
                }
        
        String name = search.jTextField1.getText();
        String location = search.jTextField3.getText();
        name = name.toUpperCase();
        location = location.toUpperCase();
        int price = Integer.parseInt(search.jTextField2.getText());
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","foodbook","1234");
            Statement st = con.createStatement();
            String query = "Select * from food001 where name = "+"'"+name+"' OR location = "+"'"+location+"' OR price = "+price;
            ResultSet rs = st.executeQuery(query);
            int flag = 0;
            while(rs.next())
            {
                flag=1;
                
                   int ID, Price;
                        String Name, Location,restaurant,type;
                        ID = rs.getInt(1);
                        Name = rs.getString(2);
                        type = rs.getString(3);
                        restaurant = rs.getString(4);
                        Location = rs.getString(5);
                        //double rating= rs.getDouble(7);
                        Price = rs.getInt(6);
                        model.addRow(new Object[]{ID,Name,type,restaurant,Location,Price}); 
                        this.remove(search);
                    this.add(table, BorderLayout.CENTER);
                    this.revalidate();
                    this.repaint();
                    this.pack();
                    search.jTextField1.setText("");
                    search.jTextField2.setText("");
                    search.jTextField3.setText("");
                    
                
            }
            rs.close();
            st.close();
            con.close();
            if(flag==0)
            {
                JOptionPane.showMessageDialog(null,"Food can't be found!" ,"ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        });
        
        
        give.jButton6.addActionListener(e -> {
        
        String name = give.jTextField2.getText();
        String restaurant = give.jTextField1.getText();
        String taste = give.jComboBox3.getActionCommand();
        String quantity = give.jComboBox3.getActionCommand();
        String environment = give.jComboBox3.getActionCommand();
        
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","foodbook","1234");
            Statement st = con.createStatement();
            String query = "Insert into review001 values ( '"+search.jLabel2.getText()+"','"+name+"','"+restaurant+"','"+taste+"','"+quantity+"','"+environment+"')";
            ResultSet rs = st.executeQuery(query);
            query = "commit";
            rs = st.executeQuery(query);
            give.jTextField2.setText("");
            give.jTextField1.setText("");
            rs.close();
            st.close();
            con.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        
        
        
        });
        
        
        review.jButton2.addActionListener(e -> {
            
            
        DefaultTableModel model = (DefaultTableModel) reviewtable.jTable1.getModel();

                int row = model.getRowCount();
                while (row > 0) {
                    model.removeRow(model.getRowCount() - 1);
                    row = model.getRowCount();
                }
        
        String customer,food,restaurant,taste,quantity,environment;
        try {
            
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","foodbook","1234");
            Statement st = con.createStatement();
            String query = "Select * from review001";
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {   
                    customer = rs.getString(1);
                    food = rs.getString(2);
                    restaurant = rs.getString(3);
                    taste = rs.getString(4);
                    quantity = rs.getString(5);
                    environment = rs.getString(6);
                    
                    model.addRow(new Object[]{customer,food,restaurant,taste,quantity,environment}); 
                    
                    
                    
                
            }
            
            this.remove(review);
                    this.add(reviewtable, BorderLayout.CENTER);
                    this.revalidate();
                    this.repaint();
                    this.pack();
            rs.close();
            st.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        });
        
        
         
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        FoodBook Tasnim = new FoodBook();
    }
    
}
