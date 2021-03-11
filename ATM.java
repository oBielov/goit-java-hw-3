public class ATM{

    public int countBanknotes(int sum){
        int[] nominals = {500, 200, 100, 50, 20, 10, 5, 2, 1};
      
        int temp = 0;
        int quant = 0;
        int nominalCount = 0;
        
        while(nominalCount < 9){
            temp = nominals[nominalCount];
            quant += sum/temp;
            sum %= temp;
            nominalCount++;
        }
        return quant;
    }

}
