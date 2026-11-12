package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/DownhillStatistic;", "Ljava/io/Serializable;", "", "component1", "component2", "component3", "component4", "times", "totalDistance", "maxDrop", "totalDrop", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getTimes", "()I", "b", "getTotalDistance", "c", "getMaxDrop", GoogleApiAvailabilityLight.a, "getTotalDrop", "<init>", "(IIII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DownhillStatistic implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int times;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int totalDistance;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int maxDrop;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
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
        return (((((this.times * 31) + this.totalDistance) * 31) + this.maxDrop) * 31) + this.totalDrop;
    }

    @NotNull
    public String toString() {
        return "DownhillStatistic(times=" + this.times + ", totalDistance=" + this.totalDistance + ", maxDrop=" + this.maxDrop + ", totalDrop=" + this.totalDrop + ')';
    }
}
