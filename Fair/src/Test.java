import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		CashDeck cashceck = new CashDeck();
		Scanner reader = new Scanner(System.in);
		System.out.println("Choose a game by a number:" + "\n" + "\t" + "\t" + "\t" + "1-Bump car." + "\n" + "\t" + "\t"
				+ "\t" + "2-Jump and smile." + "\n" + "\t" + "\t" + "\t" + "3-Mirror maze." + "\n" + "\t" + "\t" + "\t"
				+ "4-Haunted house." + "\n" + "\t" + "\t" + "\t" + "5-Top spin." + "\n" + "\t" + "\t" + "\t"
				+ "6-Tornado." + "\n" + "\t" + "\t" + "\t" + "Or q press to exit!!!");
		System.out.println("\n" + "You can also choose a meal by a number: " + "\n" + "\t" + "\t" + "\t" + "11-Fries."
				+ "\n" + "\t" + "\t" + "\t" + "22-Sandwiches." + "\n" + "\t" + "\t" + "\t" + "33-Salads." + "\n" + "\t"
				+ "\t" + "\t" + "44-Shoarma." + "\n" + "\n" + "\t" + "\t" + "\t"
				+ "	PRESS [00] TO PRINT YOUR BILL OR [q] TO EXIT!!!" + "\n");
		
		System.out.println("Enter a number: ");
		
		String n = null;
		
		while (true) {
			n = reader.nextLine();
			int j;
			switch (n) {
			case "1":
				BumperCars BumperCars = new BumperCars();
				BumperCars.run();
				System.out.println("One tickt price:" + BumperCars.d + "EURO");
				System.out.println("How many tickets do you need : ");
				j = reader.nextInt();
				cashceck.setRide(1, j);
				System.out.println("Total price for//" + j + "// Bump Cars tickets: " + Math.round(j * BumperCars.d) + " Euro.");
				break;
			case "2":
				JumpAndSmile JumpAndSmile = new JumpAndSmile();
				JumpAndSmile.run();
				System.out.println("One tickt price: " + JumpAndSmile.d + " EURO");
				System.out.println("How many tickets do you need : ");
				j = reader.nextInt();
				cashceck.setRide(2, j);
				System.out.println("Total price for//" + j + "// Jump And Smile: " + Math.round(j * JumpAndSmile.d) + " Euro.");
				break;
			case "3":
				MirrorMaze MirrorMaze = new MirrorMaze();
				MirrorMaze.run();
				System.out.println("One tickt price: " + MirrorMaze.d + " EURO");
				System.out.println("How many tickets do you need : ");
				j = reader.nextInt();
				cashceck.setRide(3, j);
				System.out.println("Total price for//" + j + "// Mirror Maze: " + Math.round(j * MirrorMaze.d) + " Euro.");
				break;
			case "4":
				HauntedHouse HauntedHouse = new HauntedHouse();
				HauntedHouse.run();
				System.out.println("One tickt price: " + HauntedHouse.d + " EURO");
				System.out.println("How many tickets do you need : ");
				j = reader.nextInt();
				cashceck.setRide(4, j);
				System.out.println("Total price for//" + j + "// Haunted House: " + Math.round(j * HauntedHouse.d) + " Euro.");
				break;
			case "5":
				TopSpin TopSpin = new TopSpin();
				TopSpin.run();
				System.out.println("One tickt price: " + TopSpin.d + " EURO");
				System.out.println("How many tickets do you need : ");
				j = reader.nextInt();
				cashceck.setRide(5, j);
				System.out.println("Total price for//" + j + "// Top Spin: " + Math.round(j * TopSpin.d) + " Euro.");
				break;
			case "6":
				Tornado Tornado = new Tornado();
				Tornado.run();
				System.out.println("One tickt price: " + Tornado.d + " EURO");
				System.out.println("How many tickets do you need : ");
				j = reader.nextInt();
				cashceck.setRide(6, j);
				System.out.println("Total price for//" + j + "// Tornado: " + Math.round(j * Tornado.d) + " Euro.");
				break;
			case "11":
				Fries Fries = new Fries();
				Fries.getFood();
				System.out.println("One fries price: " + Fries.g + " EURO");
				System.out.println("How many meals do you want : ");
				j = reader.nextInt();
				cashceck.setMeals(11, j);
				System.out.println("Total price for//" + j + "// Fries: " + Math.round(j * Fries.g) + " Euro.");
				break;
			case "22":
				Sandwiches Sandwiches = new Sandwiches();
				Sandwiches.getFood();
				System.out.println("One Sandwiches price: " + Sandwiches.g + " EURO");
				System.out.println("How many meals do you want : ");
				j = reader.nextInt();
				cashceck.setMeals(22, j);
				System.out.println("Total price for//" + j + "// Sandwiches: " + Math.round(j * Sandwiches.g) + " Euro.");
				break;
			case "33":
				Salads Salads = new Salads();
				Salads.getFood();
				System.out.println("One Salads price: " + Salads.g + " EURO");
				System.out.println("How many meals do you want : ");
				j = reader.nextInt();
				cashceck.setMeals(33, j);
				System.out.println("Total price for//" + j + "// Salads: " + Math.round(j * Salads.g) + " Euro.");
				break;
			case "44":
				Shoarma Shoarma = new Shoarma();
				Shoarma.getFood();
				System.out.println("One Shoarma price: " + Shoarma.g + " EURO");
				System.out.println("How many meals do you want : ");
				j = reader.nextInt();
				cashceck.setMeals(44, j);
				System.out.println("Total price for//" + j + "// Shoarma: " + Math.round(j * Shoarma.g) + " Euro.");
				break;
			case "q":
				System.out.println("The program is end.");
				reader.close();
				System.exit(-1);
			case "00":
				cashceck.getRide();
				cashceck.getMeals();
				cashceck.totaalPrice();
				System.exit(-1);
			}
			
		}
	}
}
