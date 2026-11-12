package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/SleepSeverNapSituation;", "", "bedtime", "", "wakeUpTime", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getBedtime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getWakeUpTime", "isEmpty", "", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/xiaomi/fit/fitness/persist/server/data/SleepSeverNapSituation;", "equals", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepSeverNapSituation {

    @SerializedName("bedtime")
    @Nullable
    private final Long bedtime;

    @SerializedName("wake_up_time")
    @Nullable
    private final Long wakeUpTime;

    public SleepSeverNapSituation(@Nullable Long l, @Nullable Long l2) {
        this.bedtime = l;
        this.wakeUpTime = l2;
    }

    public static /* synthetic */ SleepSeverNapSituation copy$default(SleepSeverNapSituation sleepSeverNapSituation, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = sleepSeverNapSituation.bedtime;
        }
        if ((i & 2) != 0) {
            l2 = sleepSeverNapSituation.wakeUpTime;
        }
        return sleepSeverNapSituation.copy(l, l2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getBedtime() {
        return this.bedtime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getWakeUpTime() {
        return this.wakeUpTime;
    }

    @NotNull
    public final SleepSeverNapSituation copy(@Nullable Long bedtime, @Nullable Long wakeUpTime) {
        return new SleepSeverNapSituation(bedtime, wakeUpTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepSeverNapSituation)) {
            return false;
        }
        SleepSeverNapSituation sleepSeverNapSituation = (SleepSeverNapSituation) other;
        return Intrinsics.areEqual(this.bedtime, sleepSeverNapSituation.bedtime) && Intrinsics.areEqual(this.wakeUpTime, sleepSeverNapSituation.wakeUpTime);
    }

    @Nullable
    public final Long getBedtime() {
        return this.bedtime;
    }

    @Nullable
    public final Long getWakeUpTime() {
        return this.wakeUpTime;
    }

    public int hashCode() {
        Long l = this.bedtime;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.wakeUpTime;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.bedtime == null && this.wakeUpTime == null;
    }

    @NotNull
    public String toString() {
        return "SleepSeverNapSituation(bedtime=" + this.bedtime + ", wakeUpTime=" + this.wakeUpTime + ")";
    }
}
