public class GiaiPT {
    float  a=5,b=3,kq;
    void Gpt(){
        if (a==0 && b==0){
            System.out.println("Phuong trinh co vo so nghiem");
        }else if (a==0 && b!=0) {
            System.out.println("Phuong trinh vo nghiem");
        }else{
            kq = -b/a;
        }
    }
}
