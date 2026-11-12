package com.xiaomi.fitness.aggregation.health.dao;

import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPaiReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPhysicalStatusReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyRunningIndicatorReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTrainingLoadReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVitalityReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\tJ\u0012\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000b\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDailyUtil;", "", "<init>", "()V", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "R", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "clazz", "Ljava/lang/Class;", "getReportClass", "type", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessDailyUtil {

    @NotNull
    public static final FitnessDailyUtil INSTANCE = new FitnessDailyUtil();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.RAINBOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.STEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.VALID_STAND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeDataType.CALORIE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeDataType.MH_STRENGTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeDataType.BLOOD_PRESSURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeDataType.HR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomeDataType.SPO2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HomeDataType.V02_MAX.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HomeDataType.ENERGY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HomeDataType.STRESS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HomeDataType.PAI.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HomeDataType.HEARING_HEALTH.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HomeDataType.WEIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[HomeDataType.TRAINING_LOAD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[HomeDataType.TEMPERATURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[HomeDataType.RUNNING_INDICATOR.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[HomeDataType.VITALITY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[HomeDataType.BLOOD_SUGAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[HomeDataType.PHYSICAL_STATUS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[HomeDataType.TEMPERATURE_TREND.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[HomeDataType.TEMPERATURE_CHARACTER.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private FitnessDailyUtil() {
    }

    @NotNull
    public final <R extends DailyBasicReport> HomeDataType getDataType(@NotNull Class<? extends R> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (Intrinsics.areEqual(clazz, AllDaySleepReport.class)) {
            return HomeDataType.SLEEP;
        }
        if (Intrinsics.areEqual(clazz, DailyGoalReport.class)) {
            return HomeDataType.RAINBOW;
        }
        if (Intrinsics.areEqual(clazz, DailyStepReport.class)) {
            return HomeDataType.STEP;
        }
        if (Intrinsics.areEqual(clazz, DailyStandReport.class)) {
            return HomeDataType.VALID_STAND;
        }
        if (Intrinsics.areEqual(clazz, DailyCalorieReport.class)) {
            return HomeDataType.CALORIE;
        }
        if (Intrinsics.areEqual(clazz, DailyMHStrengthReport.class)) {
            return HomeDataType.MH_STRENGTH;
        }
        if (Intrinsics.areEqual(clazz, DailyBloodPressureReport.class)) {
            return HomeDataType.BLOOD_PRESSURE;
        }
        if (Intrinsics.areEqual(clazz, DailyHrReport.class)) {
            return HomeDataType.HR;
        }
        if (Intrinsics.areEqual(clazz, DailySpo2Report.class)) {
            return HomeDataType.SPO2;
        }
        if (Intrinsics.areEqual(clazz, DailyVo2MaxReport.class)) {
            return HomeDataType.V02_MAX;
        }
        if (Intrinsics.areEqual(clazz, DailyEnergyReport.class)) {
            return HomeDataType.ENERGY;
        }
        if (Intrinsics.areEqual(clazz, DailyStressReport.class)) {
            return HomeDataType.STRESS;
        }
        if (Intrinsics.areEqual(clazz, DailyPaiReport.class)) {
            return HomeDataType.PAI;
        }
        if (Intrinsics.areEqual(clazz, DailyHearingReport.class)) {
            return HomeDataType.HEARING_HEALTH;
        }
        if (Intrinsics.areEqual(clazz, DailyWeightReport.class)) {
            return HomeDataType.WEIGHT;
        }
        if (Intrinsics.areEqual(clazz, DailyTrainingLoadReport.class)) {
            return HomeDataType.TRAINING_LOAD;
        }
        if (Intrinsics.areEqual(clazz, DailyTempReport.class)) {
            return HomeDataType.TEMPERATURE;
        }
        if (Intrinsics.areEqual(clazz, DailyRunningIndicatorReport.class)) {
            return HomeDataType.RUNNING_INDICATOR;
        }
        if (Intrinsics.areEqual(clazz, DailyVitalityReport.class)) {
            return HomeDataType.VITALITY;
        }
        if (Intrinsics.areEqual(clazz, DailyBloodSugarReport.class)) {
            return HomeDataType.BLOOD_SUGAR;
        }
        if (Intrinsics.areEqual(clazz, DailyPhysicalStatusReport.class)) {
            return HomeDataType.PHYSICAL_STATUS;
        }
        throw new IllegalArgumentException("unknown class " + clazz);
    }

    @NotNull
    public final Class<?> getReportClass(@NotNull HomeDataType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return AllDaySleepReport.class;
            case 2:
                return DailyGoalReport.class;
            case 3:
                return DailyStepReport.class;
            case 4:
                return DailyStandReport.class;
            case 5:
                return DailyCalorieReport.class;
            case 6:
                return DailyMHStrengthReport.class;
            case 7:
                return DailyBloodPressureReport.class;
            case 8:
                return DailyHrReport.class;
            case 9:
                return DailySpo2Report.class;
            case 10:
                return DailyVo2MaxReport.class;
            case 11:
                return DailyEnergyReport.class;
            case 12:
                return DailyStressReport.class;
            case 13:
                return DailyPaiReport.class;
            case 14:
                return DailyHearingReport.class;
            case 15:
                return DailyWeightReport.class;
            case 16:
                return DailyTrainingLoadReport.class;
            case 17:
            case 22:
            case 23:
                return DailyTempReport.class;
            case 18:
                return DailyRunningIndicatorReport.class;
            case 19:
                return DailyVitalityReport.class;
            case 20:
                return DailyBloodSugarReport.class;
            case 21:
                return DailyPhysicalStatusReport.class;
            default:
                throw new IllegalArgumentException("unknown key " + type);
        }
    }
}
