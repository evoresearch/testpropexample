package evo;

public class ScientificCalculator {
    public double add(double a,double b){
        return a+b;
    }
    public double subtract(double a,double b){
        return a-b;
    }
    public double multiply(double a,double b){
        return a*b;
    }
    public double divide(double a,double b){
        return a/b;
    }
  public double sqrt(double a){
        return Math.sqrt(a);
    }
  public int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
}
