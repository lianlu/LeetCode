package problem134;

//There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
//
//You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.
//
//Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.
//
//Note:
//The solution is guaranteed to be unique.
public class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int len = gas.length;
		if (len == 0)
			return -1;
		for (int i = 0; i < len; i++)
			gas[i] -= cost[i];
		int sum = 0;
		int currentminindex = 0;
		int currentminvalue = gas[0];
		for (int i = 0; i<len;i++)
		{
			sum += gas[i]; 
			if (currentminvalue > sum )
			{
				currentminindex = i;
				currentminvalue = sum;
			}
			
			
		}
		if (sum < 0) return -1;
		else return (currentminindex+1)%len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
