package game;

public class Main {
	public static void main(String[] args) {
		Game g = new Game();
		
		// Initialize game objects
		Pipes p = new Pipes();
		
		// Add updatables and renderables
		g.addRenderable(p);
		g.addUpdatable(p);
		
		
		//Start!
		g.start();
	}
}
