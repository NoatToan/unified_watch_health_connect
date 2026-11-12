package com.xiaomi.fitness.account;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/account/HrZone;", "", "<init>", "()V", "maxHr", "", "getMaxHr", "()I", "getMaxHeartRate", "getHrZone", "Lcom/xiaomi/fitness/account/HrZoneLevel;", "hr", "getHrZoneRange", "Lcom/xiaomi/fitness/account/HrZoneRange;", "hrZone", "computePercentage", "", "value", "getHrLevel", "percent", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HrZone {
    private final int maxHr = getMaxHeartRate();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HrZoneLevel.values().length];
            try {
                iArr[HrZoneLevel.Extreme.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HrZoneLevel.Anaerobic.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HrZoneLevel.Aerobic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HrZoneLevel.FatBurning.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HrZoneLevel.WarmUp.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final float computePercentage(int value, int maxHr) {
        return (value * 100) / (maxHr * 1.0f);
    }

    private final HrZoneLevel getHrLevel(float percent) {
        if (percent > 90.0f) {
            return HrZoneLevel.Extreme;
        }
        if (percent > 80.0f) {
            return HrZoneLevel.Anaerobic;
        }
        if (percent > 70.0f) {
            return HrZoneLevel.Aerobic;
        }
        if (percent > 60.0f) {
            return HrZoneLevel.FatBurning;
        }
        return percent >= 50.0f ? HrZoneLevel.WarmUp : HrZoneLevel.Smooth;
    }

    private final int getMaxHeartRate() {
        return UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getMaxHrOrDefault();
    }

    @NotNull
    public final HrZoneLevel getHrZone(int hr) {
        int i = this.maxHr;
        return i == 0 ? HrZoneLevel.Smooth : getHrLevel(computePercentage(hr, i));
    }

    @NotNull
    public final HrZoneRange getHrZoneRange(@NotNull HrZoneLevel hrZone) {
        int i;
        int i2;
        double d;
        Intrinsics.checkNotNullParameter(hrZone, "hrZone");
        int i3 = WhenMappings.$EnumSwitchMapping$0[hrZone.ordinal()];
        if (i3 == 1) {
            i = this.maxHr;
            i2 = ((int) (((double) i) * 0.9d)) + 1;
        } else if (i3 != 2) {
            if (i3 == 3) {
                int i4 = this.maxHr;
                i2 = ((int) (((double) i4) * 0.7d)) + 1;
                d = ((double) i4) * 0.8d;
            } else if (i3 == 4) {
                int i5 = this.maxHr;
                i2 = ((int) (((double) i5) * 0.6d)) + 1;
                d = ((double) i5) * 0.7d;
            } else if (i3 != 5) {
                i = ((int) (((double) this.maxHr) * 0.5d)) - 1;
                i2 = 0;
            } else {
                int i6 = this.maxHr;
                i2 = (int) (((double) i6) * 0.5d);
                d = ((double) i6) * 0.6d;
            }
            i = (int) d;
        } else {
            int i7 = this.maxHr;
            int i8 = 1 + ((int) (((double) i7) * 0.8d));
            i = (int) (((double) i7) * 0.9d);
            i2 = i8;
        }
        return new HrZoneRange(i2, i);
    }

    public final int getMaxHr() {
        return this.maxHr;
    }
}
