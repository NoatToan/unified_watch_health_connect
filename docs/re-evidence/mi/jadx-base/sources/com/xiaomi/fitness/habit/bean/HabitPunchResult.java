package com.xiaomi.fitness.habit.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/habit/bean/HabitPunchResult;", "", "result", "", "share", "", "Lcom/xiaomi/fitness/habit/bean/Share;", "<init>", "(ZLjava/util/List;)V", "getResult", "()Z", "getShare", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HabitPunchResult {
    private final boolean result;

    @NotNull
    private final List<Share> share;

    public HabitPunchResult(boolean z, @NotNull List<Share> share) {
        Intrinsics.checkNotNullParameter(share, "share");
        this.result = z;
        this.share = share;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HabitPunchResult copy$default(HabitPunchResult habitPunchResult, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = habitPunchResult.result;
        }
        if ((i & 2) != 0) {
            list = habitPunchResult.share;
        }
        return habitPunchResult.copy(z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getResult() {
        return this.result;
    }

    @NotNull
    public final List<Share> component2() {
        return this.share;
    }

    @NotNull
    public final HabitPunchResult copy(boolean result, @NotNull List<Share> share) {
        Intrinsics.checkNotNullParameter(share, "share");
        return new HabitPunchResult(result, share);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HabitPunchResult)) {
            return false;
        }
        HabitPunchResult habitPunchResult = (HabitPunchResult) other;
        return this.result == habitPunchResult.result && Intrinsics.areEqual(this.share, habitPunchResult.share);
    }

    public final boolean getResult() {
        return this.result;
    }

    @NotNull
    public final List<Share> getShare() {
        return this.share;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.result) * 31) + this.share.hashCode();
    }

    @NotNull
    public String toString() {
        return "HabitPunchResult(result=" + this.result + ", share=" + this.share + ")";
    }
}
