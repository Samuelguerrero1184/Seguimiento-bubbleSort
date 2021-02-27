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
			 //reading input
			line = br.readLine();
			String [] agesLine = line.split(" ");
			double[] ages = new double[agesLine.length];
			//casting values to int 
			for (int x = 0; x<agesLine.length; x++) {
				ages[x]= Double.parseDouble(agesLine[x]);
			}
			//sorting
			double numcambios = 0;
			double numpasadas = 0;
			for (int p = ages.length-1; p>0;p-- ) {
				for(int q = 0; q<p ;q++) {
					if (ages[q]>ages[q+1]) {
						double temp = ages[q];
						ages[q] = ages[q+1];
						ages[q+1] = temp;
						numcambios++;
					}
				
				}
				numpasadas++;
			}
			double promedio = numcambios/numpasadas;
			String separador = "-";
			String concat = "" + formato1.format(promedio);
			for (int x = 0; x<ages.length; x++) {
				concat += separador + ages[x];
				separador =" ";
				}
			
			concat = concat + "\n";
			bw.write(concat);
			//ending the cycle
					 }
		 br.close();
		 bw.close();
		
		 }
		 
		

	}