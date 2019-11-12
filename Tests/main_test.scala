object Main {
  def main(args:Array[String]): Unit = 
    typecast()
    nothingAndNull()
  def typecast(): Unit = 
  {
    /* example of typecasting in Scala
     */
    val x: Long = 12345678
    val y: Float = x
    println(x)
    println(y)
    print(x.toString)
  }

  def nothingAndNull(): Unit = 
  {
    /* example of nothing and null in scala
     */
    println(None)
  }

}

