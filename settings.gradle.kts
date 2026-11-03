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

// One module per watch brand. Add a brand: create :driver:<brand>, include it here and in :app.
include(":driver:standard")
include(":driver:garmin")
include(":driver:huawei")
include(":driver:zepp")

include(":feature:onboarding")
include(":feature:home")
include(":feature:activity")
include(":feature:sleep")
include(":feature:devices")
include(":feature:profile")
