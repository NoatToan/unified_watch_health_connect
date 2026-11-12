package com.xiaomi.fitness.sleep.behavior.collection;

import android.content.Context;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&J\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H&J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H&¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/ICollectionTaskManager;", "", "startCollecting", "", "context", "Landroid/content/Context;", "typeAllTask", "", "pauseCollecting", "taskType", "finishCollecting", "type", "result", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "isActiveTask", "", "isTaskRunning", "isTaskInProgress", "cancelCollecting", "interruptCollecting", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ICollectionTaskManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/ICollectionTaskManager$Companion;", "", "<init>", "()V", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void cancelCollecting(@NotNull Context context, int type);

    void finishCollecting(@NotNull Context context, int type, @Nullable SleepReport result);

    void interruptCollecting(@NotNull Context context, int type);

    boolean isActiveTask(int type);

    boolean isTaskInProgress(int type);

    boolean isTaskRunning(int type);

    void pauseCollecting(@NotNull Context context, int taskType);

    void startCollecting(@NotNull Context context, int typeAllTask);
}
