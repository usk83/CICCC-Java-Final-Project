package ca.ciccc.typinggame.controller;

import ca.ciccc.typinggame.model.Word;
import javafx.scene.Scene;

import java.util.Deque;

public class TypingGameController {
  private Player player;
  private Player[] players;
  private int timeRemains;
  private Score score;
  private Deque<Word> targetWords;
  private String currentInput;
  private boolean isFinished;

  public void updateTimeRemains() {}

  public void displayResult() {}

  public Scene getScene() {
    return null;
  }

  public void initialize() {}

  public void hitKey() {}

  public void pressNewGame() {}

  public void pressMainMenu() {}
}
