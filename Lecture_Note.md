# UCB_CS61B: Lecture Notes

Materials related with UCB CS61B data structure course. Contain useful links and assessments for students OUT of UCB.

## Lec 1: Introduction to Java

When we execute java file in a terminal, we need to first compile `.java` to `.class`, for some reasons: 1. `.class` has been type checked to avoid errors. 2. `.class` is easier for computer to understand. 3. minor benefit: others only see your `.class` file, not source code[security]

Compile in Gitbash: `$ javac yourfile.java`  

Execute the code: `$ java yourfile`

## Lec 2: Define Classes

 If you want to run your code, remember some rules:

[1] Always have a `main` method(function). [2] You can create `method1.java` file without `main` method, but execute another file `method2.java` that uses the class in `method1.java`.  [3] there is a instance method that begin with `public void yourmethod `......, no static.

**Static Method vs. Instance Methods**

