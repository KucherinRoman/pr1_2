open class Gaz(var naz:String, var num:Int, var date:String) {
    open fun naz(){
        println("введите назание газеты")
        naz=readLine()!!.toString()
    }
    open fun num(){
        println("введите номер газеты")
        num=readLine()!!.toInt()
    }
    open fun date(){
        println("введите дату выпуска")
        date=readLine()!!.toString()
    }
}