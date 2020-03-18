package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField broj;
    public Label ispis;
    public Label tekst;

    public void Submit(ActionEvent actionEvent) {
        tekst.setText("Brojevi u opsegu od 1 do " + broj.getText() + " koji su djeljivi sa sumom svojih cifara su:");
        String str = "";
        for (int i = 1; i < Integer.parseInt(broj.getText()); i++) {
            if (i % sumCifara(i) == 0) str += String.valueOf(i) + ", ";
        }
        ispis.setText(str);
    }

    private static int sumCifara(int n) {
        int sum = 0;
        while(n != 0) { sum+=n%10; n=n/10; }
        return sum;
    }

}
