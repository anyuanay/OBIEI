package edu.drexel.cci.obiei.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args){
		
		//Pattern p = Pattern.compile("\\-?[0-9]+\\.?[0-9]+");
		
		Pattern p = Pattern.compile("[\\+\\-]{0,1}[0-9]*[\\,\\d{3}]*[0-9]*\\.?[0-9]+");
		
		String s = "entity is an entities 234 is 1,240,506.0 a number -12.34 a num6ber 455.00 not number 345.ed42";
		
		Matcher m = p.matcher(s);
		
		//if(m.lookingAt())
			//System.out.println("Matches");
		
		while(m.find()){
			//System.out.println(s.substring(m.start(), m.end()));	
			System.out.println(m.group());
		}
		
		String numstr = "1240506";
		
		System.out.println(numstr.replace(",", ""));
		
		double num = Double.parseDouble(numstr.replace(",", ""));
		System.out.println(num);
	}
}
