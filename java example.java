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
