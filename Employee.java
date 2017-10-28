package employ;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
import java.io.Serializable;
//Serializible is a marker interface(has no data member and method)It is used to mark java classes
//that objects of thee classes may be get certain capability.

public class Employee  implements Serializable {
	
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.
public String firstName;
	   //String is a sequence a characters.
	   //firstName is String
	   public String lastName;
	 //lastName is String
	   private static final long serialVersionUID = 5462223600l;
	   //a private member is only accessible within the same class as it is declared
	   //static is used for memory management
	   //final is used in several different contexts to define an entity that can only be assigned once
	   //long is used to store 64 bit integer/ it reserved words which have specified meaning relevant to a complier
	   //serialVersionUID is a static final field.We can assign any number of our choice to it. This is must in serialization
	
}
