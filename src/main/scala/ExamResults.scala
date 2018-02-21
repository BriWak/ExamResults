object ExamResults {

  def apply(correctAnswers: List[String],answers: List[String]): Int = {
    val blanks = answers.intersect(List("","","","")).length
    val correct = correctAnswers.intersect(answers).length
    val wrong = correctAnswers.length - correct - blanks
    (correct * 4) - wrong
  }
}
