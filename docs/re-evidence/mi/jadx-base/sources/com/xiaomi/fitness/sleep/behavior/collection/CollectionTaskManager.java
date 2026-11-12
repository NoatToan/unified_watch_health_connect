package com.xiaomi.fitness.sleep.behavior.collection;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import androidx.collection.ArraySet;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ServiceCompat;
import com.xiaomi.fitness.sleep.behavior.collection.acc.AccCollectionTask;
import com.xiaomi.fitness.sleep.behavior.collection.audio.AudioCollectionTask;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\"\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001d2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/CollectionTaskManager;", "Lcom/xiaomi/fitness/sleep/behavior/collection/ICollectionTaskManager;", "mContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mTaskSparseArray", "Landroid/util/SparseArray;", "Lcom/xiaomi/fitness/sleep/behavior/collection/CollectionTask;", "mInProgressTasks", "", "startCollecting", "", "context", "type", "", "pauseCollecting", "taskType", "finishCollecting", "result", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "isActiveTask", "", "isTaskRunning", "isTaskInProgress", "hasRunningTask", "cancelCollecting", "interruptCollecting", "getTaskFromType", "", "stopForegroundServiceIfNeed", "startForegroundNotificationIfNeed", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCollectionTaskManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionTaskManager.kt\ncom/xiaomi/fitness/sleep/behavior/collection/CollectionTaskManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
public final class CollectionTaskManager implements ICollectionTaskManager {

    @NotNull
    private static final String TAG = "CollectionTaskManager";
    public static final int TYPE_ACC_TASK = 1;
    public static final int TYPE_ALL_TASK = 0;
    public static final int TYPE_AUDIO_TASK = 2;

    @NotNull
    private final Context mContext;

    @NotNull
    private final Set<CollectionTask> mInProgressTasks;

    @NotNull
    private final SparseArray<CollectionTask> mTaskSparseArray;

    public CollectionTaskManager(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        SparseArray<CollectionTask> sparseArray = new SparseArray<>();
        this.mTaskSparseArray = sparseArray;
        this.mInProgressTasks = new ArraySet(0, 1, null);
        sparseArray.put(1, new AccCollectionTask(mContext));
        sparseArray.put(2, new AudioCollectionTask(mContext));
    }

    private final List<CollectionTask> getTaskFromType(int type) {
        List<CollectionTask> listListOf;
        if (type != 0) {
            CollectionTask collectionTask = this.mTaskSparseArray.get(type);
            return (collectionTask == null || (listListOf = CollectionsKt__CollectionsJVMKt.listOf(collectionTask)) == null) ? CollectionsKt__CollectionsKt.emptyList() : listListOf;
        }
        LinkedList linkedList = new LinkedList();
        int size = this.mTaskSparseArray.size();
        for (int i = 0; i < size; i++) {
            CollectionTask collectionTaskValueAt = this.mTaskSparseArray.valueAt(i);
            Intrinsics.checkNotNullExpressionValue(collectionTaskValueAt, "valueAt(...)");
            linkedList.add(collectionTaskValueAt);
        }
        return linkedList;
    }

    private final boolean hasRunningTask(Context context) {
        Iterator<CollectionTask> it = this.mInProgressTasks.iterator();
        while (it.hasNext()) {
            if (it.next().isRunning(context)) {
                return true;
            }
        }
        return false;
    }

    private final void startForegroundNotificationIfNeed(Context context) {
        Intent intent = new Intent(context, (Class<?>) CollectionForegroundService.class);
        intent.putExtra(CollectionForegroundService.NOTIFICATION_TYPE, "sleep_detection");
        ServiceCompat.INSTANCE.startForegroundService(context, intent);
    }

    private final void stopForegroundServiceIfNeed(Context context) {
        if (hasRunningTask(context) || !CollectionForegroundService.INSTANCE.isRunning()) {
            return;
        }
        ServiceCompat.INSTANCE.startForegroundService(context, new Intent(context, (Class<?>) CollectionForegroundService.class));
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.ICollectionTaskManager
    public void cancelCollecting(@NotNull Context context, int type) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<CollectionTask> taskFromType = getTaskFromType(type);
        synchronized (this.mInProgressTasks) {
            try {
                boolean z = false;
                for (CollectionTask collectionTask : taskFromType) {
                    if (!collectionTask.isCanceled(context) && collectionTask.isInProgress(context)) {
                        Logger.i(TAG, "class: " + collectionTask.getName() + " : onCancelTask");
                        collectionTask.onCancelTask(context);
                        this.mInProgressTasks.remove(collectionTask);
                        z = true;
                    }
                }
                if (z) {
                    stopForegroundServiceIfNeed(context);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.ICollectionTaskManager
    public void finishCollecting(@NotNull Context context, int type, @Nullable SleepReport result) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<CollectionTask> taskFromType = getTaskFromType(type);
        synchronized (this.mInProgressTasks) {
            try {
                boolean z = false;
                for (CollectionTask collectionTask : taskFromType) {
                    if (collectionTask.isInProgress(context)) {
                        Logger.i(TAG, "class: " + collectionTask.getName() + " : onFinishTask");
                        collectionTask.onFinishTask(context, result);
                        this.mInProgressTasks.remove(collectionTask);
                        z = true;
                    }
                }
                if (z) {
                    stopForegroundServiceIfNeed(context);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.ICollectionTaskManager
    public void interruptCollecting(@NotNull Context context, int type) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<CollectionTask> taskFromType = getTaskFromType(type);
        synchronized (this.mInProgressTasks) {
            try {
                boolean z = false;
                for (CollectionTask collectionTask : taskFromType) {
                    if (collectionTask.isRunning(context) || collectionTask.isPaused(context)) {
                        Logger.i(TAG, "class: " + collectionTask.getName() + " : onInterruptTask");
                        collectionTask.onInterruptTask(context);
                        this.mInProgressTasks.remove(collectionTask);
                        z = true;
                    }
                }
                if (z) {
                    stopForegroundServiceIfNeed(context);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.ICollectionTaskManager
    public boolean isActiveTask(int type) {
        CollectionTask collectionTask = this.mTaskSparseArray.get(type);
        if (collectionTask != null) {
            return collectionTask.isActive();
        }
        return false;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.ICollectionTaskManager
    public boolean isTaskInProgress(int type) {
        List<CollectionTask> taskFromType = getTaskFromType(type);
        if (taskFromType.isEmpty()) {
            return false;
        }
        Iterator<CollectionTask> it = taskFromType.iterator();
        while (it.hasNext()) {
            if (!it.next().isInProgress(this.mContext)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.ICollectionTaskManager
    public boolean isTaskRunning(int type) {
        List<CollectionTask> taskFromType = getTaskFromType(type);
        if (taskFromType.isEmpty()) {
            return false;
        }
        Iterator<CollectionTask> it = taskFromType.iterator();
        while (it.hasNext()) {
            if (!it.next().isRunning(this.mContext)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.ICollectionTaskManager
    public void pauseCollecting(@NotNull Context context, int taskType) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<CollectionTask> taskFromType = getTaskFromType(taskType);
        synchronized (this.mInProgressTasks) {
            try {
                boolean z = false;
                for (CollectionTask collectionTask : taskFromType) {
                    if (collectionTask.isRunning(context)) {
                        Logger.i(TAG, "class: " + collectionTask.getName() + " : onPaused");
                        collectionTask.onPauseTask(context);
                        z = true;
                    }
                }
                if (z) {
                    stopForegroundServiceIfNeed(context);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.ICollectionTaskManager
    public void startCollecting(@NotNull Context context, int type) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        List<CollectionTask> taskFromType = getTaskFromType(type);
        synchronized (this.mInProgressTasks) {
            try {
                z = false;
                for (CollectionTask collectionTask : taskFromType) {
                    if (collectionTask.isActive()) {
                        Logger.i(TAG, "class: " + collectionTask.getName() + " : onStartTask");
                        collectionTask.onStartTask(context);
                        this.mInProgressTasks.add(collectionTask);
                        z = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            startForegroundNotificationIfNeed(context);
        }
    }
}
