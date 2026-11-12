package com.xiaomi.fitness.health.sleep.interfere.net;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlanTaskResult;", "", "dayTasks", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;", "next", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getDayTasks", "()Ljava/util/List;", "getNext", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepInterferePlanTaskResult {

    @SerializedName("items")
    @NotNull
    private final List<SleepInterfereDayTask> dayTasks;

    @SerializedName("next")
    @NotNull
    private final String next;

    public SleepInterferePlanTaskResult(@NotNull List<SleepInterfereDayTask> dayTasks, @NotNull String next) {
        Intrinsics.checkNotNullParameter(dayTasks, "dayTasks");
        Intrinsics.checkNotNullParameter(next, "next");
        this.dayTasks = dayTasks;
        this.next = next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepInterferePlanTaskResult copy$default(SleepInterferePlanTaskResult sleepInterferePlanTaskResult, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sleepInterferePlanTaskResult.dayTasks;
        }
        if ((i & 2) != 0) {
            str = sleepInterferePlanTaskResult.next;
        }
        return sleepInterferePlanTaskResult.copy(list, str);
    }

    @NotNull
    public final List<SleepInterfereDayTask> component1() {
        return this.dayTasks;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    @NotNull
    public final SleepInterferePlanTaskResult copy(@NotNull List<SleepInterfereDayTask> dayTasks, @NotNull String next) {
        Intrinsics.checkNotNullParameter(dayTasks, "dayTasks");
        Intrinsics.checkNotNullParameter(next, "next");
        return new SleepInterferePlanTaskResult(dayTasks, next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepInterferePlanTaskResult)) {
            return false;
        }
        SleepInterferePlanTaskResult sleepInterferePlanTaskResult = (SleepInterferePlanTaskResult) other;
        return Intrinsics.areEqual(this.dayTasks, sleepInterferePlanTaskResult.dayTasks) && Intrinsics.areEqual(this.next, sleepInterferePlanTaskResult.next);
    }

    @NotNull
    public final List<SleepInterfereDayTask> getDayTasks() {
        return this.dayTasks;
    }

    @NotNull
    public final String getNext() {
        return this.next;
    }

    public int hashCode() {
        return (this.dayTasks.hashCode() * 31) + this.next.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepInterferePlanTaskResult(dayTasks=" + this.dayTasks + ", next=" + this.next + ")";
    }
}
