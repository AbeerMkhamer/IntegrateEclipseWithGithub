package random;

public class RandomInteger2 {

	public static void main(String[] args) {
		int face;
		for(int i=1;i<=20;i++){
			face=1+(int)(6*Math.random());
			System.out.printf("%d",face);
			if(i%5==0)
				System.out.println();
		}

	}

}
