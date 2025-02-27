package net.opendasharchive.openarchive

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import net.opendasharchive.openarchive.services.internetarchive.IaConduit
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class StartTest {

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("net.opendasharchive.openarchive.release", appContext.packageName)
    }

    @Test
    fun splitTags() {
        val pieces = IaConduit.splitTags("foo bar;baz,bam  bum")

        Assert.assertEquals(listOf("foo", "bar", "baz", "bam", "bum"), pieces)
    }
}