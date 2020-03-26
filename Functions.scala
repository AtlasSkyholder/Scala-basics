package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*

    1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
    2. Factorial function 1 * 2 * 3 * .. * n
    3. A Fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n - 1) + f(n - 2)
    4. Tests if a number is prime.

  */

  def sayHello(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }
  println(sayHello("Fred", 35))

  def recFact(n: Int): Int = {
    var i = 1
    var d = 1
    while(d <= n) {
      i = i * d
      d += 1
    }
    i
  }
  println(recFact(7))

  def fib(n:Int): Int = {
    if (n <= 2) 1
    else fib(n-1) + fib(n-2)
  }
  println(fib(10))

  def isPrime(num: Int): String = {
    if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0) "No"
    else "Yes"
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(17 * 51))

}
