package idgenerator;

import java.util.List;

import com.mifmif.common.regex.Generex;
import com.mifmif.common.regex.util.Iterator;

public class IdGenerator {
	
	public static void main(String[] args) {
		Generex generex = new Generex("[a-z][2-9][a-z][2-9]");

		String randomStr = generex.random();
		System.out.println(randomStr);

		/*
		Using a Generx Iterator to get all matched strings to the above regular
		expression and printing them one by one
		List<String> matchedStrs = generex.getAllMatchedStrings();
		Iterator iterator = generex.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		*/
	}
}
