package com.xiaomi.fit.fitness.export.data.project;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/project/SleepNapSituation;", "Ljava/io/Serializable;", "bedtime", "", "wakeUpTime", "<init>", "(JJ)V", "getBedtime", "()J", "getWakeUpTime", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepNapSituation implements Serializable {
    private final long bedtime;
    private final long wakeUpTime;

    public SleepNapSituation(long j, long j2) {
        this.bedtime = j;
        this.wakeUpTime = j2;
    }

    public static /* synthetic */ SleepNapSituation copy$default(SleepNapSituation sleepNapSituation, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sleepNapSituation.bedtime;
        }
        if ((i & 2) != 0) {
            j2 = sleepNapSituation.wakeUpTime;
        }
        return sleepNapSituation.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBedtime() {
        return this.bedtime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getWakeUpTime() {
        return this.wakeUpTime;
    }

    @NotNull
    public final SleepNapSituation copy(long bedtime, long wakeUpTime) {
        return new SleepNapSituation(bedtime, wakeUpTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepNapSituation)) {
            return false;
        }
        SleepNapSituation sleepNapSituation = (SleepNapSituation) other;
        return this.bedtime == sleepNapSituation.bedtime && this.wakeUpTime == sleepNapSituation.wakeUpTime;
    }

    public final long getBedtime() {
        return this.bedtime;
    }

    public final long getWakeUpTime() {
        return this.wakeUpTime;
    }

    public int hashCode() {
        return (Long.hashCode(this.bedtime) * 31) + Long.hashCode(this.wakeUpTime);
    }

    @NotNull
    public String toString() {
        return "SleepNapSituation(bedtime=" + this.bedtime + ", wakeUpTime=" + this.wakeUpTime + ")";
    }
}
