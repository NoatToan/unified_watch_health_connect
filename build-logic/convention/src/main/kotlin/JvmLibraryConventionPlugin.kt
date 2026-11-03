import com.unified.health.buildlogic.JAVA_VERSION
import com.unified.health.buildlogic.configureKotlinJvmTarget
import com.unified.health.buildlogic.libs
import com.unified.health.buildlogic.library
import com.unified.health.buildlogic.pluginId
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

/** Pure Kotlin/JVM module (no Android dependency) used for :core:model and :core:domain. */
class JvmLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.apply(libs.pluginId("kotlin-jvm"))
        extensions.configure<JavaPluginExtension> {
            sourceCompatibility = JAVA_VERSION
            targetCompatibility = JAVA_VERSION
        }
        configureKotlinJvmTarget()
        dependencies {
            add("testImplementation", libs.library("junit4"))
            add("testImplementation", libs.library("kotlinx-coroutines-test"))
        }
    }
}
