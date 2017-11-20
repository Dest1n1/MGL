//package fr.insalyon.telecom.mgl;

public class RomanNumberConverter{
  int convert(char romanNumber){
    //int n[] = new int[romanNumber.length()];
    int n=0;
    //for (int i = 0; i < romanNumber.length(); i++){
      switch (romanNumber){
        case 'I': n = 1; break;
        case 'V': n = 5; break;
        case 'X': n = 10; break;
        case 'L': n = 50; break;
        case 'C': n = 100; break;
        case 'D': n = 500; break;
        case 'M': n = 1000; break;
      }
      return n;
    //}
    // for (int i=romanNumber.length()-1; i>0;i--){
    //   int m = romanNumber[i]-romanNumber[i-1];
    //   if(m>0){
    //
    //   }
    // }
  }

  public static void main(String args[]){
    char haha=args[0].charAt(0);
    RomanNumberConverter converter=new RomanNumberConverter();

    int test=converter.convert(haha);
    System.out.println(test);
  }
}
