package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdencacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;

    public OrdencacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new comparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdencacaoPessoa ordencacaoPessoa = new OrdencacaoPessoa();
        ordencacaoPessoa.adicionarPessoa("nome 1", 20, 1.56);
        ordencacaoPessoa.adicionarPessoa("nome 2", 30, 1.80);
        ordencacaoPessoa.adicionarPessoa("nome 3", 25, 1.70);
        ordencacaoPessoa.adicionarPessoa("nome 4", 17, 1.56);

        System.out.println(ordencacaoPessoa.pessoaList);

        System.out.println(ordencacaoPessoa.ordenarPorIdade());
        System.out.println(ordencacaoPessoa.ordenarPorAltura());
    }
}

