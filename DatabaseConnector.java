//package database;
//
//import java.sql.*;
//
//public class DatabaseConnector {
//
//
//	private static String url = "jdbc:mysql://localhost:3306/debt-database";
//	private static String driverName = "com.mysql.jdbc.Driver";
//	private static String username ="root";
//	private static String password = "";
//	private static Connection con;
//
//	public static Connection getConnection()
//	{
//
//
//		try {
//			Class.forName(driverName);
//
//			try {
//				con =DriverManager.getConnection(url,username,password);
//
//			} catch (SQLException e) {
//				System.out.println(" error failed connection to the databse");
//
//				e.getStackTrace();
//
//			}
//
//
//
//		} catch (ClassNotFoundException e) {
//			System.out.println("Drivers not found");
//		}
//
//
//
//
//		return con;
//	}
//
//
//}
