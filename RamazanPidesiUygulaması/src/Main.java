
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Main {

    
    public static void main(String[] args) throws InterruptedException {
        Queue<String> pideKuyrugu = new LinkedList<String>();
        
        Random random = new Random();
        
        pideKuyrugu.offer("Ali");
        pideKuyrugu.offer("hasan");
        pideKuyrugu.offer("okan");
        pideKuyrugu.offer("Ayşe");
        pideKuyrugu.offer("merve");
        pideKuyrugu.offer("ezgi");
        pideKuyrugu.offer("gizem");
        pideKuyrugu.offer("mehmet");
        pideKuyrugu.offer("oğuz");
        pideKuyrugu.offer("Azer");
        
        int pide_sayisi= 1 + random.nextInt(10);
        
        System.out.println("PİDELER ÇIKIYOR...");
        System.out.println("Çıkan pide sayısı:"+pide_sayisi);
        Thread.sleep(3000);
        
        for(int i=0; i<pide_sayisi; i++){
            System.out.println(pideKuyrugu.poll()+" Pidenizi aldınız..");
            Thread.sleep(1000);
        }
        System.out.println("Pide kalmadı");
    }
    
}
