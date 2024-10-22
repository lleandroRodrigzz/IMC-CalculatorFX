package br.unoeste.imccalculatorfx;

import br.unoeste.imccalculatorfx.entity.Pessoa;
import br.unoeste.imccalculatorfx.util.Singleton;
import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class TableControl implements Initializable {
    public TableView <Pessoa> tvHistorico;
    public TableColumn <Pessoa,String> coNome;
    public TableColumn <Pessoa,Integer> coPeso;
    public TableColumn <Pessoa,Double> coAltura;
    public TableColumn <Pessoa,Double> coIMC;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        coNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        coPeso.setCellValueFactory(new PropertyValueFactory<>("peso"));
        coAltura.setCellValueFactory(new PropertyValueFactory<>("altura"));
        coIMC.setCellValueFactory(new PropertyValueFactory<>("imc"));
        tvHistorico.setItems(FXCollections.observableArrayList(Singleton.getRepo().getList()));
    }
}
