
public class Tracer {
	
	static boolean isOn = false;

	public static void trace(String s) {
		if (isOn) {
			System.out.println(s);
		} else {
			System.out.println("Keine Ausgabe.");
		}
	}
	
	public static void trace(String format, Object...args) {
		if (isOn) {
			System.out.printf(format, args);
			System.out.println();
		} else {
			System.out.println("Keine Ausgabe.");
		}
	}
	
	public static void on() {
			isOn = true;
	}
	
	public static void off() {
		isOn = false;
	}
	
}
