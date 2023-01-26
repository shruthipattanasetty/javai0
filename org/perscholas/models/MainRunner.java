package org.perscholas.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MainRunner {
	public static void main(String[] args)  {
		String location = "C:\\Users\\spatt\\Downloads\\cars.csv";
		File fin = new File(location);
		System.out.println(fin.exists());
		LinkedList<Character> data = new LinkedList<>();
		ArrayList<Cars> carList = new ArrayList<>();
		try(FileReader fr = new FileReader(fin);BufferedReader bf = new BufferedReader(fr);){
			bf.readLine();
			String[] oneLineOfData = bf.readLine().split(",");
			System.out.println(Arrays.toString(oneLineOfData));
			Cars cObj = new Cars(
					oneLineOfData[0],
					Double.parseDouble(oneLineOfData[1].strip()),
					Double.parseDouble(oneLineOfData[2].strip()),
					Double.parseDouble(oneLineOfData[3].strip()),
					Double.parseDouble(oneLineOfData[4].strip()),
					Double.parseDouble(oneLineOfData[5].strip()),
					Double.parseDouble(oneLineOfData[6].strip()),
					Double.parseDouble(oneLineOfData[7].strip()),
					oneLineOfData[8]);
			System.out.println(cObj);
			carList.add(cObj);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
