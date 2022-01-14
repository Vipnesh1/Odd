package org.launchcode;


public class Main {

    public static void main(String[] args)
    {
        int []arr={1,2,3,4,5,6};
        int n=6;
        int even=0;
        int odd=1;
        //we have to put the odd number at odd index and even number at even index
        while(even<n)
        {
            while(even<n&&arr[even]%2==0)
            {
                even+=2;
            }
            while(odd<n&&arr[odd]%2!=0)
            {
                odd+=2;
            }
            if(even>=n||odd>=n)
            break;
            int temp=arr[even];
            arr[even]=arr[odd];
            arr[odd]=temp;
        }
    }
}
