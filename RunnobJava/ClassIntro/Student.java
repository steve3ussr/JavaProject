public class Student {
    int age;
    String name;
    int mathScore;
    int englishScore;

    public Student(String stuName) {
        this.name = stuName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public void printStudent() {
        System.out.println(this.name + ", 年龄: " + this.age + ". 总分为: " + (this.mathScore + this.englishScore));
    }
}
