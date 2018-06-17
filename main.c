#include <stdio.h>
#include <stdlib.h>
long long pow1(long x, long n)
{
    long long r=1;
    while(n!=0)
{
	r=r*x;
	n--;
}

return r;
}
int main()
{

int t,n,a,b;

int i=0,j=0;
scanf("%d",&t);
int out[t];
int k=0;
long long arr[3*t];
for(i=0;i<t;i++)
{

    for(j=3*i;j<3*i+3;j++){
        scanf("%d",&arr[j]);
    }
j=3*i;
   if(pow1(arr[j],arr[j+2])>pow1(arr[j+1],arr[j+2])){
        out[k]=1;
}
else if(pow1(arr[j],arr[j+2])<pow1(arr[j+1],arr[j+2]))
{
    out[k]=2;
}
else if(pow1(arr[j],arr[j+2])==pow1(arr[j+1],arr[j+2]))
{
    out[k]=0;
}
k++;

}

for(i=0;i<t;i++)
    printf("\n%d",out[i]);



return 0;

}
