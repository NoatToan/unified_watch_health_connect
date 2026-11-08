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
        // Hilt-aware runner (HiltTestApplication) for the E2E suite in src/androidTest.
        testInstrumentationRunner = "com.unified.health.HiltTestRunner"
        // Screenshots + step records go through TestStorage (/sdcard/googletest/test_outputfiles).
        testInstrumentationRunnerArguments["useTestStorageService"] = "true"
    }

    testOptions {
        // Each test in its own process: fresh Hilt graph, no DataStore "multiple instances" clash.
        execution = "ANDROIDX_TEST_ORCHESTRATOR"
        animationsDisabled = true
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
    implementation(projects.driver.coros)

    // Simulated "Demo watch" + demo-data seeder: debug/androidTest only, never in release (D-006, D-201).
    debugImplementation(projects.core.demo)

    implementation(projects.feature.onboarding)
    implementation(projects.feature.home)
    implementation(projects.feature.activity)
    implementation(projects.feature.devices)
    implementation(projects.feature.profile)
    implementation(projects.feature.races)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.compose.material.icons.extended)
    implementation(libs.kotlinx.serialization.json)

    testImplementation(libs.junit4)

    androidTestImplementation(libs.androidx.test.runner)
    androidTestImplementation(libs.androidx.test.rules)
    androidTestImplementation(libs.androidx.test.core)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.androidx.test.uiautomator)
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.hilt.android.testing)
    androidTestImplementation(projects.core.demo)
    kspAndroidTest(libs.hilt.compiler)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    androidTestImplementation(libs.androidx.test.storage)
    androidTestUtil(libs.androidx.test.orchestrator)
    androidTestUtil(libs.androidx.test.services)
}
