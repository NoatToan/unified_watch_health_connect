package com.xiaomi.fitness.sleep.behavior.collection;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000eH\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH$J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH$J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH$J\u001a\u0010\u001e\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H$R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/CollectionTask;", "", "<init>", "()V", "isActive", "", "()Z", "isInProgress", "context", "Landroid/content/Context;", "isRunning", "isCanceled", "isPaused", "getTaskState", "", "onStartTask", "", "onPauseTask", "onFinishTask", "result", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "onCancelTask", "onInterruptTask", "updateTaskState", "taskState", "getName", "", "performStartTask", "performPauseTask", "performCancelTask", "performFinishTask", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CollectionTask {

    @NotNull
    private static final String COLLECTION_CONFIGURATION = "collectionTask.cfg";

    @NotNull
    private static final String TAG = "CollectionTask";

    private final int getTaskState(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(COLLECTION_CONFIGURATION, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences.getInt(getName(), 0);
    }

    @NotNull
    public String getName() {
        return "Collection Task";
    }

    public abstract boolean isActive();

    public final boolean isCanceled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getTaskState(context) == 3;
    }

    public final boolean isInProgress(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getTaskState(context) != 0;
    }

    public final boolean isPaused(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getTaskState(context) == 2;
    }

    public final boolean isRunning(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getTaskState(context) == 1;
    }

    public final void onCancelTask(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            performCancelTask(context);
        } catch (Exception e) {
            Logger.e(TAG, "onCancelTask exception: " + getName(), e);
        }
        updateTaskState(context, 3);
    }

    public final void onFinishTask(@NotNull Context context, @Nullable SleepReport result) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            performFinishTask(context, result);
        } catch (Exception e) {
            Logger.e(TAG, "onFinishTask exception: " + getName(), e);
        }
        updateTaskState(context, 0);
    }

    public void onInterruptTask(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void onPauseTask(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            performPauseTask(context);
        } catch (Exception e) {
            Logger.e(TAG, "onPauseTask exception: " + getName(), e);
        }
        updateTaskState(context, 2);
    }

    public final void onStartTask(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            performStartTask(context);
        } catch (Exception e) {
            Logger.e(TAG, "onStartTask exception: " + getName(), e);
        }
        updateTaskState(context, 1);
    }

    public abstract void performCancelTask(@NotNull Context context);

    public abstract void performFinishTask(@NotNull Context context, @Nullable SleepReport result);

    public abstract void performPauseTask(@NotNull Context context);

    public abstract void performStartTask(@NotNull Context context);

    public final void updateTaskState(@NotNull Context context, int taskState) {
        Intrinsics.checkNotNullParameter(context, "context");
        LogExtKt.logi("update " + getName() + "'s state to " + taskState);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(COLLECTION_CONFIGURATION, 0).edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        editorEdit.putInt(getName(), taskState);
        editorEdit.apply();
    }
}
