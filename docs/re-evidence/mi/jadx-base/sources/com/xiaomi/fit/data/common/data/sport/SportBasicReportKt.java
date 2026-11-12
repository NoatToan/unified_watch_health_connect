package com.xiaomi.fit.data.common.data.sport;

import com.xiaomi.fit.data.common.data.annotation.SportCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"MONTH_IN_SEC", "", "SPORT_ID_INTERVAL_TRAINING", "showClimbDuration", "", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "maxValid", "isValid", "ROUTE_KEY", "", "getROUTE_KEY", "()Ljava/lang/String;", "fitness-common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportBasicReportKt {
    public static final int MONTH_IN_SEC = 2678400;

    @NotNull
    private static final String ROUTE_KEY = "route_key";
    public static final int SPORT_ID_INTERVAL_TRAINING = 254;

    @NotNull
    public static final String getROUTE_KEY() {
        return ROUTE_KEY;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    public static final boolean isValid(@NotNull SportBasicReport sportBasicReport) {
        boolean z;
        Intrinsics.checkNotNullParameter(sportBasicReport, "<this>");
        if (sportBasicReport.getStartTime() <= 0 || sportBasicReport.getEndTime() <= 0 || sportBasicReport.getStartTime() >= sportBasicReport.getEndTime()) {
            z = true;
        } else if (sportBasicReport.getTotalDivingDuration() != null) {
            Integer totalDivingDuration = sportBasicReport.getTotalDivingDuration();
            Intrinsics.checkNotNull(totalDivingDuration);
            if (totalDivingDuration.intValue() <= 0) {
                z = true;
            } else {
                z = false;
            }
        } else if (sportBasicReport.getDuration() <= 0 || sportBasicReport.getDuration() > 2678400) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final boolean maxValid(@NotNull SportBasicReport sportBasicReport) {
        float duration;
        Intrinsics.checkNotNullParameter(sportBasicReport, "<this>");
        Integer calories = sportBasicReport.getCalories();
        int iIntValue = calories != null ? calories.intValue() : 0;
        Integer distance = sportBasicReport.getDistance();
        int iIntValue2 = distance != null ? distance.intValue() : 0;
        if (sportBasicReport.getStartTime() > 0 && sportBasicReport.getEndTime() > 0 && sportBasicReport.getStartTime() < sportBasicReport.getEndTime() && sportBasicReport.getDuration() > 0 && sportBasicReport.getDuration() <= 2678400 && iIntValue <= sportBasicReport.getDuration() * 30 && iIntValue2 <= sportBasicReport.getDuration() * 30) {
            Integer maxPace = sportBasicReport.getMaxPace();
            int iIntValue3 = maxPace != null ? maxPace.intValue() : 0;
            Integer avgPace = sportBasicReport.getAvgPace();
            int iIntValue4 = avgPace != null ? avgPace.intValue() : 0;
            if (iIntValue3 > 0 || iIntValue4 > 0) {
                if (iIntValue4 > 0) {
                    duration = iIntValue4;
                } else {
                    duration = iIntValue2 > 0 ? (sportBasicReport.getDuration() * 1.0f) / iIntValue2 : 0.0f;
                }
                if (duration <= 0.0f) {
                    return false;
                }
                SportCategory.Companion companion = SportCategory.INSTANCE;
                if (companion.isSwimming(sportBasicReport.getSportType())) {
                    if (duration * 100 <= 30.0f) {
                        return false;
                    }
                } else if (companion.isWalking(sportBasicReport.getSportType()) || companion.isRunning(sportBasicReport.getSportType())) {
                    if (duration * 1000 <= 90.0f) {
                        return false;
                    }
                } else if (duration * 1000 <= 36.0f) {
                    return false;
                }
            }
            Float maxSpeed = sportBasicReport.getMaxSpeed();
            float fFloatValue = maxSpeed != null ? maxSpeed.floatValue() : 0.0f;
            Float avgSpeed = sportBasicReport.getAvgSpeed();
            float fFloatValue2 = avgSpeed != null ? avgSpeed.floatValue() : 0.0f;
            if (fFloatValue <= 0.0f && fFloatValue2 <= 0.0f) {
                return true;
            }
            if (fFloatValue2 <= 0.0f) {
                fFloatValue2 = (iIntValue2 * 3.6f) / sportBasicReport.getDuration();
            }
            if (fFloatValue2 > 0.0f && fFloatValue2 < 100.0f) {
                return true;
            }
        }
        return false;
    }

    public static final boolean showClimbDuration(@NotNull SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(sportBasicReport, "<this>");
        if (sportBasicReport.getRiseClimbDuration() == null && sportBasicReport.getFallClimbDuration() == null) {
            return false;
        }
        Integer riseClimbDuration = sportBasicReport.getRiseClimbDuration();
        int iIntValue = riseClimbDuration != null ? riseClimbDuration.intValue() : 0;
        Integer fallClimbDuration = sportBasicReport.getFallClimbDuration();
        return iIntValue + (fallClimbDuration != null ? fallClimbDuration.intValue() : 0) < sportBasicReport.getDuration();
    }
}
