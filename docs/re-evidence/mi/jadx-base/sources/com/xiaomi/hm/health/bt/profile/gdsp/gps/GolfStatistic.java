package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GolfStatistic;", "", "totalSwing", "", "averageBeat", "", "averageUpTime", "averageDownTime", "averageAngle", "averageScore", "(IFFFII)V", "getAverageAngle", "()I", "getAverageBeat", "()F", "getAverageDownTime", "getAverageScore", "getAverageUpTime", "getTotalSwing", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class GolfStatistic {
    private final int averageAngle;
    private final float averageBeat;
    private final float averageDownTime;
    private final int averageScore;
    private final float averageUpTime;
    private final int totalSwing;

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
        return this.totalSwing == golfStatistic.totalSwing && Float.compare(this.averageBeat, golfStatistic.averageBeat) == 0 && Float.compare(this.averageUpTime, golfStatistic.averageUpTime) == 0 && Float.compare(this.averageDownTime, golfStatistic.averageDownTime) == 0 && this.averageAngle == golfStatistic.averageAngle && this.averageScore == golfStatistic.averageScore;
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
        return (((((((((Integer.hashCode(this.totalSwing) * 31) + Float.hashCode(this.averageBeat)) * 31) + Float.hashCode(this.averageUpTime)) * 31) + Float.hashCode(this.averageDownTime)) * 31) + Integer.hashCode(this.averageAngle)) * 31) + Integer.hashCode(this.averageScore);
    }

    @NotNull
    public String toString() {
        return "GolfStatistic(totalSwing=" + this.totalSwing + ", averageBeat=" + this.averageBeat + ", averageUpTime=" + this.averageUpTime + ", averageDownTime=" + this.averageDownTime + ", averageAngle=" + this.averageAngle + ", averageScore=" + this.averageScore + ')';
    }
}
