package com.huami.health.service;

import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/health/service/HealthEntry;", "", "", "component1", "", "component2", "latestTime", "value", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getLatestTime", "()J", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(JLjava/lang/String;)V", "health-service_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class HealthEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long latestTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String value;

    public HealthEntry(long j, @NotNull String str) {
        this.latestTime = j;
        this.value = str;
    }

    public static /* synthetic */ HealthEntry copy$default(HealthEntry healthEntry, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = healthEntry.latestTime;
        }
        if ((i & 2) != 0) {
            str = healthEntry.value;
        }
        return healthEntry.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLatestTime() {
        return this.latestTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final HealthEntry copy(long latestTime, @NotNull String value) {
        return new HealthEntry(latestTime, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthEntry)) {
            return false;
        }
        HealthEntry healthEntry = (HealthEntry) other;
        return this.latestTime == healthEntry.latestTime && Intrinsics.areEqual(this.value, healthEntry.value);
    }

    public final long getLatestTime() {
        return this.latestTime;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iA = b.a(this.latestTime) * 31;
        String str = this.value;
        return iA + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HealthEntry(latestTime=" + this.latestTime + ", value=" + this.value + ")";
    }
}
