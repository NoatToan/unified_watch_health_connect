plugins {
    alias(libs.plugins.unifiedhealth.android.feature)
}

android {
    namespace = "com.unified.health.feature.profile"
}

dependencies {
    // EN/VI toggle (D-1040): AppCompatDelegate.setApplicationLocales.
    implementation(libs.androidx.appcompat)
}
