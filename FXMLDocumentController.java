
package praticando2;

import java.net.URL;
import java.util.Formatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


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
    private void limparCampo(){
        altura.setText("");
        massa.setText("");
    }
    
    @FXML
    private void calcularIMC(){
        try{
            double m = Double.parseDouble(massa.getText());
            double h = Double.parseDouble(altura.getText());
            double value = m/(h*h);
            Formatter formatter = new Formatter();
            formatter.format("%.2f",value);
            label.setText("" + formatter.toString());
        }catch (Exception e){
            label.setText("Erro");
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
