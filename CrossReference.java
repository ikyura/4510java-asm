/**
* Cross Reference Map
*
* I understand the meaning of academic dishonesty, in particular plagiarism, copyright infringement
* and collusion. I am aware of the consequences if found to be involved in these misconducts. I hereby
* declare that the work submitted for the "ITP4510 Data Structures & Algorithms" is authentic record
* of my own work.
*
* @Name : Chan Wing Lok	
* @StdID: 230020960
* @Class: IT114105/1D
* @2024-3-25
*/

import java.util.*;
import java.io.*;

public class CrossReference {

	private static final String
		DELIMITER = "\"(?:\\\\\"|[^\"])*?\"|[\\s.,;:+*/|!=><@?#%&(){}\\-\\^\\[\\]\\&&]+";

	public static String[] tokenizer(String javaStmt) {
		String[] tokens = javaStmt.split(DELIMITER);
		return tokens;
}
	public static void main(String [] args){
		String filename="";
		String line;
		kybst tree = new kybst();
		int count = 1;
	    String txt;

		try {
			filename = args[0];
			Scanner fin = new Scanner(new File(filename));
			System.out.println("SOURCE FILE:" + filename);

			while (fin.hasNextLine()) {
				System.out.printf("%04d", count);		 				//print file
				System.out.print(" | ");
				count++;
				line = fin.nextLine();
				System.out.println(line);				
			}
			System.out.println("");
			System.out.println("Cross Map Reference :");
			//String ans = tree.search(args[0]);
			//if(ans == null)
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage: java CrossReference <filename>");
		}
		catch (FileNotFoundException e) {
			System.out.println("Failed to open file " + filename);
		}
	}
}
