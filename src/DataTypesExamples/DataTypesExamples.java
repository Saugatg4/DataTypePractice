package DataTypesExamples;

public class DataTypesExamples {
public static void main (String[]args) {
	
	int x = 10;
	x = 2_000_000;
	
	long y = 2000000000L;
	
	short LargestShort = Short.MAX_VALUE;
	System.out.println("Largest short value is " + LargestShort);
	
	byte b = -128;
	byte LargestByte = Byte.MAX_VALUE;
	System.out.println("Largest short value is " + LargestByte);
	byte ShortestByte = Byte.MIN_VALUE;
	System.out.println("Shortes short value is " + ShortestByte);
	
	
	
}
}