# Lesson 5: Loops

Goal: Repeat code using while and for loops.

Time: About 30-40 minutes

You will learn:

- Why loops exist
- while loops (repeat while a condition is true)
- for loops (repeat a known number of times)
- How to avoid infinite loops
Before this lesson: Lessons 1-4 (main, variables, math, if / comparisons).

Sample code file (separate):

---

## Why this matters for robots

Autonomous routines often repeat: drive a bit, check sensors, drive again. Teleop code on the robot runs over and over in a periodic loop. First you learn the Java loop tools in a simple console program.

## The big idea

A loop runs a block of code more than once until a condition says stop.

You already know how to check a condition with if. A loop keeps checking and repeating.

### while loop

```java
int count = 3;
```



```java
while (count > 0) {
    System.out.println("Countdown: " + count);
    count--;
}
```



```java
System.out.println("Go!");
```



Output:

```java
Countdown: 3
Countdown: 2
Countdown: 1
Go!
```



while (count > 0): Keep looping as long as this is true

{ ... }: Body - runs each time

count--: Must change something, or the condition never becomes false

### Infinite loops

If the condition never becomes false, the loop never ends:

```java
while (true) {
    System.out.println("Forever");  // stop the program / fix the condition
}
```



Always make sure the loop variable changes toward the stop condition.

### for loop

Use for when you know how many times to repeat (or you are counting through a range).

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Shot attempt " + i);
}
```



Output:

```java
Shot attempt 1
Shot attempt 2
Shot attempt 3
Shot attempt 4
Shot attempt 5
```



int i = 1: Start: create counter i at 1

i <= 5: Keep going while this is true

i++: After each pass, add 1 to i

This for loop does the same kind of work as a while with a counter - just in one line of setup.

### for vs while

Repeat N times / count 0..N: for

Repeat until a condition changes (sensor, flag): while

Both are valid; pick the one that reads more clearly.

### Loops and if together

You can put an if inside a loop:

```java
for (int match = 1; match <= 3; match++) {
    System.out.print("Match " + match + ": ");
    if (match == 2) {
        System.out.println("our bye");
    } else {
        System.out.println("play");
    }
}
```



### Common mistakes

- Infinite loop - forgot to update the counter / condition
- Off-by-one - i < 5 vs i <= 5 (4 times vs 5 times)
- Semicolon after while - while (x > 0); { } loops on an empty statement
- Using = instead of == or <= in the condition
- Declaring the counter outside and forgetting to reset it if you run another loop
---

## Try it yourself

Edit `Main.java`. Put **all** challenge code inside `main`.

### Challenge 1 - while countdown

Start at `5`. While greater than `0`, print the number, then subtract `1`. After the loop print `Launch`.

### Challenge 2 - for practice laps

Use a `for` loop to print:

```
Practice lap 1
Practice lap 2
Practice lap 3
Practice lap 4
```

### Challenge 3 - Sum with a loop

Add `1` through `4` into `int total` (start at `0`). Print `total` (`10`).

### Challenge 4 - Loop + if

Loop `i` from `0` to `5`. Print `even: ` + i or `odd: ` + i using `i % 2`.

## Check your understanding

1. <details>
     <summary>What has to become false for a `while` loop to stop?</summary>
     The condition in the parentheses.
   </details>
2. <details>
     <summary>In `for (int i = 0; i < 3; i++)`, how many times does the body run?</summary>
     Three times (`i` is 0, 1, 2).
   </details>
3. <details>
     <summary>What is an infinite loop?</summary>
     A loop whose condition never becomes false.
   </details>
4. <details>
     <summary>When would you pick `for` over `while`?</summary>
     When you are counting a known range / repeating N times.
   </details>

## Looking ahead

In Lesson 6, you will wrap work into methods so main can call named recipes (greet, add, later driveForward) instead of repeating big blocks.

Lesson complete. When you can write a while loop and a for loop without hanging the program, you are ready for Lesson 6.
