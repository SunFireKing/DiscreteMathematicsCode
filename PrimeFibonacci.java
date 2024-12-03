public class MyProgram {
    public static void main(String[] args) {
        int num_primes = createFibonacci(150);
        System.out.println("Number of primes in Fibonacci sequence: " + num_primes);
    }

    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n == 2) return true; 
        if (n % 2 == 0) return false;

        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false; // Found a divisor, not prime
        }

        return true; // No divisors found, it's prime
    }

    public static int createFibonacci(int num_of_fib) {
        long prev_val = 0; // First Fibonacci number
        long curr_val = 1; // Second Fibonacci number
        long next_val;
        int number_of_primes = 0;

        for (int i = 1; i <= num_of_fib; i++) {
            next_val = prev_val + curr_val; // Compute next Fibonacci number
            // System.out.println("Fibonacci number: " + next_val);

            if (isPrime(next_val)) {
                number_of_primes++;
                // System.out.println(next_val + " is prime.");
            }

            // Update Fibonacci sequence values
            prev_val = curr_val;
            curr_val = next_val;
        }

        return number_of_primes;
    }
}
