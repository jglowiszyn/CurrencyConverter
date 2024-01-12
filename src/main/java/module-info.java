module ideaprojects.projects.speakjokes.currencyconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens ideaprojects.projects.speakjokes.currencyconverter to javafx.fxml;
    exports ideaprojects.projects.speakjokes.currencyconverter;
}