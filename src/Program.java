import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		
		
	String product1 = "Computer";
	String product2 = "Office desk";
	
	int age = 23;
	int code = 7777;
	char gender = 'M';
		
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	
	System.out.println("products:");
	System.out.printf("%s, which price is R$%.2f%n ", product1, price1);
	System.out.printf("%s, which price is R$%.2f%n ", product2, price2);
		IO.println();
	System.out.printf("RECORDE:%d years old, code %d and gender: %s%n", age, code, gender);
		IO.println();
	System.out.printf("Measure with eight decimal places: %.8f", measure);
	System.out.printf("%nRounded (three decimal places): %.3f%n", measure);
			Locale.setDefault(Locale.US);
	System.out.printf("US decimal point: %.3f", measure);
	}
}
