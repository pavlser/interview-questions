# LCM - Least Common Multiple

You are given two natural numbers A and B. Determine the positive natural number N such that the least common multiple of the numbers A + N and B + N is minimal.

Input: The only line of the input contains two natural numbers: A and B. None of them is exceeding 10^9.

Output: Output the positive natural number N such that LCM(A + N, B + N) is minimal. If there are several values of N which yield the minimum, output the smallest one.

## Sample
Input | Output
---   | --- 
4, 10  | 2

Author | Owner | Level | Time limit (seconds)
--- | --- | --- | ---
SEERC 2015 | Sergiu Puscas | Medium | 4

https://mindcoding.ro/pb/lcm

---

# Finding solution

## LCM function

What the LCM of 4 and 6?

Multiples of 4 are: 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, ...

Multiples of 6 are: 6, 12, 18, 24, 30, 36, 42, ...

Common multiples of 4 and 6 are common numbers from both lists: 12, 24, 36, ...

The minimal number is **12**.


## Finding N

We need to modify A and B as A1=A+N and B1=B+N such that LCM(A1, B1) where N is minimal possible.

A | B | N | A1 | B1 | LCM(A1, B1)
--- | --- | --- | --- | --- | ---
2 | 10 | 1 | 3 | 11 | -
2 | 10 | 2 | 4 | 12 | 2
2 | 10 | 3 | 5 | 13 | -

The finding N is **2**.

## LCM in Venn diagramm

![LCM in Venn diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Symmetrical_5-set_Venn_diagram_LCM_2_3_4_5_7.svg/375px-Symmetrical_5-set_Venn_diagram_LCM_2_3_4_5_7.svg.png)


