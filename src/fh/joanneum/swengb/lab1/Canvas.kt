package fh.joanneum.swengb.lab1

import org.w3c.dom.css.Rect

class Canvas() {
    private var shapes = mutableListOf<Shape>()

    fun addShape(shape: Shape) {
        shapes.add(shape)
    }

    fun getTotalArea():Double{
       return shapes.sumByDouble { x-> x.getArea()}
    }

    fun shapesCountPerType():Map<String,Int>{
        return (shapes.groupBy {x -> x.javaClass.simpleName}).size
    }
}