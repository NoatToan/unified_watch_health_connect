package com.xiaomi.fitness.watch.face.edit.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\bq\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006v"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/utils/Source;", "", "<init>", "()V", "TIME_HOUR", "", "TIME_HOUR_LOW", "TIME_HOUR_HIGH", "TIME_MINUTE", "TIME_MINUTE_LOW", "TIME_MINUTE_HIGH", "TIME_SECOND", "TIME_SECOND_LOW", "TIME_SECOND_HIGH", "TIME_CENTI_SECOND", "TIME_CENTI_SECOND_LOW", "TIME_CENTI_SECOND_HIGH", "TIME_HOUR_12H", "DATE_YEAR", "DATE_YEAR_DIGIT1", "DATE_YEAR_DIGIT2", "DATE_YEAR_DIGIT3", "DATE_YEAR_DIGIT4", "DATE_MONTH", "DATE_MONTH_LOW", "DATE_MONTH_HIGH", "DATE_DAY", "DATE_DAY_LOW", "DATE_DAY_HIGH", "DATE_WEEK", "DATE_LUNA_YEAR", "DATE_LUNA_MONTH", "DATE_LUNA_DAY", "MISC_IS_AM", "MISC_IS_PM", "MISC_TIME_SECTION", "MISC_IS_24", "MISC_DATE_YESTERDAY", "MISC_DATE_TOMORROW", "HEALTH_STEP_COUNT", "HEALTH_STEP_COUNT_DIGIT1", "HEALTH_STEP_COUNT_DIGIT2", "HEALTH_STEP_COUNT_DIGIT3", "HEALTH_STEP_COUNT_DIGIT4", "HEALTH_STEP_COUNT_DIGIT5", "HEALTH_STEP_PROGRESS", "HEALTH_STEP_TARGET", "HEALTH_STEP_KILO_METER", "HEALTH_HEART_RATE", "HEALTH_HEART_RATE_ZONE", "HEALTH_HEART_RATE_MIN", "HEALTH_HEART_RATE_MAX", "HEALTH_CALORIE", "HEALTH_CALORIE_VALUE", "HEALTH_CALORIE_PROGRESS", "HEALTH_CALORIE_TARGET", "HEALTH_STAND_COUNT", "HEALTH_STAND_PROGRESS", "HEALTH_STAND_TARGET", "HEALTH_OXYGEN_SPO2", "HEALTH_PRESSURE_INDEX", "HEALTH_BLOOD_PRESSURE_DIASTOLIC", "HEALTH_BLOOD_PRESSURE_SYSTOLIC", "HEALTH_BLOOD_PRESSURE_DIASTOLIC_KPA", "HEALTH_BLOOD_PRESSURE_SYSTOLIC_KPA", "HEALTH_BLOOD_PRESSURE_UNIT", "HEALTH_SLEEP_DURATION", "HEALTH_SLEEP_SCORE", "HEALTH_SLEEP_TARGET_PROGRESS", "HEALTH_EXERCISE_DURATION", "HEALTH_EXERCISE_PROGRESS", "HEALTH_EXERCISE_TARGET", "HEALTH_MISC_RECOVERY_TIME", "HEALTH_MISC_RUN_POWER_INDEX", "HEALTH_MISC_TODAY_VITALITY", "HEALTH_MISC_SEVEN_DAYS_VITALITY", "HEALTH_BLOOD_SUGAR_VALUE", "WEATHER_CURRENT_SUN_RISE", "WEATHER_CURRENT_SUN_SET", "WEATHER_CURRENT_SUN_RISE_HOUR", "WEATHER_CURRENT_SUN_RISE_MINUTE", "WEATHER_CURRENT_SUN_SET_HOUR", "WEATHER_CURRENT_SUN_SET_MINUTE", "WEATHER_CURRENT_TEMPERATURE_UNIT", "WEATHER_CURRENT_TEMPERATURE", "WEATHER_CURRENT_TEMPERATURE_FAHRENHEIT", "WEATHER_CURRENT_TEMPERATURE_FEEL", "WEATHER_CURRENT_HUMIDITY", "WEATHER_CURRENT_WEATHER", "WEATHER_CURRENT_WIND_DIRECTION", "WEATHER_CURRENT_WIND_ANGLE", "WEATHER_CURRENT_WIND_SPEED", "WEATHER_CURRENT_WIND_LEVEL", "WEATHER_CURRENT_AIR_QUALITY_INDEX", "WEATHER_CURRENT_AIR_QUALITY_LEVEL", "WEATHER_CURRENT_CHANCE_OF_RAIN", "WEATHER_CURRENT_PRESSURE", "WEATHER_CURRENT_VISIBILITY", "WEATHER_CURRENT_UV_INDEX", "WEATHER_CURRENT_UV_LEVEL", "WEATHER_CURRENT_DRESS_INDEX", "WEATHER_TODAY_TEMPERATURE_MAX", "WEATHER_TODAY_TEMPERATURE_MIN", "WEATHER_TODAY_TEMPERATURE_FAHRENHEIT_MAX", "WEATHER_TODAY_TEMPERATURE_FAHRENHEIT_MIN", "WEATHER_TOMORROW_TEMPERATURE_MAX", "WEATHER_TOMORROW_TEMPERATURE_MIN", "WEATHER_TOMORROW_TEMPERATURE_FAHRENHEIT_MAX", "WEATHER_TOMORROW_TEMPERATURE_FAHRENHEIT_MIN", "SYSTEM_STATUS_BATTERY", "SYSTEM_STATUS_CHARGE", "SYSTEM_STATUS_DISTURB", "SYSTEM_STATUS_BLUETOOTH", "SYSTEM_STATUS_WIFI", "SYSTEM_STATUS_SCREEN_LOCK", "SYSTEM_SENSOR_FUSION_ALTITUDE", "APP_ALARM_HOUR", "APP_ALARM_MINUTE", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Source {

    @NotNull
    public static final String APP_ALARM_HOUR = "appAlarmHour";

    @NotNull
    public static final String APP_ALARM_MINUTE = "appAlarmMinute";

    @NotNull
    public static final String DATE_DAY = "dateDay";

    @NotNull
    public static final String DATE_DAY_HIGH = "dateDayHigh";

    @NotNull
    public static final String DATE_DAY_LOW = "dateDayLow";

    @NotNull
    public static final String DATE_LUNA_DAY = "dateLunarDay";

    @NotNull
    public static final String DATE_LUNA_MONTH = "dateLunarMonth";

    @NotNull
    public static final String DATE_LUNA_YEAR = "dateLunarYear";

    @NotNull
    public static final String DATE_MONTH = "dateMonth";

    @NotNull
    public static final String DATE_MONTH_HIGH = "dateMonthHigh";

    @NotNull
    public static final String DATE_MONTH_LOW = "dateMonthLow";

    @NotNull
    public static final String DATE_WEEK = "dateWeek";

    @NotNull
    public static final String DATE_YEAR = "dateYear";

    @NotNull
    public static final String DATE_YEAR_DIGIT1 = "dateYearDigit1";

    @NotNull
    public static final String DATE_YEAR_DIGIT2 = "dateYearDigit2";

    @NotNull
    public static final String DATE_YEAR_DIGIT3 = "dateYearDigit3";

    @NotNull
    public static final String DATE_YEAR_DIGIT4 = "dateYearDigit4";

    @NotNull
    public static final String HEALTH_BLOOD_PRESSURE_DIASTOLIC = "healthBloodDiastolicPressureMmhg";

    @NotNull
    public static final String HEALTH_BLOOD_PRESSURE_DIASTOLIC_KPA = "healthBloodDiastolicPressureKpa";

    @NotNull
    public static final String HEALTH_BLOOD_PRESSURE_SYSTOLIC = "healthBloodSystolicPressureMmhg";

    @NotNull
    public static final String HEALTH_BLOOD_PRESSURE_SYSTOLIC_KPA = "healthBloodSystolicPressureKpa";

    @NotNull
    public static final String HEALTH_BLOOD_PRESSURE_UNIT = "healthBloodPressureUnit";

    @NotNull
    public static final String HEALTH_BLOOD_SUGAR_VALUE = "healthBloodSugarValue";

    @NotNull
    public static final String HEALTH_CALORIE = "healthCalorie";

    @NotNull
    public static final String HEALTH_CALORIE_PROGRESS = "healthCalorieProgress";

    @NotNull
    public static final String HEALTH_CALORIE_TARGET = "healthCalorieTarget";

    @NotNull
    public static final String HEALTH_CALORIE_VALUE = "healthCalorieValue";

    @NotNull
    public static final String HEALTH_EXERCISE_DURATION = "healthExerciseDuration";

    @NotNull
    public static final String HEALTH_EXERCISE_PROGRESS = "healthExerciseProgress";

    @NotNull
    public static final String HEALTH_EXERCISE_TARGET = "healthExerciseTarget";

    @NotNull
    public static final String HEALTH_HEART_RATE = "healthHeartRate";

    @NotNull
    public static final String HEALTH_HEART_RATE_MAX = "healthHearRateMax";

    @NotNull
    public static final String HEALTH_HEART_RATE_MIN = "healthHearRateMin";

    @NotNull
    public static final String HEALTH_HEART_RATE_ZONE = "healthHearRateZone";

    @NotNull
    public static final String HEALTH_MISC_RECOVERY_TIME = "healthMiscRecoveryTime";

    @NotNull
    public static final String HEALTH_MISC_RUN_POWER_INDEX = "healthMiscRunPowerIndex";

    @NotNull
    public static final String HEALTH_MISC_SEVEN_DAYS_VITALITY = "healthMiscSevenDaysVitalityValue";

    @NotNull
    public static final String HEALTH_MISC_TODAY_VITALITY = "healthMiscTodayVitalityValue";

    @NotNull
    public static final String HEALTH_OXYGEN_SPO2 = "healthOxygenSpO2";

    @NotNull
    public static final String HEALTH_PRESSURE_INDEX = "healthPressureIndex";

    @NotNull
    public static final String HEALTH_SLEEP_DURATION = "healthSleepDuration";

    @NotNull
    public static final String HEALTH_SLEEP_SCORE = "healthSleepScore";

    @NotNull
    public static final String HEALTH_SLEEP_TARGET_PROGRESS = "healthSleepTargetProgress";

    @NotNull
    public static final String HEALTH_STAND_COUNT = "healthStandCount";

    @NotNull
    public static final String HEALTH_STAND_PROGRESS = "healthStandProgress";

    @NotNull
    public static final String HEALTH_STAND_TARGET = "healthStandTarget";

    @NotNull
    public static final String HEALTH_STEP_COUNT = "healthStepCount";

    @NotNull
    public static final String HEALTH_STEP_COUNT_DIGIT1 = "healthStepCountDigit1";

    @NotNull
    public static final String HEALTH_STEP_COUNT_DIGIT2 = "healthStepCountDigit2";

    @NotNull
    public static final String HEALTH_STEP_COUNT_DIGIT3 = "healthStepCountDigit3";

    @NotNull
    public static final String HEALTH_STEP_COUNT_DIGIT4 = "healthStepCountDigit4";

    @NotNull
    public static final String HEALTH_STEP_COUNT_DIGIT5 = "healthStepCountDigit5";

    @NotNull
    public static final String HEALTH_STEP_KILO_METER = "healthStepKiloMeter";

    @NotNull
    public static final String HEALTH_STEP_PROGRESS = "healthStepProgress";

    @NotNull
    public static final String HEALTH_STEP_TARGET = "healthStepTarget";

    @NotNull
    public static final Source INSTANCE = new Source();

    @NotNull
    public static final String MISC_DATE_TOMORROW = "miscdateTomorrow";

    @NotNull
    public static final String MISC_DATE_YESTERDAY = "miscdateYestarday";

    @NotNull
    public static final String MISC_IS_24 = "miscIs24H";

    @NotNull
    public static final String MISC_IS_AM = "miscIsAM";

    @NotNull
    public static final String MISC_IS_PM = "miscIsPM";

    @NotNull
    public static final String MISC_TIME_SECTION = "miscTimeSection";

    @NotNull
    public static final String SYSTEM_SENSOR_FUSION_ALTITUDE = "systemSensorFusionAltitude";

    @NotNull
    public static final String SYSTEM_STATUS_BATTERY = "systemStatusBattery";

    @NotNull
    public static final String SYSTEM_STATUS_BLUETOOTH = "systemStatusBluetooth";

    @NotNull
    public static final String SYSTEM_STATUS_CHARGE = "systemStatusCharge";

    @NotNull
    public static final String SYSTEM_STATUS_DISTURB = "systemStatusDisturb";

    @NotNull
    public static final String SYSTEM_STATUS_SCREEN_LOCK = "systemStatusScreenLock";

    @NotNull
    public static final String SYSTEM_STATUS_WIFI = "systemStatusWifi";

    @NotNull
    public static final String TIME_CENTI_SECOND = "timeCentiSecond";

    @NotNull
    public static final String TIME_CENTI_SECOND_HIGH = "timeCentiSecondHigh";

    @NotNull
    public static final String TIME_CENTI_SECOND_LOW = "timeCentiSecondLow";

    @NotNull
    public static final String TIME_HOUR = "timeHour";

    @NotNull
    public static final String TIME_HOUR_12H = "timeHour12H";

    @NotNull
    public static final String TIME_HOUR_HIGH = "timeHourHigh";

    @NotNull
    public static final String TIME_HOUR_LOW = "timeHourLow";

    @NotNull
    public static final String TIME_MINUTE = "timeMinute";

    @NotNull
    public static final String TIME_MINUTE_HIGH = "timeMinuteHigh";

    @NotNull
    public static final String TIME_MINUTE_LOW = "timeMinuteLow";

    @NotNull
    public static final String TIME_SECOND = "timeSecond";

    @NotNull
    public static final String TIME_SECOND_HIGH = "timeSecondHigh";

    @NotNull
    public static final String TIME_SECOND_LOW = "timeSecondLow";

    @NotNull
    public static final String WEATHER_CURRENT_AIR_QUALITY_INDEX = "weatherCurrentAirQualityIndex";

    @NotNull
    public static final String WEATHER_CURRENT_AIR_QUALITY_LEVEL = "weatherCurrentAirQualityLevel";

    @NotNull
    public static final String WEATHER_CURRENT_CHANCE_OF_RAIN = "weatherCurrentChanceOfRain";

    @NotNull
    public static final String WEATHER_CURRENT_DRESS_INDEX = "weatherCurrentDressIndex";

    @NotNull
    public static final String WEATHER_CURRENT_HUMIDITY = "weatherCurrentHumidity";

    @NotNull
    public static final String WEATHER_CURRENT_PRESSURE = "weatherCurrentPressure";

    @NotNull
    public static final String WEATHER_CURRENT_SUN_RISE = "weatherCurrentSunRise";

    @NotNull
    public static final String WEATHER_CURRENT_SUN_RISE_HOUR = "weatherCurrentSunRiseHour";

    @NotNull
    public static final String WEATHER_CURRENT_SUN_RISE_MINUTE = "weatherCurrentSunRiseMinute";

    @NotNull
    public static final String WEATHER_CURRENT_SUN_SET = "weatherCurrentSunSet";

    @NotNull
    public static final String WEATHER_CURRENT_SUN_SET_HOUR = "weatherCurrentSunSetHour";

    @NotNull
    public static final String WEATHER_CURRENT_SUN_SET_MINUTE = "weatherCurrentSunSetMinute";

    @NotNull
    public static final String WEATHER_CURRENT_TEMPERATURE = "weatherCurrentTemperature";

    @NotNull
    public static final String WEATHER_CURRENT_TEMPERATURE_FAHRENHEIT = "weatherCurrentTemperatureFahrenheit";

    @NotNull
    public static final String WEATHER_CURRENT_TEMPERATURE_FEEL = "weatherCurrentTemperatureFeel";

    @NotNull
    public static final String WEATHER_CURRENT_TEMPERATURE_UNIT = "weatherTemperatureUnit";

    @NotNull
    public static final String WEATHER_CURRENT_UV_INDEX = "weatherCurrentUVIndex";

    @NotNull
    public static final String WEATHER_CURRENT_UV_LEVEL = "weatherCurrentUVLevel";

    @NotNull
    public static final String WEATHER_CURRENT_VISIBILITY = "weatherCurrentVisibility";

    @NotNull
    public static final String WEATHER_CURRENT_WEATHER = "weatherCurrentWeather";

    @NotNull
    public static final String WEATHER_CURRENT_WIND_ANGLE = "weatherCurrentWindAngle";

    @NotNull
    public static final String WEATHER_CURRENT_WIND_DIRECTION = "weatherCurrentWindDirection";

    @NotNull
    public static final String WEATHER_CURRENT_WIND_LEVEL = "weatherCurrentWindLevel";

    @NotNull
    public static final String WEATHER_CURRENT_WIND_SPEED = "weatherCurrentWindSpeed";

    @NotNull
    public static final String WEATHER_TODAY_TEMPERATURE_FAHRENHEIT_MAX = "weatherTodayTemperatureMaxFahrenheit";

    @NotNull
    public static final String WEATHER_TODAY_TEMPERATURE_FAHRENHEIT_MIN = "weatherTodayTemperatureMinFahrenheit";

    @NotNull
    public static final String WEATHER_TODAY_TEMPERATURE_MAX = "weatherTodayTemperatureMax";

    @NotNull
    public static final String WEATHER_TODAY_TEMPERATURE_MIN = "weatherTodayTemperatureMin";

    @NotNull
    public static final String WEATHER_TOMORROW_TEMPERATURE_FAHRENHEIT_MAX = "weatherTomorrowTemperatureMaxFahrenheit";

    @NotNull
    public static final String WEATHER_TOMORROW_TEMPERATURE_FAHRENHEIT_MIN = "weatherTomorrowTemperatureMinFahrenheit";

    @NotNull
    public static final String WEATHER_TOMORROW_TEMPERATURE_MAX = "weatherTomorrowTemperatureMax";

    @NotNull
    public static final String WEATHER_TOMORROW_TEMPERATURE_MIN = "weatherTomorrowTemperatureMin";

    private Source() {
    }
}
