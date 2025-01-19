import  java.sql.*;

import static java.lang.Class.forName;

public class DemoJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        import packages
        load and register
        create connection
        create statement
        execute statement
        process the result
        close the connection

         */
        String url="jdbc:postgresql://localhost:5432/TestDb";
        String user="postgres";
        String password="1234";
       // String sql="select * from Employee";
        //insertion
        String sql="insert into Employee values(6,'narendra12','narendra2@gmail.com')";
        //update
      //  String sql="update employee set email='NaveenJ@gmail.com' where id=4";
       // String sql="delete from employee where id=2";
        Class.forName("org.postgresql.Driver") ;
        System.out.println("established");
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
       // ResultSet rs= st.executeQuery(sql);
        //rs.next();
       // String name=rs.getString("email");
       // System.out.println(name);
      /*  while(rs.next())
        {
            System.out.print(rs.getInt("id")+"-");
            System.out.print(rs.getString("Name")+"-");
            System.out.print(rs.getString("email"));
            System.out.println();
        }

       */


        // Insertion
        boolean b=st.execute(sql);
        System.out.println(b);


        // st.execute(sql);

        con.close();


    }
}
