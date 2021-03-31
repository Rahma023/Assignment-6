
fun main() {
    var gari = Car("Subaru", "Legacy", "Black", 6)
    gari.carry(6)
    gari.identity()
    println(gari.calculateParkingFees(5))

    var bus=Bus("toyota","Mazda","White",8)
    println(bus.calculateParkingFees(8))
    println(bus.maxTripFare(250.toDouble()*bus.capacity))
}
class Car(make:String, model:String,color:String,capacity:Int):Vehicle(make,model,color,capacity) {
}
    open class Vehicle(var make:String, var model:String, var color:String, var capacity:Int) {
        fun carry(people: Int) {
            println("Carry $people passengers")
            var x = people - capacity
            if (x == capacity) {
                println("Carry $people passengers")
            } else {
                println("Over capacity by $people" )
            }}
            fun identity() {
                println("I am a $color $make $model")
            }

           open fun calculateParkingFees(hours: Int): Int {
                return hours * 20

            } }


        class Bus(make: String, model: String, color: String, capacity: Int) : Vehicle(make, model, color, capacity) {
            fun maxTripFare(fare: Double): Double {
                var a = 0
                return a + fare
            }
            override fun calculateParkingFees(hours:Int):Int{
                return hours * 20
            }
        }

