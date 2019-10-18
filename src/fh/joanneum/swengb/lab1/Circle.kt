package fh.joanneum.swengb.lab1

class Circle (color:String="black", val rad:Double = 2.0): Shape(color){
    override fun getArea():Double {
        return Math.PI * (rad * rad)
    }

    override fun toString(): String {
        return "Circle(rad=$rad, color=$color)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Circle

        if (rad != other.rad) return false

        return true
    }

    override fun hashCode(): Int {
        return rad.hashCode()
    }


}