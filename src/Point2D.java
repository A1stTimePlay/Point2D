import java.util.Scanner;

public class Point2D {
    private int iX;
    private int iY;
    static Scanner input = new Scanner(System.in);

    Point2D(){
        iX=0;
        iY=0;
    }

    Point2D(int x, int y){
        iX=x;
        iY=y;
    }

    public int GetX(){
        return iX;
    }

    public int GetXY(){
        return iY;
    }

    public void Nhap(){
        System.out.println("Nhap X va Y: ");
        iX=input.nextInt();
        iY=input.nextInt();
    }

    public void Xuat(){
        System.out.println(iX + ","+iY);
    }

    public int KhoangCach(Point2D B){
        double temp=(this.iX-B.iX)*(this.iX-B.iX)+ (this.iY-B.iY)*(this.iY-B.iY);
        return (int)Math.sqrt(temp);
    }

    public void DichChuyen(Point2D C){
        this.iX+=C.iX;
        this.iY+=C.iY;
    }

    public static void main(String[] args){
        Point2D A=new Point2D();
        Point2D B=new Point2D();
        A.Nhap();
        B.Nhap();
        System.out.println("Nhap Vecto dich chuyen: ");
        int x=input.nextInt();
        int y=input.nextInt();
        Point2D C=new Point2D(x,y);
        System.out.println("Khoang cach giua A va b: "+A.KhoangCach(B));
        System.out.println("Diem A sau khi dich chuyen: ");
        A.DichChuyen(C);
        A.Xuat();
        System.out.println("Diem B sau khi dich chuyen: ");
        B.DichChuyen(C);
        B.Xuat();
    }
}
