import org.scalatest.{MustMatchers, WordSpec}

class ExamResultsSpec extends WordSpec with MustMatchers {

  "ExamResults" must {

    "return 4 when given List('a','b','c','d'),List('a','','','')" in {
      ExamResults.apply(List("a", "b", "c", "d"), List("a", "", "", "")) mustEqual 4
    }

    "return 0 when given List('a','b','c','d'),List('','','','')" in {
      ExamResults.apply(List("a", "b", "c", "d"), List("", "", "", "")) mustEqual 0
    }

    "return 8 when given List('a','b','c','d'),List('a','b','','')" in {
      ExamResults.apply(List("a", "b", "c", "d"), List("a", "b", "", "")) mustEqual 8
    }

    "return 1 when given List('a','b','c','d'),List('a','a','a','a')" in {
      ExamResults.apply(List("a", "b", "c", "d"), List("a", "a", "a", "a")) mustEqual 1
    }

    "return 2 when given List('a','b','c','d'),List('a','a','a','')" in {
      ExamResults.apply(List("a", "b", "c", "d"), List("a", "a", "a", "")) mustEqual 2
    }
  }
}
