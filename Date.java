package date;
import java.util.Scanner;

public class Date {
	public String Month;
	public int Day;
	public int Year;
	
	public void Out(){
		System.out.println(Day+" "+getMonth()+" "+Year+".");
		if(Ok(this.Day, this.getMonth(), this.Year)){
			System.out.println(this.Day+" "+this.getMonth()+" "+this.Year+" "+"right date");
		}
		else {
			System.out.println("Fatal error");
			System.exit(0);
		}
		
	}
	
	public void NewYear() {
		if(Day == 1 && Month.equals("January")){
			System.out.println("It's new Year!");
		}
		else{
			System.out.println("It's not new year");
		}
	}
	
	public void In(){
		Scanner InS = new Scanner(System.in);
		System.out.println("Enter date");
		Day = InS.nextInt();
		Month = InS.next();
		Year = InS.nextInt();
		
	}
	public int getDay(){
		return Day;
	}
	public int getYear() {
		return Year;
	}
	public int getMonth() {
		if (Month.equals("January")){
			return 1;			
		}
		else if (Month.equals("February")){
			return 2;
		}
		else if (Month.equals("March")){
			return 3;
		}
		else if (Month.equals("April")){
			return 4;
		}
		else if (Month.equals("May")){
			return 5;
		}
		else if (Month.equals("June")){
			return 6;
		}
		else if (Month.equals("July")){
			return 7;
		}
		else if (Month.equals("August")){
			return 8;
		}
		else if (Month.equals("September")){
			return 9;
		}
		else if (Month.equals("October")){
			return 10;
		}
		else if (Month.equals("November")){
			return 11;
		}
		else if (Month.equals("December")){
			return 12;
		}
		else {
			System.out.println("Fatal error");
			System.exit(0);
			return -1;
		}
		
	}
	public int getNext(){
		return Year+1;
	}
	public void Greet(){
		while (Day >0){
			System.out.println("Hello!");
			Day--;
		}
	}
	public boolean Ok(int day, int month, int year){
		return (this.Day > 0 && this.Day <31 && this.getMonth()> 0 && this.getMonth() < 12 );
	}
	
}
