import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class assigment02 {

    public static void main(String[] args) {
        try
        {


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ce", "root", "R@1234");
            Statement statement=connection.createStatement();
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter your name and salary");
            statement.executeUpdate("insert into employee(name,salary) VALUES('"+scanner.next()+"','"+scanner.nextFloat()+"')");


            ResultSet  rs=statement.executeQuery("select * from employee");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
            }

            System.out.println("Enetr your id and salary to update ");

            int i=0;

            String query="UPDATE employee SET salary = '"+scanner.nextFloat()+"' WHERE (id = '"+scanner.nextInt()+"')";
            i=statement.executeUpdate(query);
            System.out.println(i);
            ResultSet rs1=statement.executeQuery("select * from employee");
            while(rs1.next())
            {
                System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getFloat(3));
            }
            System.out.println("ENter Id to delete");
            String querydelete=" delete from employee WHERE (id = '"+scanner.nextInt()+"')";
            i=statement.executeUpdate(querydelete);
            System.out.println(i);
            ResultSet rs2=statement.executeQuery("select * from employee");
            while(rs2.next())
            {
                System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getFloat(3));
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}