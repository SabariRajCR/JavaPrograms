package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;


public class ReadJSON {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, IOException, ParseException {
		String value="";
		Object js = new JSONParser().parse(new FileReader("./SmokeSuite.json"));
		
	JSONObject json = (JSONObject) js;
		
		System.out.println(json.get("CheckboxControlNum"));
		Object jObj = json.get("Common_Data");
		@SuppressWarnings("unchecked")
		HashMap<String, ArrayList<String>> map1 = (HashMap<String, ArrayList<String>>) jObj;
		// Object input=map1.get(data);
		// HashMap<String, ArrayList<String>> parseData= (HashMap<String,
		// ArrayList<String>>) input;
		for (Entry<String, ArrayList<String>> entry : map1.entrySet()) {
			for (int i = 0; i < entry.getValue().size(); i++) {
				value = entry.getValue().get(i);
				// value.add(val);
			}
		}
		System.out.println(" " + value);
		
	}

}
