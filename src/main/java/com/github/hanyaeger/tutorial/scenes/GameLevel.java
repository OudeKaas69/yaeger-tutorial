package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Waterworld;
import com.github.hanyaeger.tutorial.entities.Swordfish;

public class GameLevel extends DynamicScene {
    
    @SuppressWarnings("unused")
    private Waterworld waterworld;

    public GameLevel(Waterworld waterworld){
        this.waterworld = waterworld;
    }
    
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/waterworld.mp3");
        setBackgroundImage("backgrounds/background2.jpg");
    }

    @Override
    public void setupEntities() {
        addEntity(new Swordfish(new Coordinate2D(getWidth(), getHeight() / 2)));
    }
}
