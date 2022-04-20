//Write a Java program to find all the leaders in an integer array?


public class LeadersInArray
{
static void findTheLeaders(int inputArray[])
{
//Getting the length of input array
int inputArrayLength = inputArray.length;
//Assuming the last element as max
int max = inputArray[inputArrayLength-1];
System.out.println("The leaders in "+Arrays.toString(inputArray)+" are : ");
//Printing the last element as it is always a leader
System.out.println(inputArray[inputArrayLength-1]);
//Traversing the remaining elements from right to left
for (int i = inputArray.length-2; i >= 0; i--)
{
//If the element is greater than max
if(inputArray[i] > max)
{
//Printing the element
System.out.println(inputArray[i]);
//Updating the max
max = inputArray[i];
}
}
}
public static void main(String[] args)
{
findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});
findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});
findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23});
}
}
Output :

The leaders in [12, 9, 7, 14, 8, 6, 3] are :
3
6
8
14
The leaders in [8, 23, 19, 21, 15, 6, 11] are :
11
15
21
23
The leaders in [55, 67, 71, 57, 51, 63, 38] are :
38
63
71
The leaders in [21, 58, 44, 14, 51, 36, 23] are :
23
36
51
58
