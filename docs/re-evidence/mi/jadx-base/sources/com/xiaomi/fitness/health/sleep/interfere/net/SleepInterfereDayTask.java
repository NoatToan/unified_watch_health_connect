package com.xiaomi.fitness.health.sleep.interfere.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003JC\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\bHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;", "", DialWidgetType.DATE, "", "tasks", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereTaskItem;", "timeLineStatus", "", "dayIndex", "selected", "", "<init>", "(JLjava/util/List;IIZ)V", "getDate", "()J", "getTasks", "()Ljava/util/List;", "getTimeLineStatus", "()I", "setTimeLineStatus", "(I)V", "getDayIndex", "setDayIndex", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepInterfereDayTask {

    @SerializedName(DialWidgetType.DATE)
    private final long date;
    private int dayIndex;
    private boolean selected;

    @SerializedName("tasks")
    @Nullable
    private final List<SleepInterfereTaskItem> tasks;
    private int timeLineStatus;

    public SleepInterfereDayTask(long j, @Nullable List<SleepInterfereTaskItem> list, int i, int i2, boolean z) {
        this.date = j;
        this.tasks = list;
        this.timeLineStatus = i;
        this.dayIndex = i2;
        this.selected = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepInterfereDayTask copy$default(SleepInterfereDayTask sleepInterfereDayTask, long j, List list, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = sleepInterfereDayTask.date;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            list = sleepInterfereDayTask.tasks;
        }
        List list2 = list;
        if ((i3 & 4) != 0) {
            i = sleepInterfereDayTask.timeLineStatus;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = sleepInterfereDayTask.dayIndex;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z = sleepInterfereDayTask.selected;
        }
        return sleepInterfereDayTask.copy(j2, list2, i4, i5, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @Nullable
    public final List<SleepInterfereTaskItem> component2() {
        return this.tasks;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTimeLineStatus() {
        return this.timeLineStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDayIndex() {
        return this.dayIndex;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final SleepInterfereDayTask copy(long date, @Nullable List<SleepInterfereTaskItem> tasks, int timeLineStatus, int dayIndex, boolean selected) {
        return new SleepInterfereDayTask(date, tasks, timeLineStatus, dayIndex, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepInterfereDayTask)) {
            return false;
        }
        SleepInterfereDayTask sleepInterfereDayTask = (SleepInterfereDayTask) other;
        return this.date == sleepInterfereDayTask.date && Intrinsics.areEqual(this.tasks, sleepInterfereDayTask.tasks) && this.timeLineStatus == sleepInterfereDayTask.timeLineStatus && this.dayIndex == sleepInterfereDayTask.dayIndex && this.selected == sleepInterfereDayTask.selected;
    }

    public final long getDate() {
        return this.date;
    }

    public final int getDayIndex() {
        return this.dayIndex;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @Nullable
    public final List<SleepInterfereTaskItem> getTasks() {
        return this.tasks;
    }

    public final int getTimeLineStatus() {
        return this.timeLineStatus;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.date) * 31;
        List<SleepInterfereTaskItem> list = this.tasks;
        return ((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.timeLineStatus)) * 31) + Integer.hashCode(this.dayIndex)) * 31) + Boolean.hashCode(this.selected);
    }

    public final void setDayIndex(int i) {
        this.dayIndex = i;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setTimeLineStatus(int i) {
        this.timeLineStatus = i;
    }

    @NotNull
    public String toString() {
        return "SleepInterfereDayTask(date=" + this.date + ", tasks=" + this.tasks + ", timeLineStatus=" + this.timeLineStatus + ", dayIndex=" + this.dayIndex + ", selected=" + this.selected + ")";
    }

    public /* synthetic */ SleepInterfereDayTask(long j, List list, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i3 & 4) != 0 ? 1 : i, (i3 & 8) != 0 ? -1 : i2, (i3 & 16) != 0 ? false : z);
    }
}
