# UCB_CS61B: Lecture Notes

Materials related with UCB CS61B data structure course. Contain useful links and assessments for students OUT of UCB.

## Lec 1: Introduction to Java

When we execute java file in a terminal, we need to first compile `.java` to `.class`, for some reasons: 1. `.class` has been type checked to avoid errors. 2. `.class` is easier for computer to understand. 3. minor benefit: others only see your `.class` file, not source code[security]

**First to know:**  Compile in Gitbash: `$ javac yourfile.java`  ; Execute the code: `$ java yourfile`

## Lec 2: Define Classes

 **Rules for Java code**  [1] Always have a `main` method(function). [2] You can create `method1.java` file without `main` method, but execute another file `method2.java` that uses the class in `method1.java`.  [3] there is a instance method that begin with `public void yourmethod `......, no static. 

**Static Method vs. Instance Methods**  Static method/variable can be seen as universally applied, while instance method should be instanced before usage. A `.class` can contain both static and non-static methods.

**In General:**  A class may contain a mixture of static and non-static **members**[methods or variables]. Static methods must access instance variables via a specific instance. Static members are accessed via class name.

**HELPER METHOD:**  When dealing with complicated problems, a helper method is helpful. [giving some judgement on conditions, rather than putting all things in a single function]
