package com.mattiapiccinetti

import org.scalatest._

class MainTest extends FlatSpec with Matchers {
  "SequentialSearch" should "return empty" in {
    Main.sequentialSearch(42, List()) shouldBe Option.empty
    Main.sequentialSearch(42, List(1, 2, 3)) shouldBe Option.empty
  }

  "SequentialSearch" should "return the given number" in {
    Main.sequentialSearch(42, List(42)) shouldBe Some(42)
    Main.sequentialSearch(42, List(7, 13, 23, 36, 42, 58, 61)) shouldBe Some(42)
  }

  "BinarySearch" should "return empty" in {
    Main.binarySearch(42, List()) shouldBe Option.empty
    Main.binarySearch(42, List(1, 2, 3)) shouldBe Option.empty
  }

  "BynarySearch" should "return the given number" in {
    Main.binarySearch(42, List(42)) shouldBe Some(42)
    Main.binarySearch(42, List(7, 13, 23, 36, 42, 58, 61)) shouldBe Some(42)
  }
}
