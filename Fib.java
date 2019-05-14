/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if ( n == 0) { /// base case 1
            return 0;  // instructions for base case 1
        } else if ( n == 1) { // base case 2
            return 1;         // instructions for base case 2
        } else {                            // recursive case
            return fib_recurrence( n - 1)   // recursive abstraction
                  + fib_recurrence( n - 2); // leftover combination and recursive abstraction
                                            // instructions for recursive case
        } 
    }
     /* These are class methods because...
        these methods do not rely on the instance of the class but rather the
        parameter values which they use to calculate the value.
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        long num = 0;
        long nextNum = 1;
        long tempNum;
        for ( int iteration = 0; iteration < n; iteration++) {
            tempNum = nextNum;
            nextNum = num + nextNum; 
            num = tempNum;
        }
        return num;
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count...
       
       Then cost of the the recurrence algorithm
       grows linearly 
       as the size of the problem increases,
       because the iterations of the for loop also goes up linearly
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double phi = ( 1 + Math.sqrt( 5)) / 2;
        double psi = ( 1 - Math.sqrt( 5)) / 2;
        return ( Math.pow( phi, n)
               - Math.pow( psi, n))
               / Math.sqrt( 5);
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count...
       
       Then cost of the the recurrence algorithm
       grows constant 
       as the size of the problem increases,
       because the same opertions of Math.pow and Math.sqrt are used to 
       complete the work independent of the size of n.
     */
}
