package ru.sogaz.java.sandbox;

public class Point {
  public double x, y;
  public double dx;
  public double dy; //параметры точки, координаты

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p)
  {
    Point dx = new Point(10, 60);
    Point dy = new Point(50, 30);
    this.dx = dx.x - dy.x;
    this.dy = dy.y - dy.y;
    return Math.sqrt( (Math.pow((this.dx), 2)) +  (Math.pow((this.dy),2)));
  }
}
