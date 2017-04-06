
package example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.lang.Object;
import java.io.*;
//import org.opencsv.CVSReader;
import com.opencsv.CSVReader;
import org.apache.commons.lang.WordUtils;

public class Hello {
    public static void main(String[] args) {
	int monmax = 0;
	try {
	CSVReader reader = new CSVReader(new FileReader("data.csv"));
	List<String[]> myEntries = reader.readAll();
	System.out.println("Nombre dans le list : "+myEntries.size());
	 for(int i = 0; i < myEntries.size(); i++){
		System.out.println("Élément à l'index " + i + " = " + myEntries.get(i));
		/*if (monmax < myEntries.get(i)){
			String s = Arrays.asList(myEntries.get(i)).toString();
			Integer m = new Integer(s);
			monmax = m.intValue();
		}*/
	}

	} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	System.out.println("Max : " + monmax);
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
    }
}
        
