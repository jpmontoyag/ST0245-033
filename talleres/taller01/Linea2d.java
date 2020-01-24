import java.lang.Math;

class Punto {

private double x, y;

    public Punto(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public double getX() {
      return x;
    }

    public double getY() {
      return y;
    }

    public void radioPolar(Punto otro) {
      double mN = otro.getY()-getY();
      double mD = otro.getX()-getX();
if(mN<0 && mD<0){
mN*=-1;
mD*=-1;
}
while(mN%2==0 && mD%2==0){
  mN/=2;
  mD/=2;
}       
while(mN%3==0 && mD%3==0){
  mN/=3;
  mD/=3;
}   
while(mN%5==0 && mD%5==0){
  mN/=5;
  mD/=5;
}   
double aux_x = getX();
          double aux_y = getY();
        for(int i=0;i<=otro.getX();i++){
          System.out.println("("+aux_x+"  ,  "+aux_y+")");
          aux_x += mD;
          aux_y += mN;
        }
    }

}

class Main {
  static Punto obj = new Punto(0, 0);
  static Punto obj2 = new Punto(12, 12);

  public static void main(String[] args) {

    obj.radioPolar(obj2);
  }
}