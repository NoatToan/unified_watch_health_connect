package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/Counter;", "Ljava/io/Serializable;", "", "component1", "component2", "component3", "totalNumber", "totalTimes", "numberOfBreak", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getTotalNumber", "()I", "b", "getTotalTimes", "c", "getNumberOfBreak", "<init>", "(III)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Counter implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int totalNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int totalTimes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int numberOfBreak;

    public Counter() {
        this(0, 0, 0, 7, null);
    }

    public Counter(int i, int i2, int i3) {
        this.totalNumber = i;
        this.totalTimes = i2;
        this.numberOfBreak = i3;
    }

    public static /* synthetic */ Counter copy$default(Counter counter, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = counter.totalNumber;
        }
        if ((i4 & 2) != 0) {
            i2 = counter.totalTimes;
        }
        if ((i4 & 4) != 0) {
            i3 = counter.numberOfBreak;
        }
        return counter.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalNumber() {
        return this.totalNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalTimes() {
        return this.totalTimes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNumberOfBreak() {
        return this.numberOfBreak;
    }

    @NotNull
    public final Counter copy(int totalNumber, int totalTimes, int numberOfBreak) {
        return new Counter(totalNumber, totalTimes, numberOfBreak);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Counter)) {
            return false;
        }
        Counter counter = (Counter) other;
        return this.totalNumber == counter.totalNumber && this.totalTimes == counter.totalTimes && this.numberOfBreak == counter.numberOfBreak;
    }

    public final int getNumberOfBreak() {
        return this.numberOfBreak;
    }

    public final int getTotalNumber() {
        return this.totalNumber;
    }

    public final int getTotalTimes() {
        return this.totalTimes;
    }

    public int hashCode() {
        return (((this.totalNumber * 31) + this.totalTimes) * 31) + this.numberOfBreak;
    }

    @NotNull
    public String toString() {
        return "Counter(totalNumber=" + this.totalNumber + ", totalTimes=" + this.totalTimes + ", numberOfBreak=" + this.numberOfBreak + ')';
    }

    public /* synthetic */ Counter(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? -1 : i3);
    }
}
