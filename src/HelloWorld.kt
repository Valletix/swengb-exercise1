import fh.joanneum.swengb.lab1.Canvas
import fh.joanneum.swengb.lab1.Circle
import fh.joanneum.swengb.lab1.Rectangle
import fh.joanneum.swengb.lab1.Shape

fun main()  {
/*
    val testShape = Shape()
    println(testShape.color) //black

    val testRectangle = Rectangle (width= 5.0, length=2.0)
    println(testRectangle.getArea())
    println(testRectangle.length)


    val testCircle = Circle (rad= 3.0)
    println(testCircle.getArea())
    println(testCircle.rad)

    val circle1= Circle(rad = 10.0, color = "red")
    val circle2= Circle(rad = 10.0, color = "red")

    println(circle1 === circle2)
    println(circle1 == circle2)
    println(setOf<Circle>(circle1,circle2).size)

*/

val canvas = Canvas()
    canvas.addShape(Rectangle("white", width = 5.0, length = 2.0))
    canvas.addShape(Circle("red", rad = 1.0))
    canvas.addShape(Rectangle("blue", width = 2.0, length = 4.0))
    println(canvas.getTotalArea())
    println(canvas.shapesCountPerType())
}