plugins {
    alias(libs.plugins.unifiedhealth.android.library)
    alias(libs.plugins.unifiedhealth.android.compose)
}

android {
    namespace = "com.unified.health.core.designsystem"
}

dependencies {
    api(projects.core.model)
    api(libs.androidx.compose.material.icons.extended)
    implementation(libs.androidx.core.ktx)
}
