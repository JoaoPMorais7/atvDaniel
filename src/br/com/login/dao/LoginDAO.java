/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.dao;


import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author T-Gamer
 */
public class LoginDAO {

  
   
    public void cadastrarUsuario(String nome,String senha) throws SQLException{
    Connection conexao = new Conexao().getConnection();
    String sql = "INSERT INTO login (nome,senha) VALUES('"+nome+"','"+senha+"')";
    PreparedStatement statment= conexao.prepareStatement(sql);
    statment.execute();
    conexao.close();
    }
    
    public void login(String nome, String senha) throws SQLException{
    Connection conexao = new Conexao().getConnection();
    String sql = "SELECT nome,senha FROM login WHERE nome = '"+nome+"' AND senha = '"+senha+"'";
        System.out.println(sql);
    PreparedStatement statment = conexao.prepareStatement(sql);
    ResultSet rs = statment.executeQuery();
    
    
    if(rs.next()){
        
        System.out.println("Possui");
    }else{
    System.out.println("Não possui");
    }
     conexao.close();
    }
    }

    

