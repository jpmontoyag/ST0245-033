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


    public double radioPolar() {
      double radio = Math.sqrt(Math.pow(getX(), 2)+Math.pow(getY(), 2));
      System.out.println("Radio: "+radio+" cm");
      return radio;
    }

    public double anguloPolar() {
      double angulo = Math.atan(getY()/getX());
      System.out.println("Angulo: "+angulo+"°");
      return angulo;
    }



    public double distanciaEuclidiana(Punto otro) {
      double radio = Math.sqrt(Math.pow(otro.getX(), 2)+Math.pow(otro.getY(), 2));
      System.out.println("Distancia ("+getX()+","+getY()+")-("+otro.getX()+","+otro.getY()+"): \n"+radio+" cm");
      return radio;
    }

}

class Main {

  static Punto obj = new Punto(15, 69);
  static Punto obj2 = new Punto(30, 120);

  public static void main(String[] args) {

    obj.radioPolar();
    obj.anguloPolar();
    obj.distanciaEuclidiana(obj2);
  }
}
