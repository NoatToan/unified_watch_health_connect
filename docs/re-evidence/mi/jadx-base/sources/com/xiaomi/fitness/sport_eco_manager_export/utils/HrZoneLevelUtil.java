package com.xiaomi.fitness.sport_eco_manager_export.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/utils/HrZoneLevelUtil;", "", "<init>", "()V", "getHeartRateZone", "Lcom/xiaomi/fitness/sport_eco_manager_export/utils/HrZoneLevelUtil$HrZoneLevel;", "hr", "", "maxHr", "getHrZone", "computePercentage", "value", "sumValue", "HrZoneLevel", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HrZoneLevelUtil {

    @NotNull
    public static final HrZoneLevelUtil INSTANCE = new HrZoneLevelUtil();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/utils/HrZoneLevelUtil$HrZoneLevel;", "", "<init>", "(Ljava/lang/String;I)V", "smooth", "warmUp", "fatBurning", "aerobic", "anaerobic", "extreme", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum HrZoneLevel {
        smooth,
        warmUp,
        fatBurning,
        aerobic,
        anaerobic,
        extreme;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<HrZoneLevel> getEntries() {
            return $ENTRIES;
        }
    }

    private HrZoneLevelUtil() {
    }

    @JvmStatic
    @Nullable
    public static final HrZoneLevel getHeartRateZone(int hr, int maxHr) {
        return INSTANCE.getHrZone(hr, maxHr);
    }

    private final HrZoneLevel getHrZone(int hr, int maxHr) {
        if (maxHr == 0) {
            return HrZoneLevel.smooth;
        }
        int iComputePercentage = computePercentage(hr, maxHr);
        if (iComputePercentage >= 91) {
            return HrZoneLevel.extreme;
        }
        if (iComputePercentage >= 81) {
            return HrZoneLevel.anaerobic;
        }
        if (iComputePercentage >= 71) {
            return HrZoneLevel.aerobic;
        }
        if (iComputePercentage >= 61) {
            return HrZoneLevel.fatBurning;
        }
        return iComputePercentage >= 50 ? HrZoneLevel.warmUp : HrZoneLevel.smooth;
    }

    public final int computePercentage(int value, int sumValue) {
        return Math.max(0, Math.round((value * 100) / (sumValue * 1.0f)));
    }
}
