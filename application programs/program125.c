#include<stdio.h>
int main()
{
    char Arr[20];
    printf("Enter the string:\n");
    scanf("%[^'\n']s",Arr);
    printf("Enterd String is:%s\n",Arr);
    return 0;
}