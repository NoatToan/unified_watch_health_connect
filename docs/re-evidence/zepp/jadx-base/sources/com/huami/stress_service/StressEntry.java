package com.huami.stress_service;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/stress_service/StressEntry;", "", "", "component1", "", "component2", "latestTime", "value", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getLatestTime", "()J", "b", LogUtil.I, "getValue", "()I", "<init>", "(JI)V", "stress-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StressEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long latestTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int value;

    public StressEntry(long j, int i) {
        this.latestTime = j;
        this.value = i;
    }

    public static /* synthetic */ StressEntry copy$default(StressEntry stressEntry, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = stressEntry.latestTime;
        }
        if ((i2 & 2) != 0) {
            i = stressEntry.value;
        }
        return stressEntry.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLatestTime() {
        return this.latestTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final StressEntry copy(long latestTime, int value) {
        return new StressEntry(latestTime, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressEntry)) {
            return false;
        }
        StressEntry stressEntry = (StressEntry) other;
        return this.latestTime == stressEntry.latestTime && this.value == stressEntry.value;
    }

    public final long getLatestTime() {
        return this.latestTime;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (b.a(this.latestTime) * 31) + this.value;
    }

    @NotNull
    public String toString() {
        return "StressEntry(latestTime=" + this.latestTime + ", value=" + this.value + ')';
    }
}
