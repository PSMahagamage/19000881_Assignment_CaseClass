object caseclass extends App{

  val p1 = new Point(5,3);
  val p2 = new Point(2,1);


  println("# Point 1 -> " + p1)
  println("\n# Point 2 -> " + p2)

  val p3 = p1 + p2
  println("\n# Point 3 = Point 1 + Point 2 \n# Point 3 -> " + p3)

  val p4 = p1.move(1,1)
  println("\n# Point 4 = when Point 1 move (1,1) \n# Point 4 -> " + p4)

  val p5 = p1.distance(p2)
  println("\n# Point 5 = distance between Point 1 and Point 2 \n# Point 5 -> " + p5)

  val p6 = p1.invert()
  println("\n# Point 6 = invert of Point 1 \n# Point 6 -> " + p6)
}

case class Point(x:Int, y:Int){

  //Q1.add(+) -> Add two given points
  def +(that:Point)=Point(this.x+that.x, this.y+that.y)

  //Q2.move -> move a point by a given distance dx and dy
  def move(dx:Int, dy:Int)=Point(this.x+dx, this.y+dy)

  //Q3.distance -> return the distance between two given points
  def distance(that:Point)=Point(Math.abs(this.x-that.x), Math.abs(this.y-that.y))

  //Q4.invert -> switch the x and y coordinates
  def invert() =Point(this.y, this.x)

}
