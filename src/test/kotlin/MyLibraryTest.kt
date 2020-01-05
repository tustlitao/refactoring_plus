import org.junit.Assert.assertEquals
import org.junit.Test

/**
create by tustlitao 2020/1/4
 */
class MyLibraryTest {
    @Test
    fun testMyLanguage() {
        assertEquals("Kotlin", MyLibrary().kotlinLanguage().name)
        assertEquals(10, MyLibrary().kotlinLanguage().hotness)
    }
}