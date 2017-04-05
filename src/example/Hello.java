
package example;

import org.apache.commons.lang.WordUtils;

public class Hello {
    public static void main(String[] args) {
	int monmax = 0;
	CSVReader reader = new CSVReader(new FileReader("data.csv"));
	List<String[]> myEntries = reader.readAll();
	System.out.println("Nombre dans le list : "+myEntries.size());
	 for(int i = 0; i < myEntries.size(); i++){
		System.out.println("Élément à l'index " + i + " = " + myEntries.get(i));
		if (monmax < myEntries.get(i)){
			monmax = myEntries.get(i);
		}
	}
	
	System.out.println("Max : " + monmax);
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
    }
}
        
