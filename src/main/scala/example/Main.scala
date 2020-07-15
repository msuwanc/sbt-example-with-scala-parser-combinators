package example

object Main extends App {
  val ages = Seq(42, 72, 29, 64)
  println(s"The oldest person is ${ages.max}")

  TestSimpleParser.parse("johnny 121")
}
