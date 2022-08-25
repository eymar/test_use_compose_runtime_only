import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import kotlin.test.Test
import kotlin.test.assertTrue

class SimpleTests {

    @Test
    fun abc() {
        assertTrue("abc" == "abc".toCharArray().joinToString(separator = ""))
    }

    @Test
    fun cba() {
        var i = 0
        callComposable {
            val a = remember { "a" }
            A(a) {
                i++
            }
        }
        assertTrue(i == 1)
    }
}
