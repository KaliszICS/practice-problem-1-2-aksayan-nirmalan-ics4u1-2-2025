public class PracticeProblem {
	
	public static boolean validIndex(int[]array,int index) {
		try{
			int data = array[index];
			return true;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}
	public static int divide(int first,int second){
		try{
			int value= first/second;
			return value;
		}
		catch(ArithmeticException f) {
			return 0;
		}
	}
	public static int safeConvertStringtoInt(String String){
		try{
			int num1=Integer.parseInt(String);
			return num1;
		}
		catch(NumberFormatException g) {
			return 0;
		}
	}
}
