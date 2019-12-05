class Printer(val output: String => Unit) {
	
}

object Hello {
	def main(arg: Array[String]) {
		val printer = new Printer( s => println(s));
		printer.output("Hello");
	}
}

trait Similarity {
  def isSimilar(x: Any): Boolean
  def isNotSimilar(x: Any): Boolean = !isSimilar(x)
}