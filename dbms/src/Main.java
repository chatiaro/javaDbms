import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support
import java.util.*;
public class Main{
    public static void main(String[] args){
         //Creating the connection 
        String url = "jdbc:oracle:thin:sql12.freesqldatabase.com"; 
        String user = "sql12285105"; 
        String pass = "ZR7iYqeha8"; 
  
        //Entering the data 
        Scanner k = new Scanner(System.in); 
        System.out.println("enter name"); 
        String name = k.next(); 
        System.out.println("enter roll no"); 
        int roll = k.nextInt(); 
        System.out.println("enter class"); 
        String cls =  k.next(); 
  
        //Inserting data using SQL query 
        String sql = "insert into student1 values('"+name+"',"+roll+",'"+cls+"')"; 
        Connection con=null; 
         
        try
        { 
  
            //Reference to connection interface 
            con = DriverManager.getConnection(url,user,pass); 
  
            Statement st = con.createStatement(); 
            int m = st.executeUpdate(sql); 
            if (m == 1) 
                System.out.println("inserted successfully : "+sql); 
            else
                System.out.println("insertion failed"); 
            con.close(); 
        } 
        catch(Exception ex) 
        { 
            System.err.println(ex); 
        } 
    }
}