package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2ConnectionFactory implements ConnectionFactory {
    // Write your code here!
  public H2ConnectionFactory() {

  }

  @Override
  public Connection createConnection() {
    Connection connection;
    try {
      connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
    return connection;
  }
}

