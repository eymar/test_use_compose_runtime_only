import androidx.compose.runtime.remember

fun main() {
//    println("Hello world!")
    callComposable {
        val a = remember { "a" }
        A("A = $a")
    }
}
