public class deneme1 {
    public static void main(String[] args) {
        int [] array={-22,1,33,4,1,34,-2,13,3,0};
        System.out.println(dizidekiEnBuyukveEnKucukElemanlarinToplami(array));
    }

    public static int dizidekiEnBuyukveEnKucukElemanlarinToplami(int[] myarray){

        int enbuyuk=myarray[0];
        int enkucuk=myarray[0];
        int toplam;
        for (int x:myarray){
            if(x>enbuyuk)
                enbuyuk=x;
            if(x<enkucuk)
                enkucuk=x;
        }
        toplam =(enbuyuk+enkucuk);

        //parametre olarak gelen myarray dizisindeki en büyük ve en küçük elemanların toplamını döndürün
        return toplam;
    }
}
