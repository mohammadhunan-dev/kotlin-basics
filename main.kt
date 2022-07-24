fun main() {
    val firstName: String = "Moe"
    val friend = "Alice"
    var weight = 163
    var instagramAccount: String? = null

    instagramAccount = "ig_moe"

    val names = listOf(firstName,friend)

    println(instagramAccount)

    if(instagramAccount != null){
        println(instagramAccount.uppercase())
    }else{
        println("no instagram account selected")
    }


    println(instagramAccount?.uppercase())

    val mutableListOfNames = mutableListOf(firstName, friend, "John")

    val weights = listOf<Int>(weight, 120, 180, 205)
    
    println(firstName + " weighs " + weight);
    println("$firstName weights $weight")

    if(weight > 160){
        println("unhealthy weight")
    }else{
        println("healthy weight") 
    }

    println(names)
    mutableListOfNames.add("tim")
    println(mutableListOfNames)

    var i = 0;
    for(name in mutableListOfNames){
        var currentWeight = weights[i]
        println("$name weighs $currentWeight")
        i++;
    }

    sayHello(firstName)
}

fun sayHello(name: String){
    println("hello $name")
}
// cant be accessed from other functions or files
private fun sayBye(name: String){
    println("bye $name")
}