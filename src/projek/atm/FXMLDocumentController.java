/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.atm;

import javafx.event.ActionEvent;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class FXMLDocumentController {

    String pinn = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
   @FXML
    private JFXPasswordField pin;

    @FXML
    private JFXButton dua;

    @FXML
    private JFXButton tiga;

    @FXML
    private JFXButton empat;

    @FXML
    private JFXButton lima;

    @FXML
    private JFXButton enam;

    @FXML
    private JFXButton tujuh;

    @FXML
    private JFXButton lapan;

    @FXML
    private JFXButton sembilan;

    @FXML
    private JFXButton c;

    @FXML
    private JFXButton nol;

    @FXML
    private JFXButton ok;

    @FXML
    private JFXButton satu;

    @FXML
    void c(ActionEvent event) {
        pinn="" ;
        pin.setText(pinn);
      
        
    }

    @FXML
    void dua(ActionEvent event) {
      pinn +="2";
        pin.setText(pinn);   
    }

    @FXML
    void empat(ActionEvent event) {
         pinn +="4";
        pin.setText(pinn);
    }

    @FXML
    void enam(ActionEvent event) {
         pinn +="6";
        pin.setText(pinn);
    }

    @FXML
    void lapan(ActionEvent event) {
         pinn +="8";
        pin.setText(pinn);
    }

    @FXML
    void lima(ActionEvent event) {
         pinn +="5";
        pin.setText(pinn);
    }

    @FXML
    void nol(ActionEvent event) {
         pinn +="0";
        pin.setText(pinn);
    }

    @FXML
    void ok(ActionEvent event) {
        if(pinn.equals(PIN)){
            try{
                //hide this current window (if this is what you want)
                ((Node)(event.getSource())).getScene().getWindow().hide();
                //load the new fxml
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("MenuAwal.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 550, 400);
                // Create new stage (window), then set the new Scene
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            } catch (IOException e){
                System.out.println("failed to create new window."+ e);
            }
            }else{
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN salah \nTersisa " +kesempatan +"kesempatan lagi");
            pin.setText("");
            pinn = "";
            if (kesempatan == 0){
                System.exit(0);
            }
        }
    }

    @FXML
    void satu(ActionEvent event) {
        pinn +="1";
        pin.setText(pinn);
    }

    @FXML
    void sembilan(ActionEvent event) {
         pinn +="9";
        pin.setText(pinn);
    }

    @FXML
    void tiga(ActionEvent event) {
         pinn +="3";
        pin.setText(pinn);
    }

    @FXML
    void tujuh(ActionEvent event) {
         pinn +="7";
        pin.setText(pinn);
    }

}
