package Sokoban.controller;

import Sokoban.model.Direction;

public interface EventListener {

    void move(Direction direction);  // move object to certain direction

    void restart();                  // restart current level

    void startNextLevel();

    void levelCompleted(int level);  // action after level is completed
}
