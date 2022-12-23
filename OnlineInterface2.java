import java.util.Scanner;


public class OnlineInterface2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("please enter number of books : ");
        int size=input.nextInt();
        product [] arr=new cartoonbook[size];


        double price;
        double total=0;
        for(int i=0; i<size;i++)
        { System.out.print("enter price of the book "  +(i+1)+  ": ");
            price=input.nextDouble();
            arr[i]=new cartoonbook();
            arr[i].price(price);
            total =total + arr[i].price(price);

        }
        System.out.print("total prices of the books :"+total);
    }
}
///////////////////////////////////////////////////
 class book implements product {
    double price;
    @Override
    public double price(double p) {
        price=p;
        return price;
    }

}
////////////////////////////////////
 class cartoonbook extends childbook {
    double price;

    @Override
    public double price(double p)
    {   price=p*0.5;
        return price; }
}
///////////////////////////////

 class childbook extends book {
    double price;

    @Override
    public double price(double p)
    {   price=p*0.3;
        return price; }
}
///////////////////////////////////////

interface product {

    public abstract double price (double p);
}