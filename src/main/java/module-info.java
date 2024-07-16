module com.client.number_finding_game {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.json;
    requires java.desktop;


    opens com.client.number_finding to javafx.fxml;
    exports com.client.number_finding.Controller;
    opens com.client.number_finding.Controller to javafx.fxml;
    exports com.client.number_finding;
    exports com.server.model.DTO;
    opens com.server.model.DTO to javafx.fxml;
    exports com.server.controller.BUS;
    opens com.server.controller.BUS to javafx.fxml;
}