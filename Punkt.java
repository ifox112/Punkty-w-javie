package Grafika;

public class Punkt {
	
	protected int x;
	protected int y;
	
	public Punkt (){
		x = 0;
		y = 0;
	}
	public Punkt (int x, int y){
		this.x = x;
		this.y = y;
	 }
	public Punkt (Punkt p){
		this.ustawXY(p);
	}
	public void WyswietlWspolrzedne () {
		System.out.println("(" + x + "," + y + ")");
	}
	public int PobierzX () {
		return x;
		
	}
	public int PobierzY () {
		return y;
	}
	
	public void ustawX(int wsp_x) {
		x = wsp_x;
	}
	public void ustawY(int wsp_y) {
		y = wsp_y;
	}
	
	public void ustawXY(int wsp_x, int wsp_y) {
		x = wsp_x;
		y = wsp_y;
	}
	
	public void ustawXY(Punkt p) {
		x = p.x;
		y = p.y;
	}
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
}
