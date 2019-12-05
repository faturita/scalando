object HelloScala {
	def main(args: Array[String]): Unit = {
		println ("HEllo World")
		val list = List("1","2","3")

		val ints = list.map( s => s.toInt)
	}
}

class User {
	var name: String = _
	var orders: List[Order] = Nil
}

class Order {
	var id: Int = _
	var products: List[Product] = Nil
}

class Product {
	var id: Int = _
	var category: String = _
}