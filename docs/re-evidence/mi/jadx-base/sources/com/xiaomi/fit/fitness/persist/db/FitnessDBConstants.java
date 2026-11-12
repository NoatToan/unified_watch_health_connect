package com.xiaomi.fit.fitness.persist.db;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b)\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/FitnessDBConstants;", "", "<init>", "()V", "PATH_NO_ACCOUNT", "", "DB_NAME_FITNESS", "DB_NAME_SUMMARY", "TABLE_SLEEP", "TABLE_STEP", "TABLE_CALORIE", "TABLE_STAND", "TABLE_MH_STRENGTH", "TABLE_BLOOD_PRESSURE", "TABLE_HEART_RATE", "TABLE_SPO2", "TABLE_VO2_MAX", "TABLE_ENERGY", "TABLE_STRESS", "TABLE_PAI", "TABLE_HEARING", "TABLE_MENSTRUATION", "TABLE_WEIGHT", "TABLE_TRAINING_LOAD", "TABLE_TEMPERATURE", "TABLE_RUN_ABILITY_INDEX", "TABLE_VITALITY", "TABLE_BLOOD_SUGAR", "TABLE_PHYSICAL_STATUS", "TABLE_LACTATE_THRESHOLD", "TABLE_EXTRA_DATA", "TABLE_TEMPERATURE_TREND", "TABLE_TEMPERATURE_CHARACTER_RECORD", "TABLE_ECG_MEDICAL_TABLE", "TABLE_BP_MEDICAL_TABLE", "COL_SID", "COL_KEY", "COL_TIME", "COL_IS_DELETED", "COL_TIME_0_TZ", "COL_IS_UPLOAD", "COL_IS_SLEEP_COMPLETE", "COL_VALUE", "COL_ZERO_TIME_0_TZ", "COL_ECG_INTERPRET_STATUS", "COL_TIME_ZERO_TZ", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessDBConstants {

    @NotNull
    public static final String COL_ECG_INTERPRET_STATUS = "analyzedStatus";

    @NotNull
    public static final String COL_IS_DELETED = "isDeleted";

    @NotNull
    public static final String COL_IS_SLEEP_COMPLETE = "isComplete";

    @NotNull
    public static final String COL_IS_UPLOAD = "isUpload";

    @NotNull
    public static final String COL_KEY = "key";

    @NotNull
    public static final String COL_SID = "sid";

    @NotNull
    public static final String COL_TIME = "time";

    @NotNull
    public static final String COL_TIME_0_TZ = "timeIn0Tz";

    @NotNull
    public static final String COL_TIME_ZERO_TZ = "timeInZero";

    @NotNull
    public static final String COL_VALUE = "value";

    @NotNull
    public static final String COL_ZERO_TIME_0_TZ = "zeroTimeIn0Tz";

    @NotNull
    public static final String DB_NAME_FITNESS = "fitness_data";

    @NotNull
    public static final String DB_NAME_SUMMARY = "fitness_summary";

    @NotNull
    public static final FitnessDBConstants INSTANCE = new FitnessDBConstants();

    @NotNull
    public static final String PATH_NO_ACCOUNT = "no_account";

    @NotNull
    public static final String TABLE_BLOOD_PRESSURE = "blood_pressure_record";

    @NotNull
    public static final String TABLE_BLOOD_SUGAR = "blood_sugar_record";

    @NotNull
    public static final String TABLE_BP_MEDICAL_TABLE = "blood_pressure_medical_record";

    @NotNull
    public static final String TABLE_CALORIE = "calorie_record";

    @NotNull
    public static final String TABLE_ECG_MEDICAL_TABLE = "ecg_medical_record";

    @NotNull
    public static final String TABLE_ENERGY = "energy_record";

    @NotNull
    public static final String TABLE_EXTRA_DATA = "extra_data";

    @NotNull
    public static final String TABLE_HEARING = "hearing_health_record";

    @NotNull
    public static final String TABLE_HEART_RATE = "hr_record";

    @NotNull
    public static final String TABLE_LACTATE_THRESHOLD = "lactate_threshold";

    @NotNull
    public static final String TABLE_MENSTRUATION = "menstruation_record";

    @NotNull
    public static final String TABLE_MH_STRENGTH = "mh_strength_record";

    @NotNull
    public static final String TABLE_PAI = "pai_record";

    @NotNull
    public static final String TABLE_PHYSICAL_STATUS = "physical_fitness_status";

    @NotNull
    public static final String TABLE_RUN_ABILITY_INDEX = "running_ability_record";

    @NotNull
    public static final String TABLE_SLEEP = "sleep_segment";

    @NotNull
    public static final String TABLE_SPO2 = "spo2_record";

    @NotNull
    public static final String TABLE_STAND = "stand_record";

    @NotNull
    public static final String TABLE_STEP = "step_record";

    @NotNull
    public static final String TABLE_STRESS = "stress_record";

    @NotNull
    public static final String TABLE_TEMPERATURE = "temperature_record";

    @NotNull
    public static final String TABLE_TEMPERATURE_CHARACTER_RECORD = "temperature_characteristic_record";

    @NotNull
    public static final String TABLE_TEMPERATURE_TREND = "temperature_trend";

    @NotNull
    public static final String TABLE_TRAINING_LOAD = "training_load_record";

    @NotNull
    public static final String TABLE_VITALITY = "vitality_record";

    @NotNull
    public static final String TABLE_VO2_MAX = "v02max_record";

    @NotNull
    public static final String TABLE_WEIGHT = "weight_item_record";

    private FitnessDBConstants() {
    }
}
