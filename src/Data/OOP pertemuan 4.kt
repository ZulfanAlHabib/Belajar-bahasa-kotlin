package Data

class `OOP pertemuan 4`{
    var katakata: String = "tergantung"
    var middlename: String? = null
    var kata: String = "mati"

    //membuat sebuah function
    fun sayHello(name:String){
        println("Hello $name my name is $katakata")
    }
    fun run(){
        println("I'am run")
    }
    fun getFullname(): String{
        return "$katakata $middlename $kata"
    }
}
