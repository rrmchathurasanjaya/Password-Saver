
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chathura
 */
public class DBConnection {
 Connection conn=null;
	public static Connection connectDb()
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/passbox_db","root","");
		 return con;
		 }
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
	public static void main(String[] args) {
		DBConnection c= new DBConnection();
		c.connectDb();
}
}
