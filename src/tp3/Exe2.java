package tp3;

public class Exe2 {
	
	public static double impotMontant(double salaire) {
		// Prend en entrée le salaire d'une personne et retourne le montant de son impôt.
		double impot = 0;
		if (salaire>=10064 && salaire<25659) {
			impot = 10064*0+(salaire-10064)*0.11;
		}
		if (salaire>=25659 && salaire<73369) {
			impot = 10064*0+(25659-10064)*0.11+(salaire-25659)*0.3;
		}
		if (salaire>=73369 && salaire<157805) {
			impot = 10064*0+(25659-10064)*0.11+(73369-25659)*0.3+(salaire-73369)*0.41;
		}
		if (salaire>=157805) {
			impot = 10064*0+(25659-10064)*0.11+(73369-25659)*0.3+(157805-73369)*0.41+(salaire-157805)*0.45;
		}
		return impot;
	}

	public static double pourcentageImposition(double salaire) {
		// Prend en entrée le salaire d'une personne et retourne son pourcentage d'imposition.
		double pourcentage = 0;
		pourcentage = (impotMontant(salaire)/salaire)*100;
		return pourcentage;
	}

	public static double gainMariage(double salaire1, double salaire2) {
		// Calcul la réduction d'impot d'un couple après mariage.
		double gain = 0;
		double c = impotMontant(salaire1)+impotMontant(salaire2);
		double m = (salaire1+salaire2)/2;
		m = 2*(impotMontant(m));
		gain = c - m;
		return gain;
	}
 
	public static void main(String[] args) {
		// Tests
		System.out.println("impotMontant : "+impotMontant(32000));
		System.out.println("pourcentageImposition : "+pourcentageImposition(32000));
		System.out.println("gainMariage : "+gainMariage(10000,15000));
	}
}