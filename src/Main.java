
public class Main {

	public static void main(String[] args) {

		Tracer.trace("Lorem ipsum");
		Tracer.on();
		Tracer.trace("Start");
		int i = 2;
		Tracer.off();
		Tracer.trace("i = %d", i);
		Tracer.on();
		Tracer.trace("i = %d", i);
		Tracer.trace("End");
	}

}
