
public class ResimUreticisi {
    
    public static void main(String[] args) {
        
  final  Resim resim1 = new Resim("mavi",100, 70);
  final Resim resim2 = resim1.kopyaAl(); // nesne olusturmadan daha once olusturulan resım1 nesnesınden resım2 nesnesıne clone yardımı ıle kopyalama yaptık.
  
        System.out.println("Kopyalanan Resim nesnesi:"+resim2);
    
}
}