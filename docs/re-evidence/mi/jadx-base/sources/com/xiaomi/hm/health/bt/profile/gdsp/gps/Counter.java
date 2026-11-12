package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/Counter;", "Ljava/io/Serializable;", "totalNumber", "", "totalTimes", "numberOfBreak", "(III)V", "getNumberOfBreak", "()I", "getTotalNumber", "getTotalTimes", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Counter implements Serializable {
    private static final long serialVersionUID = 1;
    private final int numberOfBreak;
    private final int totalNumber;
    private final int totalTimes;

    public Counter() {
        this(0, 0, 0, 7, null);
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
        return (((Integer.hashCode(this.totalNumber) * 31) + Integer.hashCode(this.totalTimes)) * 31) + Integer.hashCode(this.numberOfBreak);
    }

    @NotNull
    public String toString() {
        return "Counter(totalNumber=" + this.totalNumber + ", totalTimes=" + this.totalTimes + ", numberOfBreak=" + this.numberOfBreak + ')';
    }

    public Counter(int i, int i2, int i3) {
        this.totalNumber = i;
        this.totalTimes = i2;
        this.numberOfBreak = i3;
    }

    public /* synthetic */ Counter(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? -1 : i3);
    }
}
