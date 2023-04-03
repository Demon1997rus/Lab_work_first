package lab_work_first;


public class ProgramFirst {

	public static void main(String[] args) 
	{
		System.out.println("Таблица перевода из Цельсия в Форенгейт");
		int begin_c = 15;
		int end_c = 30;
		double F = 0;

		do {
			F = 0;
			F = 1.8*begin_c + 32;
			System.out.println(begin_c + " Цельсий - " + F + " Форенгейт");
			begin_c++;
		} while(begin_c <= end_c);	
		
	}

}
