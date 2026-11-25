package com.erp.erperf.src.pessoas;

public class PessoaImpl implements Pessoa {

    private String nome;
    private String sobreNome;
    private String telefone;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getSobreNome() {
        return sobreNome;
    }

    @Override
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
