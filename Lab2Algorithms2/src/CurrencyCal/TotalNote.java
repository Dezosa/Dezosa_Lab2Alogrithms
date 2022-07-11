package CurrencyCal;

public class TotalNote {
	public void notecount(int notes[],int amount) {
		int[] noteCounter=new int[notes.length];
		
		for(int i=0;i<notes.length;i++){
			if(amount>=notes[i]) {
				noteCounter[i]=amount/notes[i];
				amount=amount-noteCounter[i]*notes[i];
				
			}
		}
		try {
		if(amount>0) {
			System.out.println("exact amount cannot be given with the highest denomination");
		}else {
			System.out.println("your payment approachin order to give min of notes will be ");
			for(int i=0;i<notes.length;i++)
			{
				if(noteCounter[i]!=0) {
					System.out.println(notes[i]+ ":" + noteCounter[i]);
				}
			}
		}
		}catch (ArithmeticException e) {
		System.out.println(e+"notes of denomination 0 is invalid");
	}
	
	}

}
