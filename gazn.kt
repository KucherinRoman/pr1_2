class Gazn(var tema:String, var srift:String,var empnaz:String,var empdate:String):Gaz(empnaz, empdate) {
    override fun prodazhi(){
        println("газета популярная и хорошо продается")
    }
    override fun Getinfo{
        println("название газеты: $naz, шрифт газеты: $srift, дата выпуска: $date, тема газеты: $tema, номер газеты: $num ")
    }
}