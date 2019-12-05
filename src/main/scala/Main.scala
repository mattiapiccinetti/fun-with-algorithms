import scala.util.Random.nextInt

object Main extends App {
  def sequentialSearch(n: Int, list: List[Int]): Option[Int] = {
    list match {
      case Nil          => None
      case head :: Nil  => if (head == n) Some(n) else None
      case head :: tail => if (head == n) Some(n) else sequentialSearch(n, tail)
    }
  }

  def binarySearch(n: Int, list: List[Int]): Option[Int] = {
    def split(n: Int, list: List[Int]): List[Int] = {
      val (left, right) = list.splitAt(list.size / 2)

      if (n >= right.head) right
      else left
    }

    list match {
      case Nil          => None
      case head :: Nil  => if (head == n) Some(n) else None
      case head :: tail => if (head == n) Some(n) else binarySearch(n, split(n, tail))
    }
  }
}
