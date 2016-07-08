//
//  main.c
//  Coin Change
//
//  Created by Jasmine Hurst on 7/7/16.
//
//

#include <stdio.h>
int count(int coins[],int N, int size);
int main(int argc, const char * argv[]) {
    int array[] = {1,2,3,4,5};
    int array_size = sizeof(array)/sizeof(array[0]);
    int N = 12;
    int answer = count(array,N, array_size);
    printf("The minimum total coins to make change for %d with the coins {1,2,3,4,5} is %d \n",N,answer);
    return 0;
}

int count(int coins[], int N, int size){
    int total[N+1]; //Hold min number of coins to get N
    int R[N+1]; // Holds highest element in coins that goes into N
    total[0] = 0; // If N is 0 answer is 0
    
    //Initialize minTotals to 0 for each element
    for(int i = 1; i <= N; i++){
        //Infinity until answer is computed
        total[i] = __INT_MAX__ - 1;
        R[i] = -1; //
    }
    for(int i = 0; i < size; i++){
        for(int j = 1;j <= N; j++){
            /* Check to make sure the current coin is not bigger
            than change we are calculating for */
            if(j >= coins[i]){
                if(total[j - coins[i]] + 1 < total[j]){
                    total[j] = total[j - coins[i]] + 1;
                    R[j];
                }
            }
        }
    }
    return total[N];
}
//