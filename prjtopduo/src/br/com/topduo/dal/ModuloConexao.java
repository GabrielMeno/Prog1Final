/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.topduo.dal;

import java.sql.*;

/**
 *
 * @author Gabriel Meno
 */
public class ModuloConexao {
    //metodo para estabelecer a conexão com o banco
    
    public static Connection conector(){
        Connection conexao = null;
        // chamar o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        //informações do banco
        String url="jdbc:mysql://localhost:3306/dbtopduo?characterEnconding=utf-8";
        String user= "topduo";
        String password= "Menno2110@";
        // conectando o banco
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            //System.out.println(e);
            return null;
        }
    }
}
