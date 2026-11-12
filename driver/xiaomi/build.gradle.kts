plugins {
    alias(libs.plugins.unifiedhealth.android.library)
    alias(libs.plugins.unifiedhealth.hilt)
}

android {
    namespace = "com.unified.health.driver.xiaomi"
}

dependencies {
    implementation(projects.core.ble)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.bouncycastle.prov)

    testImplementation(projects.core.testing)
}
