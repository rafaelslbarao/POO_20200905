package br.com.rafaelbarao.entidades;

import java.util.Date;

public class Animal {
    private String nome;
    private Double peso;
    private String corPredominante;
    private Long posicaoAtual;
    private Date ultimaAlteracao;

    public Animal(String nome, Double peso, String corPredominante)
    {
        this.nome = nome;
        this.peso = peso;
        this.corPredominante = corPredominante;
        this.posicaoAtual = 0L;
        atualizaData();
    }

    public Animal(String nome, Double peso, String corPredominante, Long posicaoAtual)
    {
        this.nome = nome;
        this.peso = peso;
        this.corPredominante = corPredominante;
        this.posicaoAtual = posicaoAtual;
        atualizaData();
    }

    public String comunica()
    {
        return nome + " está se comunicando";
    }

    public Long movimenta()
    {
        posicaoAtual++;
        atualizaData();
        return posicaoAtual;
    }

    public String getNome() {
        return nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
        atualizaData();
    }

    public void setPeso(String peso) {
        this.peso = Double.valueOf(peso);
        atualizaData();
    }

    public String getCorPredominante() {
        return corPredominante;
    }

    public Long getPosicaoAtual() {
        return posicaoAtual;
    }

    private void atualizaData()
    {
        this.ultimaAlteracao = new Date();
    }

    public Date getUltimaAlteracao() {
        return ultimaAlteracao;
    }
}
