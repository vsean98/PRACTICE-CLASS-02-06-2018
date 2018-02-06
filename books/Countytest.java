package books;

import java.util.Scanner;

public class Countytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the County name");    
        Scanner county=new Scanner(System.in);
        String  anwser=county.nextLine();
        

		System.out.println("Please enter the county population name");    
        Scanner countyPopulation=new Scanner(System.in);
        int anwser2=countyPopulation.nextInt();
		    
        
        

		System.out.println("Please enter the County year established name");    
        Scanner countyyearestablished=new Scanner(System.in);
        int  anwser3=countyyearestablished.nextInt();
        
        

		System.out.println("Please enter the County land value name");    
        Scanner countylandvalue=new Scanner(System.in);
        int anwser4=countylandvalue.nextInt();
        
        System.out.println(anwser);
        System.out.println(anwser2);
		System.out.println(anwser3);
		System.out.println(anwser4);
	}

}
