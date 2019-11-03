package templateDesignPattern;

/**
 * @author brentable
 */

public abstract class House {
	/**
	 * abstract class as the method createFrame will be updated later on
	 */
	public final void buildHouse() {
		createFrame();
		prepFoundation();
		installDrywall();
		addWindows();
		addElectrical();
		addPlumbing();
	}
	/**
	 * Add the void methods here to be called later
	 */
	
	public abstract void createFrame();
	/**
	 * Left as abstract so can be changed later as needed
	 */
	
	public void prepFoundation() {
		System.out.println("Adding a crawlspace to crawl into");
	}
	public void installDrywall() {
		System.out.println("Creating the interior walls");
	}
	
	public void addWindows() {
		System.out.println("Putting in the glass for the windows");
	}
	
	public void addElectrical() {
		System.out.println("Running all the wires and hooking up the power");
	}
	
	public void addPlumbing() {
		System.out.println("Letting water run through the house");
	}
	/**
	 * These methods are not needed to change and as such are set in stone now
	 */
}
