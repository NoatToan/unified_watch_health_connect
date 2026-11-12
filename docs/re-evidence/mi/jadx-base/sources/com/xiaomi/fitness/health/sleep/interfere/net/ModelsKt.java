package com.xiaomi.fitness.health.sleep.interfere.net;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\u0002\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\r\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\r\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\r\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\r¨\u0006\u0011"}, d2 = {"isFuture", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;", "isToday", "isPast", "updateFuture", "", "updateToday", "updatePast", "updateTimeline", "timeLine", "", "isCompleteFail", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereTaskItem;", "isSleepCompleteFail", "isCompleted", "isFinished", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ModelsKt {
    public static final boolean isCompleteFail(@NotNull SleepInterfereTaskItem sleepInterfereTaskItem) {
        Intrinsics.checkNotNullParameter(sleepInterfereTaskItem, "<this>");
        return sleepInterfereTaskItem.getStatus() == -1;
    }

    public static final boolean isCompleted(@NotNull SleepInterfereTaskItem sleepInterfereTaskItem) {
        Intrinsics.checkNotNullParameter(sleepInterfereTaskItem, "<this>");
        return sleepInterfereTaskItem.getStatus() == 1 || sleepInterfereTaskItem.getStatus() == 2;
    }

    public static final boolean isFinished(@NotNull SleepInterfereTaskItem sleepInterfereTaskItem) {
        Intrinsics.checkNotNullParameter(sleepInterfereTaskItem, "<this>");
        return ArraysKt___ArraysKt.contains(new Integer[]{1, 2, -1}, Integer.valueOf(sleepInterfereTaskItem.getStatus()));
    }

    public static final boolean isFuture(@NotNull SleepInterfereDayTask sleepInterfereDayTask) {
        Intrinsics.checkNotNullParameter(sleepInterfereDayTask, "<this>");
        return sleepInterfereDayTask.getTimeLineStatus() == 1;
    }

    public static final boolean isPast(@NotNull SleepInterfereDayTask sleepInterfereDayTask) {
        Intrinsics.checkNotNullParameter(sleepInterfereDayTask, "<this>");
        return sleepInterfereDayTask.getTimeLineStatus() == -1;
    }

    public static final boolean isSleepCompleteFail(@NotNull SleepInterfereTaskItem sleepInterfereTaskItem) {
        Intrinsics.checkNotNullParameter(sleepInterfereTaskItem, "<this>");
        return ArraysKt___ArraysKt.contains(new String[]{"TIMELY_SLEEP", "TIMELY_WAKE_UP"}, sleepInterfereTaskItem.getType()) && ArraysKt___ArraysKt.contains(new Integer[]{-1, 0}, Integer.valueOf(sleepInterfereTaskItem.getStatus()));
    }

    public static final boolean isToday(@NotNull SleepInterfereDayTask sleepInterfereDayTask) {
        Intrinsics.checkNotNullParameter(sleepInterfereDayTask, "<this>");
        return sleepInterfereDayTask.getTimeLineStatus() == 0;
    }

    public static final void updateFuture(@NotNull SleepInterfereDayTask sleepInterfereDayTask) {
        Intrinsics.checkNotNullParameter(sleepInterfereDayTask, "<this>");
        sleepInterfereDayTask.setTimeLineStatus(1);
    }

    public static final void updatePast(@NotNull SleepInterfereDayTask sleepInterfereDayTask) {
        Intrinsics.checkNotNullParameter(sleepInterfereDayTask, "<this>");
        sleepInterfereDayTask.setTimeLineStatus(-1);
    }

    public static final void updateTimeline(@NotNull SleepInterfereDayTask sleepInterfereDayTask, int i) {
        Intrinsics.checkNotNullParameter(sleepInterfereDayTask, "<this>");
        sleepInterfereDayTask.setTimeLineStatus(i);
    }

    public static final void updateToday(@NotNull SleepInterfereDayTask sleepInterfereDayTask) {
        Intrinsics.checkNotNullParameter(sleepInterfereDayTask, "<this>");
        sleepInterfereDayTask.setTimeLineStatus(0);
    }
}
