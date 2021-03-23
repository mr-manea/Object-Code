//this class will be about me and my group
public class Object {
	String FirstName;
	String SecoundName;
	String Code;
	String ID;

	 //object constructor

Object (String newFirstName,String newSecoundName,String newCode,String newID){
                  	
	 FirstName   = newFirstName;
	 SecoundName = newSecoundName;
	 Code = newCode;
	 ID = newID;
 }
   
   String getName(){
	   String Name;
	   Name = FirstName + SecoundName;
	   return Name;
   }
   String getCode(){
	   return Code;
   }
   String getID(){
	   return ID;
   }

   }
