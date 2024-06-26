package coffee.kiosk.Controller;


import coffee.kiosk.DTO.Food;
import coffee.kiosk.Service.ManagementService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;



/**
 *  Date    : 2024.05.30
 *  Author  : 이다영
 *  Summary : 메뉴 관리 화면 컨트롤러
 */

public class ManagementController implements Initializable {

    @FXML Label logo;
    ManagementService managementService = new ManagementService();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void goTotal(MouseEvent e) throws SQLException {
        List<Food> foodList = managementService.findAll();
    }

    public void goCoffee(MouseEvent e) {
    }

    public void goBeverage(MouseEvent mouseEvent) {
    }

    public void goSmoothie(MouseEvent mouseEvent) {
    }

    public void goTea(MouseEvent mouseEvent) {
    }

    public void goDessert(MouseEvent mouseEvent) {
    }


    // 첫 화면 이동 메소드
    public void goHome() throws Exception {

        try {
            Parent home = FXMLLoader.load(getClass().getResource("/coffee/kiosk/home.fxml"));
            Scene scene = new Scene(home, 500, 900);

            Stage stage = (Stage) logo.getScene().getWindow();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
