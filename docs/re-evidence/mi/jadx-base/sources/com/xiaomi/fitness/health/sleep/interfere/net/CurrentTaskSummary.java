package com.xiaomi.fitness.health.sleep.interfere.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/CurrentTaskSummary;", "", "day", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "<init>", "(II)V", "getDay", "()I", "getProgress", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CurrentTaskSummary {

    @SerializedName("day")
    private final int day;

    @SerializedName(BroadcastsKt.SILENT_PUSHING_PROGRESS)
    private final int progress;

    public CurrentTaskSummary(int i, int i2) {
        this.day = i;
        this.progress = i2;
    }

    public static /* synthetic */ CurrentTaskSummary copy$default(CurrentTaskSummary currentTaskSummary, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = currentTaskSummary.day;
        }
        if ((i3 & 2) != 0) {
            i2 = currentTaskSummary.progress;
        }
        return currentTaskSummary.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final CurrentTaskSummary copy(int day, int progress) {
        return new CurrentTaskSummary(day, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentTaskSummary)) {
            return false;
        }
        CurrentTaskSummary currentTaskSummary = (CurrentTaskSummary) other;
        return this.day == currentTaskSummary.day && this.progress == currentTaskSummary.progress;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return (Integer.hashCode(this.day) * 31) + Integer.hashCode(this.progress);
    }

    @NotNull
    public String toString() {
        return "CurrentTaskSummary(day=" + this.day + ", progress=" + this.progress + ")";
    }
}
