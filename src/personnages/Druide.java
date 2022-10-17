package personnages;

import java.util.Random;

public class Druide {
	 private String nom; 
	 private int forcePotion=1;
	 private int effetPotionMin; 
	 private int effetPotionMax; 
	 
	 public Druide(String nom, int effetPotionMin, int effetPotionMax) { 
		 this.nom = nom; 
		 this.effetPotionMin = effetPotionMin; 
		 this.effetPotionMax = effetPotionMax; 
		 parler("Bonjour,  je  suis  le  druide  "  +  nom  +  "  et  ma  potion  peut  aller  d'une force " + effetPotionMin + " à " + effetPotionMax + "."); 
	 } 
	 
	 public String getNom() { 
		 return nom; 
	 } 
	 
	 public void parler(String texte) { 
		 System.out.println(prendreParole() + "« " + texte + "»"); 
	 } 
	 
	 private String prendreParole() { 
		 return "Le druide " + nom + " : "; 
	 } 
	 
	 public int preparerPotion() {
		 this.prendreParole();
		 this.parler("Je vais aller préparer une petite potion...");
		 Random rd = new Random();
		 this.forcePotion=rd.nextInt(this.effetPotionMax-this.effetPotionMin)+this.effetPotionMin;
		 if (this.forcePotion>7) {
			 this.prendreParole();
			 this.parler("J'ai préparé une super potion de force " + this.forcePotion);
		 	}
		 else {
			 this.prendreParole();
			 this.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force "+ this.forcePotion);
		 }
		 return forcePotion;
	 }
	 
	 public void booster(Gaulois gaugau) {
		 if ( gaugau.getNom() == "Obélix" ) {
			 this.prendreParole();
			 this.parler("Non, Obélix!... Tu n’auras pas de potion magique ! ");
		 }
		 else {
		 gaugau.boirePotion(forcePotion);
		 }
	 }
	 
	 public static void main(String[] args) {
		 Druide panoramix = new Druide("Panoramix",5,10);
		 panoramix.preparerPotion();
		 panoramix.preparerPotion();
		 panoramix.preparerPotion();
		 panoramix.preparerPotion();
		 panoramix.preparerPotion();
	 }
	 
	 
	 
}
