package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/FrequencyStatistic;", "Ljava/io/Serializable;", "", "component1", "component2", "avg", "max", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getAvg", "()I", "b", "getMax", "<init>", "(II)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FrequencyStatistic implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int avg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int max;

    public FrequencyStatistic(int i, int i2) {
        this.avg = i;
        this.max = i2;
    }

    public static /* synthetic */ FrequencyStatistic copy$default(FrequencyStatistic frequencyStatistic, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = frequencyStatistic.avg;
        }
        if ((i3 & 2) != 0) {
            i2 = frequencyStatistic.max;
        }
        return frequencyStatistic.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAvg() {
        return this.avg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    @NotNull
    public final FrequencyStatistic copy(int avg, int max) {
        return new FrequencyStatistic(avg, max);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrequencyStatistic)) {
            return false;
        }
        FrequencyStatistic frequencyStatistic = (FrequencyStatistic) other;
        return this.avg == frequencyStatistic.avg && this.max == frequencyStatistic.max;
    }

    public final int getAvg() {
        return this.avg;
    }

    public final int getMax() {
        return this.max;
    }

    public int hashCode() {
        return (this.avg * 31) + this.max;
    }

    @NotNull
    public String toString() {
        return "FrequencyStatistic(avg=" + this.avg + ", max=" + this.max + ')';
    }
}
