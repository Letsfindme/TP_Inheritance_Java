
public class CreatAnimal {
	public static void main(String arg[]) {
		Chien monChien = new Chien();
		monChien.setNom("Medor");
		monChien.setCouleur("Noir");
		System.out.println("Mon chien s'appelle "+ monChien.getNom()+" et il fait "+monChien.aboie()+".");
		
		Cat monCat = new Cat();
		monCat.setNom("Felix");
		monCat.setCouleur("Blond");
		System.out.println("Mon chat s'appelle "+ monCat.getNom()+" et il fait "+monCat.miaule()+".");
	}
}
