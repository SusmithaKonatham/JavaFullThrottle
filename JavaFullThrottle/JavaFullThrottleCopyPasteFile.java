// Java Full Throttle Copy/Paste File
// Updated April 28, 2018

// Chapter numbers correspond to the chapters of Java How to Program, 11/e, Early Objects Version


// In JShell
/set feedback verbose

/***************************************************************
* Chapter 1: Test Drive
***************************************************************/


/***************************************************************
* Chapter 2: Intro to Java
***************************************************************/


/***************************************************************
* Chapter 3: Intro to Classes
***************************************************************/


/***************************************************************
* Chapter 4: Control Statements 1
***************************************************************/
int grade = 80

// if statement
if (grade >= 60) {
   System.out.println("Passed");
}


// if/else
if (grade >= 60) {
   System.out.println("Passed");
} else {
   System.out.println("Failed");
}


// nested if/else
if (grade >= 90) {
   System.out.println("A");
} else if (grade >= 80) {
   System.out.println("B");
} else if (grade >= 70) {
   System.out.println("C");
} else if (grade >= 60) {
   System.out.println("D");
} else {
   System.out.println("F");
}


// while: first power of 3 greater than 100
int product = 3;

while (product <= 100) {
   product = 3 * product;
}


// Conditional Expression
int grade = 80;
System.out.println(grade >= 60 ? "Passed" : "Failed");


/***************************************************************
* Chapter 5: Control Statements 2
***************************************************************/
// for
for (int counter = 1; counter <= 10; counter++) {
   System.out.printf("%d  ", counter);           
}


// do/while
int counter = 1; 

do {                                  
   System.out.printf("%d  ", counter);
   ++counter;                         
} while (counter <= 10);              




/***************************************************************
* Chapter 6: Methods
***************************************************************/


/***************************************************************
* Chapter 7: Arrays and ArrayLists
***************************************************************/



/***************************************************************
* Chapter 8: Classes--A Deeper Look
***************************************************************/


/***************************************************************
* Chapter 9: Inheritance
***************************************************************/
Object class documentation
https://docs.oracle.com/javase/11/docs/api/java/lang/Object.html 


/***************************************************************
* Chapter 10: Polymorphism
***************************************************************/


/***************************************************************
* Chapter 11: Exception Handling
***************************************************************/


/***************************************************************
* Chapter 12: JavaFX 1
***************************************************************/


/***************************************************************
* Chapter 13: JavaFX 2
***************************************************************/


/***************************************************************
* Chapter 16: Generic Collections
***************************************************************/
// JSHELL: Type Wrappers
Integer x = new Integer(7);
x.<tab> // shows methods


// JSHELL: boxing
Integer x = 7;
x
int y = x;
y
	
	

/***************************************************************
* Chapter 17: Lambdas and Streams
***************************************************************/
// Fig. 17.7 modified pipeline
IntStream.rangeClosed(1, 10) 
         .filter(
            x -> {
               System.out.printf("%nfilter: %d%n", x);
               return x % 2 == 0;
            })
         .map(
            x -> {
               System.out.println("map: " + x);
               return x * 3;
            })
         .sum()     
			
/***************************************************************
* Chapter 23: Concurrency and Parallel Streams
***************************************************************/