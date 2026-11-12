package com.xiaomi.hm.health.running;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003J=\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R%\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/running/HistoryRecordHeader;", "", "", "component1", "component2", "component3", "", "component4", "cal", "startTime", "endTime", "data", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getCal", "()J", "b", "getStartTime", "c", "getEndTime", GoogleApiAvailabilityLight.a, "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "<init>", "(JJJLjava/util/Map;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HistoryRecordHeader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long cal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long startTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long endTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final Map<Long, Long> data;

    public HistoryRecordHeader(long j, long j2, long j3, @NotNull Map<Long, Long> map) {
        this.cal = j;
        this.startTime = j2;
        this.endTime = j3;
        this.data = map;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCal() {
        return this.cal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final Map<Long, Long> component4() {
        return this.data;
    }

    @NotNull
    public final HistoryRecordHeader copy(long cal, long startTime, long endTime, @NotNull Map<Long, Long> data) {
        return new HistoryRecordHeader(cal, startTime, endTime, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryRecordHeader)) {
            return false;
        }
        HistoryRecordHeader historyRecordHeader = (HistoryRecordHeader) other;
        return this.cal == historyRecordHeader.cal && this.startTime == historyRecordHeader.startTime && this.endTime == historyRecordHeader.endTime && Intrinsics.areEqual(this.data, historyRecordHeader.data);
    }

    public final long getCal() {
        return this.cal;
    }

    @NotNull
    public final Map<Long, Long> getData() {
        return this.data;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((((defpackage.b.a(this.cal) * 31) + defpackage.b.a(this.startTime)) * 31) + defpackage.b.a(this.endTime)) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "HistoryRecordHeader(cal=" + this.cal + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", data=" + this.data + ")";
    }
}
