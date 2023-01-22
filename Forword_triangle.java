 package java_string;

public class Forword_triangle {

	public static void main(String[] args) {

		
		//forward facing increasing triangle 
		int n=5;
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(ch+++"");
			}
			System.out.println();
		}
	}

}