package com.xiaomi.fitness.health.sleep.interfere.net;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J@\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/PlanSleepTimeInfo;", "", "avg", "", "isRegular", "", "diffMinutes", "", "daily", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/PlanSleepTimeDailyInfo;", "<init>", "(Ljava/lang/String;ZLjava/lang/Integer;Ljava/util/List;)V", "getAvg", "()Ljava/lang/String;", "()Z", "getDiffMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDaily", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/Integer;Ljava/util/List;)Lcom/xiaomi/fitness/health/sleep/interfere/net/PlanSleepTimeInfo;", "equals", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlanSleepTimeInfo {

    @SerializedName("avg")
    @NotNull
    private final String avg;

    @SerializedName("daily")
    @Nullable
    private final List<PlanSleepTimeDailyInfo> daily;

    @SerializedName("diffMinutes")
    @Nullable
    private final Integer diffMinutes;

    @SerializedName("isRegular")
    private final boolean isRegular;

    public PlanSleepTimeInfo(@NotNull String avg, boolean z, @Nullable Integer num, @Nullable List<PlanSleepTimeDailyInfo> list) {
        Intrinsics.checkNotNullParameter(avg, "avg");
        this.avg = avg;
        this.isRegular = z;
        this.diffMinutes = num;
        this.daily = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlanSleepTimeInfo copy$default(PlanSleepTimeInfo planSleepTimeInfo, String str, boolean z, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = planSleepTimeInfo.avg;
        }
        if ((i & 2) != 0) {
            z = planSleepTimeInfo.isRegular;
        }
        if ((i & 4) != 0) {
            num = planSleepTimeInfo.diffMinutes;
        }
        if ((i & 8) != 0) {
            list = planSleepTimeInfo.daily;
        }
        return planSleepTimeInfo.copy(str, z, num, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvg() {
        return this.avg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsRegular() {
        return this.isRegular;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getDiffMinutes() {
        return this.diffMinutes;
    }

    @Nullable
    public final List<PlanSleepTimeDailyInfo> component4() {
        return this.daily;
    }

    @NotNull
    public final PlanSleepTimeInfo copy(@NotNull String avg, boolean isRegular, @Nullable Integer diffMinutes, @Nullable List<PlanSleepTimeDailyInfo> daily) {
        Intrinsics.checkNotNullParameter(avg, "avg");
        return new PlanSleepTimeInfo(avg, isRegular, diffMinutes, daily);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanSleepTimeInfo)) {
            return false;
        }
        PlanSleepTimeInfo planSleepTimeInfo = (PlanSleepTimeInfo) other;
        return Intrinsics.areEqual(this.avg, planSleepTimeInfo.avg) && this.isRegular == planSleepTimeInfo.isRegular && Intrinsics.areEqual(this.diffMinutes, planSleepTimeInfo.diffMinutes) && Intrinsics.areEqual(this.daily, planSleepTimeInfo.daily);
    }

    @NotNull
    public final String getAvg() {
        return this.avg;
    }

    @Nullable
    public final List<PlanSleepTimeDailyInfo> getDaily() {
        return this.daily;
    }

    @Nullable
    public final Integer getDiffMinutes() {
        return this.diffMinutes;
    }

    public int hashCode() {
        int iHashCode = ((this.avg.hashCode() * 31) + Boolean.hashCode(this.isRegular)) * 31;
        Integer num = this.diffMinutes;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<PlanSleepTimeDailyInfo> list = this.daily;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isRegular() {
        return this.isRegular;
    }

    @NotNull
    public String toString() {
        return "PlanSleepTimeInfo(avg=" + this.avg + ", isRegular=" + this.isRegular + ", diffMinutes=" + this.diffMinutes + ", daily=" + this.daily + ")";
    }
}
