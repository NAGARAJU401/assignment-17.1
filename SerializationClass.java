package employ;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {
	//Serializible is a marker interface(has no data member and method)It is used to mark java classes
	//that objects of thee classes may be get certain capability.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		Employee emp = new Employee();
	    //here creating the EmployeeClass object which implemented  the  serializable interface
	    emp.firstName ="Nagaraju";//first  and last name of the employee
	    emp.lastName = "Adepu";
	  
	    try {
	    	/*the code is prone to exceptions is placed in the try block
	    	 *when exception occurs that exception occurred is handled by the 
	    	 *catch block associated with it
	    	 */
	      FileOutputStream fileOut = new FileOutputStream("D:/employee.txt");
	      //creating an object of fileOut and assigning the path of text file
	      ObjectOutputStream out = new ObjectOutputStream(fileOut);
	      out.writeObject(emp);//here we are passing the object of the employee
	      out.close();//here closing the object output stream
	      fileOut.close();// and here file of output stream
	      System.out.println("Serialized data is saved in D:/employee.txt file");
	      //gives the output as the  serialization file saved successfully
		  System.out.println("First Name:"+emp.firstName);
		  //gives the output as the  serialization file saved successfully
		  //displays the second name of the employee
	      System.out.println("Last Name:"+emp.lastName);
	      
	    } catch (IOException i)  {
	      i.printStackTrace();//prints stack trace for this throwable object
	    }
	}

}
