package com.xiaomi.fit.fitness.persist.dailyreport.utils;

import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.CloudParamsKt;
import com.xiaomi.fit.fitness.persist.data.CloudSyncCheckResult;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u001a\u0006\u0010\b\u001a\u00020\t\u001a\u0006\u0010\n\u001a\u00020\u0004\u001a\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"REQUEST_COUNT", "", "REAULT_COUNT", "isInvalidTime", "", "time", "", "(Ljava/lang/Long;)Z", "requestTimeInterval", "", "isEnable", "getRequestTag", "", "type", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "fitness-data-core_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DataCloudUtilKt {
    public static final int REAULT_COUNT = 100;
    public static final int REQUEST_COUNT = 20;

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
                iArr[HomeDataType.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.HR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeDataType.STRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeDataType.SPO2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeDataType.MH_STRENGTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeDataType.VALID_STAND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomeDataType.ENERGY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HomeDataType.RAINBOW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String getRequestTag(@NotNull HomeDataType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return "daily_report";
            case 10:
                return CloudParamsKt.TAG_DAILY_FITNESS;
            default:
                return "";
        }
    }

    public static final boolean isEnable() {
        return FitnessPersistUtils.INSTANCE.checkServerRequestEnable() == CloudSyncCheckResult.SUCCESS;
    }

    public static final boolean isInvalidTime(@Nullable Long l) {
        return l != null && l.longValue() > 0;
    }

    public static final void requestTimeInterval() throws InterruptedException {
        Thread.sleep(RangesKt___RangesKt.random(new IntRange(500, 1000), Random.Default));
    }
}
