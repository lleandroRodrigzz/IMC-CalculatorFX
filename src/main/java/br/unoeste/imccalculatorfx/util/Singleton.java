package br.unoeste.imccalculatorfx.util;

import br.unoeste.imccalculatorfx.repository.PessoaRepo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Singleton {
    static private PessoaRepo repo = new PessoaRepo();

    static public PessoaRepo getRepo(){
        return repo;
    }

    private Singleton(){
    }

    public static boolean carregar(){
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream("dados.obj");
            objectInputStream = new ObjectInputStream(fileInputStream);
            repo = (PessoaRepo) objectInputStream.readObject();
            return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static boolean salvar() {
        //serializar o objeto repo
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream;
        try{
            //iniciar gravação do arq;
            fileOutputStream = new FileOutputStream("dados.obj");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(repo);
            objectOutputStream.close();
            return true;
        }
        catch (Exception e){

            return false;
        }

        //gravar o objeto serealizado em arquivo
    }
}
