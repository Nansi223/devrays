package app.jaid.devrays;

import app.jaid.devrays.screen.ingame.IngameScreen;

import com.badlogic.gdx.Game;

public class Devrays extends Game {

	@Override
	public void create()
	{
		setScreen(new IngameScreen());
	}

	@Override
	public void render()
	{
		Core.tick();
	}
}
