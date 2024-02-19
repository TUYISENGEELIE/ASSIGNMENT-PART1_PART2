class continue1 {
  public static void main(String[] args) {

    // for loop
    for (int i = 3; i <= 20; ++i) {

      // if value of i is between 5 and 10
      // continue is executed
      if (i > 4 && i < 10) {
        continue;
      }
      System.out.println(i);
    }
  }
}