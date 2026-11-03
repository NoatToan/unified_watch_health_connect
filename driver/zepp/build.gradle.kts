plugins {
    alias(libs.plugins.unifiedhealth.android.library)
    alias(libs.plugins.unifiedhealth.hilt)
}

android {
    namespace = "com.unified.health.driver.zepp"
}

dependencies {
    implementation(projects.core.ble)
    implementation(libs.kotlinx.coroutines.android)
    // Lightweight EC API only: Zepp OS uses ECDH on sect163r2, which Android JCA does not provide.
    implementation(libs.bouncycastle.prov)

    testImplementation(projects.core.testing)
}
