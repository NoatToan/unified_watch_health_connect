plugins {
    alias(libs.plugins.unifiedhealth.android.feature)
}

android {
    namespace = "com.unified.health.feature.devices"
}

dependencies {
    // "Pair with QR code": CameraX preview/analysis + ZXing decoder (no Google Play Services
    // dependency, needed so Huawei phones without GMS can still scan). D-900, docs/DECISIONS.md.
    implementation(libs.androidx.camera.core)
    implementation(libs.androidx.camera.camera2)
    implementation(libs.androidx.camera.lifecycle)
    implementation(libs.androidx.camera.view)
    implementation(libs.zxing.core)
}
