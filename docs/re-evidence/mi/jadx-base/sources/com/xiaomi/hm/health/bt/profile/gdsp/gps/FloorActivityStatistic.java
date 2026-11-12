package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/FloorActivityStatistic;", "Ljava/io/Serializable;", "upstair", "", "downstair", "upHeight", "", "downHeight", "averageFloorsPerMinutes", "(IIFFF)V", "getAverageFloorsPerMinutes", "()F", "getDownHeight", "getDownstair", "()I", "getUpHeight", "getUpstair", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class FloorActivityStatistic implements Serializable {
    private static final long serialVersionUID = 1;
    private final float averageFloorsPerMinutes;
    private final float downHeight;
    private final int downstair;
    private final float upHeight;
    private final int upstair;

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
        return this.upstair == floorActivityStatistic.upstair && this.downstair == floorActivityStatistic.downstair && Float.compare(this.upHeight, floorActivityStatistic.upHeight) == 0 && Float.compare(this.downHeight, floorActivityStatistic.downHeight) == 0 && Float.compare(this.averageFloorsPerMinutes, floorActivityStatistic.averageFloorsPerMinutes) == 0;
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
        return (((((((Integer.hashCode(this.upstair) * 31) + Integer.hashCode(this.downstair)) * 31) + Float.hashCode(this.upHeight)) * 31) + Float.hashCode(this.downHeight)) * 31) + Float.hashCode(this.averageFloorsPerMinutes);
    }

    @NotNull
    public String toString() {
        return "FloorActivityStatistic(upstair=" + this.upstair + ", downstair=" + this.downstair + ", upHeight=" + this.upHeight + ", downHeight=" + this.downHeight + ", averageFloorsPerMinutes=" + this.averageFloorsPerMinutes + ')';
    }
}
