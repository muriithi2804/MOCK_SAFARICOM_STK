import java.util.Scanner
import java.time.LocalDateTime
import kotlin.text.matches

val leader = Scanner(System.`in`)
fun mpesa() {
    fun SendMoney() {
        val mydate = LocalDateTime.now()
        val transcation_cost: Int;
        val myMpesaAmount: Int = 1000
        println("Enter Your PhoneNumber")
        var reader = Scanner(System.`in`)
        val phoneNumber = reader.nextLine()
        val c = phoneNumber.length
        println("Enter The  Amount ")
        val Money_Send = reader.nextInt()
        println("Enter Your Pin")
        var reder = Scanner(System.`in`)
        val inm = reder.nextLine()
        println(inm)
        val z = inm.length
        if (Money_Send <= 100) {
            transcation_cost = 0;
        } else {
            transcation_cost = 200;
        }
        val Current_balance = (myMpesaAmount) - (Money_Send + transcation_cost)
        val credit: Int;
        credit = (Money_Send + transcation_cost) - (myMpesaAmount)
        if( z == 4) {

            if (c == 10) {
                if (credit >= 0) {
                    println("Failed!! to Send ${Money_Send}..You Have Insufficient Balance \n Your Mpesa Balance is ${myMpesaAmount}\n Fuliza ${credit} To Continue With The Transaction")
                } else {
                    println("UC94H67TH Confirmed.Ksh${Money_Send} Was sent To ${phoneNumber} on ${mydate} \nNew Mpesa balance is Ksh${Current_balance}.Transcation cost Ksh${transcation_cost}.\n. Amount you can transcat within the day is 499,999.00\n.Earn interest daily on Zidi MMF,Dial*33#")
                }
            } else {
                println("Enter Your PhoneNumber correctly\n:10digits")
                SendMoney()
            }
        }
        else{
            println("Enter Your pin Correctly :\n 4.digits")
            SendMoney()
        }
    }
    fun WithdrawCash() {
        fun Fromagent() {
            println("Enter agent no:")
            val reader = Scanner(System.`in`)
            val agentNumber = reader.nextLine()
            val b = agentNumber.length
            if (b == 7) {
                println("Enter the amount You Want Withdrawn")
                val withdrawAmount = reader.nextInt()
                val mpesaBalance = 1000;
                val transcation: Int;
                val mydate = LocalDateTime.now()
                val debit: Int;
                if (withdrawAmount <= 100) {
                    transcation = 0
                } else {
                    transcation = 200
                }
                println("Enter Your Pin ")
                val reader = Scanner(System.`in`)
                val mypink = reader.nextLine()
                val a = mypink.length
                if (a == 4) {
                    val myBalance = (withdrawAmount + transcation)- mpesaBalance
                    debit = (withdrawAmount - mpesaBalance) + transcation
                    if (debit >=0) {
                        println("Failed to Withdraw..You Have Inssufficient BalanceYour Mpesa \nBalance is ${mpesaBalance} Fuliza ${debit} To Continue With The Transaction ")
                    } else {
                        println("UC94H67TH Confirmed.Ksh${withdrawAmount}Was WithDrawn From ${agentNumber} on ${mydate}\nNew Mpesa balance is Ksh${myBalance}\n. Transcation cost Ksh${transcation}\n. Amount you can transcat within the day is 499,999.00 .Earn interest daily on Zidi MMF,Dial*33#")
                    }
                } else {
                    println("Enter Your Pin To Proceed ")
                }
            } else {
                println("Enter The correct Agent number:7 Digits")
                WithdrawCash()
            }
        }

        fun FromAtm() {
            println("Enter Atm  no:")
            val dyce = Scanner(System.`in`)
            val ATm_Number = dyce.nextLine()
            val g = ATm_Number.length
            if (g == 9) {
                fun Debit(){
                    println("Enter Debit number")
                    val Debit_Input = Scanner(System.`in`)
                    val Debit_Number = Debit_Input.nextLine()
                    val tyup =Debit_Number.length
                    println("Enter your pin")
                    val pin_input = Scanner(System.`in`)
                    val mypike = pin_input.nextLine()
                    val hjk = mypike .length
                    if(hjk==4 && tyup == 9 ){
                        println("Enter the Amount you Want to send")
                        val amount_input = Scanner(System.`in`)
                        val Withdraw_Debit_Money = amount_input.nextInt()
                        val Debit_Balance = 1000;
                        val Debit_transcation_Fee:Int;
                        val Fuliza_Debit:Int;
                        val Cummulative_Sent_Money:Int;
                        if(Withdraw_Debit_Money <= 1000){
                            Debit_transcation_Fee = 0
                        }
                        else{
                            Debit_transcation_Fee = 500
                        }
                        Cummulative_Sent_Money = Withdraw_Debit_Money + Debit_transcation_Fee
                        Fuliza_Debit =  Cummulative_Sent_Money - Debit_Balance
                        val myDate = LocalDateTime.now()
                        if( Fuliza_Debit >= 0){
                            println("Failed to Withdraw ${Withdraw_Debit_Money} From .This Account Number ${Debit_Number}..You have insuficient Funds in the Account\n.Your Account Balance is${Debit_Balance}. To Continue Acces Credit Of${Fuliza_Debit}\n Thanks for Your Transcation")

                        }

                            else{
                                println("AFCSGBVBSY: You have Succesfuly Withdrawn  ${Withdraw_Debit_Money} From This Account Number ${Debit_Number}.On This Time ${myDate}\n Your New Account Balance is ${Fuliza_Debit}.Thanks for using This service have a Good day ")
                        }

                    }
                    else{
                        println("Enter Your Pin Correctly .And Debit Number.\nKindly")
                        Debit()
                    }
                }
                fun Credit(){
                    println("Enter Credit number")
                    val Credit_Input = Scanner(System.`in`)
                    val Credit_Number = Credit_Input.nextLine()
                    val tp =Credit_Number.length
                    println("Enter your pin")
                    val pin_input = Scanner(System.`in`)
                    val mypike = pin_input.nextLine()
                    val hj = mypike .length
                    if(hj==4 && tp == 9 ){
                        println("Enter the Amount you Want to send")
                        val Credit_amount_input = Scanner(System.`in`)
                        val Withdraw_Credit_Money = Credit_amount_input.nextInt()
                        val Credit_Balance = 1000;
                        val Credit_transcation_Fee:Int;
                        val Fuliza_Credit:Int;
                        val Cummulative_Sent_Money:Int;
                        if(Withdraw_Credit_Money <= 1000){
                            Credit_transcation_Fee = 0
                        }
                        else{
                            Credit_transcation_Fee = 500
                        }
                        Cummulative_Sent_Money = Withdraw_Credit_Money + Credit_transcation_Fee
                        Fuliza_Credit =  Cummulative_Sent_Money - Credit_Balance
                        val myDate = LocalDateTime.now()
                        if( Fuliza_Credit >= 0){
                            println("Failed to Withdraw ${Withdraw_Credit_Money} From .This Account Number ${Credit_Number}..You have insuficient Funds in the Account\n.Your Account Balance is${Credit_Balance}. To Continue Acces Credit Of${Fuliza_Credit}\n Thanks for Your Transcation")

                        }

                        else{
                            println("AFCSGBVBSY: You have Succesfuly Withdrawn  ${Withdraw_Credit_Money} From This Account Number ${Credit_Number}.On This Time ${myDate}\n Your New Account Balance is ${Fuliza_Credit}.Thanks for using This service have a Good day ")
                        }

                    }
                    else{
                        println("Enter Your Pin Correctly .And Credit Number.\nKindly")
                        Credit()
                    }

                }
                println("Chooce Payment Method:\n 1.Credit.Number\n2.Debit.Number")
                val input_Choice = Scanner(System.`in`)
                val optionM= input_Choice.nextInt()
                when(optionM){
                    1->Debit()
                    2->Credit()
                    else -> "Invalid Choice"
                }
            }
            else{
                println("Enter your ATM NUMBER .Correctly!!\n 9digits")
                FromAtm()
            }
        }
        println("\n1.From Agent\n 2.From ATM\n")
        val reader= Scanner(System.`in`)
        val option13: Int = reader.nextInt()
        when (option13) {
            1 -> Fromagent()
            2 -> FromAtm()
        }
    }

    fun BuyAirtime() {
        fun Myphone() {
            println("Enter Amount")
            val reader = Scanner(System.`in`)
            val amount = reader.nextInt()
            if (amount == 0) {
                val exist = BuyAirtime()
                println(exist)
            } else {
                println("Enter Your Pin")
                val reader = Scanner(System.`in`)
                val mypin = reader.nextLine()
            }
        }

        fun Otherphone() {
            fun searchSim() {
                println("Name(abc....)?")
                val reader: Scanner = Scanner(System.`in`)
                val name = reader.nextLine();
                if (name == "") {
                    val exit = Otherphone()
                    println(exit)

                } else {
                    println("Enter Your Pin")
                    val reader: Scanner = Scanner(System.`in`)
                    val mypin = reader.nextLine()
                }
            }

            fun Enterphone() {
                println("Enter phone no.\n")
                val reader: Scanner = Scanner(System.`in`)
                val phone_no = reader.nextInt()
                if (phone_no == 0) {
                    val exit = Otherphone()
                    println(exit)
                } else {
                    println("Enter Your Pin")
                    val reader: Scanner = Scanner(System.`in`)
                    val mypin = reader.nextLine()
                }
            }

            println("\n 1.Search SIM Contacts\n 2.Enter phone no.\n ")
            val reader: Scanner = Scanner(System.`in`)
            val option17 = reader.nextInt();
            when (option17) {
                1 -> searchSim()
                2 -> Enterphone()
            }

        }

        println("\n 1.My phone\n 2.Other phone\n ")
        val reader: Scanner = Scanner(System.`in`)
        val option14: Int = reader.nextInt()
        when (option14) {
            1 -> Myphone()
            2 -> Otherphone()
        }
    }

    fun LoansandSavings() {
        fun mshwari() {
            fun mshwari_ACTIVATE() {
                println("I Accept M-Shwari terms&Conditions on\n the Safaricom website")
            }
            println("\n1.Activate\n")
            val reader = Scanner(System.`in`)
            val option21: Int = reader.nextInt()
            when (option21) {
                1 -> mshwari_ACTIVATE()
                else -> mshwari()
            }

        }

        fun kcbmpesa() {
            fun kcb_ACTIVATE() {
                println("I Accept KCB -MPESA terms&Conditions on\n the Safaricom website")
            }
            println("\n1.Activate\n ")
            val reader = Scanner(System.`in`)
            val option21: Int = reader.nextInt()
            when (option21) {
                1 -> kcb_ACTIVATE()
                else -> kcbmpesa()
            }

        }
        println("\n 1.M-Shwari\n2.KCB M-PESA")
        val reader = Scanner(System.`in`)
        val option18: Int = reader.nextInt()
        when (option18) {
            1 -> mshwari()
            2 -> kcbmpesa()
            else -> LoansandSavings()
        }

    }

    fun LipanaMPESA() {
        fun paybill() {
            fun SearchContacts() {
                println("Enter name(abc...)?")
                val reader: Scanner = Scanner(System.`in`)
                val contacts: String = reader.nextLine();
                if (contacts == "") {
                    val exit = SearchContacts();
                    println(exit)
                } else {
                    println("Enter Your Pin")
                    val mypin = reader.nextLine()
                }
            }

            fun BusinessNumber() {
                println("Enter business no. ")
                val reader: Scanner = Scanner(System.`in`)
                val bussNo: Int = reader.nextInt()
                if (bussNo == 0) {
                    val exit = BusinessNumber()
                } else {
                    println("Enter Your Pin")
                    val mypin = reader.nextLine()
                }
            }
            println("\n 1.Search From contacts\n 2.Enter business no.\n ")
            val reader = Scanner(System.`in`)
            val option23: Int = reader.nextInt()
            when (option23) {
                1 -> SearchContacts()
                2 -> BusinessNumber()
                else -> paybill()
            }

        }

        fun buygoods() {
            println("Enter till no")
            val reader: Scanner = Scanner(System.`in`)
            val tillNo: String = reader.nextLine()
            if (tillNo == "" && tillNo.length >= 7) {
                val exit = paybill()
                println(exit);
            } else {
                println("Enter Your Pin")
                val mypin44 = reader.nextLine()
            }
        }

        fun pochilaBiashara() {
            println("Enter phone no.")
            val reader: Scanner = Scanner(System.`in`)
            val phonepochi = reader.nextLine()
            if (phonepochi == "" && phonepochi.length >= 4) {
                val exit = paybill()
                println(exit)
            } else {
                println("Enter Your Pin ")
                val mypin = reader.nextLine()
            }
        }

        println("\n 1.Pay Bill\n2.Buy Goods & Services\n 3.Pochi La Biashara")
        val reader = Scanner(System.`in`)
        val option22: Int = reader.nextInt()
        when (option22) {
            1 -> paybill()
            2 -> buygoods()
            3 -> pochilaBiashara()
            else -> LipanaMPESA()
        }

    }

    fun MyAccount() {
        fun MiniStatement() {
            println("Enter M-PESA PIN")
            val reader: Scanner = Scanner(System.`in`)
            val mypin: String = reader.nextLine();
            if (mypin == "") {
                val exit = MyAccount();
                println(exit)
            } else {
                println("Mpesa statements Will be Displayed Here.")
            }
        }

        fun CheckBalance() {
            println("Enter M-PESA PIN")
            val reader: Scanner = Scanner(System.`in`)
            val mypin2: String = reader.nextLine();
            if (mypin2 == " " && mypin2.length == 4) {
                val exit = MyAccount();
                println(exit)
            } else {
                println("YOUR M-PESA BALANCE IS... ")
            }
        }

        fun ChangeMPESAPIN() {
            println("Enter old PIN")
            val reader: Scanner = Scanner(System.`in`)
            val mypin3: String = reader.nextLine();
            if (mypin3 == "" && mypin3.length == 4) {
                val exit = MyAccount();
                println(exit)
            } else {
                println("Enter NEW  PIN")
                val reader: Scanner = Scanner(System.`in`)
                val newpin = reader.nextLine()
                println("Confirm NEW  PIN")
                val confirmpin = reader.nextLine();
                if (newpin == confirmpin) {
                    println("Now You Have Successfully Changed Your Pin")
                } else {
                    println("Enter Your Pin Again")
                    val exit = ChangeMPESAPIN()
                    println(exit)
                }
            }
        }

        fun Changelanguage() {
            fun English() {
                println("Enter M-PESA PIN")
                val reader: Scanner = Scanner(System.`in`)
                val mpesa_language = reader.nextLine()
                if (mpesa_language== "" ) {
                    Changelanguage()
                } else {
                    println("THANKS NOW  YOU ARE USING ENGLISH LANGUAGE")
                }
            }

            fun Kiswahili() {
                println("Enter M-PESA PIN")
                val reader: Scanner = Scanner(System.`in`)
                val mpesa_language = reader.nextLine()
                if (mpesa_language == ""
                ) {
                    val exit = Changelanguage()
                    println(exit)
                } else {
                    println("ASANTE KWA KUTUMIA KISWAHILI KAMA LUGHA YAKO")
                }

            }
            println("\n 1.English\n2.Kiswahili\n")
            val reader: Scanner = Scanner(System.`in`)
            val option = reader.nextInt()
            when (option) {
                1 -> English()
                2 -> Kiswahili()
                else -> Changelanguage()
            }

        }

        fun UpdateCustomerMenu() {
            println("Enter M-PESA PIN")
            val reader: Scanner = Scanner(System.`in`)
            val mpesa_language = reader.nextInt()
            if (mpesa_language == 0) {
                val exit = UpdateCustomerMenu()
                println(exit)
            }
        }
        println("\n1.Mini Statement\n 2.Check Balance\n 3.Change M-PESA PIN\n4.Change language\n5.Update Customer Menu\n ")
        val reader: Scanner = Scanner(System.`in`)
        val option23: Int = reader.nextInt()
        when (option23) {
            1 -> MiniStatement()
            2 -> CheckBalance()
            3 -> ChangeMPESAPIN()
            4 -> Changelanguage()
            5 -> UpdateCustomerMenu()
            else -> MyAccount()
        }

    }
    println("\n 1.Send Money\n 2.Withdraw Cash\n 3.Buy Airtime\n4.Loans and Savings\n 5.Lipa na M-PESA\n 6.My Account\n")
    val reader = Scanner(System.`in`)
    val option20: Int = reader.nextInt()
    when (option20) {
        1 -> SendMoney()
        2 -> WithdrawCash()
        3 -> BuyAirtime()
        4 -> LoansandSavings()
        5 -> LipanaMPESA()
        6 -> MyAccount()
    }
}

fun main() {
    val reader = Scanner(System.`in`)
    val choice: Int
    println("choose what you want \n 1.Safaricom+\n 2.M-pesa")
    choice = reader.nextInt()
    when (choice) {
        1 -> safaricom()
        2 -> mpesa()
    }
}


fun safaricom() {
    fun mbanking() {

        fun BarclaysBank() {
            println("This is Barclays Banks")
        }

        fun CoopBank() {
            println("This is Co op Banks")
        }

        fun fnDTB() {
            println("This is DTB ")
        }

        fun Ecobank() {
            println("This is Eco Bank")
        }

        fun EquityBank() {
            println("This is Equity Bank")

        }

        fun FamilyBank() {
            println("This is Family Bank")
        }

        fun FauluDTM() {
            println("This is Faulu DTM")
        }

        fun FirstCommunity() {
            println("This is First Community")
        }

        fun IMBank() {
            println("This is IM Bank")
        }
        fun More() {

            fun funKCB() {
                println("Sorry. You have insufficient funds\n to use this services. Kindly top up and send the \n  request again")
            }

            fun funKWFT() {
                println("Sorry. You have insufficient funds\n to use this services. Kindly top up and send the \n   request again")


            }

            fun funMSACCO() {
                println("Sorry. You have insufficient funds\n to use this services. Kindly top up and send the \nrequest again")


            }

            fun NationalBank() {
                println("Sorry. You have insufficient funds\n   to use this services. Kindly top up and send the \nrequest again")


            }

            fun NICBank() {
                println("Sorry. You have insufficient funds\n to use this services. Kindly top up and send the \n request again")


            }

            fun PostBank() {
                println("Sorry. You have insufficient funds\n to use this services. Kindly top up and send the \n  request again")


            }

            fun SBMBank() {
                println("Sorry. You have insufficient funds\nto use this services. Kindly top up and send the \nrequest again")


            }

            fun SidianBank() {
                println("Sorry. You have insufficient funds\n to use this services. Kindly top up and send the \nrequest again")


            }

            fun StandardChartered() {
                println("Sorry. You have insufficient funds\n  to use this services. Kindly top up and send the \n request again")


            }
            println("1.KCB:\n2.KWFT:\n 3.M-SACCO:\n 4.National Bank:\n 5.NIC Bank:\n 6.Post Bank:\n 7.SBM Bank:\n 8.Sidian Bank:\n 9.Standard Chartered:\n    ")
            val reader: Scanner = Scanner(System.`in`)
            val option12 = reader.nextInt()
            when (option12) {
                1 -> funKCB()
                2 -> funKWFT()
                3 -> funMSACCO()
                4 -> NationalBank()
                5 -> NICBank()
                6 -> PostBank()
                7 -> SBMBank()
                8 -> SidianBank()
                9 -> StandardChartered()
            }
        }
        println("1.Barclays Bank\n 2.Co-op Bank\n3.DTB\n 4.Ecobank\n5.Equity Bank\n 6.Family Bank\n 7.Faulu DTM\n 8.First Community\n 9.I&M Bank\n10.More...\n ")
        val reader = Scanner(System.`in`)
        val option10: Int = reader.nextInt()
        when (option10) {
            1 -> BarclaysBank()
            2 -> CoopBank()
            3 -> fnDTB()
            4 -> Ecobank()
            5 -> EquityBank()
            6 -> FamilyBank()
            7 -> FauluDTM()
            8 -> FirstCommunity()
            9 -> IMBank()
            10 -> More()
        }
    }
    fun myaccount() {
        fun Mpes(){
            fun MpesaPinManager(){
               // println("Welcome to Mp-Pin-Manager")
                println("Want to change your pin")
            }
            fun BusinessLoans(){
                ///println("Welcome to Businessty-Loans")
            }
            fun MpesaProducts(){
                println("Welcome to Mpesa-Products")
            }
            fun MpesaBusinessTill(){
                println("Welcome to Mpesa -Business-Till")
            }
            fun MpesaAgentServices(){
                println("Welcome to Mpesa -Agent-Services")
            }
            fun MerchantServices(){
                println("welcome to Mpesa -Mechant -Services")
            }
            fun MpesaInformation(){
                println("Welcome to Mpesa -Information")
            }
            fun More(){
                println("More info:")
            }
            val reader = Scanner(System.`in`)
            println("Welcome to Mpesa platform ..")
            println("\n1.MpesaPinManager\n 2.BusinessLoans\n 3.MpesaProducts\n 4.MpesaBusinessTill\n 5.MpesaAgentServices\n 6.MerchantServices\n7.MpesaInformation\n98.More:\n ")
            val option7:Int= reader.nextInt()
            when(option7){
                1->MpesaPinManager()
                2->BusinessLoans()
                3->MpesaProducts()
                4->MpesaBusinessTill()
                5->MpesaAgentServices()
                6->MerchantServices()
                7->MpesaInformation()
                98 ->More()
            }
            println("\n1.Prepaid\n 2.Postpaid\n 3.Mpesa\n")
            fun Prepaid(){
                println("pliz dail *100# .To access Prepaid")
            }
            fun Postpaid(){
                println("pliz dail *100# .To access postpaid Services")
            }
            val option5:Int=reader.nextInt()
            when(option5){
                1->Prepaid()
                2->Postpaid()
                3->Mpes()
            }

        }
        fun Topup(){
            println("\n1.MyNumber:\n 2.Another Safaricom Number:\n ")
            val reader= Scanner(System.`in`)
            val option4:Int= reader.nextInt()
            when(option4){
                1->myNumber()
                2->AnotherNumber()
            }


        }
        fun Selfcare(){
            fun Mpesa() {
                fun MpesaPinManager(){
                    println("Welcome to Mpesa-Pin-Manager")
                    fun Authentication() {
                        val patern = Regex("^[0-9]{4}$")
                        println("Create Your First pin ")
                        val pinNumber = reader.nextLine()
                        if (!pinNumber.matches(patern)) {
                            println("Confirm Your Pin")
                            val Confirm_pinNumber = reader.nextLine()
                            if (pinNumber != Confirm_pinNumber) {
                                println("You have Entered the Wrong Pin.Retry")
                                Authentication()
                            } else {
                                println("You have Succesfully Created Your First_Pin.Keep it Safe")

                                fun idVerification() {
                                    println("Enter Your Id Number .{ 8 values}")
                                    val IDNumber: Int = reader.nextInt()
                                    val confirmNUmber: String = IDNumber.toString()
                                    val confirm_ID_Length = (confirmNUmber.length) != 8
                                    if (confirm_ID_Length) {
                                        println("Wrong ID length .Please Try Again:")
                                        idVerification()
                                    } else {
                                        println("Your ID Number is Captured Successfully")

                                    }
                                }
                                idVerification()
                            }

                        }
                    }
                    Authentication()
                }
                fun BusinessLoans(){
                    println("Welcome to Business-Loans")
                }
                fun MpesaProducts(){
                    println("Welcome to Mpesa-Products")
                }
                fun MpesaBusinessTill(){
                    println("Welcome to Mpesa -Business-Till")
                }
                fun MpesaAgentServices(){
                    println("Welcome to Mpesa -Agent-Services")
                }
                fun MerchantServices(){
                    println("welcome to Mpesa -Mechant -Services")
                }
                fun MpesaInformation(){
                    println("Welcome to Mpesa -Information")
                }
                fun More(){
                    println("More info:")
                }
                println("Welcome to Mpesa platform ..")
                println("\n1.MpesaPinManager\n2.BusinessLoans\n 3.MpesaProducts\n 4.MpesaBusinessTill\n5.MpesaAgentServices\n 6.MerchantServices\n7.MpesaInformation\n 98.More..\n ")
                val reader = Scanner(System.`in`)
                val option6: Int = reader.nextInt()
                when (option6) {
                    1 -> MpesaPinManager()
                    2 -> BusinessLoans()
                    3 -> MpesaProducts()
                    4 -> MpesaBusinessTill()
                    5 -> MpesaAgentServices()
                    6 -> MerchantServices()
                    7 -> MpesaInformation()
                    98 -> More()
                }
            }
            println("\n1.Prepaid\n 2.Postpaid\n 3.Mpesa\n ")
            fun Prepaid(){
                println("pliz dail *100# .To access Prepaid")
            }
            fun Postpaid(){
                println("pliz dail *100# .To access postpaid Services")
            }
            val reader= Scanner(System.`in`)
            val option5:Int=reader.nextInt()
            when(option5){
                1->Prepaid()
                2->Postpaid()
                3-> Mpesa()
            }



        }
        fun Balance(){
            println("\n1.Prepaid\n2.PostPaid\n")
            fun Prepaid(){
                println("pliz dail *100# .To access Prepaid")
            }
            fun Postpaid(){
                println("pliz dail *100# .To access postpaid Services")
            }
            val reader= Scanner(System.`in`)
            val option3:Int= reader.nextInt()
            when(option3){
                1-> Prepaid()
                2 -> Postpaid()
            }


        }
        fun CustomerCare(){
            println("1.Prepaid\n 2.Postpaid:")
            fun Prepaid(){
                println("pliz dail *100# .To access Prepaid")
            }
            fun Postpaid(){
                println("pliz dail *100# .To access postpaid Services")
            }
            val reader =Scanner(System.`in`)
            val option7 = reader.nextInt()
            when(option7){
                1->Prepaid()
                2->Postpaid()
            }


        }
        println("\n1.Balance\n 2.Top -Up\n 3.Self Care\n 4.Customer Care:\n ")
        val reader = Scanner(System.`in`)
        val option2: Int = reader.nextInt()
        when (option2) {
            1 -> Balance()
            2 -> Topup()
            3 -> Selfcare()
            4 -> CustomerCare()

        }
    }

    println("Welcome To  safaricom")
    val reader = Scanner(System.`in`)
    println("\n1.My Account\n 2.M-Banking\n ")
    val options: Int;
    options = reader.nextInt()
    when (options) {
        1 -> myaccount()
        2 -> mbanking()
        else -> "invalid Option"
    }
}
fun AnotherNumber(){
    println("Enter Voucher Pin")
    val reader= Scanner(System.`in`)
    val voucher_Number = reader.nextLine()
}
fun myNumber(){
    println("Enter Voucher Pin")
    val reader= Scanner(System.`in`)
    val voucher_Number = reader.nextLine()
}
