package edu.connexion3a35.gui;

import edu.connexion3a35.entities.User;
import edu.connexion3a35.services.UserService;
import edu.connexion3a35.session.UserSession;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UserInfoController extends AdminPageController implements Initializable  {
    @FXML
    private Button btnRetour;

    @FXML
    private Button btnBan;

    @FXML
    private Button btnDelete;

    @FXML
    private Label lbAdresse;

    @FXML
    private Label lbAge;

    @FXML
    private Label lbCreationDate;

    @FXML
    private Label lbDateOfBirth;

    @FXML
    private Label lbEmail;

    @FXML
    private Label lbFirstName;

    @FXML
    private Label lbLastName;

    @FXML
    private Label lbLicence;

    @FXML
    private Label lbNumTel;

    @FXML
    private Label lbRole;

    @FXML
    private Label lbSexe;

    @FXML
    private Label lbSpeciality;
    private Stage previousStage;
    private User user;




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void retour() {
            previousStage = (Stage) btnRetour.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("adminPage.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        previousStage.setScene(scene);
        previousStage.show();
    }

    @FXML
    public void delete(ActionEvent actionEvent) {

        UserService userService = new UserService();
        userService.deleteUser(getUser().getEmail());
        System.out.println("User deleted"+getUser());
        Stage stage = (Stage) btnDelete.getScene().getWindow();
        FXMLLoader loader= new FXMLLoader(getClass().getResource("adminPage.fxml"));
        try {
            Parent root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(loader.getRoot());
        stage.setScene(scene);
        stage.show();
    }

    public void bannir(ActionEvent actionEvent) {
    }


    public void setSelectedUser(User selectedUser) {
        lbAdresse.setText(selectedUser.getLocation() != null ? selectedUser.getLocation() : "UNDEFINED");
        lbAge.setText(selectedUser.getAge() != null ? selectedUser.getAge().toString() : "UNDEFINED");
        lbCreationDate.setText(selectedUser.getCreatedAt() != null ? selectedUser.getCreatedAt().toString() : "UNDEFINED");
        lbDateOfBirth.setText(selectedUser.getDateOfBirth() != null ? selectedUser.getDateOfBirth().toString() : "UNDEFINED");
        lbEmail.setText(selectedUser.getEmail() != null ? selectedUser.getEmail() : "UNDEFINED");
        lbFirstName.setText(selectedUser.getFirstName() != null ? selectedUser.getFirstName() : "UNDEFINED");
        lbLastName.setText(selectedUser.getLastName() != null ? selectedUser.getLastName() : "UNDEFINED");
        lbLicence.setText(selectedUser.getLicence() != null ? selectedUser.getLicence() : "UNDEFINED");
        lbNumTel.setText(selectedUser.getPhoneNumber() != null ? selectedUser.getPhoneNumber() : "UNDEFINED");
        lbRole.setText(selectedUser.getRole() != null ? selectedUser.getRole() : "UNDEFINED");
        lbSexe.setText(selectedUser.getGender() != null ? selectedUser.getGender() : "UNDEFINED");
        lbSpeciality.setText(selectedUser.getSpeciality() != null ? selectedUser.getSpeciality() : "UNDEFINED");
    }










    UserSession userSession;

    public Button getBtnBan() {
        return btnBan;
    }

    public void setBtnBan(Button btnBan) {
        this.btnBan = btnBan;
    }

    public Button getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(Button btnDelete) {
        this.btnDelete = btnDelete;
    }

    public Label getLbAdresse() {
        return lbAdresse;
    }

    public void setLbAdresse(Label lbAdresse) {
        this.lbAdresse = lbAdresse;
    }

    public Label getLbAge() {
        return lbAge;
    }

    public void setLbAge(Label lbAge) {
        this.lbAge = lbAge;
    }

    public Label getLbCreationDate() {
        return lbCreationDate;
    }

    public void setLbCreationDate(Label lbCreationDate) {
        this.lbCreationDate = lbCreationDate;
    }

    public Label getLbDateOfBirth() {
        return lbDateOfBirth;
    }

    public void setLbDateOfBirth(Label lbDateOfBirth) {
        this.lbDateOfBirth = lbDateOfBirth;
    }

    public Label getLbEmail() {
        return lbEmail;
    }

    public void setLbEmail(Label lbEmail) {
        this.lbEmail = lbEmail;
    }

    public Label getLbFirstName() {
        return lbFirstName;
    }

    public void setLbFirstName(Label lbFirstName) {
        this.lbFirstName = lbFirstName;
    }

    public Label getLbLastName() {
        return lbLastName;
    }

    public void setLbLastName(Label lbLastName) {
        this.lbLastName = lbLastName;
    }

    public Label getLbLicence() {
        return lbLicence;
    }

    public void setLbLicence(Label lbLicence) {
        this.lbLicence = lbLicence;
    }

    public Label getLbNumTel() {
        return lbNumTel;
    }

    public void setLbNumTel(Label lbNumTel) {
        this.lbNumTel = lbNumTel;
    }

    public Label getLbRole() {
        return lbRole;
    }

    public void setLbRole(Label lbRole) {
        this.lbRole = lbRole;
    }

    public Label getLbSexe() {
        return lbSexe;
    }

    public void setLbSexe(Label lbSexe) {
        this.lbSexe = lbSexe;
    }

    public Label getLbSpeciality() {
        return lbSpeciality;
    }

    public void setLbSpeciality(Label lbSpeciality) {
        this.lbSpeciality = lbSpeciality;
    }

    public Button getBtnRetour() {
        return btnRetour;
    }

    public void setBtnRetour(Button btnRetour) {
        this.btnRetour = btnRetour;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }
}
























