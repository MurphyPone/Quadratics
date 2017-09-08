/**
 * 
 */

/**
 * @author MurphyP1
 * date 9/8/2017
 */

public class QuadraticFormula {

	/**
	 * @author MurphyP1
	 * @param args
	 * @return: 
	 */
	private double a;
	private double b;
	private double c;
	
	//Constructor
	QuadraticFormula(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double discriminant() {
		return Math.pow(b, 2) - 4*a*c;
	}
	
	public double[] roots() {
		double[] allRoots;
		double d = discriminant();
		
		if (d < 0 ) return null;
		if (d == 0) {
			allRoots = new double[1];
			allRoots[1] = -b / 2 *a
		}
	}
	
		/*try {			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic error");
			System.out.println(e.toString());
		}
		*/
}
