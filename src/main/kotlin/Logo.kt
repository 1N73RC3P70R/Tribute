data class asciiData(
    val logo: String? = ".-++-.",
    val companyName: String? = "All additional information goes here."
)

class Logo : Startup() {

    fun showLogo() {
        val asciiDataInteraction = asciiData()
        val funcPrintLogo: (String) -> Unit = { a: String -> println(a + asciiDataInteraction.logo) }

        if (startOnPress(true)) {
            funcPrintLogo("Welcome, admin!")
            funcPrintLogo("Welcome, user!")
            println(asciiDataInteraction.companyName!!.length)
        }
    }
}