public class Ultrabook extends Computer{

	
	public Ultrabook() {
		
	}	
	
	public void inputScreen() {
		
		super.inputScreen();
	}
	
	public void inputColor() {
		
		super.inputColor();
	}
	
	public void inputScreenColor() {
		inputScreen();
		inputColor();
	}
	
	public void setCharacteristics() {
		super.setCharacteristics();
	}
}
