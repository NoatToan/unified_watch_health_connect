package com.xiaomi.fitness.aggregation.health.dao.convert;

import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.FitnessDataUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPaiReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPhysicalStatusReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTrainingLoadReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVitalityReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.CalorieRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.EnergyStateRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.MHStrengthRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StandRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StepRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimedValuePair;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordFloat;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.EnergyItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.NoiseItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u0001H\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010 \u001a\u00020!2\u0006\u0010\t\u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\t\u001a\u00020#2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010$\u001a\u00020%2\u0006\u0010\t\u001a\u00020%2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010&\u001a\u00020'2\u0006\u0010\t\u001a\u00020'2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000bH\u0002J\u0018\u0010-\u001a\u00020.2\u0006\u0010\t\u001a\u00020.2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010/\u001a\u0002002\u0006\u0010\t\u001a\u0002002\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u00101\u001a\u0002022\u0006\u0010\t\u001a\u0002022\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u00103\u001a\u0002042\u0006\u0010\t\u001a\u0002042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u00105\u001a\u0002062\u0006\u0010\t\u001a\u0002062\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/convert/ReportConvertor;", "", "<init>", "()V", "convertReport", "R", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "report", "timeInZero", "", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;J)Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "convertTemperatureReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;", "convertWeightReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;", "convertEcgReport", "convertBloodPressureReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "convertVO2MaxReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;", "convertPaiReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPaiReport;", "convertVitalityReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVitalityReport;", "convertPhysicalStatusReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPhysicalStatusReport;", "convertTrainingLoadReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTrainingLoadReport;", "convertHearingReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;", "convertEnergyReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;", "convertStressReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "convertSPO2Report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "convertHrReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "convertAbnormalRecord", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "offset", "convertSleepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "convertMHStrength", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;", "convertStandReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "convertCalorieReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;", "convertStepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReportConvertor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportConvertor.kt\ncom/xiaomi/fitness/aggregation/health/dao/convert/ReportConvertor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,432:1\n1863#2,2:433\n1863#2,2:435\n1863#2,2:437\n1863#2,2:439\n1863#2,2:441\n1863#2,2:443\n1863#2,2:445\n1863#2,2:447\n1863#2,2:449\n1863#2:451\n1863#2,2:452\n1864#2:454\n1863#2,2:455\n1863#2,2:457\n1863#2,2:459\n1863#2,2:461\n*S KotlinDebug\n*F\n+ 1 ReportConvertor.kt\ncom/xiaomi/fitness/aggregation/health/dao/convert/ReportConvertor\n*L\n69#1:433,2\n72#1:435,2\n75#1:437,2\n91#1:439,2\n121#1:441,2\n136#1:443,2\n200#1:445,2\n203#1:447,2\n221#1:449,2\n250#1:451\n253#1:452,2\n250#1:454\n274#1:455,2\n312#1:457,2\n315#1:459,2\n329#1:461,2\n*E\n"})
public final class ReportConvertor {

    @NotNull
    public static final ReportConvertor INSTANCE = new ReportConvertor();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.STEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.CALORIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.VALID_STAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.MH_STRENGTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeDataType.SLEEP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeDataType.HR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeDataType.SPO2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeDataType.STRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomeDataType.ENERGY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HomeDataType.HEARING_HEALTH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HomeDataType.PAI.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HomeDataType.V02_MAX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HomeDataType.BLOOD_PRESSURE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HomeDataType.ECG_MEDICAL.ordinal()] = 14;
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
                iArr[HomeDataType.VITALITY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[HomeDataType.PHYSICAL_STATUS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ReportConvertor() {
    }

    private final void convertAbnormalRecord(SegmentItem record, long offset) {
        record.setStartTime(record.getStartTime() + offset);
        record.setEndTime(record.getEndTime() + offset);
        List<AbnormalItem> items = record.getItems();
        if (items != null) {
            for (AbnormalItem abnormalItem : items) {
                abnormalItem.setTime(abnormalItem.getTime() + offset);
            }
        }
    }

    private final DailyBloodPressureReport convertBloodPressureReport(DailyBloodPressureReport report, long timeInZero) {
        long time = report.getTime();
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            return new DailyBloodPressureReport(jChangeToCurrentTzZeroTimeOneDay, report.getTag());
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        for (TimesDataRecordInt timesDataRecordInt : report.getHighPressureRecords()) {
            timesDataRecordInt.setTime((timesDataRecordInt.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
        }
        for (TimesDataRecordInt timesDataRecordInt2 : report.getLowPressureRecords()) {
            timesDataRecordInt2.setTime((timesDataRecordInt2.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
        }
        List<TimesDataRecordInt> pulseRecords = report.getPulseRecords();
        if (pulseRecords != null && !pulseRecords.isEmpty()) {
            for (TimesDataRecordInt timesDataRecordInt3 : report.getPulseRecords()) {
                timesDataRecordInt3.setTime((timesDataRecordInt3.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        List<BloodPressureItem> singlePressureRecords = report.getSinglePressureRecords();
        if (singlePressureRecords != null) {
            for (BloodPressureItem bloodPressureItem : singlePressureRecords) {
                bloodPressureItem.setTime((bloodPressureItem.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        return report;
    }

    private final DailyCalorieReport convertCalorieReport(DailyCalorieReport report, long timeInZero) {
        long time = report.getTime();
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            return new DailyCalorieReport(report.getTag(), jChangeToCurrentTzZeroTimeOneDay);
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        for (CalorieRecord calorieRecord : report.getCalRecords()) {
            calorieRecord.setTime((calorieRecord.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
        }
        Long maxEndTime = report.getMaxEndTime();
        if (maxEndTime != null) {
            report.setMaxEndTime(Long.valueOf((maxEndTime.longValue() + jChangeToCurrentTzZeroTimeOneDay) - time));
        }
        Long minStartTime = report.getMinStartTime();
        if (minStartTime != null) {
            report.setMinStartTime(Long.valueOf((jChangeToCurrentTzZeroTimeOneDay + minStartTime.longValue()) - time));
        }
        return report;
    }

    private final Object convertEcgReport() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    private final DailyEnergyReport convertEnergyReport(DailyEnergyReport report, long timeInZero) {
        long time = report.getTime();
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            String tag = report.getTag();
            String sid = report.getSid();
            Intrinsics.checkNotNull(sid);
            return new DailyEnergyReport(jChangeToCurrentTzZeroTimeOneDay, tag, sid);
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        for (TimesDataRecordInt timesDataRecordInt : report.getEnergyRecords()) {
            timesDataRecordInt.setTime((timesDataRecordInt.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
        }
        List<EnergyStateRecord> energyStateRecords = report.getEnergyStateRecords();
        if (energyStateRecords != null) {
            for (EnergyStateRecord energyStateRecord : energyStateRecords) {
                energyStateRecord.setTime((energyStateRecord.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        EnergyItem latestRecord = report.getLatestRecord();
        if (latestRecord != null) {
            latestRecord.setTime((jChangeToCurrentTzZeroTimeOneDay + latestRecord.getTime()) - time);
        }
        return report;
    }

    private final DailyHearingReport convertHearingReport(DailyHearingReport report, long timeInZero) {
        long time = report.getTime();
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            return new DailyHearingReport(jChangeToCurrentTzZeroTimeOneDay, report.getTag());
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        List<TimedValuePair<Integer>> hearingDurationList = report.getHearingDurationList();
        if (hearingDurationList != null) {
            Iterator<T> it = hearingDurationList.iterator();
            while (it.hasNext()) {
                TimedValuePair timedValuePair = (TimedValuePair) it.next();
                timedValuePair.setTime((timedValuePair.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        List<NoiseItem> noiseList = report.getNoiseList();
        if (noiseList != null) {
            for (NoiseItem noiseItem : noiseList) {
                noiseItem.setTime((noiseItem.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        return report;
    }

    private final DailyHrReport convertHrReport(DailyHrReport report, long timeInZero) {
        long time = report.getTime();
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            return new DailyHrReport(jChangeToCurrentTzZeroTimeOneDay, report.getTag());
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        long j = jChangeToCurrentTzZeroTimeOneDay - time;
        for (TimesDataRecordInt timesDataRecordInt : report.getHrRecords()) {
            timesDataRecordInt.setTime((timesDataRecordInt.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
        }
        if (report.getStepHrRecords() != null) {
            List<TimesDataRecordInt> stepHrRecords = report.getStepHrRecords();
            Intrinsics.checkNotNull(stepHrRecords);
            for (TimesDataRecordInt timesDataRecordInt2 : stepHrRecords) {
                timesDataRecordInt2.setTime((timesDataRecordInt2.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        List<HrItem> singleHrRecords = report.getSingleHrRecords();
        if (singleHrRecords != null) {
            for (HrItem hrItem : singleHrRecords) {
                hrItem.setTime((hrItem.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        List<AbnormalHrItem> abnormalHrRecords = report.getAbnormalHrRecords();
        if (abnormalHrRecords != null) {
            for (AbnormalHrItem abnormalHrItem : abnormalHrRecords) {
                abnormalHrItem.setTime((abnormalHrItem.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        List<AbnormalFibItem> abnormalFibRecords = report.getAbnormalFibRecords();
        if (abnormalFibRecords != null) {
            for (AbnormalFibItem abnormalFibItem : abnormalFibRecords) {
                abnormalFibItem.setStartTime((abnormalFibItem.getStartTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
                abnormalFibItem.setEndTime((abnormalFibItem.getEndTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        List<SegmentItem> abnormalHrHighRecords = report.getAbnormalHrHighRecords();
        if (abnormalHrHighRecords != null) {
            Iterator<T> it = abnormalHrHighRecords.iterator();
            while (it.hasNext()) {
                INSTANCE.convertAbnormalRecord((SegmentItem) it.next(), j);
            }
        }
        List<SegmentItem> abnormalHrLowRecords = report.getAbnormalHrLowRecords();
        if (abnormalHrLowRecords != null) {
            Iterator<T> it2 = abnormalHrLowRecords.iterator();
            while (it2.hasNext()) {
                INSTANCE.convertAbnormalRecord((SegmentItem) it2.next(), j);
            }
        }
        HrItem latestHrRecord = report.getLatestHrRecord();
        if (latestHrRecord != null) {
            latestHrRecord.setTime((jChangeToCurrentTzZeroTimeOneDay + latestHrRecord.getTime()) - time);
        }
        return report;
    }

    private final DailyMHStrengthReport convertMHStrength(DailyMHStrengthReport report, long timeInZero) {
        long time = report.getTime();
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            return new DailyMHStrengthReport(jChangeToCurrentTzZeroTimeOneDay, report.getTag());
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        for (MHStrengthRecord mHStrengthRecord : report.getRecordList()) {
            mHStrengthRecord.setTime((mHStrengthRecord.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
        }
        Long maxEndTime = report.getMaxEndTime();
        if (maxEndTime != null) {
            report.setMaxEndTime(Long.valueOf((maxEndTime.longValue() + jChangeToCurrentTzZeroTimeOneDay) - time));
        }
        Long minStartTime = report.getMinStartTime();
        if (minStartTime != null) {
            report.setMinStartTime(Long.valueOf((jChangeToCurrentTzZeroTimeOneDay + minStartTime.longValue()) - time));
        }
        return report;
    }

    private final DailyPaiReport convertPaiReport(DailyPaiReport report, long timeInZero) {
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (!report.isEmpty()) {
            report.setTime(jChangeToCurrentTzZeroTimeOneDay);
            return report;
        }
        String sid = report.getSid();
        Intrinsics.checkNotNull(sid);
        return new DailyPaiReport(jChangeToCurrentTzZeroTimeOneDay, sid);
    }

    private final DailyPhysicalStatusReport convertPhysicalStatusReport(DailyPhysicalStatusReport report, long timeInZero) {
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (!report.isEmpty()) {
            report.setTime(jChangeToCurrentTzZeroTimeOneDay);
            return report;
        }
        String sid = report.getSid();
        Intrinsics.checkNotNull(sid);
        return new DailyPhysicalStatusReport(jChangeToCurrentTzZeroTimeOneDay, sid);
    }

    private final DailySpo2Report convertSPO2Report(DailySpo2Report report, long timeInZero) {
        long time = report.getTime();
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            return new DailySpo2Report(jChangeToCurrentTzZeroTimeOneDay, report.getTag());
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        long j = jChangeToCurrentTzZeroTimeOneDay - time;
        for (TimesDataRecordInt timesDataRecordInt : report.getSpo2Records()) {
            timesDataRecordInt.setTime((timesDataRecordInt.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
        }
        Spo2Item latestSpoRecord = report.getLatestSpoRecord();
        if (latestSpoRecord != null) {
            latestSpoRecord.setTime((jChangeToCurrentTzZeroTimeOneDay + latestSpoRecord.getTime()) - time);
        }
        List<SegmentItem> abnormalSpo2Records = report.getAbnormalSpo2Records();
        if (abnormalSpo2Records != null) {
            Iterator<T> it = abnormalSpo2Records.iterator();
            while (it.hasNext()) {
                INSTANCE.convertAbnormalRecord((SegmentItem) it.next(), j);
            }
        }
        return report;
    }

    private final AllDaySleepReport convertSleepReport(AllDaySleepReport report, long timeInZero) {
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            return new AllDaySleepReport(jChangeToCurrentTzZeroTimeOneDay, report.getTag());
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        FitnessDataUtils fitnessDataUtils = FitnessDataUtils.INSTANCE;
        fitnessDataUtils.sleepSegmentToLocalTime(report.getSleepSegments());
        fitnessDataUtils.filterAudioFile(report.getSleepSegments());
        return report;
    }

    private final DailyStandReport convertStandReport(DailyStandReport report, long timeInZero) {
        long time = report.getTime();
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            return new DailyStandReport(report.getTag(), jChangeToCurrentTzZeroTimeOneDay);
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        for (StandRecord standRecord : report.getStandDetail()) {
            standRecord.setTime((standRecord.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
        }
        Long maxEndTime = report.getMaxEndTime();
        if (maxEndTime != null) {
            report.setMaxEndTime(Long.valueOf((maxEndTime.longValue() + jChangeToCurrentTzZeroTimeOneDay) - time));
        }
        Long minStartTime = report.getMinStartTime();
        if (minStartTime != null) {
            report.setMinStartTime(Long.valueOf((jChangeToCurrentTzZeroTimeOneDay + minStartTime.longValue()) - time));
        }
        return report;
    }

    private final DailyStepReport convertStepReport(DailyStepReport report, long timeInZero) {
        long time = report.getTime();
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            return new DailyStepReport(jChangeToCurrentTzZeroTimeOneDay, report.getTag());
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        for (StepRecord stepRecord : report.getStepRecords()) {
            stepRecord.setTime((stepRecord.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
        }
        Long maxEndTime = report.getMaxEndTime();
        if (maxEndTime != null) {
            report.setMaxEndTime(Long.valueOf((maxEndTime.longValue() + jChangeToCurrentTzZeroTimeOneDay) - time));
        }
        Long minStartTime = report.getMinStartTime();
        if (minStartTime != null) {
            report.setMinStartTime(Long.valueOf((minStartTime.longValue() + jChangeToCurrentTzZeroTimeOneDay) - time));
        }
        List<ActiveStageItem> activeStageList = report.getActiveStageList();
        if (activeStageList != null) {
            for (ActiveStageItem activeStageItem : activeStageList) {
                activeStageItem.setStartTime((activeStageItem.getStartTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
                activeStageItem.setEndTime((activeStageItem.getEndTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        return report;
    }

    private final DailyStressReport convertStressReport(DailyStressReport report, long timeInZero) {
        long time = report.getTime();
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            String tag = report.getTag();
            String sid = report.getSid();
            Intrinsics.checkNotNull(sid);
            return new DailyStressReport(jChangeToCurrentTzZeroTimeOneDay, tag, sid);
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        long j = jChangeToCurrentTzZeroTimeOneDay - time;
        for (TimesDataRecordInt timesDataRecordInt : report.getStressRecords()) {
            timesDataRecordInt.setTime((timesDataRecordInt.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
        }
        for (StressItem stressItem : report.getSingleStressRecords()) {
            stressItem.setTime((stressItem.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
        }
        StressItem latestStressRecord = report.getLatestStressRecord();
        if (latestStressRecord != null) {
            latestStressRecord.setTime((latestStressRecord.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
        }
        List<SegmentItem> abnormalStressRecords = report.getAbnormalStressRecords();
        if (abnormalStressRecords != null) {
            for (SegmentItem segmentItem : abnormalStressRecords) {
                segmentItem.setStartTime(segmentItem.getStartTime() + j);
                segmentItem.setEndTime(segmentItem.getEndTime() + j);
                List<AbnormalItem> items = segmentItem.getItems();
                if (items != null) {
                    for (AbnormalItem abnormalItem : items) {
                        abnormalItem.setTime((abnormalItem.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
                    }
                }
            }
        }
        return report;
    }

    private final DailyTempReport convertTemperatureReport(DailyTempReport report, long timeInZero) {
        long time = report.getTime();
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            return new DailyTempReport(jChangeToCurrentTzZeroTimeOneDay, report.getTag());
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        List<TimesDataRecordFloat> skinTempRecords = report.getSkinTempRecords();
        if (skinTempRecords != null) {
            for (TimesDataRecordFloat timesDataRecordFloat : skinTempRecords) {
                timesDataRecordFloat.setTime((timesDataRecordFloat.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        List<TimesDataRecordFloat> bodyTempRecords = report.getBodyTempRecords();
        if (bodyTempRecords != null) {
            for (TimesDataRecordFloat timesDataRecordFloat2 : bodyTempRecords) {
                timesDataRecordFloat2.setTime((timesDataRecordFloat2.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        List<TemperatureItem> dailyAllTempDatas = report.getDailyAllTempDatas();
        if (dailyAllTempDatas != null) {
            for (TemperatureItem temperatureItem : dailyAllTempDatas) {
                temperatureItem.setTime((temperatureItem.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        return report;
    }

    private final DailyTrainingLoadReport convertTrainingLoadReport(DailyTrainingLoadReport report, long timeInZero) {
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (!report.isEmpty()) {
            report.setTime(jChangeToCurrentTzZeroTimeOneDay);
            return report;
        }
        String sid = report.getSid();
        Intrinsics.checkNotNull(sid);
        return new DailyTrainingLoadReport(jChangeToCurrentTzZeroTimeOneDay, sid);
    }

    private final DailyVo2MaxReport convertVO2MaxReport(DailyVo2MaxReport report, long timeInZero) {
        long time = report.getTime();
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            return new DailyVo2MaxReport(jChangeToCurrentTzZeroTimeOneDay, report.getTag());
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        List<TimesDataRecordInt> vo2MaxList = report.getVo2MaxList();
        if (vo2MaxList != null) {
            for (TimesDataRecordInt timesDataRecordInt : vo2MaxList) {
                timesDataRecordInt.setTime((timesDataRecordInt.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        Vo2MaxItem latestItem = report.getLatestItem();
        if (latestItem != null) {
            latestItem.setTime((jChangeToCurrentTzZeroTimeOneDay + latestItem.getTime()) - time);
        }
        return report;
    }

    private final DailyVitalityReport convertVitalityReport(DailyVitalityReport report, long timeInZero) {
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (!report.isEmpty()) {
            report.setTime(jChangeToCurrentTzZeroTimeOneDay);
            return report;
        }
        String sid = report.getSid();
        Intrinsics.checkNotNull(sid);
        return new DailyVitalityReport(jChangeToCurrentTzZeroTimeOneDay, sid);
    }

    private final DailyWeightReport convertWeightReport(DailyWeightReport report, long timeInZero) {
        long time = report.getTime();
        long jChangeToCurrentTzZeroTimeOneDay = FitnessDateUtils.INSTANCE.changeToCurrentTzZeroTimeOneDay(timeInZero, 0);
        if (report.isEmpty()) {
            return new DailyWeightReport(jChangeToCurrentTzZeroTimeOneDay, report.getTag());
        }
        report.setTime(jChangeToCurrentTzZeroTimeOneDay);
        WeightItem preDayWeightItem = report.getPreDayWeightItem();
        if (preDayWeightItem != null) {
            WeightItem preDayWeightItem2 = report.getPreDayWeightItem();
            Intrinsics.checkNotNull(preDayWeightItem2);
            preDayWeightItem.setTimestamp((preDayWeightItem2.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
        }
        List<WeightItem> weightRecordList = report.getWeightRecordList();
        if (weightRecordList != null) {
            for (WeightItem weightItem : weightRecordList) {
                weightItem.setTime((weightItem.getTime() + jChangeToCurrentTzZeroTimeOneDay) - time);
            }
        }
        return report;
    }

    @NotNull
    public final <R extends DailyBasicReport> R convertReport(@NotNull HomeDataType dataType, @NotNull R report, long timeInZero) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(report, "report");
        switch (WhenMappings.$EnumSwitchMapping$0[dataType.ordinal()]) {
            case 1:
                DailyStepReport dailyStepReportConvertStepReport = convertStepReport((DailyStepReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyStepReportConvertStepReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyStepReportConvertStepReport;
            case 2:
                DailyCalorieReport dailyCalorieReportConvertCalorieReport = convertCalorieReport((DailyCalorieReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyCalorieReportConvertCalorieReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyCalorieReportConvertCalorieReport;
            case 3:
                DailyStandReport dailyStandReportConvertStandReport = convertStandReport((DailyStandReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyStandReportConvertStandReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyStandReportConvertStandReport;
            case 4:
                DailyMHStrengthReport dailyMHStrengthReportConvertMHStrength = convertMHStrength((DailyMHStrengthReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyMHStrengthReportConvertMHStrength, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyMHStrengthReportConvertMHStrength;
            case 5:
                AllDaySleepReport allDaySleepReportConvertSleepReport = convertSleepReport((AllDaySleepReport) report, timeInZero);
                Intrinsics.checkNotNull(allDaySleepReportConvertSleepReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return allDaySleepReportConvertSleepReport;
            case 6:
                DailyHrReport dailyHrReportConvertHrReport = convertHrReport((DailyHrReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyHrReportConvertHrReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyHrReportConvertHrReport;
            case 7:
                DailySpo2Report dailySpo2ReportConvertSPO2Report = convertSPO2Report((DailySpo2Report) report, timeInZero);
                Intrinsics.checkNotNull(dailySpo2ReportConvertSPO2Report, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailySpo2ReportConvertSPO2Report;
            case 8:
                DailyStressReport dailyStressReportConvertStressReport = convertStressReport((DailyStressReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyStressReportConvertStressReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyStressReportConvertStressReport;
            case 9:
                DailyEnergyReport dailyEnergyReportConvertEnergyReport = convertEnergyReport((DailyEnergyReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyEnergyReportConvertEnergyReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyEnergyReportConvertEnergyReport;
            case 10:
                DailyHearingReport dailyHearingReportConvertHearingReport = convertHearingReport((DailyHearingReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyHearingReportConvertHearingReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyHearingReportConvertHearingReport;
            case 11:
                DailyPaiReport dailyPaiReportConvertPaiReport = convertPaiReport((DailyPaiReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyPaiReportConvertPaiReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyPaiReportConvertPaiReport;
            case 12:
                DailyVo2MaxReport dailyVo2MaxReportConvertVO2MaxReport = convertVO2MaxReport((DailyVo2MaxReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyVo2MaxReportConvertVO2MaxReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyVo2MaxReportConvertVO2MaxReport;
            case 13:
                DailyBloodPressureReport dailyBloodPressureReportConvertBloodPressureReport = convertBloodPressureReport((DailyBloodPressureReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyBloodPressureReportConvertBloodPressureReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyBloodPressureReportConvertBloodPressureReport;
            case 14:
                Object objConvertEcgReport = convertEcgReport();
                Intrinsics.checkNotNull(objConvertEcgReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return (R) objConvertEcgReport;
            case 15:
                DailyWeightReport dailyWeightReportConvertWeightReport = convertWeightReport((DailyWeightReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyWeightReportConvertWeightReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyWeightReportConvertWeightReport;
            case 16:
                DailyTrainingLoadReport dailyTrainingLoadReportConvertTrainingLoadReport = convertTrainingLoadReport((DailyTrainingLoadReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyTrainingLoadReportConvertTrainingLoadReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyTrainingLoadReportConvertTrainingLoadReport;
            case 17:
                DailyTempReport dailyTempReportConvertTemperatureReport = convertTemperatureReport((DailyTempReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyTempReportConvertTemperatureReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyTempReportConvertTemperatureReport;
            case 18:
                DailyVitalityReport dailyVitalityReportConvertVitalityReport = convertVitalityReport((DailyVitalityReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyVitalityReportConvertVitalityReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyVitalityReportConvertVitalityReport;
            case 19:
                DailyPhysicalStatusReport dailyPhysicalStatusReportConvertPhysicalStatusReport = convertPhysicalStatusReport((DailyPhysicalStatusReport) report, timeInZero);
                Intrinsics.checkNotNull(dailyPhysicalStatusReportConvertPhysicalStatusReport, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor.convertReport");
                return dailyPhysicalStatusReportConvertPhysicalStatusReport;
            default:
                throw new IllegalArgumentException("unknown dataType: " + dataType);
        }
    }
}
