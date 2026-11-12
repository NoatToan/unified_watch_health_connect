package com.xiaomi.fitness.health.sleep.ui.adapter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/ScheduleItem;", "", "color", "", "timeStr", "", "descStr", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getColor", "()I", "getTimeStr", "()Ljava/lang/String;", "getDescStr", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ScheduleItem {
    private final int color;

    @NotNull
    private final String descStr;

    @NotNull
    private final String timeStr;

    public ScheduleItem(int i, @NotNull String timeStr, @NotNull String descStr) {
        Intrinsics.checkNotNullParameter(timeStr, "timeStr");
        Intrinsics.checkNotNullParameter(descStr, "descStr");
        this.color = i;
        this.timeStr = timeStr;
        this.descStr = descStr;
    }

    public static /* synthetic */ ScheduleItem copy$default(ScheduleItem scheduleItem, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = scheduleItem.color;
        }
        if ((i2 & 2) != 0) {
            str = scheduleItem.timeStr;
        }
        if ((i2 & 4) != 0) {
            str2 = scheduleItem.descStr;
        }
        return scheduleItem.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimeStr() {
        return this.timeStr;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescStr() {
        return this.descStr;
    }

    @NotNull
    public final ScheduleItem copy(int color, @NotNull String timeStr, @NotNull String descStr) {
        Intrinsics.checkNotNullParameter(timeStr, "timeStr");
        Intrinsics.checkNotNullParameter(descStr, "descStr");
        return new ScheduleItem(color, timeStr, descStr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleItem)) {
            return false;
        }
        ScheduleItem scheduleItem = (ScheduleItem) other;
        return this.color == scheduleItem.color && Intrinsics.areEqual(this.timeStr, scheduleItem.timeStr) && Intrinsics.areEqual(this.descStr, scheduleItem.descStr);
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getDescStr() {
        return this.descStr;
    }

    @NotNull
    public final String getTimeStr() {
        return this.timeStr;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.color) * 31) + this.timeStr.hashCode()) * 31) + this.descStr.hashCode();
    }

    @NotNull
    public String toString() {
        return "ScheduleItem(color=" + this.color + ", timeStr=" + this.timeStr + ", descStr=" + this.descStr + ")";
    }
}
