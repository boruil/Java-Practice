import java.io.*;
import java.util.*;


class EditedBookFile {
	public static void main(String[] args) throws FileNotFoundException {
	PrintStream output = new PrintStream(new File("*TextBookFile.txt"));
	Scanner scan = new Scanner(new File("Better_Textbook.txt"));
	Set<String> memo = new HashSet<String>();
	
	while (scan.hasNextLine()) {
		String course = scan.nextLine();
		String name = scan.nextLine();
		String author = scan.nextLine();
		String price = scan.nextLine();
		if (memo.add(course)) {
			output.println("*" + course);
			output.println(name);
			output.println(author);
			output.println(price);
		} else {
			output.println(name);
			output.println(author);
			output.println(price);
		}
	}
	}
}