/*The command line argument is the argument passed to a program at the time when you run it. 
 *  it provides a convenient way to check the behavior of the program for the different values
 */
package converting;
//here we cretaed package as converting which that organizes a set of related classes and interfaces.
public class Commandline {

	public static void main(String[] args) {
				//public : it can be called from anywhere.
				//static : doesn't belong to a specific object.
				//void : returns to no value.
				//main : is special because it will start the program.
			// to give command line arguments in Eclipse right click on the blank space->go to run as ->run configuration->

				//then in the program arguments section provide arguments separated by space.
		Integer firstNumber=new Integer(args[0]);
		//here it takes the value which we passed in the index arguments 
		Integer secondNumber=Integer.parseInt(args[3]); 
		//here in two ways we can  read integer value
		System.out.println("given arguments are :60 79 21 84 ");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.

		System.out.println("the output is :");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.

		System.out.println(firstNumber+" "+secondNumber);
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
		// here  it prints the values of index of size zero and of index size three

		System.out.println( firstNumber + secondNumber );//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
		// here it adds the two values of the given arguments
		//Inside the brackets is value which to be printed			    

   		   // Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber)

   		   // = Integer.parseInt("12") + Integer.parseInt("30")

   		   // = 12 + 30 = 42

   		   // Because + = ADD when used on integers

	} // otherwise  a  "12" + "30" = "1230" 

// Because + = concatenate when used on strings





}
