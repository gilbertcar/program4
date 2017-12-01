//Gilbert Carrillo
//CS 371
//Junit
public class Circle1 extends Circle
{

public Circle1(double x, double y, double radius)
{
   super(x,y,radius);
}

public boolean intersects(Circle other)
{

  //orignial if
  // if (Math.abs(center.x - other.center.x) < radius &&
  //    Math.abs(center.y - other.center.y) < radius)

   if (Math.abs(center.x - other.center.x) < radius &&
       Math.abs(center.y - other.center.y) < radius && radius <= other.radius)
      return true;
   return false;
}

}
