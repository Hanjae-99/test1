package exam0607;

public class Util {
	public static <T> void print(T t){
		System.out.print(t + " ");
	}
	
	public static <T> void printWithPare(T t) {
		System.out.println("(" + t + ")");
	}
}
