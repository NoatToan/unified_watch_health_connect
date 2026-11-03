import com.unified.health.buildlogic.libs
import com.unified.health.buildlogic.library
import com.unified.health.buildlogic.pluginId
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.project

/**
 * A feature module = Android library + Compose + Hilt + type-safe navigation.
 * Features depend on domain/designsystem only, never on :core:data or other features.
 */
class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.apply("unifiedhealth.android.library")
        pluginManager.apply("unifiedhealth.android.compose")
        pluginManager.apply("unifiedhealth.hilt")
        pluginManager.apply(libs.pluginId("kotlin-serialization"))

        dependencies {
            add("implementation", project(":core:model"))
            add("implementation", project(":core:domain"))
            add("implementation", project(":core:designsystem"))

            add("implementation", libs.library("androidx-core-ktx"))
            add("implementation", libs.library("androidx-activity-compose"))
            add("implementation", libs.library("androidx-lifecycle-runtime-compose"))
            add("implementation", libs.library("androidx-lifecycle-viewmodel-compose"))
            add("implementation", libs.library("androidx-navigation-compose"))
            add("implementation", libs.library("androidx-hilt-lifecycle-viewmodel-compose"))
            add("implementation", libs.library("androidx-compose-material-icons-extended"))
            add("implementation", libs.library("kotlinx-serialization-json"))
            add("implementation", libs.library("kotlinx-coroutines-android"))
        }
    }
}
