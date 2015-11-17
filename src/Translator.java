import java.util.Scanner;

public class Translator {

	private static Scanner input;
	private static Scanner userchoice;

	public static void main(String[] args)
	{
		
		boolean finished;
		finished = false;
		
		while (finished == false)
		{	
			String input_text;
			String sentence;
			String code;
			String translate;
		
			System.out.println("Welcome to the morse code translator!");
		
			//Allows user to input text for translation.
			input = new Scanner(System.in);
			System.out.println("What word or phrase would you like to tranlsate?");
			input_text = input.nextLine();
		
			//Replace all character's (except the last one) with itself and an additional "/"
			sentence = input_text.toLowerCase().replaceAll(".(?=.)", "$0/").replaceAll(" ", "   ");
			
			//Add "/" to beginning and end of sentence
			code = "/" + sentence + "/";
			
			//Replace letters and numbers with corresponding morse code	
			translate = code.replaceAll("a", "._").replaceAll("b", "_...").replaceAll("c", "_._.").replaceAll("d", "_..").replaceAll("e", ".").replaceAll("f", ".._.").replaceAll("g", "__.").replaceAll("h", "....").replaceAll("i", "..").replaceAll("j", ".___").replaceAll("k", "_._").replaceAll("l", "._..").replaceAll("m", "__").replaceAll("n", "_.").replaceAll("o", "___").replaceAll("p", ".__.").replaceAll("q", "__._").replaceAll("r", "._.").replaceAll("s", "...").replaceAll("t", "_").replaceAll("u", ".._").replaceAll("v", "..._").replaceAll("w", ".__").replaceAll("x", "_.._").replaceAll("y", "_.__").replaceAll("z", "__..").replaceAll("0", "_____").replaceAll("1", ".____").replaceAll("2", "..___").replaceAll("3", "...__").replaceAll("4", "...._").replaceAll("5", ".....").replaceAll("6", "_....").replaceAll("7", "__...").replaceAll("8", "___..").replaceAll("9", "____.");
			
			//Display translation
			System.out.println(" ");
			System.out.println("In morse code that is:");
			System.out.println(translate);
		
			//User choice to translate new word/phrase
			String decision;
		
			while (finished == false)
			{ 
				System.out.println("Do you want to keep playing? (Y/N)");
				userchoice = new Scanner(System.in);
				decision = userchoice.next();
				decision = decision.toLowerCase();
		
					if (decision.equals("y"))
					{
						break;
					}
					else if (decision.equals("n"))
					{
						finished = true;
						break;
					}
			}
		}
		
	System.out.println("Thanks for using the morse code translator!");
		
	}
	
}
