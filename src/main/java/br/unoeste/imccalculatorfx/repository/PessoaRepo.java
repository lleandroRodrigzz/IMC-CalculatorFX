package br.unoeste.imccalculatorfx.repository;
import br.unoeste.imccalculatorfx.entity.Pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PessoaRepo implements Serializable {
    private List<Pessoa> list;

    public PessoaRepo() {
        list = new ArrayList<>();
    }

    public void add(Pessoa p){
        list.add(p);
    }

    public List<Pessoa> getList() {
        return list;
    }
}
