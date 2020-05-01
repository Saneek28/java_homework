package ru.sogaz.java.sandbox;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyFirstProgram {

public static void main(String[] args) {
  maybe("Java");
  maybe("User");
  maybe("Alexander");
  maybe("Prostakov");
  Square s = new Square(5);
  System.out.println("Площадь квадрата со стороной" + s.l+ "=" + s.area());

  Rectangle r = new Rectangle(4,6);
  System.out.println("Площадь прямоугольника со сторонами" + r.a + "и" + r.b + "=" + r.area());
}
public static void maybe(String somebody) {
  System.out.println("Hello "+somebody+ "!");
}

}
