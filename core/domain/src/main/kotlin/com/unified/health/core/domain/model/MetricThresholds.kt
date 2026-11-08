package com.unified.health.core.domain.model

import com.unified.health.core.model.StressLevel
import kotlin.math.roundToInt

/**
 * "What counts as normal" for the metrics this app tracks: the generic, publicly documented
 * reference ranges a fitness app ships with by default (resting HR, HR zones, sleep, SpO2, VO2max
 * bands, stress bands, watch-battery alert levels) plus the default daily goals (steps, active
 * calories, active minutes). See docs/DECISIONS.md D-1030.
 *
 * [DefaultMetricThresholds] holds the industry-default [MetricThresholds]. Only step/calorie/sleep
 * goals are user-adjustable in this first round, via the nullable override fields on
 * [com.unified.health.core.model.UserPreferences]; HR zones, SpO2 and VO2max bands are read-only
 * (docs/DECISIONS.md D-1030 — a full editor for those is deferred).
 *
 * VO2max is only ever categorized into a [Vo2MaxCategory] band here, never scored or combined into a
 * single number: docs/DECISIONS.md D-803 forbids reproducing a vendor's proprietary fitness-score
 * algorithm (Firstbeat VO2max/fitness age, Body Battery, PAI…).
 */
data class MetricThresholds(
    /** Normal resting heart rate, bpm. */
    val restingHeartRate: IntRange,
    /** The 5 universal heart-rate-zone bands (Karvonen/%HRmax model), in ascending order Z1..Z5. */
    val heartRateZones: List<HeartRateZone>,
    /** Recommended nightly sleep duration for adults, in hours. */
    val sleepDurationHours: IntRange,
    val spo2: SpO2Thresholds,
    /** Published reference VO2max bands by sex and age bracket; display-only (see class doc). */
    val vo2MaxBands: List<Vo2MaxBand>,
    /** Perceived-stress score (0..100) bands, in ascending order. */
    val stressBands: List<StressBand>,
    /** Active-energy goal used when no [BodyProfile] is known and no user override is set, kcal/day. */
    val defaultActiveCalorieGoal: Int,
    /** Active-minutes goal, minutes/day (not user-adjustable in this round). */
    val defaultActiveMinutesGoal: Int,
    /** At or below this battery percent a paired watch is "low" (Profile › Notifications, D-807). */
    val lowBatteryPercent: Int,
    /** A device is re-armed for another low-battery alert only once it reports at least this (hysteresis). */
    val recoveredBatteryPercent: Int,
) {
    /** The band whose [HeartRateZone.percentOfMaxHr] contains [percentOfMax] (0..100-ish), or null below Z1/above Z5. */
    fun heartRateZoneFor(percentOfMax: Int): HeartRateZone? = heartRateZones.firstOrNull { percentOfMax in it.percentOfMaxHr }

    /** The band whose [StressBand.scoreRange] contains [score]; bands cover the whole 0..100 range. */
    fun stressLevelFor(score: Int): StressLevel = stressBands.first { score in it.scoreRange }.level

    /** The closest-matching band for [vo2Max] (ml/kg/min) at [age] and [sex], or null if no band for that sex/age exists. */
    fun vo2MaxCategoryFor(vo2Max: Double, age: Int, sex: BiologicalSex): Vo2MaxCategory? =
        vo2MaxBands.filter { it.sex == sex && age in it.ageRange && vo2Max >= it.minMlPerKgPerMin }
            .maxByOrNull { it.minMlPerKgPerMin }
            ?.category

    /**
     * Active-energy goal for a day: [BodyProfile.restingEnergyKcal] scaled by [activityLevel] minus
     * the resting baseline itself (the *active* portion of total daily energy expenditure), or
     * [defaultActiveCalorieGoal] when [profile] is unknown — onboarding does not collect a body
     * profile yet, so this is the common path today (docs/DECISIONS.md D-1030: BMR × activity factor
     * instead of a fixed constant, once that input exists).
     */
    fun activeCalorieGoal(profile: BodyProfile?, activityLevel: ActivityLevel = ActivityLevel.MODERATELY_ACTIVE): Int {
        val restingKcal = profile?.restingEnergyKcal() ?: return defaultActiveCalorieGoal
        return (restingKcal * (activityLevel.factor - 1.0)).roundToInt()
    }
}

/** One of the 5 universal heart-rate-zone bands used industry-wide. */
data class HeartRateZone(
    val zone: Int,
    val label: String,
    /** Inclusive %HRmax range, e.g. 50..60 for Z1. */
    val percentOfMaxHr: IntRange,
)

data class SpO2Thresholds(
    /** The normal range at sea level, percent. */
    val normal: IntRange,
    /** At or below this percent, SpO2 is low enough to alert on. */
    val alertBelowPercent: Int,
)

enum class BiologicalSex { MALE, FEMALE }

/** Qualitative VO2max category — a band label only, never a score (docs/DECISIONS.md D-803). */
enum class Vo2MaxCategory { LOW, BELOW_AVERAGE, AVERAGE, ABOVE_AVERAGE, HIGH, SUPERIOR }

/**
 * One published VO2max reference band for a sex/age bracket. Bands for the same [sex]/[ageRange] are
 * contiguous and ascending, so [minMlPerKgPerMin] alone (no explicit upper bound) is enough to place
 * a value — the next band's minimum is this band's maximum.
 */
data class Vo2MaxBand(
    val category: Vo2MaxCategory,
    val sex: BiologicalSex,
    val ageRange: IntRange,
    val minMlPerKgPerMin: Double,
)

data class StressBand(val level: StressLevel, val scoreRange: IntRange)

/** Minimal body inputs for the resting-energy formula below; not collected by onboarding yet. */
data class BodyProfile(val weightKg: Double, val heightCm: Double, val age: Int, val sex: BiologicalSex) {
    /** Mifflin-St Jeor resting energy expenditure, kcal/day — a standard published formula, not a vendor algorithm. */
    fun restingEnergyKcal(): Double {
        val base = 10 * weightKg + 6.25 * heightCm - 5 * age
        return if (sex == BiologicalSex.MALE) base + 5 else base - 161
    }
}

/** Standard Harris-Benedict/Mifflin activity multipliers, sedentary to very active. */
enum class ActivityLevel(val factor: Double) {
    SEDENTARY(1.2),
    LIGHTLY_ACTIVE(1.375),
    MODERATELY_ACTIVE(1.55),
    VERY_ACTIVE(1.725),
    EXTRA_ACTIVE(1.9),
}

object DefaultMetricThresholds {

    /**
     * Approximate, commonly published VO2max reference bands by sex and age bracket (the kind of
     * general table cited across the fitness industry, e.g. Cooper Institute-style norms). These are
     * a rough reference for "where does this value fall", not a precise lab-grade measurement.
     * [Vo2MaxCategory.LOW] is the catch-all below [Vo2MaxCategory.BELOW_AVERAGE]'s minimum, hence `0.0`.
     */
    private val VO2MAX_BANDS: List<Vo2MaxBand> = run {
        val brackets = listOf(18..29, 30..49, 50..120)
        // One row per bracket, one column per Vo2MaxCategory entry (LOW, BELOW_AVERAGE, AVERAGE, ABOVE_AVERAGE, HIGH, SUPERIOR).
        val men = listOf(
            listOf(0.0, 35.0, 42.0, 46.0, 53.0, 60.0),
            listOf(0.0, 30.0, 37.0, 42.0, 48.0, 55.0),
            listOf(0.0, 25.0, 32.0, 36.0, 42.0, 49.0),
        )
        val women = listOf(
            listOf(0.0, 28.0, 34.0, 38.0, 44.0, 50.0),
            listOf(0.0, 24.0, 30.0, 34.0, 40.0, 46.0),
            listOf(0.0, 20.0, 25.0, 29.0, 35.0, 41.0),
        )
        val categories = Vo2MaxCategory.entries
        buildList {
            brackets.forEachIndexed { bracketIndex, range ->
                categories.forEachIndexed { categoryIndex, category ->
                    add(Vo2MaxBand(category, BiologicalSex.MALE, range, men[bracketIndex][categoryIndex]))
                    add(Vo2MaxBand(category, BiologicalSex.FEMALE, range, women[bracketIndex][categoryIndex]))
                }
            }
        }
    }

    /**
     * Resting energy of a sex-neutral reference adult (70 kg, 170 cm, 35 y/o — averaged over both
     * sexes since no real [BodyProfile] is collected yet), scaled by [ActivityLevel.MODERATELY_ACTIVE]
     * and reduced to just the active portion, per docs/DECISIONS.md D-1030 ("BMR × activity factor
     * instead of a fixed constant").
     */
    private val REFERENCE_ACTIVE_CALORIE_GOAL: Int = run {
        val restingKcal = listOf(BiologicalSex.MALE, BiologicalSex.FEMALE)
            .map { BodyProfile(weightKg = 70.0, heightCm = 170.0, age = 35, sex = it).restingEnergyKcal() }
            .average()
        (restingKcal * (ActivityLevel.MODERATELY_ACTIVE.factor - 1.0)).roundToInt()
    }

    val VALUES = MetricThresholds(
        restingHeartRate = 60..100,
        heartRateZones = listOf(
            HeartRateZone(1, "Warm up", 50..60),
            HeartRateZone(2, "Fat burn", 60..70),
            HeartRateZone(3, "Aerobic", 70..80),
            HeartRateZone(4, "Anaerobic", 80..90),
            HeartRateZone(5, "Maximum", 90..100),
        ),
        sleepDurationHours = 7..9,
        spo2 = SpO2Thresholds(normal = 95..100, alertBelowPercent = 90),
        vo2MaxBands = VO2MAX_BANDS,
        stressBands = listOf(
            StressBand(StressLevel.RELAXED, 0..29),
            StressBand(StressLevel.NORMAL, 30..59),
            StressBand(StressLevel.MEDIUM, 60..79),
            StressBand(StressLevel.HIGH, 80..100),
        ),
        defaultActiveCalorieGoal = REFERENCE_ACTIVE_CALORIE_GOAL,
        defaultActiveMinutesGoal = 30,
        lowBatteryPercent = 20,
        recoveredBatteryPercent = 30,
    )
}
