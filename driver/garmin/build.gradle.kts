plugins {
    alias(libs.plugins.unifiedhealth.android.library)
    alias(libs.plugins.unifiedhealth.hilt)
}

android {
    namespace = "com.unified.health.driver.garmin"
}

dependencies {
    implementation(projects.core.ble)
    implementation(libs.kotlinx.coroutines.android)

    testImplementation(projects.core.testing)
}
