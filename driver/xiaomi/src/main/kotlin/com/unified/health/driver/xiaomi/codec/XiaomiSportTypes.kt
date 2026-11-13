package com.unified.health.driver.xiaomi.codec

/**
 * The compact wire-level `sportType` catalog used as [com.unified.health.driver.xiaomi.proto.FitnessDataId.subType]
 * when `dataType == FitnessDataId.DATA_TYPE_SPORT` (protocol §9.5 [V], confirmed against
 * `docs/re-evidence/mi/jadx-base/sources/com/xiaomi/fit/data/common/data/annotation/FitnessProtoSportType.java`
 * -- note this is a *different*, narrower catalog than the app-level `FitnessSportType`
 * (`RUNNING_OUTDOOR=1..SPORT_DIVING=25`, not the hundreds of UI sport codes in
 * `FitnessSportType.java`); the two share low numbers by coincidence of history, not identity).
 *
 * `FitnessDataParser.java`'s own dispatch switch (`getSportRecordParserInstance`/
 * `getSportReportParserInstance`) is the second, independent confirmation that these are the
 * values actually placed on the wire: sportType 1/2/4/5/15 all route to the same
 * `OutdoorSportRecordParser`/`OutdoorSportReportParser` pair -- the one family this driver decodes
 * (see [SportReportCodec]/[SportGpsCodec]).
 */
internal object XiaomiSportTypes {
    const val RUNNING_OUTDOOR = 1
    const val WALKING_OUTDOOR = 2
    const val RUNNING_INDOOR = 3
    const val MOUNTAINEERING = 4
    const val CROSS_COUNTRY = 5
    const val BIKING_OUTDOOR = 6
    const val BIKING_INDOOR = 7
    const val FREE_TRAINING = 8
    const val SWIMMING_POOL = 9
    const val SWIMMING_OPEN_WATER = 10
    const val ELLIPTICAL_MACHINE = 11
    const val YOGA = 12
    const val ROWING_MACHINE = 13
    const val ROPE_SKIPPING = 14
    const val HIKING_OUTDOOR = 15
    const val HIGH_INTERVAL_TRAINING = 16
    const val TRIATHLON = 17
    const val ORDINARY_BALL = 18
    const val BASKETBALL = 19
    const val GOLF = 20
    const val SKI = 21
    const val OUTDOOR_HAS_STEP = 22
    const val OUTDOOR_NO_STEP = 23
    const val ROCK_CLIMBING = 24
    const val DIVING = 25

    /**
     * The `(FitnessDataId.DATA_TYPE_SPORT, fileType=1 report / fileType=0 record)` sportTypes this
     * driver actually decodes: the outdoor-run family that shares `OutdoorSportRecordParser`/
     * `OutdoorSportReportParser` in the vendor's own dispatch table [V] -- outdoor running, outdoor
     * walking, mountaineering, cross-country (running) and outdoor hiking. Chosen over the more
     * numerous "ball sports"/niche types because outdoor running/walking is the highest-volume
     * workout kind on a Xiaomi band, and because this family's report/record tables are the
     * smallest, least version-fragmented ones in the evidence (see [SportReportCodec]'s KDoc).
     */
    val OUTDOOR_REPORT_SPORT_TYPES: Set<Int> = setOf(
        RUNNING_OUTDOOR,
        WALKING_OUTDOOR,
        MOUNTAINEERING,
        CROSS_COUNTRY,
        HIKING_OUTDOOR,
    )

    /**
     * `HealthRecord.Workout.sport`, lower_snake_case per that field's own KDoc, matching the
     * convention `driver/garmin`'s `FitSport`/`driver/huawei` already use for their own vendor sport
     * catalogs -- a human-readable display name, not a protocol fact, so names for sportTypes this
     * driver does not yet decode are included too (cheap, and ready for a future milestone that
     * adds more sport-report families) with a safe `sport_<n>` fallback for anything unlisted.
     */
    fun lowerSnakeCaseName(sportType: Int): String = when (sportType) {
        RUNNING_OUTDOOR -> "running"
        WALKING_OUTDOOR -> "walking"
        RUNNING_INDOOR -> "indoor_running"
        MOUNTAINEERING -> "mountaineering"
        CROSS_COUNTRY -> "cross_country_running"
        BIKING_OUTDOOR -> "cycling"
        BIKING_INDOOR -> "indoor_cycling"
        FREE_TRAINING -> "free_training"
        SWIMMING_POOL -> "pool_swimming"
        SWIMMING_OPEN_WATER -> "open_water_swimming"
        ELLIPTICAL_MACHINE -> "elliptical"
        YOGA -> "yoga"
        ROWING_MACHINE -> "rowing_machine"
        ROPE_SKIPPING -> "rope_skipping"
        HIKING_OUTDOOR -> "hiking"
        HIGH_INTERVAL_TRAINING -> "hiit"
        TRIATHLON -> "triathlon"
        ORDINARY_BALL -> "ball_sport"
        BASKETBALL -> "basketball"
        GOLF -> "golf"
        SKI -> "skiing"
        OUTDOOR_HAS_STEP -> "outdoor_other"
        OUTDOOR_NO_STEP -> "outdoor_other_no_step"
        ROCK_CLIMBING -> "rock_climbing"
        DIVING -> "diving"
        else -> "sport_$sportType"
    }
}
