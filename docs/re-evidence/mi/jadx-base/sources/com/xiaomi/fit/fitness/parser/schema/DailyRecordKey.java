package com.xiaomi.fit.fitness.parser.schema;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/DailyRecordKey;", "", "<init>", "()V", DailyRecordKey.heartRateRise, "", "newSteps", DailyRecordKey.activeType, DailyRecordKey.activityCalories, DailyRecordKey.activeStreng, DailyRecordKey.sportType, "newDistance", "heartRate", DailyRecordKey.dumpEnergy, "newCalories", DailyRecordKey.energyStatus, DailyRecordKey.energyStatusValue, DailyRecordKey.bloodOxygen, DailyRecordKey.curPressure, DailyRecordKey.abnormalityHeartRate, DailyRecordKey.lightSensation, DailyRecordKey.volumeMomentum, "startTime", "endTime", DailyRecordKey.abnormalDataType, DailyRecordKey.userSetReminderValue, "recordCount", DailyRecordKey.abnormalTime, DailyRecordKey.abnormalValue, "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DailyRecordKey {

    @NotNull
    public static final DailyRecordKey INSTANCE = new DailyRecordKey();

    @NotNull
    public static final String abnormalDataType = "abnormalDataType";

    @NotNull
    public static final String abnormalTime = "abnormalTime";

    @NotNull
    public static final String abnormalValue = "abnormalValue";

    @NotNull
    public static final String abnormalityHeartRate = "abnormalityHeartRate";

    @NotNull
    public static final String activeStreng = "activeStreng";

    @NotNull
    public static final String activeType = "activeType";

    @NotNull
    public static final String activityCalories = "activityCalories";

    @NotNull
    public static final String bloodOxygen = "bloodOxygen";

    @NotNull
    public static final String curPressure = "curPressure";

    @NotNull
    public static final String dumpEnergy = "dumpEnergy";

    @NotNull
    public static final String endTime = "endTime";

    @NotNull
    public static final String energyStatus = "energyStatus";

    @NotNull
    public static final String energyStatusValue = "energyStatusValue";

    @NotNull
    public static final String heartRate = "heartRate";

    @NotNull
    public static final String heartRateRise = "heartRateRise";

    @NotNull
    public static final String lightSensation = "lightSensation";

    @NotNull
    public static final String newCalories = "newCalories";

    @NotNull
    public static final String newDistance = "newDistance";

    @NotNull
    public static final String newSteps = "newSteps";

    @NotNull
    public static final String recordCount = "recordCount";

    @NotNull
    public static final String sportType = "sportType";

    @NotNull
    public static final String startTime = "startTime";

    @NotNull
    public static final String userSetReminderValue = "userSetReminderValue";

    @NotNull
    public static final String volumeMomentum = "volumeMomentum";

    private DailyRecordKey() {
    }
}
