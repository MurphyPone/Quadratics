/**
 * 
 */

/**
 * @author MurphyP1
 * date 9/8/1017
 *
 */
public class QETest {

	/**
	 * @author MurphyP1
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Quadratic 
		QEFormula testQuad = new QEFormula(6, 10, -1);
		double[] results = testQuad.roots();
		System.out.println(results.length);
		
		for(double d : results) {
			System.out.println(d);
		}
		
		//im ok now
		QEFormula testQuad1 = new QEFormula(20, 1, 20);
		results = testQuad1.roots();
		System.out.println(results.length);
		
		for(double d : results) {
			System.out.println(d);
		}
		
	}
}