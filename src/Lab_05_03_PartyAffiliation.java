public class Lab_05_03_PartyAffiliation {
    public static void main(String[] args){
        //class PolParty
        //	Main()
        //		String partAfil = “”
        //		output “What is your political party? Democrat [D], Republican [R], or Independent [I]? ”
        //		input partyAfil
        //		if partyAfil == D then
        //			output “You are a Donkey”
        //		else if partyAfil == R then
        //			output  “You are an Elephant”
        //		else if partyAfil == I then
        // 			output “You are a Person”
        // 		else
        // 			output “Invalid selection” + partyAfil  “Enter D,N, or I ”
        //  		end if
        // 	return
        // end class
        String partyAfil = "I";
        System.out.println("What is your political party Democrat [D], Republican [R], or Independent [I]?");
        System.out.println("My affiliation is [" + partyAfil + "].");
        if (partyAfil.equalsIgnoreCase("D")){
            System.out.println("You are a donkey.");
        }
        else if (partyAfil.equalsIgnoreCase("R")) {
            System.out.println("You are an elephant.");
        }
        else if (partyAfil.equalsIgnoreCase("I")) {
            System.out.println("You are a person.");
        }
        else{
            System.out.println("Invalid selection" + partyAfil + "Enter [D,R, or I");
        }
    }
    }
