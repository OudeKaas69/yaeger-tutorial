package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Waterworld;
import com.github.hanyaeger.tutorial.entities.text.buttons.EndButton;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class GameOver extends StaticScene{
    Waterworld waterworld;
    public GameOver(Waterworld waterworld){
        this.waterworld = waterworld;
    }

    @Override
    public void setupEntities(){
        var endText = new TextEntity(
            new Coordinate2D(getWidth() / 2, getHeight() / 2),
            "Game Over"
        );

        endText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        endText.setFill(Color.RED);
        endText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(endText);
        addEntity(new EndButton(new Coordinate2D(getWidth() / 2, getHeight() * 3 / 4), waterworld));

    }
    

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/ocean.mp3");
        setBackgroundImage("backgrounds/background1.jpg");
    }
}
