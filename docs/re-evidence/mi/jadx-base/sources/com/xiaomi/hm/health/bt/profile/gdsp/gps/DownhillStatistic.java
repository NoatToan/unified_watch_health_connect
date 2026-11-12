package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/DownhillStatistic;", "Ljava/io/Serializable;", "times", "", "totalDistance", "maxDrop", "totalDrop", "(IIII)V", "getMaxDrop", "()I", "getTimes", "getTotalDistance", "getTotalDrop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class DownhillStatistic implements Serializable {
    private static final long serialVersionUID = 1;
    private final int maxDrop;
    private final int times;
    private final int totalDistance;
    private final int totalDrop;

    public DownhillStatistic(int i, int i2, int i3, int i4) {
        this.times = i;
        this.totalDistance = i2;
        this.maxDrop = i3;
        this.totalDrop = i4;
    }

    public static /* synthetic */ DownhillStatistic copy$default(DownhillStatistic downhillStatistic, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = downhillStatistic.times;
        }
        if ((i5 & 2) != 0) {
            i2 = downhillStatistic.totalDistance;
        }
        if ((i5 & 4) != 0) {
            i3 = downhillStatistic.maxDrop;
        }
        if ((i5 & 8) != 0) {
            i4 = downhillStatistic.totalDrop;
        }
        return downhillStatistic.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTimes() {
        return this.times;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalDistance() {
        return this.totalDistance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxDrop() {
        return this.maxDrop;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalDrop() {
        return this.totalDrop;
    }

    @NotNull
    public final DownhillStatistic copy(int times, int totalDistance, int maxDrop, int totalDrop) {
        return new DownhillStatistic(times, totalDistance, maxDrop, totalDrop);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownhillStatistic)) {
            return false;
        }
        DownhillStatistic downhillStatistic = (DownhillStatistic) other;
        return this.times == downhillStatistic.times && this.totalDistance == downhillStatistic.totalDistance && this.maxDrop == downhillStatistic.maxDrop && this.totalDrop == downhillStatistic.totalDrop;
    }

    public final int getMaxDrop() {
        return this.maxDrop;
    }

    public final int getTimes() {
        return this.times;
    }

    public final int getTotalDistance() {
        return this.totalDistance;
    }

    public final int getTotalDrop() {
        return this.totalDrop;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.times) * 31) + Integer.hashCode(this.totalDistance)) * 31) + Integer.hashCode(this.maxDrop)) * 31) + Integer.hashCode(this.totalDrop);
    }

    @NotNull
    public String toString() {
        return "DownhillStatistic(times=" + this.times + ", totalDistance=" + this.totalDistance + ", maxDrop=" + this.maxDrop + ", totalDrop=" + this.totalDrop + ')';
    }
}
