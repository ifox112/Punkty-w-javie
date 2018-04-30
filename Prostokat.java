package Grafika;
public class Prostokat {
	private Punkt p1;
	private Punkt p2;
	public Prostokat(){}
	public Prostokat(Punkt p1, Punkt p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	public int Obwod() {
		return 2*Math.abs(p2.PobierzX()-p1.PobierzX())+2*Math.abs(p2.PobierzY()-p1.PobierzY());
	}
	public int Pole() {
		return Math.abs(p2.PobierzX()-p1.PobierzX())*Math.abs(p2.PobierzY()-p1.PobierzY());
	}
	public void wyswietl() {
		System.out.println("("+p1.PobierzX()+";"+p1.PobierzY()+")"+"("+p2.PobierzX()+";"+p2.PobierzY()+")"+"("+p2.PobierzX()+";"+p1.PobierzY()+")"+"("+p1.PobierzX()+";"+p2.PobierzY()+")");
//		System.out.println("("+k.p2.x+";"+k.p2.y+")");
//		System.out.println("("+k.p2.x+";"+k.p1.y+")");
//		System.out.println("("+k.p1.x+";"+k.p2.y+")");
	}
	public void setP(Punkt p1, Punkt p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	public void kop(Prostokat k) {
		p1 = k.p1;
		p2 = k.p2;
	}
	public void getp1() {
		p1.WyswietlWspolrzedne();
	}
	public void getp2() {
		p2.WyswietlWspolrzedne();
	}
	public String toString() {
		return "p1=" + p1 + ", p2=" + p2;
	}
	


}