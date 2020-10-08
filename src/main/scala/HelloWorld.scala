//object HelloWorld extends App {
//  println("Hello, Wolrd!")
//}

//import org.junit.Assert._

object Palindrome {
  def isPal(s: IndexedSeq[Char]): Boolean = {
    s match {
      case Seq() => true // The empty string is a palindrome
      case Seq(a) => true // Single letter string
      case a +: w :+ b if a == b => isPal(w)
      case a +: w if isSymbol(a) => isPal(w)
      case w :+ a if isSymbol(a) => isPal(w)
      case _ => false
    }
  }

  def isSymbol(c: Char) : Boolean = {
    !c.isLetter
  }

  def main(args: Array[String]): Unit = {
    println(isPal("pop"))
    println(isPal("race car"))
    println(isPal("a man, a plan, a canal, panama!"))
    println(isPal("apple"))
    println(isPal("fubar"))
  }

}


