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

    // RaceCard (D-1106): real imageUrl via Coil when present, gradient-by-terrain fallback otherwise.
    implementation(libs.coil.compose)

    // Opens a race's registrationUrl without leaving the app (D-1105); shared by Home's carousel
    // and the full RacesScreen list, both of which depend on this module already.
    implementation(libs.androidx.browser)
}
