void foo(){
  A a = new A();
  B x = new B();
  a.setB(X);
  B y = a.getB();
}

class A {
  B b;
  void setB(B b) {this.b = b;}
  B getB() {return this.b;}
}


1 n1 = new One();
2 n2 = new Two();
3 x1 = newX(n1);
4 x2 = newX(n2);
5 n = x1.f;
6
7 X newX(Number p) {
8   X x = new X();
9   x.f = p;
10  return x;
11  }
12 class X {
13   Number f;
14 }
