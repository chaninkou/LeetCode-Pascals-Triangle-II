package leetcode119;

import java.util.List;

public class Main {
	public static void main(String[] args) {

		PascalTriangleSolution triangle = new PascalTriangleSolution();
		
		int input = 4;
		
		System.out.println("Input: " + input);
		
		List<Integer> tree = triangle.getRow(input);
		
		System.out.println(tree);
		

	}
}
