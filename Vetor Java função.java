public class MontaVetor{
    public static void main(String args[]){
         int vet[] = new int[5];
         
         vet[0] = 5;
         vet[1] = 6;
         vet[2] = 7;
         vet[3] = 8;
         vet[4] = 9;
         
         for(int i = 0; i < vet.length; i++){
             System.out.println("Vetor na Posição [" + i +"] = " +vet[i]);
         }   
    
    }
}