package com.xiaomi.hm.health.temperature.model;

import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/temperature/model/AllDayTemperature;", "", "", "component1", "", "Lcom/xiaomi/hm/health/temperature/model/TemperaturePair;", "component2", "timestamp", "data", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "Ljava/util/List;", "getData", "()Ljava/util/List;", "<init>", "(JLjava/util/List;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AllDayTemperature {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<TemperaturePair> data;

    public AllDayTemperature(long j, @NotNull List<TemperaturePair> list) {
        this.timestamp = j;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllDayTemperature copy$default(AllDayTemperature allDayTemperature, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = allDayTemperature.timestamp;
        }
        if ((i & 2) != 0) {
            list = allDayTemperature.data;
        }
        return allDayTemperature.copy(j, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final List<TemperaturePair> component2() {
        return this.data;
    }

    @NotNull
    public final AllDayTemperature copy(long timestamp, @NotNull List<TemperaturePair> data) {
        return new AllDayTemperature(timestamp, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllDayTemperature)) {
            return false;
        }
        AllDayTemperature allDayTemperature = (AllDayTemperature) other;
        return this.timestamp == allDayTemperature.timestamp && Intrinsics.areEqual(this.data, allDayTemperature.data);
    }

    @NotNull
    public final List<TemperaturePair> getData() {
        return this.data;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (b.a(this.timestamp) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "AllDayTemperature(timestamp=" + this.timestamp + ", data=" + this.data + ")";
    }
}
