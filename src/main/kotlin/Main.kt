fun main(args: Array<String>) {
    val thisIsATest = "This is a test!"
    val zero = 0
    val numberLarge = 3000000000000L
    val pi = 3.1415927f
    val numberDouble: Double = 13.77
    val personalBudget = numberLarge % 3
    val personalIncomeBeforeTax = false
    val personalIncomeAfterTax = true
    val personalIncomeOperationStart = if ((personalIncomeBeforeTax || personalIncomeAfterTax) && !(personalIncomeBeforeTax == personalIncomeAfterTax)) println("Program started!") else "Error!"

    val logo = Logo()
    val startup = Startup()

    println("$thisIsATest" + "\n Code " + zero)
    println(logo.showLogo())
    println(startup.enterUsername())
    logo.enterUsername()
}