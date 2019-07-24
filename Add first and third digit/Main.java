#include<stdio.h>
int main()
{
  int n,n1,n2,n3;
  scanf("%d",&n);
  n1=n/100;
  n2=n%10;
  n3=n1+n2;
  printf("%d",n3);
  return 0;
}