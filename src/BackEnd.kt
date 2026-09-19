import java.util.Scanner
val reader = Scanner(System.`in`)
val phoneBook_Numbers = mutableSetOf("")
fun AccountCreation(){
    println("Create an account with us and Experience Quality Services")
    println("Enter Your FirstName")
    val FName:String = reader.nextLine()
    println("Enter Your LastName")
    val lastname:String = reader.nextLine()

    fun phoneNumberVerification(){
        println("Enter Your PhoneNumber..{07********} OR {01********}")
        val phoneNumber:String = reader.nextLine()
        val pattern = Regex("^0[17][0-9]{8}$")
        if(!phoneNumber.matches(pattern)){
             println("Wrong PhoneNumber Format please Try Again. ")
            phoneNumberVerification()
        }
        else{
           println("Thanks for Setting up Your Phone Number of your Choice:${phoneNumber}")
            phoneBook_Numbers.add(phoneNumber)
            fun Authentication() {
                println("Create Your First pin ")
                val pinNumber: Int = reader.nextInt()
                println("Confirm Your Pin")
                val Confirm_pinNumber: Int = reader.nextInt()
                if(pinNumber != Confirm_pinNumber){
                    println("You have Entered the Wrong Pin.Retry")
                    Authentication()
                }
                else{
                    println("You have Succesfully Created Your First_Pin.Keep it Safe")

                    fun idVerification(){
                        println("Enter Your Id Number .{ 8 values}")
                        val IDNumber:Int = reader.nextInt()
                        val confirmNUmber:String = IDNumber.toString()
                        val confirm_ID_Length = (confirmNUmber.length)!= 8
                        if(confirm_ID_Length){
                            println("Wrong ID length .Please Try Again:")
                            idVerification()
                        }
                        else{
                            println("Your ID Number is Captured Successfully")

                        }
                    }
                    idVerification()
                }

            }
            Authentication()
            for(i in phoneBook_Numbers){
                println(i)
            }

        }

    }
    phoneNumberVerification()

}
fun bankAccount (){
    
}

fun main(){
  //  println("Hello welcome to safaricom database portal")

    val MpesaBalance:String
    val myDeposit:String
    AccountCreation()
}