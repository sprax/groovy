#!/usr/bin/groovy
// Sprax Lines
// Adapted from: https://vasya10.wordpress.com/2012/01/10/groovy-olc-1/

bound = 100
if (args.length > 0)
    bound = args[0].toInteger()

maxBound = 100000
if (bound < 1 || bound > maxBound) {
    printf("Upper bound %d is invalid; setting it to %d.\n",
        bound, maxBound)
    bound = maxBound
}

printf "All prime numbers <= %d computed by a Groovy One-Liner-Closure:\n", bound
twoAsList = [2]
oddPrimes = odd_prime_numbers(bound)
println twoAsList + oddPrimes

List odd_prime_numbers(int bound) {
    def list = 3..bound
    return list.findAll { x -> (2..Math.sqrt(x)).every { x % it != 0 } }
}
 

