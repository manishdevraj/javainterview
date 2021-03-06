package geeks.in.action.java.arr;

/**
 * Find missing number in an array
 * 
 * @author manishdevraj
 * 
 */
public class MissingNumArray {

	public Number findMissingNumber(Number[] numArray) {
		int size = numArray.length;
		Number missingNum;
		Number missingIndex;// return this as index if required
		long sum = 0;
		for (int i = 0; i < size; i++) {
			if (numArray[i].intValue() == 0) {
				missingIndex = new Integer(i);
			} else {
				sum += numArray[i].longValue();
			}
		}
		missingNum = ((size + 1) * size) / 2 - sum;
		return missingNum;
	}

	public int findMissingNumberBitWise(int[] numArray) {
		int size = numArray.length;
		int XOR = 0;
		for(int i=0; i< size; i++) {
			if (numArray[i] != 0)
				XOR ^= numArray[i];
			XOR ^= (i + 1);
		}
		return XOR;
	}

}
