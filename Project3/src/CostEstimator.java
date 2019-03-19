/**
 * 
 * @author saranya
 *
 */
public class CostEstimator {
	/**
	 * 
	 * @param area
	 * @param standard
	 * @return int cost
	 */
	public int costEstimator(int area,String standard){
		int cst=0;
		if(standard.equals("standard"))
			cst = area*1200;
		else if(standard.equals("abovestandard"))
			cst = area*1500;
		else if(standard.equals("highstandard"))
			cst = area*1800;
		else
			cst = area*2500;
		return cst;
	}
}
