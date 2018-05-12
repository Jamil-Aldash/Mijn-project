
public class AmusementRides {
	public static double d = 0.00;

	public void run() {
	}

}

class BumperCars extends AmusementRides {
	public static double d = 2.50;

	public void run() {
		System.out.println("***Bumper Cars Runs");
	}

}

class JumpAndSmile extends AmusementRides {
	public static double d = 2.25;

	public void run() {
		System.out.println("***Jump AndSmile Runs");
	}
}

class MirrorMaze extends AmusementRides {
	public static double d = 2.75;

	public void run() {
		System.out.println("***Mirror Maze Runs");
	}
}

class HauntedHouse extends AmusementRides {
	public static double d = 3.20;

	public void run() {
		System.out.println("***Haunted House Runs");
	}
}

class TopSpin extends AmusementRides {
	public static double d = 2.90;

	public void run() {
		System.out.println("***Top Spin Runs");
	}
}

class Tornado extends AmusementRides {
	public static double d = 5.00;

	public void run() {
		System.out.println("***Tornado Runs");
	}
}

class FoodStand {
	public static double g = 0.00;

	public void getFood() {
	}
}

class Fries extends FoodStand {
	public static double g = 4.00;

	public void getFood() {
		System.out.println("Fries for one person");
	}
}

class Sandwiches extends FoodStand {
	public static double g = 3.45;

	public void getFood() {
		System.out.println("Sandwiches for one person");
	}

}

class Salads extends FoodStand {
	public static double g = 9.00;

	public void getFood() {
		System.out.println("Salads for one person");
	}

}

class Shoarma extends FoodStand {
	public static double g = 5.15;

	public void getFood() {
		System.out.println("Shaorma for one person");
	}

}

class CashDeck {
	private double pumberCars = 0, pumberCarsCost = 0, jumpAndSmile = 0, jumpAndSmileCost = 0, mirrorMaze = 0,
			mirrorMazeCost = 0, hauntedHouse = 0, hauntedHouseCost = 0, topSpin = 0, topSpinCost = 0, tornado = 0,
			tornadoCost = 0;
	private double fries = 0, firesCost = 0, sandwiches = 0, SandwichesCost = 0, salads = 0, SaladsCost = 0,
			shoarma = 0, ShoarmaCost = 0;

	public void setRide(int a, int k) {
		if (a == 1) {
			pumberCars = k;
			pumberCarsCost = k * BumperCars.d;
		} else {
			if (a == 2) {
				jumpAndSmile = k;
				jumpAndSmileCost = Math.round(k * JumpAndSmile.d);
			}
			if (a == 3) {
				mirrorMaze = k;
				mirrorMazeCost = Math.round(k * MirrorMaze.d);
			}
			if (a == 4) {
				hauntedHouse = k;
				hauntedHouseCost = Math.round(k * HauntedHouse.d);
			}
			if (a == 5) {
				topSpin = k;
				topSpinCost = Math.round(k * TopSpin.d);
			}
			if (a == 6) {
				tornado = k;
				tornadoCost = Math.round(Tornado.d);
			}
		}
	}

	public void getRide() {
		String rides = "";
		if (pumberCars != 0)
			rides += "- Pumber cars Tickets  " + (int) pumberCars + "  *  " + BumperCars.d + "  Euro per ticket = "
					+ pumberCarsCost + "  Euro		// Bumper Cars Totaal Cost." + "\n";
		if (jumpAndSmile != 0)
			rides += "- Jump And Smile Tickets  " + (int) jumpAndSmile + "  *  " + JumpAndSmile.d
					+ "  Euro per ticket = " + jumpAndSmileCost + "  Euro		// Jump And Smile Totaal Cost." + "\n";

		if (mirrorMaze != 0)
			rides += "- Mirro Maze Tickets  " + (int) mirrorMaze + "  *  " + MirrorMaze.d + "  Euro per ticket = "
					+ mirrorMazeCost + "  Euro		// Mirror Maze Totaal Cost." + "\n";

		if (hauntedHouse != 0)
			rides += "- Haunted House Tickets  " + (int) hauntedHouse + "  *  " + HauntedHouse.d
					+ "  Euro per ticket = " + hauntedHouseCost + "  Euro		// Haunted House Totaal Cost." + "\n";

		if (topSpin != 0)
			rides += "- Top Spin Tickets  " + (int) topSpin + "  *  " + TopSpin.d + "  Euro per ticket = " + topSpinCost
					+ "  Euro		// Top Spin Totaal Cost." + "\n";
		if (topSpin != 0)
			rides += "- Tornedo Tickets   " + (int) tornado + "  *  " + Tornado.d + "  Euro per ticket = " + tornadoCost
					+ "  Euro		// Tornedo Totaal Cost." + "\n";

		System.out.println(rides);

	}

	public void setMeals(int a, int k) {
		if (a == 11) {
			fries = k;
			firesCost = Math.round(k * Fries.g);
		} else {
			if (a == 22) {
				sandwiches = k;
				SandwichesCost = Math.round(k * Sandwiches.g);
			}
			if (a == 33) {
				salads = k;
				SaladsCost = Math.round(k * Salads.g);
			}
			if (a == 44) {
				shoarma = k;
				ShoarmaCost = Math.round(Shoarma.g);
			}
		}
	}

	public void getMeals() {
		String meals = "";
		if (fries != 0)
			meals += "* Fries Meals	" + (int) fries + "  *  " + Fries.g + "  Euro per Meal = " + firesCost
					+ "  Euro		// Fries Totaal Coat." + "\n";
		if (sandwiches != 0)
			meals += "* Sandwishes Meals	" + (int) sandwiches + "  *  " + Sandwiches.g + "  Euro per Meal = "
					+ SandwichesCost + "  Euro		// Sandwishes Totaal Coat." + "\n";
		if (salads != 0)
			meals += "* Salads Meals		" + (int) salads + "  *  " + Salads.g + "  Euro per Meal = " + SaladsCost
					+ "  Euro		// Salads Totaal Coat." + "\n";
		if (shoarma != 0)
			meals += "* Shoarma Meals	" + (int) shoarma + "  *  " + Shoarma.g + "  Euro per Meal = " + ShoarmaCost
					+ "  Euro		// Shoarma Totaal Coat." + "\n" + "\n";
		System.out.println(meals);
	}

	public void totaalPrice() {
		double r = pumberCarsCost + jumpAndSmileCost + mirrorMazeCost + hauntedHouseCost + topSpinCost + tornadoCost;
		double m = firesCost + SandwichesCost + SaladsCost + ShoarmaCost;
		System.out.println("Totaal Rides cost=  " + r + " Euro.");
		System.out.println("Totaal Meals cost=  " + m + " Euro.");
		System.out.println("*****TOTAAL PRICE=  " + (double) (m + r) + " Euro.");
	}
}
