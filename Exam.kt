open class Exam(var name:String,var date:String,var ots:Int,var pred:String,var stud:String) {
    open fun Dop(){
        println("$stud не допущен")
    }
    open fun name(){
        println("имя студента $name")
    }
    open fun Pred(){
        println("предмет: $pred")
    }
    open fun Date(){
        println("дата экзамена $date")
    }
    open fun Ots(){
        println("оценка студента $ots")
    }
    open fun Getinfo(){
        println("имя студента: $name, предмет: $pred, дата: $date, оценка: $ots")
    }
}