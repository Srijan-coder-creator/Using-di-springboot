package com.example.Vaccination;

/**
   This class is an implementation of vaccine Interface based on the selection 
   of type of vaccine this should be injected as a dependency into the user.To complete
   this class you need to perform the following task.

   Tasks:
    a.Override the methods of Vaccine Interface.
    b.Build the logic for all the methods based on the description 
    mentioned in the Vaccine Interface.
    
**/
public class Typhoid implements Vaccine{
	 @Override
	    public String getType() {
	        return "Typhoid";
	    }
}
