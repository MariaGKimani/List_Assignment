fun main() {
    println(even(listOf("Maria","ivy","Javascript","Goretti","pencil","akech","add","race","Bossy")))
    println(avgheight(listOf(45.0,75.0,68.0)))
    people()
    var cars = listOf(
        Car("KBK123",120300.0),
        Car("SSH76",28369.0),
        Car("KJD",26891.9),
        Car("ASJ",38392.90)



    )
    var avgmileage = calculate(cars)
    println("The average mileage is :$avgmileage")

}
fun even(num:List<String>):List<String>{
    return num.filterIndexed { index,num->index%2==0 }


}
//Given a list of people's heights in metres. Write a function that returns
//the average height and the total height
fun avgheight(height:List<Double>):Pair<Double,Double>{
    var y = height.sum()
    var z = height.average()
    return Pair(y,z)

}



//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)

fun people(){
    val person1 = Person("Joseph",20,160.0,54.0)
    val person2 = Person("Ndungu",25,171.0,65.8)
    val person3 = Person("Esther",21,167.0,58.0)
    val person4 = Person("Muthoni",24,162.0,69.0)
    val result = listOf(person1,person2,person3,person4)
    println(result.sortedByDescending { Person->Person.age })
}


//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String,var mileage:Double)
fun calculate(cars:List<Car>):Double{
    var totalmileage = 0.0
    for(car in cars){
        totalmileage+=car.mileage
    }
    return totalmileage/cars.size
}