package CSV_Controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FindLast {
	ArrayList<String> dayValArr = new ArrayList<String>();

	public FindLast() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> found() {
		String line = "";
		
		try {
			SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
			BufferedReader br = new BufferedReader(new FileReader("log.csv"));
			
			while((line = br.readLine()) != null) {
				
<<<<<<< HEAD
				if(line.contains("Work")) {
=======
				if(line.contains("Long Break")) {
>>>>>>> a88799de794c74c8bc40d6f7f304a30aaf1dbed5
					Date todayDay = new Date();
					
					if(line.contains(dateFormatter.format(todayDay))){
						dayValArr.add(line);
					}
				}
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dayValArr;
	}
}