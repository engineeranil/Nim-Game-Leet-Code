public class Program {
    public static void main(String[] args) {
        int n = 12;
        int remainStones = 0;
        int winner = 4;
      while(n>0){
          if(n==1){
              System.out.println("TRUE");
              n=0;
          }
          if(n==2){
              System.out.println("TRUE");
              n=0;
          }
          if(n==3){
              System.out.println("TRUE");
              n=0;
          }
          if(n==4){
              System.out.println("FALSE");
              n=0;
          }
          remainStones=n%winner;
          if(remainStones>0 && n>4){
              System.out.println("TRUE");
              n=0;
          }
          else if(remainStones==0){
              System.out.println("FALSE");
              n=0;
          }
      }

    }
}
