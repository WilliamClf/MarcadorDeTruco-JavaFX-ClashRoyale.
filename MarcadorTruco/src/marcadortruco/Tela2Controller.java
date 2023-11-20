package marcadortruco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Tela2Controller implements Initializable {

    @FXML
    private Label pontuacaoEquipe1;

    @FXML
    private Label pontuacaoEquipe2;

    @FXML
    private TextField nomeEquipe1;

    @FXML
    private TextField nomeEquipe2;

    @FXML
    private Label vitoriasEquipe1Label;

    @FXML
    private Label vitoriasEquipe2Label;

    private int pontosEquipe1 = 0;
    private int pontosEquipe2 = 0;
    private int vitoriasEquipe1 = 0;
    private int vitoriasEquipe2 = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void aumentarPontuacaoEquipe1(ActionEvent event) {
        if (pontosEquipe1 < 12) {
            pontosEquipe1++;
            pontuacaoEquipe1.setText(String.valueOf(pontosEquipe1));
            verificarVitoria();
        }
    }

    @FXML
    private void diminuirPontuacaoEquipe1(ActionEvent event) {
        if (pontosEquipe1 > 0) {
            pontosEquipe1--;
            pontuacaoEquipe1.setText(String.valueOf(pontosEquipe1));
        }
    }

    @FXML
    private void aumentarPontuacaoEquipe2(ActionEvent event) {
        if (pontosEquipe2 < 12) {
            pontosEquipe2++;
            pontuacaoEquipe2.setText(String.valueOf(pontosEquipe2));
            verificarVitoria();
        }
    }

    @FXML
    private void diminuirPontuacaoEquipe2(ActionEvent event) {
        if (pontosEquipe2 > 0) {
            pontosEquipe2--;
            pontuacaoEquipe2.setText(String.valueOf(pontosEquipe2));
        }
    }

    @FXML
    private void trucoEquipe1(ActionEvent event) {
        somarPontosEquipe1(3);
    }

    @FXML
    private void trucoEquipe2(ActionEvent event) {
        somarPontosEquipe2(3);
    }

    private void verificarVitoria() {
    if (pontosEquipe1 >= 12 && pontosEquipe2 < 12) {
        vitoriasEquipe1++;
        vitoriasEquipe1Label.setText(String.valueOf(vitoriasEquipe1));
        reiniciarPartida();
    } else if (pontosEquipe2 >= 12 && pontosEquipe1 < 12) {
        vitoriasEquipe2++;
        vitoriasEquipe2Label.setText(String.valueOf(vitoriasEquipe2));
        reiniciarPartida();
    }
}

    private void reiniciarPartida() {
        pontosEquipe1 = 0;
        pontosEquipe2 = 0;
        pontuacaoEquipe1.setText("0");
        pontuacaoEquipe2.setText("0");
    }

    private void somarPontosEquipe1(int pontos) {
        pontosEquipe1 += pontos;
        pontuacaoEquipe1.setText(String.valueOf(pontosEquipe1));
        verificarVitoria();
    }

    private void somarPontosEquipe2(int pontos) {
        pontosEquipe2 += pontos;
        pontuacaoEquipe2.setText(String.valueOf(pontosEquipe2));
        verificarVitoria();
    }
}
       
    

