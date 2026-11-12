package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001a¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GolfStatistic;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "totalSwing", "averageBeat", "averageUpTime", "averageDownTime", "averageAngle", "averageScore", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getTotalSwing", "()I", "b", "F", "getAverageBeat", "()F", "c", "getAverageUpTime", GoogleApiAvailabilityLight.a, "getAverageDownTime", "e", "getAverageAngle", "f", "getAverageScore", "<init>", "(IFFFII)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GolfStatistic {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int totalSwing;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float averageBeat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float averageUpTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float averageDownTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int averageAngle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int averageScore;

    public GolfStatistic(int i, float f, float f2, float f3, int i2, int i3) {
        this.totalSwing = i;
        this.averageBeat = f;
        this.averageUpTime = f2;
        this.averageDownTime = f3;
        this.averageAngle = i2;
        this.averageScore = i3;
    }

    public static /* synthetic */ GolfStatistic copy$default(GolfStatistic golfStatistic, int i, float f, float f2, float f3, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = golfStatistic.totalSwing;
        }
        if ((i4 & 2) != 0) {
            f = golfStatistic.averageBeat;
        }
        float f4 = f;
        if ((i4 & 4) != 0) {
            f2 = golfStatistic.averageUpTime;
        }
        float f5 = f2;
        if ((i4 & 8) != 0) {
            f3 = golfStatistic.averageDownTime;
        }
        float f6 = f3;
        if ((i4 & 16) != 0) {
            i2 = golfStatistic.averageAngle;
        }
        int i5 = i2;
        if ((i4 & 32) != 0) {
            i3 = golfStatistic.averageScore;
        }
        return golfStatistic.copy(i, f4, f5, f6, i5, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalSwing() {
        return this.totalSwing;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getAverageBeat() {
        return this.averageBeat;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getAverageUpTime() {
        return this.averageUpTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getAverageDownTime() {
        return this.averageDownTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAverageAngle() {
        return this.averageAngle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAverageScore() {
        return this.averageScore;
    }

    @NotNull
    public final GolfStatistic copy(int totalSwing, float averageBeat, float averageUpTime, float averageDownTime, int averageAngle, int averageScore) {
        return new GolfStatistic(totalSwing, averageBeat, averageUpTime, averageDownTime, averageAngle, averageScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GolfStatistic)) {
            return false;
        }
        GolfStatistic golfStatistic = (GolfStatistic) other;
        return this.totalSwing == golfStatistic.totalSwing && Intrinsics.areEqual((Object) Float.valueOf(this.averageBeat), (Object) Float.valueOf(golfStatistic.averageBeat)) && Intrinsics.areEqual((Object) Float.valueOf(this.averageUpTime), (Object) Float.valueOf(golfStatistic.averageUpTime)) && Intrinsics.areEqual((Object) Float.valueOf(this.averageDownTime), (Object) Float.valueOf(golfStatistic.averageDownTime)) && this.averageAngle == golfStatistic.averageAngle && this.averageScore == golfStatistic.averageScore;
    }

    public final int getAverageAngle() {
        return this.averageAngle;
    }

    public final float getAverageBeat() {
        return this.averageBeat;
    }

    public final float getAverageDownTime() {
        return this.averageDownTime;
    }

    public final int getAverageScore() {
        return this.averageScore;
    }

    public final float getAverageUpTime() {
        return this.averageUpTime;
    }

    public final int getTotalSwing() {
        return this.totalSwing;
    }

    public int hashCode() {
        return (((((((((this.totalSwing * 31) + Float.floatToIntBits(this.averageBeat)) * 31) + Float.floatToIntBits(this.averageUpTime)) * 31) + Float.floatToIntBits(this.averageDownTime)) * 31) + this.averageAngle) * 31) + this.averageScore;
    }

    @NotNull
    public String toString() {
        return "GolfStatistic(totalSwing=" + this.totalSwing + ", averageBeat=" + this.averageBeat + ", averageUpTime=" + this.averageUpTime + ", averageDownTime=" + this.averageDownTime + ", averageAngle=" + this.averageAngle + ", averageScore=" + this.averageScore + ')';
    }
}
