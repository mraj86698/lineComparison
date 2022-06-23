package lineComp;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation program on Master Branch");
		int x1=3;
		int x2=9;
		int y1=9;
		int y2=3;
		double line_length = Math.floor(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
		System.out.println("Length of a Line is "+line_length);
	}

}
