/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.dao;

// faz as importações de classes necessárias para o funcionamento do programa
import java.sql.Connection;
// conexão SQL para Java
import java.sql.DriverManager;
// driver de conexão SQL para Java
import java.sql.SQLException;
// classe para tratamento de exceções
public class Conexao {
public Connection getConnection() {

try {
return

DriverManager.getConnection("jdbc:mysql://localhost/AtvDaniel","root","");

}
catch(SQLException excecao) {
throw new RuntimeException(excecao);
}
}
}