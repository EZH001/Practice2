fun main(args: Array<String>) {
//Задача 1
    val age1 = 42.toDouble()
    val age2 = 21.toDouble()
//--------------------------

//Задача 2
    val avg1 = (age1 + age2) / 2
    println(avg1)
// Значение должно быть равно 31.5
//-----------------------------------

//Задача 3

//Потому что Double вещественный тип
//----------------------------------

//Задача 4
    val firstName:String = "Алексей"
    val lastName:String = "Быкадоров"
//--------------------------

//Задача 5
    val fullName:String = firstName + " " + lastName

//----------------------------

// Задача 6
    val myDetails:String = "Привет, меня зовут $fullName" 
//------------------------

//Задача 7
    val Triple:Triple<Int, Int, Int> = Triple(1, 17, 2005)
//--------------------

//Задача 8
    val month = Triple.first
    val day = Triple.second
    val year = Triple.third
//---------------------

//Задача 9
   val date = Pair(month, year)
    println("${date.first}" + "\n\n" + "${date.second}")
//----------------

//Задача 10
     val Pair: Pair<Int, Int>  = Pair(5,year);
//-------------------------------------
}
