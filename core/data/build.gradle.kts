plugins {
    alias(libs.plugins.unifiedhealth.android.library)
    alias(libs.plugins.unifiedhealth.hilt)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.unified.health.core.data"
}

ksp {
    arg("room.schemaLocation", "$projectDir/schemas")
    arg("room.generateKotlin", "true")
}

dependencies {
    api(projects.core.domain)
    implementation(projects.core.ble)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)
    implementation(libs.androidx.datastore.preferences)
    implementation(libs.androidx.health.connect.client)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.serialization.json)

    // Races feed fetch (D-1107): lightest HTTP client, no existing network stack in the project.
    implementation(libs.okhttp)
}
