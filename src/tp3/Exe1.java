package tp3;

public class Exe1 {
	
	public static void enumereCroissante(int vMin,int vMax) {
		// Affiche, dans l’ordre croissant, tous les entiers de vMin inclus à vMax inclus, avec vMin ≤ vMax.
		while (vMin<=vMax) {
			System.out.print(vMin+" ");
			vMin += 1;
		}
	}

	public static void enumereDecroissante(int vMin,int vMax) {
		// Affiche, dans l’ordre décroissant, tous les entiers de vMax inclus à vMin inclus, avec vMin ≤ vMax.
		while (vMin<=vMax) {
			System.out.print(vMax+" ");
			vMax -= 1;
		}
	}
	
	public static void enumere(int deb,int fin) {
		// Enumère tous les entiers dans l’ordre croissant, selon les valeurs et l’ordre de deb et fin.
		if (deb<=fin) {
			enumereCroissante(deb,fin);
		}
		if (deb>fin) {
			enumereCroissante(fin,deb);
		}
	}

	public static void main(String[] args) {
		// Tests
		System.out.print("enumereCroissante : ");
		enumereCroissante(-2,6);
		System.out.print("\nenumereDecroissante : ");
		enumereDecroissante(-2,6);
		System.out.print("\nenumere : ");
		enumere(6,-2);
	}
}