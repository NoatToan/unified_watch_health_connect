package com.xiaomi.fit.fitness.persist.db.utils;

import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.data.item.CaloriesItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.export.data.item.EnergyItem;
import com.xiaomi.fit.fitness.export.data.item.GradePredictionItem;
import com.xiaomi.fit.fitness.export.data.item.HeadsetItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import com.xiaomi.fit.fitness.export.data.item.LightValueItem;
import com.xiaomi.fit.fitness.export.data.item.MHStrengthItem;
import com.xiaomi.fit.fitness.export.data.item.NoiseItem;
import com.xiaomi.fit.fitness.export.data.item.OneDayPaiReport;
import com.xiaomi.fit.fitness.export.data.item.PhysicalStatusItem;
import com.xiaomi.fit.fitness.export.data.item.ReportHrItem;
import com.xiaomi.fit.fitness.export.data.item.ReportSpo2Item;
import com.xiaomi.fit.fitness.export.data.item.RestHrItem;
import com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureCharacterItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import com.xiaomi.fit.fitness.export.data.item.TrainingLoadItem;
import com.xiaomi.fit.fitness.export.data.item.ValidStandItem;
import com.xiaomi.fit.fitness.export.data.item.VitalityItem;
import com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthStatus;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fit.fitness.export.data.item.body;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.BPMedicalRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.BloodPressureRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.BloodSugarEntity;
import com.xiaomi.fit.fitness.persist.db.internal.CaloriesRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao;
import com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity;
import com.xiaomi.fit.fitness.persist.db.internal.EcgMedicalRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.EnergyRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.ExtraDataEntity;
import com.xiaomi.fit.fitness.persist.db.internal.HearingHealthRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.HrRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.LactateThresholdEntity;
import com.xiaomi.fit.fitness.persist.db.internal.MHStrengthRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.PaiRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.PhysicalStatusEntity;
import com.xiaomi.fit.fitness.persist.db.internal.RunAbilityRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentEntity;
import com.xiaomi.fit.fitness.persist.db.internal.Spo2RecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.StandRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.StepRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.StressRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.TemperatureCharacterRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.TemperatureRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.TemperatureTrendEntity;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingLoadRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.VitalityRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.Vo2MaxRecordEntity;
import com.xiaomi.fit.fitness.persist.db.internal.WeightItemEntity;
import com.xiaomi.fit.fitness.persist.db.internal.WomenHealthRecordEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u001a\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007J\u0018\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u00152\u0006\u0010\u000f\u001a\u00020\u0006J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0006J\u0018\u0010\u001b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001c\u0018\u00010\u00152\u0006\u0010\u000f\u001a\u00020\u0006R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/utils/DailyRecordDaoRepo;", "", "<init>", "()V", "recordDaoSupportKeys", "", "", "[Ljava/lang/String;", "medicalDataKeys", "getRecordDaoSupportKey", "()[Ljava/lang/String;", "getMedicalDataKeys", "getDailyRecordDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseDao;", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;", "persistKey", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "dbInstance", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDatabase;", "getRecordEntityClass", "Ljava/lang/Class;", "getHomeTypeByPersistKey", "getSupportKeysByHomeType", "", "hasOneDateRecordOneDay", "", "getRecordItemClazz", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DailyRecordDaoRepo {

    @NotNull
    public static final DailyRecordDaoRepo INSTANCE = new DailyRecordDaoRepo();

    @NotNull
    private static final String[] recordDaoSupportKeys = {"heart_rate", FitnessPersistKey.RestHr, FitnessPersistKey.ManualHr, FitnessPersistKey.AbnormalHr, "abnormal_heart_beat", "high_heart_rate", FitnessPersistKey.AbnormalHrLow, FitnessPersistKey.ReportMinHr, FitnessPersistKey.ReportMaxHr, "steps", FitnessPersistKey.ActiveStage, "calories", "intensity", FitnessPersistKey.ValidStand, "stress", FitnessPersistKey.ManualStress, FitnessPersistKey.AbnormalStress, "spo2", FitnessPersistKey.ManualSpo2, FitnessPersistKey.ReportMinSpo2, FitnessPersistKey.ReportMaxSpo2, "low_spo2", "sleep", FitnessPersistKey.NightSleep, FitnessPersistKey.DaytimeSleep, "energy", FitnessPersistKey.Vo2Max, "blood_pressure", "headset", FitnessPersistKey.Noise, "weight", FitnessPersistKey.WomenHealthStatus, FitnessPersistKey.WomenHealthSymptoms, "pai", FitnessPersistKey.TrainingLoad, FitnessPersistKey.ManualTemperature, FitnessPersistKey.RunningIndicator, "vitality", FitnessPersistKey.GradePrediction, "blood_sugar", FitnessPersistKey.ManualBloodSugar, "physical_fitness_status", "lactate_threshold", "body_momentum", "light_sensitivity_value", "temperature_trend", FitnessPersistKey.TemperatureCharacter};

    @NotNull
    private static final String[] medicalDataKeys = {FitnessPersistKey.EcgMedical, FitnessPersistKey.BloodPressureMedical};

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.HR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.STEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.CALORIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.MH_STRENGTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeDataType.VALID_STAND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeDataType.STRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeDataType.SPO2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeDataType.SLEEP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomeDataType.ENERGY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HomeDataType.V02_MAX.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HomeDataType.BLOOD_PRESSURE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HomeDataType.HEARING_HEALTH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HomeDataType.WOMEN_HEALTH.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HomeDataType.WEIGHT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HomeDataType.PAI.ordinal()] = 15;
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
                iArr[HomeDataType.ECG_MEDICAL.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[HomeDataType.BP_MEDICAL.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[HomeDataType.BLOOD_SUGAR.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[HomeDataType.PHYSICAL_STATUS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[HomeDataType.LACTATE_THRESHOLD.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[HomeDataType.EXTRA_DATA.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[HomeDataType.TEMPERATURE_TREND.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[HomeDataType.TEMPERATURE_CHARACTER.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DailyRecordDaoRepo() {
    }

    @JvmStatic
    @Nullable
    public static final DailyRecordBaseDao<? extends DailyRecordBaseEntity> getDailyRecordDao(@NotNull String persistKey) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        DailyRecordDaoRepo dailyRecordDaoRepo = INSTANCE;
        HomeDataType homeTypeByPersistKey = dailyRecordDaoRepo.getHomeTypeByPersistKey(persistKey);
        if (homeTypeByPersistKey == null) {
            return null;
        }
        return dailyRecordDaoRepo.getDailyRecordDao(homeTypeByPersistKey);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0153, code lost:
    
        if (r2.equals("high_heart_rate") == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x016b, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.DaytimeSleep) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0187, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ReportMaxHr) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ad, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.WomenHealthSymptoms) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01bb, code lost:
    
        if (r2.equals("stress") == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r2.equals("heart_rate") == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01e1, code lost:
    
        if (r2.equals("blood_sugar") == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01fb, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ReportMinSpo2) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0210, code lost:
    
        if (r2.equals("light_sensitivity_value") == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x021c, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ManualHr) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0228, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ManualSpo2) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.NightSleep) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x023d, code lost:
    
        if (r2.equals("low_spo2") == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0249, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ManualStress) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x024f, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.STRESS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.RUNNING_INDICATOR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.STEP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.HEARING_HEALTH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.SLEEP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.WOMEN_HEALTH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.BLOOD_SUGAR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ManualBloodSugar) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.EXTRA_DATA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.HR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.SPO2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.RestHr) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.RunningIndicator) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2.equals("body_momentum") == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r2.equals("headset") == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.AbnormalHr) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        if (r2.equals("abnormal_heart_beat") == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b9, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ReportMaxSpo2) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c3, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.GradePrediction) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00df, code lost:
    
        if (r2.equals("steps") == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ActiveStage) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ed, code lost:
    
        if (r2.equals("sleep") == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f7, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.Noise) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0105, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.WomenHealthStatus) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010f, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ReportMinHr) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0119, code lost:
    
        if (r2.equals("spo2") == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0131, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.AbnormalHrLow) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x013b, code lost:
    
        if (r2.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.AbnormalStress) == false) goto L177;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.xiaomi.fit.fitness.export.data.annotation.HomeDataType getHomeTypeByPersistKey(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoRepo.getHomeTypeByPersistKey(java.lang.String):com.xiaomi.fit.fitness.export.data.annotation.HomeDataType");
    }

    @NotNull
    public final String[] getMedicalDataKeys() {
        return medicalDataKeys;
    }

    @NotNull
    public final String[] getRecordDaoSupportKey() {
        return recordDaoSupportKeys;
    }

    @Nullable
    public final Class<? extends DailyRecordBaseEntity> getRecordEntityClass(@NotNull String persistKey) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        HomeDataType homeTypeByPersistKey = getHomeTypeByPersistKey(persistKey);
        if (homeTypeByPersistKey == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[homeTypeByPersistKey.ordinal()]) {
            case 1:
                return HrRecordEntity.class;
            case 2:
                return StepRecordEntity.class;
            case 3:
                return CaloriesRecordEntity.class;
            case 4:
                return MHStrengthRecordEntity.class;
            case 5:
                return StandRecordEntity.class;
            case 6:
                return StressRecordEntity.class;
            case 7:
                return Spo2RecordEntity.class;
            case 8:
                return SleepSegmentEntity.class;
            case 9:
                return EnergyRecordEntity.class;
            case 10:
                return Vo2MaxRecordEntity.class;
            case 11:
                return BloodPressureRecordEntity.class;
            case 12:
                return HearingHealthRecordEntity.class;
            case 13:
                return WomenHealthRecordEntity.class;
            case 14:
                return WeightItemEntity.class;
            case 15:
                return PaiRecordEntity.class;
            case 16:
                return TrainingLoadRecordEntity.class;
            case 17:
                return TemperatureRecordEntity.class;
            case 18:
                return RunAbilityRecordEntity.class;
            case 19:
                return VitalityRecordEntity.class;
            case 20:
                return EcgMedicalRecordEntity.class;
            case 21:
                return BPMedicalRecordEntity.class;
            case 22:
                return BloodSugarEntity.class;
            case 23:
                return PhysicalStatusEntity.class;
            case 24:
                return LactateThresholdEntity.class;
            case 25:
                return ExtraDataEntity.class;
            case 26:
                return TemperatureTrendEntity.class;
            case 27:
                return TemperatureCharacterRecordEntity.class;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:118:0x0196 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x01b2 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0210 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x022b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x024f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x025b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x027b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x027d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[RETURN, SYNTHETIC] */
    @Nullable
    public final Class<? extends DailyRecordItem> getRecordItemClazz(@NotNull String persistKey) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        switch (persistKey) {
            case "single_stress":
                return StressItem.class;
            case "low_spo2":
                return SegmentItem.class;
            case "temperature_characteristic":
                return TemperatureCharacterItem.class;
            case "single_spo2":
                return Spo2Item.class;
            case "single_heart_rate":
                return HrItem.class;
            case "light_sensitivity_value":
                return LightValueItem.class;
            case "valid_stand":
                return ValidStandItem.class;
            case "min_spo2":
                return ReportSpo2Item.class;
            case "energy":
                return EnergyItem.class;
            case "blood_sugar":
                return BloodSugarItem.class;
            case "mc_ecg":
                return EcgMedicalItemReport.class;
            case "single_temperature":
                return TemperatureItem.class;
            case "stress":
                return StressItem.class;
            case "menstrual_symptoms":
                return WomenHealthSymptoms.class;
            case "temperature_trend":
                return TemperatureTrendItem.class;
            case "weight":
                return WeightItem.class;
            case "max_heart_rate":
                return ReportHrItem.class;
            case "training_load":
                return TrainingLoadItem.class;
            case "watch_daytime_sleep":
                return DayNightSleepReport.class;
            case "physical_fitness_status":
                return PhysicalStatusItem.class;
            case "high_heart_rate":
                return SegmentItem.class;
            case "calories":
                return CaloriesItem.class;
            case "high_stress":
                return SegmentItem.class;
            case "low_heart_rate":
                return SegmentItem.class;
            case "pai":
                return OneDayPaiReport.class;
            case "spo2":
                return Spo2Item.class;
            case "min_heart_rate":
                return ReportHrItem.class;
            case "menstruation":
                return WomenHealthStatus.class;
            case "noise":
                return NoiseItem.class;
            case "sleep":
                return SleepSegmentReport.class;
            case "steps":
                return StepItem.class;
            case "mc_blood_pressure":
                return BloodPressureItem.class;
            case "grade_prediction":
                return GradePredictionItem.class;
            case "max_spo2":
                return ReportSpo2Item.class;
            case "intensity":
                return MHStrengthItem.class;
            case "blood_pressure":
                return BloodPressureItem.class;
            case "vo2_max":
                return Vo2MaxItem.class;
            case "abnormal_heart_beat":
                return AbnormalFibItem.class;
            case "abnormal_heart_rate":
                return AbnormalHrItem.class;
            case "headset":
                return HeadsetItem.class;
            case "body_momentum":
                return body.class;
            case "running_ability_index":
                return RunningIndicatorItem.class;
            case "resting_heart_rate":
                return RestHrItem.class;
            case "vitality":
                return VitalityItem.class;
            case "single_blood_sugar":
                return BloodSugarItem.class;
            case "watch_night_sleep":
                return DayNightSleepReport.class;
            case "heart_rate":
                return HrItem.class;
            case "lactate_threshold":
                return LactateThresholdItem.class;
            case "dynamic":
                return ActiveStageItem.class;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @NotNull
    public final List<String> getSupportKeysByHomeType(@NotNull HomeDataType dataType) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        ArrayList arrayList = new ArrayList();
        switch (WhenMappings.$EnumSwitchMapping$0[dataType.ordinal()]) {
            case 1:
                arrayList.add("heart_rate");
                arrayList.add(FitnessPersistKey.RestHr);
                arrayList.add(FitnessPersistKey.ManualHr);
                arrayList.add(FitnessPersistKey.AbnormalHr);
                arrayList.add("abnormal_heart_beat");
                arrayList.add("high_heart_rate");
                arrayList.add(FitnessPersistKey.AbnormalHrLow);
                arrayList.add(FitnessPersistKey.ReportMaxHr);
                arrayList.add(FitnessPersistKey.ReportMinHr);
                return arrayList;
            case 2:
                arrayList.add("steps");
                arrayList.add(FitnessPersistKey.ActiveStage);
                return arrayList;
            case 3:
                arrayList.add("calories");
                return arrayList;
            case 4:
                arrayList.add("intensity");
                return arrayList;
            case 5:
                arrayList.add(FitnessPersistKey.ValidStand);
                return arrayList;
            case 6:
                arrayList.add("stress");
                arrayList.add(FitnessPersistKey.ManualStress);
                arrayList.add(FitnessPersistKey.AbnormalStress);
                return arrayList;
            case 7:
                arrayList.add("spo2");
                arrayList.add(FitnessPersistKey.ManualSpo2);
                arrayList.add("low_spo2");
                arrayList.add(FitnessPersistKey.ReportMaxSpo2);
                arrayList.add(FitnessPersistKey.ReportMinSpo2);
                return arrayList;
            case 8:
                arrayList.add("sleep");
                arrayList.add(FitnessPersistKey.DaytimeSleep);
                arrayList.add(FitnessPersistKey.NightSleep);
                return arrayList;
            case 9:
                arrayList.add("energy");
                return arrayList;
            case 10:
                arrayList.add(FitnessPersistKey.Vo2Max);
                return arrayList;
            case 11:
                arrayList.add("blood_pressure");
                return arrayList;
            case 12:
                arrayList.add("headset");
                arrayList.add(FitnessPersistKey.Noise);
                return arrayList;
            case 13:
                arrayList.add(FitnessPersistKey.WomenHealthStatus);
                arrayList.add(FitnessPersistKey.WomenHealthSymptoms);
                return arrayList;
            case 14:
                arrayList.add("weight");
                return arrayList;
            case 15:
                arrayList.add("pai");
                return arrayList;
            case 16:
                arrayList.add(FitnessPersistKey.TrainingLoad);
                return arrayList;
            case 17:
                arrayList.add(FitnessPersistKey.ManualTemperature);
                return arrayList;
            case 18:
                arrayList.add(FitnessPersistKey.RunningIndicator);
                arrayList.add(FitnessPersistKey.GradePrediction);
                return arrayList;
            case 19:
                arrayList.add("vitality");
                return arrayList;
            case 20:
                arrayList.add(FitnessPersistKey.EcgMedical);
                return arrayList;
            case 21:
                arrayList.add(FitnessPersistKey.BloodPressureMedical);
                return arrayList;
            case 22:
                arrayList.add("blood_sugar");
                arrayList.add(FitnessPersistKey.ManualBloodSugar);
                return arrayList;
            case 23:
                arrayList.add("physical_fitness_status");
                return arrayList;
            case 24:
                arrayList.add("lactate_threshold");
                return arrayList;
            case 25:
                arrayList.add("body_momentum");
                arrayList.add("light_sensitivity_value");
                return arrayList;
            case 26:
                arrayList.add("temperature_trend");
                return arrayList;
            case 27:
                arrayList.add(FitnessPersistKey.TemperatureCharacter);
                return arrayList;
            default:
                return arrayList;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x007c A[ORIG_RETURN, RETURN] */
    public final boolean hasOneDateRecordOneDay(@NotNull String persistKey) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        switch (persistKey) {
            case "min_spo2":
            case "menstrual_symptoms":
            case "max_heart_rate":
            case "training_load":
            case "watch_daytime_sleep":
            case "pai":
            case "min_heart_rate":
            case "menstruation":
            case "max_spo2":
            case "resting_heart_rate":
            case "vitality":
            case "watch_night_sleep":
                return true;
            default:
                return false;
        }
    }

    @Nullable
    public final DailyRecordBaseDao<? extends DailyRecordBaseEntity> getDailyRecordDao(@NotNull HomeDataType dataType) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        return getDailyRecordDao(dataType, FitnessDatabase.INSTANCE.getInstance());
    }

    @Nullable
    public final DailyRecordBaseDao<? extends DailyRecordBaseEntity> getDailyRecordDao(@NotNull HomeDataType dataType, @NotNull FitnessDatabase dbInstance) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(dbInstance, "dbInstance");
        switch (WhenMappings.$EnumSwitchMapping$0[dataType.ordinal()]) {
            case 1:
                return dbInstance.hrRecordItemDao();
            case 2:
                return dbInstance.stepRecordItemDao();
            case 3:
                return dbInstance.calorieRecordItemDao();
            case 4:
                return dbInstance.mhStrengthRecordItemDao();
            case 5:
                return dbInstance.standRecordItemDao();
            case 6:
                return dbInstance.stressRecordItemDao();
            case 7:
                return dbInstance.spo2RecordItemDao();
            case 8:
                return dbInstance.sleepSegmentDao();
            case 9:
                return dbInstance.energyRecordItemDao();
            case 10:
                return dbInstance.vo2maxItemDao();
            case 11:
                return dbInstance.bloodPressureItemDao();
            case 12:
                return dbInstance.hearingHealthItemDao();
            case 13:
                return dbInstance.menstruationItemDao();
            case 14:
                return dbInstance.weightRecordDao();
            case 15:
                return dbInstance.paiRecordDao();
            case 16:
                return dbInstance.trainingLoadRecordDao();
            case 17:
                return dbInstance.temperatureRecordDao();
            case 18:
                return dbInstance.runningAbilityIndexDao();
            case 19:
                return dbInstance.vitalityRecordDao();
            case 20:
                return dbInstance.ecgMedicalRecordDao();
            case 21:
                return dbInstance.bloodPressureMedicalDao();
            case 22:
                return dbInstance.bloodSugarDao();
            case 23:
                return dbInstance.physicalStatusDao();
            case 24:
                return dbInstance.lactateThresholdDao();
            case 25:
                return dbInstance.extraDataDao();
            case 26:
                return dbInstance.temperatureTrendDao();
            case 27:
                return dbInstance.temperatureCharacterDao();
            default:
                return null;
        }
    }
}
