package com.huami.sky.lib.repo.weekplan;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/huami/sky/lib/repo/weekplan/WeekPlanHintDO;", "", "Lcom/huami/sky/lib/repo/weekplan/WeekPlanHintPO;", "component1", "", "component2", "weekPlanHintPO", "isToday", "copy", "", "toString", "", "hashCode", "other", "equals", "Lcom/huami/sky/lib/repo/weekplan/WeekPlanHintPO;", "getWeekPlanHintPO", "()Lcom/huami/sky/lib/repo/weekplan/WeekPlanHintPO;", "Z", "()Z", "<init>", "(Lcom/huami/sky/lib/repo/weekplan/WeekPlanHintPO;Z)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeekPlanHintDO {
    private final boolean isToday;

    @NotNull
    private final WeekPlanHintPO weekPlanHintPO;

    public WeekPlanHintDO(@NotNull WeekPlanHintPO weekPlanHintPO, boolean z) {
        this.weekPlanHintPO = weekPlanHintPO;
        this.isToday = z;
    }

    public static /* synthetic */ WeekPlanHintDO copy$default(WeekPlanHintDO weekPlanHintDO, WeekPlanHintPO weekPlanHintPO, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            weekPlanHintPO = weekPlanHintDO.weekPlanHintPO;
        }
        if ((i & 2) != 0) {
            z = weekPlanHintDO.isToday;
        }
        return weekPlanHintDO.copy(weekPlanHintPO, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WeekPlanHintPO getWeekPlanHintPO() {
        return this.weekPlanHintPO;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsToday() {
        return this.isToday;
    }

    @NotNull
    public final WeekPlanHintDO copy(@NotNull WeekPlanHintPO weekPlanHintPO, boolean isToday) {
        return new WeekPlanHintDO(weekPlanHintPO, isToday);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeekPlanHintDO)) {
            return false;
        }
        WeekPlanHintDO weekPlanHintDO = (WeekPlanHintDO) other;
        return Intrinsics.areEqual(this.weekPlanHintPO, weekPlanHintDO.weekPlanHintPO) && this.isToday == weekPlanHintDO.isToday;
    }

    @NotNull
    public final WeekPlanHintPO getWeekPlanHintPO() {
        return this.weekPlanHintPO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.weekPlanHintPO.hashCode() * 31;
        boolean z = this.isToday;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isToday() {
        return this.isToday;
    }

    @NotNull
    public String toString() {
        return "WeekPlanHintDO(weekPlanHintPO=" + this.weekPlanHintPO + ", isToday=" + this.isToday + ")";
    }
}
