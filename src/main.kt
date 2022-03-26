fun main(){
    var liz=banker("beth",25)
    var far=farmer("pascaline",45)
   var doc=doctor("Dr,liz",40)
   println( liz.age)
   println(liz.name)
    liz.talk("hello there")
    liz.sleep()
    liz.eat()
   println(liz.countmoney(arrayOf(4000)))
    println( doc.age)
   println( doc.name)
    doc.talk("your sick")
    doc.eat()
    doc.sleep()
    doc.introduction()
    far.introduction()
    liz.introduction()
    doc.treatpatient("lucy","amnessia")
    println( far.age)
   println(far.name)
    far.sleep()
    far.eat()
    far.talk("am harvesting")
    println(doc is doctor)
    println(liz is banker)
    far.caltivateland()

}
open class person(var name: String, var age: Int){
    fun talk(words:String){
        println(words)

    }
    open fun eat(){
        println("yum")
    }
    fun sleep(){
        println("zzzzzzkooozzz")
    }
   open fun introduction(){
        println("Hy my name is $name")
    }

}
class banker( name:String,age:Int):person(name,age){

    fun countmoney(note:Array<Int>):Int{
        var sum=0
        note.forEach { note->
            sum+=note
        }
        return sum
        }
}
class doctor( name: String, age: Int):person(name, age){
    override fun eat() {
        super.eat()
        println("cheeheecheee")
    }

    override fun introduction() {
        super.introduction()
        println("Hy my name is doc. $name")
    }
fun treatpatient(patient:String,disease:String){
    println("treating $patient for $disease")

}}
class farmer(name: String,age: Int):person(name, age){

  fun caltivateland(){
      println("dig dig dig ")
  }

    override fun eat() {
        super.eat()
        println("I am eating all the food that i have grown")

    }
    //override fun sleep() {
      //  super.sleep()
        //println("craacraazzzzzz")
    //}


    }
