package date;

public class Test {

	public static void main(String[] args) {
		Date date1 = new Date();
		Date date2 = new Date();
		date1.In();
		date1.Out();
		System.out.println("Next Year is ");
		System.out.println(date1.getNext());
		
	}

}
