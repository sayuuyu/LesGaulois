package personnages;

public class Village {
	 //attributs
	 private String nom; 
	 private Chef chef;
	 private int nbVillageois=0;
	 private Gaulois[] villageois;
	 
	 
	 //constructeur
	 public Village(String nom, int nbVillageoisMax) { 
		 this.nom = nom;
		 for (int i = 0 ; i < nbVillageoisMax ; i++)
			 villageois[i] = null ;
	 } 
	 
	 //methodes
	 public void setChef(Chef chef) { 
	 this.chef = chef; 
	 } 
	 
	 public String getNom() { 
	 return this.nom; 
	 }
	 
	 public void ajouterHabitant(Gaulois g) {
		 if ( nbVillageois == villageois.length ) 
			 System.out.println("Le village est plein");
		 else {
			 villageois[nbVillageois] = g;
			 nbVillageois+=1;
		 }
	 }
	 
	 public Gaulois trouverHabitant(int iGaulois) {
		 if( 0 <= iGaulois && iGaulois < nbVillageois) 
			 return villageois[iGaulois];
		 else {
			 System.out.println("Ce numero de gaulois n'existe pas dans ce village");
			 return null;
		 }
	 }
	 
	 public static void main( String[] args) {
		Village village= new Village("Village des Irréductibles", 30);
		Gaulois gaulois = village.trouverHabitant(30);
		 
	 }
	 
}
