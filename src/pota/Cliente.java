package pota;

import java.io.Serializable;
import java.util.Comparator;

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    
    // Nome, sexo, endereço, cidade, e-mail, telefone, idade
    private String nome;
    private String sexo;
    private String endereco;
    private String cidade;
    private String email;
    private String telefone;
    private String idade;
    
    public Cliente(){
    }
    
    public Cliente(String nome, String sexo, String endereco, String cidade, String email, String telefone, String idade){
        super();
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cidade = cidade;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getIdade(){
        return idade;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }
    
    public void getInformacoes(String nome, String sexo, String endereco, String cidade, String email, String telefone, String idade){
        System.out.println("Ficha do Cliente:\n-----------------\nNome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Email: " + email);
        System.out.println("Número de telefone: " + telefone);
        System.out.println("Idade: " + idade + "\n-----------------");
    }
    
    @Override
    public String toString(){
        return "Cliente: \nNome: " + nome + "\nSexo: " + sexo + "\nEndereco: " + endereco + "\nCidade: " + cidade + "\nEmail: " + email + "\nTelefone: " + telefone  + "\nIdade: " + idade ;
    }
}
