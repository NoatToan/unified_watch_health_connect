package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/FloorActivityStatistic;", "Ljava/io/Serializable;", "", "component1", "component2", "", "component3", "component4", "component5", "upstair", "downstair", "upHeight", "downHeight", "averageFloorsPerMinutes", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getUpstair", "()I", "b", "getDownstair", "c", "F", "getUpHeight", "()F", GoogleApiAvailabilityLight.a, "getDownHeight", "e", "getAverageFloorsPerMinutes", "<init>", "(IIFFF)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FloorActivityStatistic implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int upstair;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int downstair;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float upHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float downHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final float averageFloorsPerMinutes;

    public FloorActivityStatistic(int i, int i2, float f, float f2, float f3) {
        this.upstair = i;
        this.downstair = i2;
        this.upHeight = f;
        this.downHeight = f2;
        this.averageFloorsPerMinutes = f3;
    }

    public static /* synthetic */ FloorActivityStatistic copy$default(FloorActivityStatistic floorActivityStatistic, int i, int i2, float f, float f2, float f3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = floorActivityStatistic.upstair;
        }
        if ((i3 & 2) != 0) {
            i2 = floorActivityStatistic.downstair;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            f = floorActivityStatistic.upHeight;
        }
        float f4 = f;
        if ((i3 & 8) != 0) {
            f2 = floorActivityStatistic.downHeight;
        }
        float f5 = f2;
        if ((i3 & 16) != 0) {
            f3 = floorActivityStatistic.averageFloorsPerMinutes;
        }
        return floorActivityStatistic.copy(i, i4, f4, f5, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUpstair() {
        return this.upstair;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDownstair() {
        return this.downstair;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getUpHeight() {
        return this.upHeight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getDownHeight() {
        return this.downHeight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getAverageFloorsPerMinutes() {
        return this.averageFloorsPerMinutes;
    }

    @NotNull
    public final FloorActivityStatistic copy(int upstair, int downstair, float upHeight, float downHeight, float averageFloorsPerMinutes) {
        return new FloorActivityStatistic(upstair, downstair, upHeight, downHeight, averageFloorsPerMinutes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorActivityStatistic)) {
            return false;
        }
        FloorActivityStatistic floorActivityStatistic = (FloorActivityStatistic) other;
        return this.upstair == floorActivityStatistic.upstair && this.downstair == floorActivityStatistic.downstair && Intrinsics.areEqual((Object) Float.valueOf(this.upHeight), (Object) Float.valueOf(floorActivityStatistic.upHeight)) && Intrinsics.areEqual((Object) Float.valueOf(this.downHeight), (Object) Float.valueOf(floorActivityStatistic.downHeight)) && Intrinsics.areEqual((Object) Float.valueOf(this.averageFloorsPerMinutes), (Object) Float.valueOf(floorActivityStatistic.averageFloorsPerMinutes));
    }

    public final float getAverageFloorsPerMinutes() {
        return this.averageFloorsPerMinutes;
    }

    public final float getDownHeight() {
        return this.downHeight;
    }

    public final int getDownstair() {
        return this.downstair;
    }

    public final float getUpHeight() {
        return this.upHeight;
    }

    public final int getUpstair() {
        return this.upstair;
    }

    public int hashCode() {
        return (((((((this.upstair * 31) + this.downstair) * 31) + Float.floatToIntBits(this.upHeight)) * 31) + Float.floatToIntBits(this.downHeight)) * 31) + Float.floatToIntBits(this.averageFloorsPerMinutes);
    }

    @NotNull
    public String toString() {
        return "FloorActivityStatistic(upstair=" + this.upstair + ", downstair=" + this.downstair + ", upHeight=" + this.upHeight + ", downHeight=" + this.downHeight + ", averageFloorsPerMinutes=" + this.averageFloorsPerMinutes + ')';
    }
}
