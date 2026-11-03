plugins {
    alias(libs.plugins.unifiedhealth.android.library)
}

android {
    namespace = "com.unified.health.core.testing"
}

// Test doubles for driver modules: add as `testImplementation(projects.core.testing)`.
dependencies {
    api(projects.core.ble)
    api(libs.kotlinx.coroutines.test)
    api(libs.junit4)
}
