package Grafika;

public class Main {

	public static void main(String[] args) {
		Punkt p1 = new Punkt();
		Punkt p2 = new Punkt();
		Prostokat k = new Prostokat(p1, p2);
		p1.ustawXY(-5, 5);
		p2.ustawXY(0, 0);
		// System.out.println(p1.PobierzX());
		System.out.println(k.Obwod());
		System.out.println(k.Pole());
		k.wyswietl();
		Prostokat l = new Prostokat();
		Punkt p3 = new Punkt(0, 10);
		Punkt p4 = new Punkt(10, 0);
		l.setP(p3, p4);
		l.wyswietl();
		k.kop(l);
		k.wyswietl();
		k.setP(p1, p2);
		k.getp1();
		k.getp2();
		System.out.println(k);
		System.out.println(p1);
		Punkt3D p10 = new Punkt3D();

		System.out.println("Dziedziczenie");

		p10.WyswietlWspolrzedne();
		p10.ustawX(13);

		Punkt3D p11 = new Punkt3D(4, 5, 6);
		p11.WyswietlWspolrzedne();

		Punkt3D p12 = new Punkt3D(p10);
		p12.WyswietlWspolrzedne();

		p10.wyswietl3D();
		p11.wyswietl3D();
		p12.wyswietl3D();

		System.out.println("Punkt 3D : " + p12);

		Punkt tablicaPunktow[] = new Punkt[4];
		
		tablicaPunktow[0] = new Punkt(5, 10);
		tablicaPunktow[1] = new Punkt3D(3, 6, 9);
		tablicaPunktow[2] = p1;
		tablicaPunktow[3] = p11;
		
		tablicaPunktow[0].WyswietlWspolrzedne();
		tablicaPunktow[1].WyswietlWspolrzedne();
		
		((Punkt3D)tablicaPunktow[1]).wyswietl3D();
		
		System.out.println(tablicaPunktow[0]);
		System.out.println(tablicaPunktow[1]);
		
		System.out.println("Tylko pkt 3D z tablicy");
		for (Punkt pkt : tablicaPunktow) {
			if(pkt instanceof Punkt3D){
				((Punkt3D) pkt).wyswietl3D();
			}
		}
	}

}
