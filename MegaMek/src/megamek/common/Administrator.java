package megamek.common;

public class Administrator extends Player{

	/**
	 * Represents an administrator of the game.
	 */
	private static final long serialVersionUID = 1L;
	private boolean invisible;
	
	public Administrator(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isInvisible() {
		return invisible;
	}
	
	public void setInvisible(boolean invisFlag) {
		this.invisible = invisFlag;
	}

}
