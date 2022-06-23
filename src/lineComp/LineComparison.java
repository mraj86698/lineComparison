package lineComp;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation program on Master Branch");
		
		int x1=3;
		int x2=9;
		int y1=9;
		int y2=3;
		int x3=4;
		int x4=7;
		int y3=4;
		int y4=5;
		double line1_length = Math.floor(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
		double line2_length = Math.floor(Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2)));
		System.out.println("Length of a First Line is "+line1_length);
		System.out.println("Length of a Second Line is "+line2_length);
		
		Integer obj1 = new Integer((int)line1_length);
		Integer obj2 = new Integer((int)line2_length);
		System.out.println("These Lines length are equal "+""+obj1.equals(obj2));
		
	}

}
