/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.model;

/**
 *
 * @author T-Gamer
 */
public class Login {
    
    
    private String nome, senha; 

    public Login(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
     public void cadastrar(String nome, String senha){
     
         this.nome = nome;
         this.senha = senha;
     
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
             
}
