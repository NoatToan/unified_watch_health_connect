package com.xiaomi.fitness.common.concurrent;

import android.os.SystemClock;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/TaskTrace;", "Ljava/lang/Runnable;", "mTag", "", "mTask", "<init>", "(Ljava/lang/String;Ljava/lang/Runnable;)V", "run", "", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TaskTrace implements Runnable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TASK_TRACE = "TaskTrace";
    private static final boolean TASK_TRACE_ENABLE = false;

    @NotNull
    private final String mTag;

    @NotNull
    private final Runnable mTask;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/TaskTrace$Companion;", "", "<init>", "()V", "TASK_TRACE", "", "TASK_TRACE_ENABLE", "", "getTask", "Ljava/lang/Runnable;", "tag", "task", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Runnable getTask(@NotNull String tag, @NotNull Runnable task) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(task, "task");
            return TaskTrace.TASK_TRACE_ENABLE ? new TaskTrace(tag, task, null) : task;
        }
    }

    public /* synthetic */ TaskTrace(String str, Runnable runnable, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.mTask.run();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            if (jElapsedRealtime2 > 200) {
                Logger.d("TaskTrace:" + this.mTag + " perform [" + this.mTask + "] cost " + jElapsedRealtime2 + "ms", new Object[0]);
            }
        } catch (Throwable th) {
            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            if (jElapsedRealtime3 > 200) {
                Logger.d("TaskTrace:" + this.mTag + " perform [" + this.mTask + "] cost " + jElapsedRealtime3 + "ms", new Object[0]);
            }
            throw th;
        }
    }

    private TaskTrace(String str, Runnable runnable) {
        this.mTag = str;
        this.mTask = runnable;
    }
}
