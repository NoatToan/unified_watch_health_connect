plugins {
    alias(libs.plugins.unifiedhealth.android.library)
    alias(libs.plugins.unifiedhealth.hilt)
}

// Debug/test-only: the app adds this module with `debugImplementation`, so release builds contain
// no mock driver, fake GATT link, demo generator or seeder (see docs/DECISIONS.md D-006, D-201).
// Whether the simulated watches show up is a runtime switch now (Profile > Developer > Demo mode,
// `DemoModeController`, default off), not a build-time flag (D-710 supersedes the old
// `-PunifiedHealth.mockDevice` Gradle property).
android {
    namespace = "com.unified.health.core.demo"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
    implementation(projects.core.ble)
    implementation(libs.kotlinx.coroutines.android)
    // DemoModeControllerImpl reads/writes the same Preferences DataStore as :core:data's repositories.
    implementation(libs.androidx.datastore.preferences)

    testImplementation(projects.core.testing)
    // The real Zepp driver against the simulated watch (ZeppVirtualWatchDriverTest), same pairing as the E2E.
    testImplementation(projects.driver.zepp)
}
