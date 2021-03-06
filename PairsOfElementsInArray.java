//Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?


public class PairsOfElementsInArray
{
static void findThePairs(int inputArray[], int inputNumber)
{
//Sorting the given array
Arrays.sort(inputArray);
System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
//Initializing i to first index
int i = 0;
//Initializing j to last index
int j = inputArray.length-1;
//Till i crosses j, perform the following task
while (i < j)
{
//If inputArray[i]+inputArray[j] is equal to inputNumber
if(inputArray[i]+inputArray[j] == inputNumber)
{
//then Print inputArray[i] and inputArray[j]
System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
//Increment i
i++;
//Decrement j
j--;
}
//If inputArray[i]+inputArray[j] is smaller than inputNumber
else if (inputArray[i]+inputArray[j] < inputNumber)
{
//then increment i
i++;
}
//If inputArray[i]+inputArray[j] is greater than inputNumber
else if (inputArray[i]+inputArray[j] > inputNumber)
{
//then decrement j
j--;
}
}
}
public static void main(String[] args)
{
findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
findThePairs(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);
findThePairs(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);
}
}
Output :

Pairs of elements whose sum is 10 are :
-10 + 20 = 10
4 + 6 = 10
5 + 5 = 10
Pairs of elements whose sum is 20 are :
-5 + 25 = 20
8 + 12 = 20
9 + 11 = 20
Pairs of elements whose sum is 25 are :
-15 + 40 = 25
10 + 15 = 25
12 + 13 = 25
Pairs of elements whose sum is 50 are :
12 + 38 = 50
23 + 27 = 50
