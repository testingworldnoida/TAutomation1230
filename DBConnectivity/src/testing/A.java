package testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {

	public void calculation(){
	
	  try
	  {
		File f = new File("D:\\file33W1.txt");
		FileReader fr = new FileReader(f);
		System.out.println("DONE..");
	  }
	  catch(FileNotFoundException e){
		 System.out.println("Snapshot1"); 
	  }
	  catch(NullPointerException e){
			 System.out.println("Snapshot2"); 
	 }
	  catch(Exception e){
			 System.out.println("Snapshot3"); 
		  }
	  
	  finally
	  {
	  System.out.println("END");
	  }
	}
	
}
