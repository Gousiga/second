import java.util.Arrays;
class maxmin
{
public static void main(String Args[])
{
int a[]= {25,14,56,15,36,56,77,18,29,49};
int max=a[0];
int min=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]>max){
max=a[i];
}
if(a[i]<min){
min=a[i];
}}
  //maxmin using array
System.out.println("Original Array:  ");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
System.out.println("Maximum value for the above array: "+max);
System.out.print("Minimum value for the above array: "+min);
}}
