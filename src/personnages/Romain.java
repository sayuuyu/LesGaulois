package personnages;

public class Romain {
	 private String nom; 
	 private int force; 
	 
	 public Romain(String nom, int force) { 
		 this.nom = nom; 
		 this.force = force; 
	 } 
	 
	 public String getNom() { 
		 return nom; 
	 }
	 
	 public void parler(String texte) { 
		 System.out.println(prendreParole() + "« " + texte + "»"); 
	 }
	 
	 public String prendreParole() { 
		 return "Le romain " + nom + " : "; 
	 }
	 
	 public void recevoirCoup(int forceCoup) { 
		 force -= forceCoup; 
		 if (force > 0) { 
		 parler("Aïe"); 
		 } else { 
		 parler("J'abandonne..."); 
		 }
	 }
	 
	 public static void main(String[] args) { 
		  Romain caesar = new Romain("Caesar",8);
		  caesar.prendreParole();
		  caesar.parler("Bonjour, je suis Caesar");
		  caesar.recevoirCoup(5);
		  caesar.recevoirCoup(4);
		  
		  
		 }
	 
}
