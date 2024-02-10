package generateRandomNumber;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int n = 5;
		int[] randomNumbers = generateRandomNumbers(500);
		int nthSmallest = findNthSmallest(randomNumbers, n);
		
		System.out.println("Generate random numbers; " + Arrays.toString(randomNumbers));
		System.out.println("The " + n + "th smallest number is: " + nthSmallest);
	
		}
    public static int[] generateRandomNumbers(int count) {
    	int[] randomNumbers = new int[count];
    	Random random = new Random();
    	
    	for (int i = 0; i < count; i++) {
    		randomNumbers[i] = random.nextInt(500);
    	}
		return randomNumbers;
    }
    
    private static int findNthSmallest(int[] arr, int n) {
    	Arrays.sort(arr);
    	return arr[n - 1];
    	
    	}
    }
	


