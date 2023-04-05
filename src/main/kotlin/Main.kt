
fun main(){

//    println(indices(listOf("Ann","Kotlin","Maria","Javascript","Irene")))
//    println(heights(listOf(23.0,45.0,36.5,82.2,56.5,66.0)))
 var result =people(mutableListOf(Person("Maria",22,134.0,40.0),
     Person("Esther",21,114.0,60.0),
     Person("Irene",24,100.0,70.5)))
    println(result)
//    println(peoplesHeight(listOf(164.0,124.0,44.0)))



}
fun indices(num: List<String>): List<String>{
    return num.filterIndexed{i, num -> i%2 ==0  }
}


fun heights(height :List<Double>): List<Double>{
    val totalHeight = height.sum()
    val averageHeight = height.average()
    return listOf(totalHeight,averageHeight)

}
data class SumAndAverageHeights(var sumHeights: Double, var averageHeights: Double)

fun peoplesHeight(heights: List<Double>): SumAndAverageHeights {

    val sumHeights = heights.sum()
    val averageHeights = heights.average()
    return SumAndAverageHeights(sumHeights, averageHeights)
}

data class Person(var name: String,var age: Int,var height: Double,var weight: Double)

fun people(persons: List<Person>){
    println(persons.sortedByDescending { person -> person.age })
}


data class  Car(var registration: String,var mileage: Int)

fun car(vehicle : List<Car>): Int{
    var average =0
    vehicle.forEach { v ->
        average +=(v.mileage/vehicle.size)
    }
    return average
}


