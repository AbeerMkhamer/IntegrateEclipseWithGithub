package random;
import java.util.Random;
public class RandomInteger {

	public static void main(String[] args) {
		
Random randNumbers=new Random();
int face;
for(int counter=1;counter<=20;counter++){
	face=1+randNumbers.nextInt(6);
	System.out.printf("%d",face);
	
	if(counter%5==0)
		System.out.println();
}
	}

}
