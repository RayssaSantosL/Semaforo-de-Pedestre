import java.util.Scanner;
  class Main {
  public static void main (String[] args){
    Scanner bah= new Scanner(System.in);

  // definindo fases do semaforo
    String x = "verde";
    String z = "vermelho";
    // perguntando sobre o semaforo
    System.out.println("Que cor está o semaforo?");
    String r = bah.nextLine();
    
    if (r.contains(x)){
      System.out.println("Pode atravessar!");
    }
    
    else{
      System.out.println("Não atravesse.");
    }
  }
}