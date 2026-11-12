package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/LatestSportReportParam;", "", "time", "", "<init>", "(Ljava/lang/Long;)V", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/xiaomi/fit/fitness/persist/server/data/LatestSportReportParam;", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LatestSportReportParam {

    @SerializedName("time")
    @Nullable
    private final Long time;

    public LatestSportReportParam(@Nullable Long l) {
        this.time = l;
    }

    public static /* synthetic */ LatestSportReportParam copy$default(LatestSportReportParam latestSportReportParam, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = latestSportReportParam.time;
        }
        return latestSportReportParam.copy(l);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @NotNull
    public final LatestSportReportParam copy(@Nullable Long time) {
        return new LatestSportReportParam(time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LatestSportReportParam) && Intrinsics.areEqual(this.time, ((LatestSportReportParam) other).time);
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        Long l = this.time;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    @NotNull
    public String toString() {
        return "LatestSportReportParam(time=" + this.time + ")";
    }
}
