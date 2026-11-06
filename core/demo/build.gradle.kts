plugins {
    alias(libs.plugins.unifiedhealth.android.library)
    alias(libs.plugins.unifiedhealth.hilt)
}

// Debug/test-only: the app adds this module with `debugImplementation`, so release builds contain
// no mock driver, fake GATT link, demo generator or seeder (see docs/DECISIONS.md D-006, D-201).
android {
    namespace = "com.unified.health.core.demo"

    defaultConfig {
        // `-PunifiedHealth.mockDevice=false` hides the simulated watch (seeding stays available).
        val mockDevice = providers.gradleProperty("unifiedHealth.mockDevice").orNull?.toBoolean() ?: true
        buildConfigField("boolean", "MOCK_DEVICE", mockDevice.toString())
    }

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
    implementation(projects.core.ble)
    implementation(libs.kotlinx.coroutines.android)

    testImplementation(projects.core.testing)
    // The real Zepp driver against the simulated watch (ZeppVirtualWatchDriverTest), same pairing as the E2E.
    testImplementation(projects.driver.zepp)
}
