
class practice2 {
  static double getDistance(int x, int y, int x1, int y1) {
    double distanceX;
    double distanceY;
    double Answer;

    distanceX = x1 - x;
    distanceY = y1 - y;
    distanceX = distanceX * distanceX;
    distanceY = distanceY * distanceY;

    Answer = distanceX + distanceY;
    Answer = Math.sqrt(Answer);

    return Answer;

  }

  public static void main(String[] args) {
    Student s = new Student("홍길동", 1, 1, 100, 60, 76);

    String str = s.info();
    System.out.println(str);

    System.out.println("이름 : " + s.name);
    System.out.println("총점 : " + s.getTotal());
    System.out.println("평균 : " + s.getAverage());

    // 6-4
    System.out.println(getDistance(1, 1, 2, 2));

  }
}

class Student {
  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  Student(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  int getTotal() {
    return this.kor + this.eng + this.math;
  }

  double getAverage() {
    return (Math.round(((double) (this.kor + this.eng + this.math) / 3) * 10.0) / 10.0);
  }

  String info() {
    return this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math + ","
        + (this.kor + this.eng + this.math) + ","
        + (Math.round(((double) (this.kor + this.eng + this.math) / 3) * 10.0) / 10.0);
  }

}