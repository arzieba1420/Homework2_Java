

public class ChessBoard {
    public static void main(String[] args) {
        double grain = 0;
    
        for (int i = 0; i <64 ; i++) {
            double temp = Math.pow(2,i);
            grain+=temp;
        }
        System.out.println("Ilość ziaren na szachownicy: "+grain);
    }
}
