package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {
	
	public static void main(String[] args) throws IOException {
		
				
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));//mais simples que a burocracia acima
		bw.write("Lorem ipsum dolos sit amet, consectetur adipiscing elit, sed do eiusmod");		
		bw.write("\n");
		bw.write(System.lineSeparator());
		
		bw.write("sldfkjdlfksjlfkdsjf");
		
		
		
		
		
		bw.close();
		
	}
}

