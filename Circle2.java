//Gilbert Carrillo
//CS 371
//Junit

public class Circle2 extends Circle
{

public Circle2(double x, double y, double radius)
{
    //changed order
   super(x,y,radius); //orignial: super(y,x,radius)
}

public boolean intersects(Circle other)
{
   double d;
   d = Math.sqrt(Math.pow(center.x - other.center.x, 2) +
                 Math.pow(center.y - other.center.y, 2));
   if (d < radius && radius <= other.radius) //orignial if:  if (d < radius)
      return true;
   else
      return false;
}

}
