package quiz01;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		double td, yds, intr, comp, att, rate;
		double a, b, c, d;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("How many Touchdowns did this QB get?: ");
		td = inp.nextInt();
		
		System.out.print("How many yards did this QB gain?: ");
		yds = inp.nextInt();
		
		System.out.print("How many interceptions did this QB allow?: ");
		intr = inp.nextInt();
		
		System.out.print("How many completions did this QB make?: ");
		comp = inp.nextInt();
		
		System.out.print("How many attempted completions did this QB make?: ");
		att = inp.nextInt();
		
		a = ((comp/att)-0.3)*5;
		if (a>2.375) a=2.375;
			else if (a<0) a=0;
		
		b = ((yds/att)-3)*0.25;
		if (b>2.375) b=2.375;
			else if (b<0) b=0;
		
		c = (td/att)*20;
		if (c>2.375) c=2.375;
			else if (c<0) c=0;
		
		d = 2.375-((intr/att)*25);
		if (d>2.375) d=2.375;
			else if (d<0) d=0;
		
		rate = ((a+b+c+d)/6)*100;
		
		System.out.printf("This QB's rating is: " + "%1.1f", rate);
		inp.close();
		}
		
	}
