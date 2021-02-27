package model;
import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat formato1 = new DecimalFormat("#.0#");
		formato1.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));

		formato1.setRoundingMode(RoundingMode.FLOOR);

		//reads first input line
		String line = br.readLine();
		
		int n = Integer.parseInt(line);
		 for (int i = 0; i<n; i++) {
			 //reading imput
			line = br.readLine();
			String [] agesLine = line.split(" ");
			double[] ages = new double[agesLine.length];
			//casting values to int 
			for (int x = 0; x<agesLine.length; x++) {
				ages[x]= Double.parseDouble(agesLine[x]);
			}
					 }
		 br.close();
		 bw.close();
		
		 }
		 
		

	}