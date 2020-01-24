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

    public double radioPolar() {
      double radio = Math.sqrt(Math.pow(getX(), 2)+Math.pow(getZ(), 2));
      radio = Math.sqrt(Math.pow(radio, 2)+Math.pow(getY(), 2));
      System.out.println("Radio: "+radio+" cm");
      return radio;
    }

    public double anguloPolar() {
      double x = Math.sqrt(Math.pow(getX(), 2)+Math.pow(getZ(), 2));
      double angulo = ((Math.atan(getY()/x))*180)/3.1416;
      System.out.println("Angulo: "+angulo+"°");
      return angulo;
    }

    public double distanciaEuclidiana(Punto otro) {
      double aux_x = otro.getX()-getX(); 
      double aux_y = otro.getY()-getY(); 
      double aux_z = otro.getZ()-getZ(); 
      double radio = Math.sqrt(Math.pow(aux_x, 2)+Math.pow(aux_z, 2));
      radio = Math.sqrt(Math.pow(radio, 2)+Math.pow(aux_y, 2));
      System.out.println("Distancia ("+getX()+","+getY()+","+getZ()+")-("+otro.getX()+","+otro.getY()+","+otro.getZ()+"): \n"+radio+" cm");
      return radio;
    }

}

class Main {
  static Punto obj = new Punto(1, 2, 3);
  static Punto obj2 = new Punto(5, 2, 3);

  public static void main(String[] args) {

    obj.radioPolar();
    obj.anguloPolar();
    obj.distanciaEuclidiana(obj2);
  }
}