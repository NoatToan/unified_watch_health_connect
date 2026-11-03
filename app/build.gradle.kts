plugins {
    alias(libs.plugins.unifiedhealth.android.application)
    alias(libs.plugins.unifiedhealth.android.compose)
    alias(libs.plugins.unifiedhealth.hilt)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.unified.health"

    defaultConfig {
        applicationId = "com.unified.health"
        versionCode = 1
        versionName = "0.1.0"
    }

    buildTypes {
        debug {
            applicationIdSuffix = ".debug"
        }
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(projects.core.model)
    implementation(projects.core.domain)
    implementation(projects.core.designsystem)
    implementation(projects.core.data)
    implementation(projects.core.ble)

    // Watch drivers register themselves into DriverRegistry through Hilt multibinding.
    implementation(projects.driver.standard)
    implementation(projects.driver.garmin)
    implementation(projects.driver.huawei)
    implementation(projects.driver.zepp)

    implementation(projects.feature.onboarding)
    implementation(projects.feature.home)
    implementation(projects.feature.activity)
    implementation(projects.feature.sleep)
    implementation(projects.feature.devices)
    implementation(projects.feature.profile)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.compose.material.icons.extended)
    implementation(libs.kotlinx.serialization.json)

    testImplementation(libs.junit4)
}
