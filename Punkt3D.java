package Grafika;

public class Punkt3D extends Punkt{
	
	private int z;
	Punkt3D(){
		super();
		z = 0;
	}
	Punkt3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	Punkt3D(Punkt3D pkt){
		super(pkt);
		this.z = pkt.z;
	}
	void wyswietl3D(){
		System.out.println("("+x+";"+y+";"+z+")");
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public String toString() {
		return "("+x+";"+y+";"+z+")";
	}
	

}
