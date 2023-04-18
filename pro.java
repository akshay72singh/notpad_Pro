 class Pro{

public static void main(String [] a){
// riversString();
//triangle1();
//triangle2();
//triangle3();
//febnaquiSeries();
//stringInLowerCase();
//stringInUpperCase();
//riversOnItsPlace();
// digitalSum();
accurence();
}

public static void riversString(){
System.out.println("Rivers String is ");
String name = "Name Akshay Kumar";
char ar[] = name.toCharArray();
    for(int i = ar.length-1;i>=0;i--){
System.out.print(ar[i]);
}
}
public static void triangle1(){
for(int i =1;i<=3;i++){ 
      for(int j = 1;j<=i;j++){
System.out.print ("*");
}
System.out.println();
}
}
public static void triangle2(){
for(int i =1;i<=3;i++){ 
      for(int j = 3;j>=i;j--){
System.out.print ("*");
}
System.out.println();
}
}
public static void triangle3(){
for(int i =1;i<=3;i++){ 
      for(int j = 3;j>=i;j--){
System.out.print(" ");
}
 for(int k = 1;k<=i;k++){
System.out.print(" *");
}
System.out.println();
}
}
public static void febnaquiSeries(){
int a= 0;
int b=1;
System.out.print(a);
System.out.print(b);
int c;
for(int i=0;i<4;i++){
   c=b+a;
System.out.print(c);
a=b;
b=c;
}
}
public static void stringInLowerCase(){
String name = "Hii I Am Akshay Kumar";
char ar [] = name.toCharArray();
for(int i = 0;i<ar.length;i++){
     if(ar[i]>='A' & ar[i]<='Z'){
         ar[i]+=32;
}
System.out.print(ar[i]);
}
}
public static void stringInUpperCase(){
String name = "Hii I Am Akshay Kumar";
char ar [] = name.toCharArray();
for(int i = 0;i<ar.length;i++){
     if(ar[i]>='a' & ar[i]<='z'){
         ar[i]-=32;
}
System.out.print(ar[i]);
}
}
public static void riversOnItsPlace(){
String name ="Hii I am Akshay Kumar Yadav";
String splt [] = name.split(" ");
for(int i =0;i<splt.length;i++){
   char chr [] = splt[i].toCharArray();
for(int j=splt[i].length()-1;j>=0; j--){
System.out.print(chr[j]);
}
}
}
public static void digitalSum(){
      int num = 445;
      int num1=0;
      int num2 ;
      for (int i = 0; num>0; i++) {
            num2 = num%10;         //= 44
            num1 = num2+num1;      // = 44
            num= num /10; 
      }
      System.out.print(num1);          // 
}
public static void accurence(){
      String name = "Hii I am akshay kumar".toLowerCase();
      String split [] = name.split(" ");
      for(char i= 'a';i<='z';i++){
            int count = 0;
            for(int j=0;j<split.length;j++){
                  count ++;
            }
            if(count>0){
                  System.out.print(count);
            }      
      }
      }
            }

