package java_fx.heartbeat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HeartBeatController {

    @FXML
    private TextField THRRInput;

    @FXML
    private TextField ageInput;

    @FXML
    private TextField maxInput;

    @FXML
    void ButtonPressed(ActionEvent event) {
        int age;
        try{
          age = Integer.parseInt(ageInput.getText());
        }catch (Exception e){
           ageInput.setText("Enter integer");
           ageInput.selectAll();
           return;
        }
        int max = 220 - age;
        maxInput.setText(String.valueOf(max));
        THRRInput.setText(String.valueOf(max*0.5) + " - " + String.valueOf(max*0.8) );
    }
}
