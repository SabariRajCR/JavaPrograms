package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("./property.properties");
		
		Properties prop =new Properties();
		prop.setProperty("1", "Sabari");
		prop.setProperty("2", "Sabari");
		prop.store(fos, null);
	//	prop.setProperty("1", "sa");
		

	}

	
}
