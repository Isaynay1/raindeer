
public class ReindeerGames {

	public static void main(String[] args) {
		// Start Here
		String nam = "";
		Arraylist<String>  raindeer = new Arraylist<String>;
		raindeer.add("Dasher");
		raindeer.add("Dancer");
		raindeer.add("prancer");
		raindeer.add("Vixen");
		raindeer.add("Comet");
		raindeer.add("Cupid");
		raindeer.add("Donner");
		raindeer.add("Blitzen");
		raindeer.add("Rudolph");
		for (int i =0 ; i < raindeer.size() ; i++){
			nam = ((String)raindeer.get(i));
			if (nam.Lenght() % 2 == 0){
				nam = nam + "*";
				raindeer.set(i,nam);
			}
		}

	}

}
