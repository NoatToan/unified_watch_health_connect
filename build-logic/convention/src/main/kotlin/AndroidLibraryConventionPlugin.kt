import com.android.build.api.dsl.LibraryExtension
import com.unified.health.buildlogic.JAVA_VERSION
import com.unified.health.buildlogic.configureKotlinJvmTarget
import com.unified.health.buildlogic.libs
import com.unified.health.buildlogic.library
import com.unified.health.buildlogic.pluginId
import com.unified.health.buildlogic.versionInt
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

/** Base configuration shared by every Android library module. */
class AndroidLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.apply(libs.pluginId("android-library"))

        extensions.configure<LibraryExtension> {
            compileSdk = libs.versionInt("compileSdk")
            defaultConfig {
                minSdk = libs.versionInt("minSdk")
                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            }
            compileOptions {
                sourceCompatibility = JAVA_VERSION
                targetCompatibility = JAVA_VERSION
            }
            lint {
                targetSdk = libs.versionInt("targetSdk")
            }
            testOptions {
                targetSdk = libs.versionInt("targetSdk")
                unitTests.isReturnDefaultValues = true
            }
        }
        configureKotlinJvmTarget()

        dependencies {
            add("testImplementation", libs.library("junit4"))
            add("testImplementation", libs.library("kotlinx-coroutines-test"))
        }
    }
}
