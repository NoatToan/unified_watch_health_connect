import com.android.build.api.dsl.ApplicationExtension
import com.unified.health.buildlogic.JAVA_VERSION
import com.unified.health.buildlogic.configureKotlinJvmTarget
import com.unified.health.buildlogic.libs
import com.unified.health.buildlogic.pluginId
import com.unified.health.buildlogic.versionInt
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

/** Base configuration for the :app module. Kotlin support is built into AGP 9+. */
class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.apply(libs.pluginId("android-application"))

        extensions.configure<ApplicationExtension> {
            compileSdk = libs.versionInt("compileSdk")
            defaultConfig {
                minSdk = libs.versionInt("minSdk")
                targetSdk = libs.versionInt("targetSdk")
                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                vectorDrawables.useSupportLibrary = true
            }
            compileOptions {
                sourceCompatibility = JAVA_VERSION
                targetCompatibility = JAVA_VERSION
            }
            packaging {
                resources.excludes += "/META-INF/{AL2.0,LGPL2.1}"
            }
        }
        configureKotlinJvmTarget()
    }
}
