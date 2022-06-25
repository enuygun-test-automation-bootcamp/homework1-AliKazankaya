# Task 2 and Task 3 

## What is the order of extends and implements keyword on Java class declaration?

* The extends always precedes the implements keyword in any Java class declaration.

When the Java compiler compiles a class into bytecode, it must first look to a parent class because the underlying implementation of classes is to point to the bytecode of the parent class - which holds the relevant methods and fields.

* We can only extend one class but implements multiple interfaces as your need. We need to declare extends before implements:

public class DetailActivity extends AppCompatActivity implements Interface1, Interface2 {

// ...
}

## Internal Keyword 

* A value defined as Internal; accessible from within the same program, but inaccessible from within a different program. There are no restrictions in the program.
* It is available in C# language. There is no exact equivalent in Java.