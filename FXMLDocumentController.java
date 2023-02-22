
package praticando2;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.net.URL;
import java.util.Formatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private Button limpar;
    @FXML
    private TextField altura;
    @FXML
    private TextField massa;
    @FXML
    private Button voltar;
    @FXML
    private void limparCampo(){
        altura.setText("");
        massa.setText("");
        label.setText("");
    }
    
    @FXML
    private void calcularIMC(){
        try{
            double m = Double.parseDouble(massa.getText());
            double h = Double.parseDouble(altura.getText());
            if(massa.getText().isEmpty() && altura.getText().isEmpty()){
                label.setText("");
            }else{
                double value = m/(h*h);
                if(value < 0.0){
                    value *= -1;
                }
                Formatter formatter = new Formatter();
                formatter.format("%.2f",value);
                label.setText("" + formatter.toString());
            }
            
        }catch (Exception e){
            label.setText("Erro");
        }     
    }
    
    @FXML 
    private void avaliacaoIMC(ActionEvent a) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Stage window = (Stage)((Node)a.getSource()).getScene().getWindow();
        Scene scene = new Scene(root,260,415);
        window.setTitle("Avaliação IMC");
        window.setScene(scene);
        window.setResizable(false);
        window.show();
        
        
    }
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
