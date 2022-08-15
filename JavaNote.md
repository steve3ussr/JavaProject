# Java TODO

- [ ] Module
- [ ] 

# Java Hello World

``` java
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
```

必须有`String[] args`作为参数才行

# Java 基础语法，注释

- 大小写敏感；

- 类名首字母应大写，大驼峰；

- 方法名：小驼峰；

- 源文件：必须和类名一致；

- **主程序入口：**统一为`public static void main(String[] args)`

- 标识符可用字母、$、_、数字；**数字不能作为开头**

- 访问控制修饰符：default, public , protected, private

- 非访问控制修饰符 : final, abstract, static, synchronized

- 变量类型：

  - 局部变量；
  - 类变量（静态变量）；
  - 成员变量（非静态变量）；

  ---

  ``` java
  // 1
  /* 2 */
  /*
   3
   */
  ```

  

# Java Class, Object

## basic

``` java
public class Dog {
    // define attr
    int size;
    int age;
    
    // define method
    void m1(){
        
    }
}


```

**变量：**

- 局部变量：方法中
- 成员变量：attr（只能被实例调用）
- 类变量：类似attr，但是必须声明为static类型（被实例或者类调用）

**构造方法：**

- 必须和类同名；
- 可以有多个构造方法；

**创建对象：**（还是在类中的主函数入口）

- 声明一个对象：`类型(类名) 标识符 = new 类名`；
- 实例化：关键字new
- 初始化：调用构造方法初始化

## public, non-public

当在一个源文件中定义多个类，并且还有import语句和package语句时，要特别注意这些规则。

- 一个源文件中只能有一个 public 类
- 一个源文件可以有多个非 public 类
- **源文件的名称应该和 public 类的类名保持一致**。例如：源文件中 public 类的类名是 Employee，那么源文件应该命名为Employee.java。
- 如果一个类定义在某个包中，那么 package 语句应该在源文件的首行。
- 如果源文件包含 import 语句，那么应该放在 package 语句和类定义之间。如果没有 package 语句，那么 import 语句应该在源文件中最前面。
- import 语句和 package 语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。

类有若干种访问级别，并且类也分不同的类型：抽象类和 final 类等。这些将在访问控制章节介绍。

## package





## example

``` java
// Student.java
public class Student {
    int age;
    String name;
    int mathScore;
    int englishScore;

    public Student(String stuName) {this.name = stuName;}

    public void setAge(int age) {this.age = age;}

    public void setMathScore(int mathScore) {this.mathScore = mathScore;}

    public void setEnglishScore(int englishScore) {this.englishScore = englishScore;}

    public void printStudent() {
        System.out.println(this.name + ", 年龄: " + this.age + ". 总分为: " + (this.mathScore + this.englishScore));
    }
}

// StudentTest.java
public class StudentTest{
    public static void main(String[] args){
        Student inst = new Student("卢本伟");
        inst.setAge(14);
        inst.setMathScore(93);
        inst.setEnglishScore(39);
        inst.printStudent();
    }
}
```



# Java 基本数据类型

## 内置类型

> 可以十进制；八进制（0开头）；十六进制（0x开头）。

| 类型            | 范围                            | 备注         | 默认值     |              |
| --------------- | ------------------------------- | ------------ | ---------- | ------------ |
| byte(nit8)      | [-128, 127]                     | 是int的1/4   | 0          | `Byte`       |
| short(int16)    | [-32768, 32767]                 | 是int的1/2   | 0          | `Short`      |
| int(int32)      | [-2,147,483,648, 2,147,483,647] | **整型默认** | 0          | `Integer`    |
| long(int64)     | $[-2^{63},\ 2^{63}-1]$          |              | 0***L***   | `Long`       |
| float(float32)  |                                 |              | 0.0**f**   | `Float`      |
| double(float64) |                                 | **浮点默认** | 0.0***d*** | `Double`     |
| boolean         | True/False                      |              | False      |              |
| char(1)         | `\u0000 ~ \uffff`               |              | `\u0000`   | `Chareacter` |

通过`*.SIZE, *.MIN_VALUE, *.MAX_VALUE`可获取上表。

## 引用类型（指针）

比如`Student inst = new Student();`

变量一旦声明就不能更改类型。

同样地，仅仅声明并不能分配内存空间，必须实例化（定义）才行。

## 类型转换与计算

低等级（内存占用）的可以自动转为高等级并计算，但高等级的必须强制转换才行。

``` java
// 低  ------------------------------------>  高
// byte8, short16, char1—> int32 —> long64 —> float32 —> double64

int i = 128;
byte j = (byte)i;  //(type)value
```

**强制转换有可能会溢出，比如上例；或者损失精度。**

**float转成int不是四舍五入，而是取整。**

# Java 变量类型

[TODO](https://www.runoob.com/java/java-variable-types.html)
