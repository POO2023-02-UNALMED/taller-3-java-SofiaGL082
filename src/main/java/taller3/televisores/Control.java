package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV televisor) {
		this.tv = televisor;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public TV getTv() {
		return tv;
	}
	
	public void turnOn() {
		this.tv.turnOn(true);
	}
	
	public void turnOff() {
		this.tv.turnOff(false);
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}
	
	public void setVolumen(int volumen) {
		this.tv.setVolumen(volumen);
	}

}
