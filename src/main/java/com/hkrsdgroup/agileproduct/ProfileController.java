package com.hkrsdgroup.agileproduct;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ProfileController {
    @FXML
    private TextField sleepHour;

    @FXML
    private TextField studyHour;

    @FXML
    private TextField studyMinute;

    @FXML
    private TextField workoutType;

    @FXML
    private TextField course;

    @FXML
    void onSubmitClick(ActionEvent event) {
       int sleepTime = Integer.parseInt(sleepHour.getText());
       int studyHr = Integer.parseInt(studyHour.getText());
       int studyMin = Integer.parseInt(studyMinute.getText());
       String workout = workoutType.getText();
       int dayStartTime = (studyHr * 60) + studyMin;
       DailySchedule myDay = new DailySchedule(sleepTime, workout, dayStartTime);

       myDay.ScheduleDayOnlyLongSession();
    }
}
