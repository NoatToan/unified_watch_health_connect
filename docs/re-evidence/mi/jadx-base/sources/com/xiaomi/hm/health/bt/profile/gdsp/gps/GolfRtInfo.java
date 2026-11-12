package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GolfRtInfo;", "", "time", "", "angle", "", "beat", "", "upTime", "downTime", "(JIFFF)V", "getAngle", "()I", "getBeat", "()F", "getDownTime", "getTime", "()J", "getUpTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class GolfRtInfo {
    private final int angle;
    private final float beat;
    private final float downTime;
    private final long time;
    private final float upTime;

    public GolfRtInfo(long j, int i, float f, float f2, float f3) {
        this.time = j;
        this.angle = i;
        this.beat = f;
        this.upTime = f2;
        this.downTime = f3;
    }

    public static /* synthetic */ GolfRtInfo copy$default(GolfRtInfo golfRtInfo, long j, int i, float f, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = golfRtInfo.time;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = golfRtInfo.angle;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            f = golfRtInfo.beat;
        }
        float f4 = f;
        if ((i2 & 8) != 0) {
            f2 = golfRtInfo.upTime;
        }
        float f5 = f2;
        if ((i2 & 16) != 0) {
            f3 = golfRtInfo.downTime;
        }
        return golfRtInfo.copy(j2, i3, f4, f5, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAngle() {
        return this.angle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getBeat() {
        return this.beat;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getUpTime() {
        return this.upTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getDownTime() {
        return this.downTime;
    }

    @NotNull
    public final GolfRtInfo copy(long time, int angle, float beat, float upTime, float downTime) {
        return new GolfRtInfo(time, angle, beat, upTime, downTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GolfRtInfo)) {
            return false;
        }
        GolfRtInfo golfRtInfo = (GolfRtInfo) other;
        return this.time == golfRtInfo.time && this.angle == golfRtInfo.angle && Float.compare(this.beat, golfRtInfo.beat) == 0 && Float.compare(this.upTime, golfRtInfo.upTime) == 0 && Float.compare(this.downTime, golfRtInfo.downTime) == 0;
    }

    public final int getAngle() {
        return this.angle;
    }

    public final float getBeat() {
        return this.beat;
    }

    public final float getDownTime() {
        return this.downTime;
    }

    public final long getTime() {
        return this.time;
    }

    public final float getUpTime() {
        return this.upTime;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.angle)) * 31) + Float.hashCode(this.beat)) * 31) + Float.hashCode(this.upTime)) * 31) + Float.hashCode(this.downTime);
    }

    @NotNull
    public String toString() {
        return "GolfRtInfo(time=" + this.time + ", angle=" + this.angle + ", beat=" + this.beat + ", upTime=" + this.upTime + ", downTime=" + this.downTime + ')';
    }
}
