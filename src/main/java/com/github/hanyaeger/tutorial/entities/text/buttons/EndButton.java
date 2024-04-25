package com.github.hanyaeger.tutorial.entities.text.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.Waterworld;

import javafx.scene.input.MouseButton;

public class EndButton extends StartButton{
    Waterworld waterworld;
    public EndButton(Coordinate2D initialLocation, Waterworld waterworld) {
        super(initialLocation, waterworld, "Exit");
        this.waterworld = waterworld;
    }

    @Override
    public void onMouseButtonPressed(MouseButton arg0, Coordinate2D arg1) {
        waterworld.quit();
    }
}
