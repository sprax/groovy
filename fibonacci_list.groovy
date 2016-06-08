#!/usr/bin/groovy
// Sprax Lines

count = 36
if (args.length > 0)
    count = args[0].toInteger()

maxCount = 47
if (count > maxCount) {
    printf("Count %d is too big for 32-bit integers; setting count to %d.\n",
        count, maxCount)
    count = maxCount
}

printf "First %d Fibonacci numbers using a Groovy list:\n", count
def list = [0, 1]
printf "%3d  %d\n", 0, 0
for (j in 1..count-1) {
    fibnum = list.last()
    printf "%3d  %d\n", j, fibnum
    list << list.sum()
    list = list.tail()
}

