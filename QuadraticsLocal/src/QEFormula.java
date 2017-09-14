/**
 * 
 */

/**
 * @author MurphyP1
 * date 9/8/2017
 */

public class QEFormula {

	private double a;
	private double b;
	private double c;
	
	//Constructor
	QEFormula(double a, double b, double c) {
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
		
		if (d < 0 ) return null; //No real roots
		if (d == 0) {
			allRoots = new double[1];
			allRoots[0] = -b / 2 *a;	//One real root
			return allRoots;
		}
		if (d > 0) {			//Two real roots
			allRoots = new double[2];
			allRoots[0] = (-b + d) / 2 *a;	
			allRoots[1] = (-b - d) / 2 *a;	
			return allRoots;

		}
		//TODO Fix later
		return null; 
	}
}