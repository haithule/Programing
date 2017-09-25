/**
 * Execises to practice the basic syntax
 */
public class Basics {

    public static void main(String[] args) {
        // TODO: Write a Java program to print the sum of two numbers.

int a;
int b;
int c;
a=7;
b=9;
c=a+b;
System.out.println("sum of a and b");
System.out.print(c);
// this is how i did the sum of a and b. I define the int a and b, and add another int called c. Int c will be the sum of int a and b.
//then i insert the numbers of a and b and c will be a+b.



        // TODO: Write a Java program to divide two numbers and print on the screen. Use both integers and doubles.
int d;
int e;
int f;
d= 8;
e= 2;
f= d/e;
System.out.print('\n');
System.out.println("division of d and e");
System.out.print(f);
// I did this the same as the first exercise.

        // TODO: Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

int t;
int u;
int sum;
int mul;
int sub;
int div;
int rem;
t= 8;
u= 3;
sum=t+u;
mul=t*u;
sub=t-u;
div=t/u;
rem= t-u*div;
System.out.print('\n');
System.out. println("sum of t and u");
System.out.print(sum);
System.out.print('\n');
System.out.println("multiplication of t and u");
System.out.print(mul);
System.out.print('\n');
System.out.println("subtraction of t and u");
System.out.print(sub);
System.out.print('\n');
System.out.println("division of t and u");
System.out.print(div);
System.out.print('\n');
System.out.println("remainder of t and u");
System.out.print(rem);
// in this exercise I realize i need to add words in order for you to understand it easier. About the remainder, I used my math skills and apply it into the code. I used the remainder theorem, if a/b=c and r(remainder), then a=b*c+r

        // TODO: Write a Java program to swap two variables. Print the before and after switching.
        int z;
        int x;
        int temp;
        z= 6;
        x=9;
        System.out.print('\n');
        System.out.print("Variables z and x before being swapped ");
        System.out.print(z);
        System.out.print(x);
        temp=z;
        z=x;
        System.out.print('\n');
        System.out.println("variables z and x after being swapped");
        System.out.print(z);
        System.out.print(temp);
// For the 'before switching part', i used the print code right away and then swap the variables.
    }
}
