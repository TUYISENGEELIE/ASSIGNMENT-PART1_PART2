class conti2 {
  public static void main(String[] args) {

    int i = 10, j = 30;

    // outer loop
    while (i <= 32) {

      System.out.println("Outer Loop: " + i);

      // inner loop
      while(j <= 34) {

        if(j == 4) {
          j++;
          continue;
        }

        System.out.println("Inner Loop: " + j);
        j++;
      }
      i++;
    }
  }
}
