package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GolfRtInfo;", "", "", "component1", "", "component2", "", "component3", "component4", "component5", "time", "angle", "beat", "upTime", "downTime", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "b", LogUtil.I, "getAngle", "()I", "c", "F", "getBeat", "()F", GoogleApiAvailabilityLight.a, "getUpTime", "e", "getDownTime", "<init>", "(JIFFF)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GolfRtInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int angle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float beat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float upTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final float downTime;

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
        return this.time == golfRtInfo.time && this.angle == golfRtInfo.angle && Intrinsics.areEqual((Object) Float.valueOf(this.beat), (Object) Float.valueOf(golfRtInfo.beat)) && Intrinsics.areEqual((Object) Float.valueOf(this.upTime), (Object) Float.valueOf(golfRtInfo.upTime)) && Intrinsics.areEqual((Object) Float.valueOf(this.downTime), (Object) Float.valueOf(golfRtInfo.downTime));
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
        return (((((((defpackage.b.a(this.time) * 31) + this.angle) * 31) + Float.floatToIntBits(this.beat)) * 31) + Float.floatToIntBits(this.upTime)) * 31) + Float.floatToIntBits(this.downTime);
    }

    @NotNull
    public String toString() {
        return "GolfRtInfo(time=" + this.time + ", angle=" + this.angle + ", beat=" + this.beat + ", upTime=" + this.upTime + ", downTime=" + this.downTime + ')';
    }
}
