package io.github.amorehead.views;

import com.gluonhq.charm.glisten.mvc.View;
import java.io.IOException;
import javafx.fxml.FXMLLoader;

public class HomeView {

    public View getView() {
        try {
            View view = FXMLLoader.load(HomeView.class.getResource("home.fxml"));
            return view;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
            return new View();
        }
    }
}
