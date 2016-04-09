package game;

import java.awt.Graphics2D;
import java.util.Random;

public class Pipes implements Updatable, Renderable {

	private int pipeWidth = 100;
	private int pipeHorizontalSpacing = 210;
	private int pipeVerticalSpacing = 180;
	
	private float xVel = -5.0f;
	private float x1, x2, x3;
	private float y1, y2, y3;
	
	// The pipe that is closest to the bird
	private int currentPipe;
	// An Array to hold the pipe coordinates
	private float[][] pipeCoords = new float[3][2];
	
	private Random rand;
	
	public Pipes() {
		rand = new Random();
		
		resetPipes();
	}
	
	public void resetPipes() {
		
	}
	
	@Override
	public void render(Graphics2D g, float interpolation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Input input) {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
