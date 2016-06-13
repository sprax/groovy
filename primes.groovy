#!/usr/bin/groovy
// Sprax Lines
// Adapted from: https://vasya10.wordpress.com/2012/01/10/groovy-olc-1/

max = 100
if (args.length > 0)
    max = args[0].toInteger()

maxCount = 100000
if (max < 1 || max > maxCount) {
    printf("Upper bound %d is invalid; setting it to %d.\n",
        max, maxCount)
    max = maxCount
}

printf "All prime numbers <= %d computed by a Groovy One-Liner-Closure:\n", max
twoAsList = [2]
oddPrimes = odd_prime_numbers(max)
println twoAsList + oddPrimes

List odd_prime_numbers(int bound) {
    def list = 3..bound
    oddPrimes = list.findAll { x -> (2..Math.sqrt(x)).every { x % it != 0 } }
    return oddPrimes
}
 

