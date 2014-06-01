import java.io.*;
import java.util.*;

class RemoveDuplicates {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream output1 = new PrintStream(new File("RemovedFile.txt"));
		PrintStream output2 = new PrintStream(new File("BadContents.txt"));
		
		Scanner scan = new Scanner(new File("Textbook.txt"));
		Map<String, Integer> counter = new HashMap<String, Integer>();
		Set<String> memo = new HashSet<String>();
		
		while (scan.hasNextLine()) {
			String course = scan.nextLine();
			if (counter.containsKey(course)) {
				counter.put(course, counter.get(course) + 1);
			} else {
				counter.put(course, 1);
			}
			String name = scan.nextLine();
			String author = scan.nextLine();
			String price = scan.nextLine();
			
			String group = course + name + author + price;
			if (memo.add(group)) {
				output1.println(course);
				output1.println(name);
				output1.println(author);
				output1.println(price);
			} else {
				output2.println(course);
				output2.println(name);
				output2.println(author);
				output2.println(price);
			}
			
			
		}
		int max = 0;
					for (String nameeee : counter.keySet()) {
						if (counter.get(nameeee) > max) {
							max = counter.get(nameeee);
						}
					}
					
					System.out.println(max);
	}
}