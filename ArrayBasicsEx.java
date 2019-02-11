package arrayBasic;

public class ArrayBasicsEx {

	public static void main(String[] args) {

		int a = 100;
		int b= 200;
		int c =300; //LOC - 3 lines
		
		int a1 =100, b2=200, c2=300; //LOC -1 line
		
		int[] array = {100, 200, 300};//LOC - 1 line, single reference - Continguous
		// Code optimzation, index (0 to length-1) - Random access - search performance
		System.out.println("2nd::::"+array[1]);
		
		int[] arrays1 = new int[5];
		System.out.println("Size 1: "+arrays1.length);
		
		arrays1[0] = 1;
		arrays1[1] = 2;
		arrays1[2] = 3;
		arrays1[3] = 4;
		arrays1[4] = 5;
		//arrays1[4] = "String";//Homogenious data - compiletime exception
		//arrays1[5] = 6; size is static in nature - 
		//memory wastage or memry shortage
		//arrays1[4] = 'C'; //67
		
		//arrays1[4] = 10.2f;
		//arrays1[5] = 6;
		
		for(int i=0; i<arrays1.length; i++){
			System.out.println("Arrays Values : "+arrays1[i]);
		}
		
		System.out.println("Arrays Value at index 3 : "+arrays1[3]);
		
		int[] arrays2 = {1,2,3,4,5,6};
		System.out.println("Size 2: "+arrays2.length);
		for(int i=0; i<arrays2.length; i++){
			System.out.println("Arrays2 Values : "+arrays2[i]);
		}
		
		System.out.println("Arrays2 Value at index 3 : "+arrays2[3]);
		
	}

}
