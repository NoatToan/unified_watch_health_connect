pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "UnifiedHealth"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":app")

include(":core:model")
include(":core:domain")
include(":core:designsystem")
include(":core:ble")
include(":core:data")
include(":core:testing")
// Debug/test-only mock watch + demo data (never in release, see docs/DECISIONS.md D-201).
include(":core:demo")

// One module per watch brand. Add a brand: create :driver:<brand>, include it here and in :app.
include(":driver:standard")
include(":driver:garmin")
include(":driver:huawei")
include(":driver:zepp")
include(":driver:coros")

include(":feature:onboarding")
include(":feature:home")
include(":feature:activity")
include(":feature:devices")
include(":feature:profile")
include(":feature:races")
