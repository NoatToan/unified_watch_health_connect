package com.xiaomi.fit.data.common.data.sport;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b3\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3¨\u00064"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "<init>", "(Ljava/lang/String;I)V", "Gps", "TgcGps", "RecordDetailInfo", "RecordPauseDetailInfo", "Hr", "Spo2", "Stress", "Power", "Resistance", "Step", "StepsFrequency", "StepsLength", "LandingImpact", "TouchdownTime", "InTheAirTime", "TouchAirRatio", "Distance", "WholeKMPoint", "Height", "Pace", "Speed", "SwimSwolf", "SwimStrokeCount", "SwimStrokeFreq", "SwimPassage", "SwimPace", "Count", "Frequency", "SkippingHeight", "GroupSportInfo", "SkiInfo", "GolfInfo", "ITSportInfo", "RopeSkipStumbleInfo", "RecoverRateData", "EqualIntensityPace", "RunningPower", "DivingSportInfo", "DivingDepth", "DivingTemperature", "VerticalAmplitude", "VerticalStrideRatio", "SwimmingInfo", "SwimmingHr", "FreePitchAngle", "FreeBreathAngle", "FrogBreathAngle", "FrogSkiDuration", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum SportRecordKey {
    Gps,
    TgcGps,
    RecordDetailInfo,
    RecordPauseDetailInfo,
    Hr,
    Spo2,
    Stress,
    Power,
    Resistance,
    Step,
    StepsFrequency,
    StepsLength,
    LandingImpact,
    TouchdownTime,
    InTheAirTime,
    TouchAirRatio,
    Distance,
    WholeKMPoint,
    Height,
    Pace,
    Speed,
    SwimSwolf,
    SwimStrokeCount,
    SwimStrokeFreq,
    SwimPassage,
    SwimPace,
    Count,
    Frequency,
    SkippingHeight,
    GroupSportInfo,
    SkiInfo,
    GolfInfo,
    ITSportInfo,
    RopeSkipStumbleInfo,
    RecoverRateData,
    EqualIntensityPace,
    RunningPower,
    DivingSportInfo,
    DivingDepth,
    DivingTemperature,
    VerticalAmplitude,
    VerticalStrideRatio,
    SwimmingInfo,
    SwimmingHr,
    FreePitchAngle,
    FreeBreathAngle,
    FrogBreathAngle,
    FrogSkiDuration;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<SportRecordKey> getEntries() {
        return $ENTRIES;
    }
}
