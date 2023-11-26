package com.example.project4_final.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection(){
        Connection conn = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mariadb://walab.handong.edu:3306/p233_22200671",
                    "p233_22200671", "sohVa8");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로드 오류!");
            throw new RuntimeException(e);
        }catch(SQLException e){
            System.out.println("DB연결 오류!");
            throw new RuntimeException(e);
        }
        return conn;
    }

//    public static void main(String arg[]){
//        System.out.println("DB연결테스트 중!");
//        Connection conn = JDBCUtil.getConnection();
//        if (conn == null) System.out.println("DB 연결 오류");
//        else System.out.println("DB 연결됨!");
//    }
}
