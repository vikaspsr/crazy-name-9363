package com.crime;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public class Demo {
public static void main(String[] args) {
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	String url="jdbc:mysql://localhost:3306/crimeCount";
try {
	Connection connection=	DriverManager.getConnection(url, "root", "root");
	
	if(connection!=null)
		System.out.println("connected");
	else {
		System.out.println("not no connection stablish");
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}	
	
	
}
