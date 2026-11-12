package com.xiaomi.fit.fitness.parser.schema;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\bO\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/DailyReportKey;", "", "<init>", "()V", "time", "", "weight", "bmi", DailyReportKey.bodywater, DailyReportKey.bonesalt, DailyReportKey.protein, DailyReportKey.bodyfat, DailyReportKey.fatmass, DailyReportKey.musclemass, DailyReportKey.bonemineralcontent, DailyReportKey.proteinmass, DailyReportKey.basalmetabolicrate, "totalSteps", DailyReportKey.totalactiveCalories, "heartRate", DailyReportKey.restingHeartRate, "maxHeartRate", DailyReportKey.maxHeartRateTime, "minHeartRate", DailyReportKey.minHeartRateTime, "avgHeartRate", "avgStress", "maxStress", "minStress", DailyReportKey.standingindicator, "totalCalories", DailyReportKey.residualrecoverytime, "oxygenSaturation", DailyReportKey.maxOxygenSaturation, DailyReportKey.maxOxygenSaturationTime, DailyReportKey.minOxygenSaturation, DailyReportKey.minOxygenSaturationTime, DailyReportKey.avgOxygenSaturation, DailyReportKey.totaltrainingLoad, DailyReportKey.totalPast7daystrainingLoad, "trainingLoadLevel", DailyReportKey.lowIntensityearnedPoints, DailyReportKey.mediumIntensityearnedPoints, DailyReportKey.maxIntensityearnedPoints, DailyReportKey.totalPast7dayearnedPoints, DailyReportKey.targetNextearnedPointsType, DailyReportKey.targetNextearnedPointsTiem, "tsb", DailyReportKey.ctl, DailyReportKey.atl, DailyReportKey.tss, "timestamp", "measurementType", "spo2", "stress", "temperature", DailyReportKey.skinTemperature, DailyReportKey.bodyTemperature, DailyReportKey.systolic, DailyReportKey.diastolic, DailyReportKey.pulse, DailyReportKey.measurementStatus, DailyReportKey.sleepFull, "startTime", "endTime", DailyReportKey.sleepQuality, DailyReportKey.sleepEfficiency, DailyReportKey.asleepDuration, DailyReportKey.liebBedDuratio, DailyReportKey.goBedTime, DailyReportKey.liveBedTime, DailyReportKey.heartRateInterval, DailyReportKey.heartRateRecondCount, DailyReportKey.heartRateFirstTime, "heartRates", DailyReportKey.bloodOxygenInterval, DailyReportKey.bloodOxygenRecondCount, DailyReportKey.bloodOxygenFirstTime, DailyReportKey.bloodOxygens, DailyReportKey.snoreInterval, DailyReportKey.snoreRecondCount, DailyReportKey.snoreFirstTime, DailyReportKey.snores, DailyReportKey.featureData, "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DailyReportKey {

    @NotNull
    public static final DailyReportKey INSTANCE = new DailyReportKey();

    @NotNull
    public static final String asleepDuration = "asleepDuration";

    @NotNull
    public static final String atl = "atl";

    @NotNull
    public static final String avgHeartRate = "avgHeartRate";

    @NotNull
    public static final String avgOxygenSaturation = "avgOxygenSaturation";

    @NotNull
    public static final String avgStress = "avgStress";

    @NotNull
    public static final String basalmetabolicrate = "basalmetabolicrate";

    @NotNull
    public static final String bloodOxygenFirstTime = "bloodOxygenFirstTime";

    @NotNull
    public static final String bloodOxygenInterval = "bloodOxygenInterval";

    @NotNull
    public static final String bloodOxygenRecondCount = "bloodOxygenRecondCount";

    @NotNull
    public static final String bloodOxygens = "bloodOxygens";

    @NotNull
    public static final String bmi = "bmi";

    @NotNull
    public static final String bodyTemperature = "bodyTemperature";

    @NotNull
    public static final String bodyfat = "bodyfat";

    @NotNull
    public static final String bodywater = "bodywater";

    @NotNull
    public static final String bonemineralcontent = "bonemineralcontent";

    @NotNull
    public static final String bonesalt = "bonesalt";

    @NotNull
    public static final String ctl = "ctl";

    @NotNull
    public static final String diastolic = "diastolic";

    @NotNull
    public static final String endTime = "endTime";

    @NotNull
    public static final String fatmass = "fatmass";

    @NotNull
    public static final String featureData = "featureData";

    @NotNull
    public static final String goBedTime = "goBedTime";

    @NotNull
    public static final String heartRate = "heartRate";

    @NotNull
    public static final String heartRateFirstTime = "heartRateFirstTime";

    @NotNull
    public static final String heartRateInterval = "heartRateInterval";

    @NotNull
    public static final String heartRateRecondCount = "heartRateRecondCount";

    @NotNull
    public static final String heartRates = "heartRates";

    @NotNull
    public static final String liebBedDuratio = "liebBedDuratio";

    @NotNull
    public static final String liveBedTime = "liveBedTime";

    @NotNull
    public static final String lowIntensityearnedPoints = "lowIntensityearnedPoints";

    @NotNull
    public static final String maxHeartRate = "maxHeartRate";

    @NotNull
    public static final String maxHeartRateTime = "maxHeartRateTime";

    @NotNull
    public static final String maxIntensityearnedPoints = "maxIntensityearnedPoints";

    @NotNull
    public static final String maxOxygenSaturation = "maxOxygenSaturation";

    @NotNull
    public static final String maxOxygenSaturationTime = "maxOxygenSaturationTime";

    @NotNull
    public static final String maxStress = "maxStress";

    @NotNull
    public static final String measurementStatus = "measurementStatus";

    @NotNull
    public static final String measurementType = "type";

    @NotNull
    public static final String mediumIntensityearnedPoints = "mediumIntensityearnedPoints";

    @NotNull
    public static final String minHeartRate = "minHeartRate";

    @NotNull
    public static final String minHeartRateTime = "minHeartRateTime";

    @NotNull
    public static final String minOxygenSaturation = "minOxygenSaturation";

    @NotNull
    public static final String minOxygenSaturationTime = "minOxygenSaturationTime";

    @NotNull
    public static final String minStress = "minStress";

    @NotNull
    public static final String musclemass = "musclemass";

    @NotNull
    public static final String oxygenSaturation = "oxygenSaturation";

    @NotNull
    public static final String protein = "protein";

    @NotNull
    public static final String proteinmass = "proteinmass";

    @NotNull
    public static final String pulse = "pulse";

    @NotNull
    public static final String residualrecoverytime = "residualrecoverytime";

    @NotNull
    public static final String restingHeartRate = "restingHeartRate";

    @NotNull
    public static final String skinTemperature = "skinTemperature";

    @NotNull
    public static final String sleepEfficiency = "sleepEfficiency";

    @NotNull
    public static final String sleepFull = "sleepFull";

    @NotNull
    public static final String sleepQuality = "sleepQuality";

    @NotNull
    public static final String snoreFirstTime = "snoreFirstTime";

    @NotNull
    public static final String snoreInterval = "snoreInterval";

    @NotNull
    public static final String snoreRecondCount = "snoreRecondCount";

    @NotNull
    public static final String snores = "snores";

    @NotNull
    public static final String spo2 = "spo2";

    @NotNull
    public static final String standingindicator = "standingindicator";

    @NotNull
    public static final String startTime = "startTime";

    @NotNull
    public static final String stress = "stress";

    @NotNull
    public static final String systolic = "systolic";

    @NotNull
    public static final String targetNextearnedPointsTiem = "targetNextearnedPointsTiem";

    @NotNull
    public static final String targetNextearnedPointsType = "targetNextearnedPointsType";

    @NotNull
    public static final String temperature = "temperature";

    @NotNull
    public static final String time = "timestamp";

    @NotNull
    public static final String timestamp = "timestamp";

    @NotNull
    public static final String totalCalories = "totalCalories";

    @NotNull
    public static final String totalPast7dayearnedPoints = "totalPast7dayearnedPoints";

    @NotNull
    public static final String totalPast7daystrainingLoad = "totalPast7daystrainingLoad";

    @NotNull
    public static final String totalSteps = "totalSteps";

    @NotNull
    public static final String totalactiveCalories = "totalactiveCalories";

    @NotNull
    public static final String totaltrainingLoad = "totaltrainingLoad";

    @NotNull
    public static final String trainingLoadLevel = "trainingLoadLevel";

    @NotNull
    public static final String tsb = "tsb";

    @NotNull
    public static final String tss = "tss";

    @NotNull
    public static final String weight = "weight";

    private DailyReportKey() {
    }
}
