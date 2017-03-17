/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Danilo
 */
public class RecrutaM {
    private String Nome;
    private String Endereco;
    private String Data_nascimento;
    private String Rg;
    private String Cpf;
    private String Telefone;
    private String Telefone_recado;
    private String Pai;
    private String Mae;
    private String Nome_guerra;
    private int Maticula;
    private int Chamada;
    private String Ano_instrucao;

    public RecrutaM() {
    }

    public RecrutaM(String Nome, String Endereco, String Data_nascimento, String Rg, String Cpf, String Telefone, String Telefone_recado, String Pai, String Mae, String Nome_guerra, int Maticula, int Chamada, String Ano_instrucao) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Data_nascimento = Data_nascimento;
        this.Rg = Rg;
        this.Cpf = Cpf;
        this.Telefone = Telefone;
        this.Telefone_recado = Telefone_recado;
        this.Pai = Pai;
        this.Mae = Mae;
        this.Nome_guerra = Nome_guerra;
        this.Maticula = Maticula;
        this.Chamada = Chamada;
        this.Ano_instrucao = Ano_instrucao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getData_nascimento() {
        return Data_nascimento;
    }

    public void setData_nascimento(String Data_nascimento) {
        this.Data_nascimento = Data_nascimento;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getTelefone_recado() {
        return Telefone_recado;
    }

    public void setTelefone_recado(String Telefone_recado) {
        this.Telefone_recado = Telefone_recado;
    }

    public String getPai() {
        return Pai;
    }

    public void setPai(String Pai) {
        this.Pai = Pai;
    }

    public String getMae() {
        return Mae;
    }

    public void setMae(String Mae) {
        this.Mae = Mae;
    }

    public String getNome_guerra() {
        return Nome_guerra;
    }

    public void setNome_guerra(String Nome_guerra) {
        this.Nome_guerra = Nome_guerra;
    }

    public int getMaticula() {
        return Maticula;
    }

    public void setMaticula(int Maticula) {
        this.Maticula = Maticula;
    }

    public int getChamada() {
        return Chamada;
    }

    public void setChamada(int Chamada) {
        this.Chamada = Chamada;
    }

    public String getAno_instrucao() {
        return Ano_instrucao;
    }

    public void setAno_instrucao(String Ano_instrucao) {
        this.Ano_instrucao = Ano_instrucao;
    }
    
    
}
