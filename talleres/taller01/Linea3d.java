import java.lang.Math;

class Punto {

private double x, y, z;

    public Punto(double x, double y, double z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX() {
      return x;
    }

    public double getY() {
      return y;
    }
    public double getZ() {
      return z;
    }

    public void radioPolar(Punto otro) {

double h = Math.sqrt(Math.pow(otro.getX(),2)+Math.pow(otro.getZ(),2));

      double mN = otro.getY()-getY();
      double mD = otro.getX()-getX();
      double mZ = otro.getZ()-getZ();

if(mN<0 && mD<0 && mZ<0){
mN*=-1;
mD*=-1;
mZ*=-1;
}
while(mN%2==0 && mD%2==0){
  mN/=2;
  mD/=2;
  mZ/=2;
}       
while(mN%3==0 && mD%3==0){
  mN/=3;
  mD/=3;
  mZ/=3;
}   
while(mN%5==0 && mD%5==0){
  mN/=5;
  mD/=5;
  mZ/=5; 
}
while(mD%2==0 && mZ%2==0){
  mN/=2;
  mD/=2;
  mZ/=2;
}       
while(mD%3==0 && mZ%3==0){
  mN/=3;
  mD/=3;
  mZ/=3;
}   
while(mD%5==0 && mZ%5==0){
  mN/=5;
  mD/=5;
  mZ/=5; 
}
          double aux_x = getX();
          double aux_y = getY();
          double aux_z = getZ();
        for(int i=0;i<=otro.getX();i++){
          System.out.println("("+aux_x+"  ,  "+aux_y+"  ,  "+aux_z+")");
          aux_x += mD;
          aux_y += mZ;
          aux_z += mN;
        }
    }

}

class Main {
  static Punto obj = new Punto(0, 0, 0);
  static Punto obj2 = new Punto(10, 15, 20);

  public static void main(String[] args) {

    obj.radioPolar(obj2);
  }
}