package com.spark.lms;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

	public static void main(String[] args) {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/library management system";
			String username = "root"; 
			String password = "12345"; 
			Class.forName(driver); 
			Connection conn = DriverManager.getConnection(url,
			username, password);
			System.out.println("Established Connection");
			}catch (Exception e) {
			e.printStackTrace();
			}
			}
			}