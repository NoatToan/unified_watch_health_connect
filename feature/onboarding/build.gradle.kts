plugins {
    alias(libs.plugins.unifiedhealth.android.feature)
}

android {
    namespace = "com.unified.health.feature.onboarding"
}

dependencies {
    // Only for PermissionController.createRequestPermissionResultContract().
    implementation(libs.androidx.health.connect.client)
}
