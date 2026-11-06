plugins {
    alias(libs.plugins.unifiedhealth.android.library)
    alias(libs.plugins.unifiedhealth.hilt)
}

android {
    namespace = "com.unified.health.driver.huawei.wearengine"
}

dependencies {
    implementation(projects.core.ble)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.huawei.wearengine)

    testImplementation(projects.core.testing)
}
