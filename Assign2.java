class Car{
float speed,regularPrice;
String color;

  Car(){
      speed=100;
      regularPrice=1000;
      color="red";
  }

public float getSalePrice(){
    return regularPrice;
}

}

class Truck extends Car{
 float weight;

 Truck(){
     weight=2500;
 }

 public float getSalePrice(){
     if(weight>2300){
         regularPrice=(regularPrice*90)/100;
     }else{
        regularPrice=(regularPrice*80)/100;
     }

     return regularPrice;
 }

}

class Assign2{
    public static void main(String[] args) {

        Truck T=new Truck();
        System.out.println(T.getSalePrice());
    }
}