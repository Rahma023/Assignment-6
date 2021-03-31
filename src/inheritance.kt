
fun main() {
    var gari = Car("Subaru", "Legacy", "Black", 6)
    gari.carry(6)
    gari.identity()
    println(gari.calculateParkingFees(5))

    var basi=Bus("toyota","Mazda","White",8)
    println(basi.maxTripFare(250.toDouble()*basi.capacity))
    println(basi.calculateParkingFees(8))
}
class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        var x=people-capacity
        if (people==capacity){
            println("Carrying $people passengers")
        }
        else{
            println("Over capacity by $x people")
        }
    }
        fun identity(){
            println("I am a $color $make $model")
        }
        fun calculateParkingFees(hours:Int):Int{
            return hours * 20

        }
    open class vehicle(var make:String, var model:String, var color:String, var capacity:Int){
        fun carry(people:Int){
            println("Carry $people passengers")
            var x=people-capacity
            if(x==capacity){
                println("Carry $people passengers")
            }else{
                println{"Over capacity by $people"}
            }
        }
    }

}
class Bus(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        var x=people-capacity
        if (people==capacity){
            println("Carrying $people passengers")
        }
        else{
            println("Over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    fun calculateParkingFees(hours:Int):Int{
        return hours * 10

    }
    fun maxTripFare(fare:Double):Double{
        var a=0
        return a+ fare
    }
}