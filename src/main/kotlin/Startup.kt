data class startupData(val username: String? = null)
open class Startup {
    fun startOnPress(isPressed: Boolean): Boolean {
return isPressed
    }

    fun enterUsername(){
        var startupDataInteraction = startupData()
        println(startupDataInteraction.username ?: "Invalid username!")
    }
}