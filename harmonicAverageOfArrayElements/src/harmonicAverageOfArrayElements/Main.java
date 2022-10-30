package harmonicAverageOfArrayElements;

public class Main {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
        double result = 0;
        
        for(int number:numbers) {
        	for(int i=1; i<=number; i++) {
        		result+=(1.0/i);
        	}
        }
        
        System.out.println("Dizinin harmonik ortalamasý: "+(numbers.length/result));
	}

}
