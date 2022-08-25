import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
fun A(a: String, content: @Composable () -> Unit = {}) {
    println(a)
    content()
}
