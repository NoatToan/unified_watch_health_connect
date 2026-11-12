package com.xiaomi.fit.fitness.request;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fit/fitness/request/HuaMiKey;", "", "Companion", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface HuaMiKey {

    @NotNull
    public static final String AllDayStressRecord = "huami_all_day_stress_record";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HuamiAFib = "huami_atrial_fibrillation_record";

    @NotNull
    public static final String HuamiAbnormalHr = "huami_hl_heart_rate";

    @NotNull
    public static final String HuamiActivityData = "huami_vitality_index";

    @NotNull
    public static final String HuamiCalorieStageRecord = "huami_app_estimate_record";

    @NotNull
    public static final String HuamiDailyRecord = "huami_regular_record";

    @NotNull
    public static final String HuamiLowSpo2 = "huami_low_spo2";

    @NotNull
    public static final String HuamiManualHrRecord = "huami_manual_heartrate_record";

    @NotNull
    public static final String HuamiPaiRecord = "huami_pai_record";

    @NotNull
    public static final String HuamiRestHr = "huami_rest_heart_rate";

    @NotNull
    public static final String HuamiSpo2 = "huami_manual_measure_record";

    @NotNull
    public static final String HuamiSportRecord = "huami_sport_record";

    @NotNull
    public static final String HuamiSportReport = "huami_sport_report";

    @NotNull
    public static final String HuamiTrainingLoad = "huami_training_load_record";

    @NotNull
    public static final String ManualStressRecord = "huami_single_stress_record";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/request/HuaMiKey$Companion;", "", "<init>", "()V", "HuamiDailyRecord", "", "HuamiManualHrRecord", "AllDayStressRecord", "ManualStressRecord", "HuamiSportRecord", "HuamiSportReport", "HuamiPaiRecord", "HuamiCalorieStageRecord", "HuamiSpo2", "HuamiAFib", "HuamiTrainingLoad", "HuamiActivityData", "HuamiRestHr", "HuamiLowSpo2", "HuamiAbnormalHr", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String AllDayStressRecord = "huami_all_day_stress_record";

        @NotNull
        public static final String HuamiAFib = "huami_atrial_fibrillation_record";

        @NotNull
        public static final String HuamiAbnormalHr = "huami_hl_heart_rate";

        @NotNull
        public static final String HuamiActivityData = "huami_vitality_index";

        @NotNull
        public static final String HuamiCalorieStageRecord = "huami_app_estimate_record";

        @NotNull
        public static final String HuamiDailyRecord = "huami_regular_record";

        @NotNull
        public static final String HuamiLowSpo2 = "huami_low_spo2";

        @NotNull
        public static final String HuamiManualHrRecord = "huami_manual_heartrate_record";

        @NotNull
        public static final String HuamiPaiRecord = "huami_pai_record";

        @NotNull
        public static final String HuamiRestHr = "huami_rest_heart_rate";

        @NotNull
        public static final String HuamiSpo2 = "huami_manual_measure_record";

        @NotNull
        public static final String HuamiSportRecord = "huami_sport_record";

        @NotNull
        public static final String HuamiSportReport = "huami_sport_report";

        @NotNull
        public static final String HuamiTrainingLoad = "huami_training_load_record";

        @NotNull
        public static final String ManualStressRecord = "huami_single_stress_record";

        private Companion() {
        }
    }
}
