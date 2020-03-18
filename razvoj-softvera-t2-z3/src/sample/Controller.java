package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField unos;

    public void Submit(ActionEvent actionEvent) {
        String str = unos.getText();
        String[] rijeci = str.split(" ", -2);

        int max = 0, maxIndex = 0;
        for (int i = 0; i < rijeci.length; i++) {

            if (max < rijeci[i].length()) { max = rijeci[i].length(); maxIndex = i; }
        }
        str = "";
        for (int i = 0; i < rijeci.length; i++) {
            if(i == maxIndex) str += rijeci[i].toUpperCase() + " ";
            else str += rijeci[i] + " ";
        }

        unos.setText(str);
    }
}
