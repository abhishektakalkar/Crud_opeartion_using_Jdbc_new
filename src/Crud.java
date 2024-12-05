// Source code is decompiled from a .class file using FernFlower decompiler.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Crud {

   public static void delete() {
      try {
         String url = "jdbc:mysql://localhost:3306/db5";
         String username= "root";
         String password = "Abhi@123";
        String query = "DELETE FROM student17 WHERE id = ?";
         
         Connection con = DriverManager.getConnection(url,username,password);
         PreparedStatement pstm= con.prepareStatement(query);
         
           pstm.setInt(1, 1);
          // pstmt.setString(2, "John");
          pstm.executeUpdate();
          ///System.out.println(n);
         //pstmt.execute(query);
         System.out.println(" data deleted succesfully");
         con.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public static void read() {
      try {
         String url = "jdbc:mysql://localhost:3306/db5";
         String username= "root";
         String password = "Abhi@123";
         String query = "select * from student17";
         
         Connection con = DriverManager.getConnection(url,username,password);
         Statement stm= con.createStatement();
         ResultSet rs =stm.executeQuery(query);
         while (rs.next()) {
            int id = rs.getInt("id"); // Column name
            String name = rs.getString("name"); // Column name

            // Print the row
            System.out.println("ID: " + id + ", Name: " + name);
            
         }
         
         //  pstmt.setInt(1, 25);
          // pstmt.setString(2, "John");
          //int n =stm.executeUpdate(query);
          //System.out.println(n);
         //pstmt.execute(query);
         System.out.println("ccesfullyy read a data su");
         con.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }



   public static void updatet() {
      try {
         String url = "jdbc:mysql://localhost:3306/db5";
         String username= "root";
         String password = "Abhi@123";
         String query = "update student17 set name='sachin' where name='john'";
         
         Connection con = DriverManager.getConnection(url,username,password);
         Statement stm= con.createStatement();
         
         //  pstmt.setInt(1, 25);
          // pstmt.setString(2, "John");
          int n =stm.executeUpdate(query);
          System.out.println(n);
         //pstmt.execute(query);
         System.out.println("insert data create succesfully");
         con.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public static void insertt() {
      try {
         String url = "jdbc:mysql://localhost:3306/db5";
         String username= "root";
         String password = "Abhi@123";
         String query = "insert into student17 values(?,?)";
         
         Connection con = DriverManager.getConnection(url,username,password);
         PreparedStatement pstmt= con.prepareStatement(query);
         
           pstmt.setInt(1, 25);
           pstmt.setString(2, "John");
          pstmt.executeUpdate();
         //pstmt.execute(query);
         System.out.println("insert data create succesfully");
         con.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   

   public static void db() {
      try {
         String var0 = "jdbc:mysql://localhost:3306/";
         String var1 = "root";
         String var2 = "Abhi@123";
         String var3 = "create database db5";
         Connection var4 = DriverManager.getConnection(var0, var1, var2);
         Statement var5 = var4.createStatement();
         var5.execute(var3);
         System.out.println("database create succesfully");
         var4.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public static void createT() {
      try {
         String var0 = "jdbc:mysql://localhost:3306/db5";
         String var1 = "root";
         String var2 = "Abhi@123";
         String var3 = "create table student17(id int,name varchar(30))";
         Connection var4 = DriverManager.getConnection(var0, var1, var2);
         Statement var5 = var4.createStatement();
         var5.execute(var3);
         System.out.println("table create succesfully");
         var4.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public static void main(String[] var0) {
      //createT();
      //insertt();
      //updatet();
      //read();
      delete();


      
   }
}
