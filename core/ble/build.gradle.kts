plugins {
    alias(libs.plugins.unifiedhealth.android.library)
    alias(libs.plugins.unifiedhealth.hilt)
}

android {
    namespace = "com.unified.health.core.ble"

    defaultConfig {
        // `./gradlew installDebug -PunifiedHealth.fakeBle=true` forces the demo devices.
        val fakeBle = providers.gradleProperty("unifiedHealth.fakeBle").orNull?.toBoolean() ?: false
        buildConfigField("boolean", "FAKE_BLE", fakeBle.toString())
    }

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    api(projects.core.model)
    api(libs.kotlinx.coroutines.core)
    api(libs.javax.inject)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.androidx.core.ktx)

    testImplementation(projects.core.testing)
}
