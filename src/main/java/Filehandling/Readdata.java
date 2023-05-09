package Filehandling;


	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

	public class Readdata {
		
		String filepath = "C:\\Users\\saranya\\eclipse-workspace\\mavenProject\\inputfile\\besant.txt";
		public void Readdataonechar() throws IOException
		{
			File F = new File(filepath);
			FileInputStream FI = new FileInputStream(F);
			System.out.println((char)FI.read());
			
		}
		
		public static void main(String[] args) throws IOException
		{
			Readdata R = new Readdata();
			R.Readdataonechar();
		}
	}