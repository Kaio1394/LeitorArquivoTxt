package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		String path = "/home/kaio/Documentos/sample.txt";
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			String line = bf.readLine();
			while(line != null) {
				list.add(Integer.parseInt(line));
				line = bf.readLine();
			}
			Integer x = CalculationService.max(list);
			
			for(Integer item : list) {
				System.out.print(item + ", ");
			}
			System.out.println();

			System.out.print("Max: ");
			System.out.println(x);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
