class main{
  public static void main(String args[]){
    int a[] = new int[5];

    try{
      a[5] = 30/2;
    }
    catch(ArithmeticException e){
      System.out.println("cannot divide by 0!!");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Array Index out of range");
    }
  }
}
