package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import etities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		String path = "/home/kaio/Documentos/sample.txt";
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			String line = bf.readLine();
			while(line != null) {
				String [] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = bf.readLine();
			}
			Product x = CalculationService.max(list);
			
			for(Product item : list) {
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
