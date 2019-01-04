
public class Resim implements Cloneable{ //kopyalama ıslemı yapmak ıcın obje classındakı clone metodunu kullanmak ıcın ımplements ettık..
    
    private final String renk; // genel olarak bu prototype patternı performans ve kaynak kullanımı acısından fayda saglar.. amac mınumum nesne olusturmak
    private final Integer boy;
    private final Integer en;
    
    public Resim(final String renk,final Integer boy,final Integer en) {
        this.boy = boy;
        this.en = en;
        this.renk = renk;
    }
    
    public Resim kopyaAl() {
        try {
            return (Resim) super.clone();
            
        } catch (final CloneNotSupportedException e) { // Kopyalama ıslemı yapılan bır objenın kopyalama sırasında hata olusursa bu hatayı fırlat
            e.printStackTrace(); // bu metod hatanın detaylı bır sekılde konsola yazılmasını saglar..
            return null;
        }
    }
    public String renkAl() {
        return renk;
    }
    public Integer boyAl() {
        return boy;
    }
    public Integer enAl() {
        return en;
    }
    @Override
    public String toString() {
        return "Resim [ renk: "+renk+" en: "+en+" boy: "+boy+"]";
        
    }
}
