package com.xiaomi.fitness.common.concurrent;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.onetrack.OneTrack;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006?@ABCDB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*J\u0010\u0010+\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0007J\u0018\u0010+\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0007H\u0007J\u0010\u0010-\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*J\u0014\u0010.\u001a\u0006\u0012\u0002\b\u00030/2\u0006\u0010)\u001a\u00020*H\u0007J\u001a\u00100\u001a\u0006\u0012\u0002\b\u0003012\u0006\u0010)\u001a\u00020*2\u0006\u00102\u001a\u00020\u0007J\u001c\u00103\u001a\u0006\u0012\u0002\b\u00030/2\b\u00104\u001a\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u00020*J\u0014\u00103\u001a\u0006\u0012\u0002\b\u00030/2\u0006\u0010)\u001a\u00020*H\u0007J\u001a\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00052\b\b\u0001\u0010<\u001a\u00020\tH\u0002J\u001a\u0010=\u001a\u00020*2\b\u0010>\u001a\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u00020*H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\"\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b&\u0010\u001fR\u0011\u00106\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/ExecutorHelper;", "", "<init>", "()V", "MAIN", "", "KEEP_ALIVE_SECONDS", "", "MAX_TASK_SIZE", "", "KEEP_POOL_SIZE", "MAXIMUM_POOL_SIZE", "WORK_EXECUTOR", "CACHE_POOL", "TAG", "IO_POOL", "sMainHandler", "Landroid/os/Handler;", "sSingleWorkThread", "Ljava/util/concurrent/ScheduledExecutorService;", "sCacheThread", "Ljava/util/concurrent/ThreadPoolExecutor;", "sMainExecutor", "Ljava/util/concurrent/Executor;", "sIOThreadPool", "Ljava/util/concurrent/ExecutorService;", "sDefaultRejectCallbackHandler", "Lcom/xiaomi/fitness/common/concurrent/ExecutorHelper$RejectCallbackHandler;", "backgroundPool", "getBackgroundPool$annotations", "getBackgroundPool", "()Ljava/util/concurrent/Executor;", "ioThreadPool", "getIoThreadPool", "worker", "getWorker", "()Ljava/util/concurrent/ScheduledExecutorService;", "mainExecutor", "getMainExecutor", "runInMain", "", "task", "Ljava/lang/Runnable;", "postInMain", "millis", "removeFromMain", "runInWorker", "Ljava/util/concurrent/Future;", "postInWorker", "Ljava/util/concurrent/ScheduledFuture;", "delay", "runInBackground", CardInfo.KEY_OWNER, "run", "mainHandler", "getMainHandler", "()Landroid/os/Handler;", "createThreadFactory", "Ljava/util/concurrent/ThreadFactory;", "factoryName", "threadPriority", "createSlaveTaskIfNeed", "master", "RejectStrategy", "ScheduleStrategy", "Builder", "RejectCallbackHandler", "InnerThread", "SlaveRunnable", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExecutorHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExecutorHelper.kt\ncom/xiaomi/fitness/common/concurrent/ExecutorHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,445:1\n1#2:446\n*E\n"})
public final class ExecutorHelper {

    @NotNull
    private static final String CACHE_POOL = "Cache";

    @NotNull
    private static final String IO_POOL = "IO";
    private static final long KEEP_ALIVE_SECONDS = 30;
    private static int KEEP_POOL_SIZE = 0;

    @NotNull
    private static final String MAIN = "main";
    private static int MAXIMUM_POOL_SIZE = 0;
    private static final int MAX_TASK_SIZE = 256;

    @NotNull
    private static final String TAG = "Executor";

    @NotNull
    private static final String WORK_EXECUTOR = "Work";

    @Nullable
    private static volatile ThreadPoolExecutor sCacheThread;

    @Nullable
    private static ExecutorService sIOThreadPool;

    @Nullable
    private static volatile Executor sMainExecutor;

    @Nullable
    private static volatile Handler sMainHandler;

    @Nullable
    private static volatile ScheduledExecutorService sSingleWorkThread;

    @NotNull
    public static final ExecutorHelper INSTANCE = new ExecutorHelper();

    @NotNull
    private static final RejectCallbackHandler sDefaultRejectCallbackHandler = new RejectCallbackHandler(new ThreadPoolExecutor.DiscardOldestPolicy());

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\u0018\u001a\u00020\u00002\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0007J\u0010\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010J\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/ExecutorHelper$Builder;", "", "poolName", "", "<init>", "(Ljava/lang/String;)V", "coreSize", "", "maxSize", "keepTimeSec", "", "queueSize", "threadPriority", "rejectStrategy", "scheduleStrategy", "rejectedExecutionHandler", "Ljava/util/concurrent/RejectedExecutionHandler;", "mBlockingQueue", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "setCoreSize", "setMaxSize", "setKeepTimeSec", "setQueueSize", "setBlockingQueue", "queue", "setScheduleStrategy", "strategy", "setThreadPriority", "setRejectStrategy", "setRejectedExecutionHandler", "handler", OneTrack.Param.BUILD, "Ljava/util/concurrent/ThreadPoolExecutor;", "createRejectedHandler", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "createWorkerQueue", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private int coreSize;
        private long keepTimeSec;

        @Nullable
        private BlockingQueue<Runnable> mBlockingQueue;
        private int maxSize;

        @NotNull
        private final String poolName;
        private int queueSize;
        private int rejectStrategy;

        @Nullable
        private RejectedExecutionHandler rejectedExecutionHandler;
        private int scheduleStrategy;
        private int threadPriority;

        public Builder(@NotNull String poolName) {
            Intrinsics.checkNotNullParameter(poolName, "poolName");
            this.poolName = poolName;
            this.coreSize = 1;
            this.maxSize = 1;
            this.keepTimeSec = 10L;
            this.queueSize = 256;
            this.threadPriority = 1;
            this.rejectStrategy = 3;
        }

        private final RejectedExecutionHandler createRejectedHandler(final ThreadFactory threadFactory) {
            RejectedExecutionHandler rejectedExecutionHandler = this.rejectedExecutionHandler;
            if (rejectedExecutionHandler != null) {
                Intrinsics.checkNotNull(rejectedExecutionHandler);
                return rejectedExecutionHandler;
            }
            int i = this.rejectStrategy;
            if (i == 0) {
                return new ThreadPoolExecutor.DiscardPolicy();
            }
            if (i == 1) {
                return new RejectedExecutionHandler() { // from class: yf8
                    @Override // java.util.concurrent.RejectedExecutionHandler
                    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                        ExecutorHelper.Builder.createRejectedHandler$lambda$0(threadFactory, runnable, threadPoolExecutor);
                    }
                };
            }
            if (i == 2) {
                return new ThreadPoolExecutor.AbortPolicy();
            }
            if (i == 3) {
                return new ThreadPoolExecutor.DiscardOldestPolicy();
            }
            if (i == 4) {
                return new ThreadPoolExecutor.CallerRunsPolicy();
            }
            throw new IllegalArgumentException("Unknown Reject Strategy");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createRejectedHandler$lambda$0(ThreadFactory threadFactory, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Intrinsics.checkNotNullParameter(threadFactory, "$threadFactory");
            threadFactory.newThread(runnable).start();
        }

        private final BlockingQueue<Runnable> createWorkerQueue() {
            BlockingQueue<Runnable> blockingQueue = this.mBlockingQueue;
            if (blockingQueue == null) {
                return this.scheduleStrategy == 1 ? new StackBlockingQueue(this.queueSize) : new LinkedBlockingQueue(this.queueSize);
            }
            Intrinsics.checkNotNull(blockingQueue);
            return blockingQueue;
        }

        @NotNull
        public final ThreadPoolExecutor build() {
            ExecutorHelper executorHelper = ExecutorHelper.INSTANCE;
            String str = this.poolName;
            Objects.requireNonNull(str);
            Intrinsics.checkNotNullExpressionValue(str, "requireNonNull(...)");
            ThreadFactory threadFactoryCreateThreadFactory = executorHelper.createThreadFactory(str, this.threadPriority);
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.coreSize, this.maxSize, this.keepTimeSec, TimeUnit.SECONDS, createWorkerQueue(), threadFactoryCreateThreadFactory, new RejectCallbackHandler(createRejectedHandler(threadFactoryCreateThreadFactory)));
            if (this.keepTimeSec > 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return threadPoolExecutor;
        }

        @NotNull
        public final Builder setBlockingQueue(@NotNull BlockingQueue<Runnable> queue) {
            Intrinsics.checkNotNullParameter(queue, "queue");
            Objects.requireNonNull(queue);
            this.mBlockingQueue = queue;
            return this;
        }

        @NotNull
        public final Builder setCoreSize(int coreSize) {
            this.coreSize = coreSize;
            return this;
        }

        @NotNull
        public final Builder setKeepTimeSec(long keepTimeSec) {
            this.keepTimeSec = keepTimeSec;
            return this;
        }

        @NotNull
        public final Builder setMaxSize(int maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        @NotNull
        public final Builder setQueueSize(int queueSize) {
            this.queueSize = queueSize;
            return this;
        }

        @NotNull
        public final Builder setRejectStrategy(int strategy) {
            this.rejectStrategy = strategy;
            return this;
        }

        @NotNull
        public final Builder setRejectedExecutionHandler(@Nullable RejectedExecutionHandler handler) {
            this.rejectedExecutionHandler = handler;
            return this;
        }

        @NotNull
        public final Builder setScheduleStrategy(int strategy) {
            this.scheduleStrategy = strategy;
            return this;
        }

        @NotNull
        public final Builder setThreadPriority(@Priority int threadPriority) {
            this.threadPriority = threadPriority;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/ExecutorHelper$InnerThread;", "Ljava/lang/Thread;", "namePrefix", "", "target", "Ljava/lang/Runnable;", "threadPriority", "", "<init>", "(Ljava/lang/String;Ljava/lang/Runnable;I)V", "mPriority", "run", "", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InnerThread extends Thread {
        private int mPriority;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InnerThread(@NotNull String namePrefix, @Nullable Runnable runnable, @Priority int i) {
            super(runnable);
            Intrinsics.checkNotNullParameter(namePrefix, "namePrefix");
            setName(namePrefix + "-" + getId());
            this.mPriority = i != 0 ? i != 2 ? 10 : 0 : 11;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(this.mPriority);
            super.run();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/ExecutorHelper$RejectCallbackHandler;", "Ljava/util/concurrent/RejectedExecutionHandler;", "mHandler", "<init>", "(Ljava/util/concurrent/RejectedExecutionHandler;)V", "rejectedExecution", "", "r", "Ljava/lang/Runnable;", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RejectCallbackHandler implements RejectedExecutionHandler {

        @NotNull
        private final RejectedExecutionHandler mHandler;

        public RejectCallbackHandler(@NotNull RejectedExecutionHandler mHandler) {
            Intrinsics.checkNotNullParameter(mHandler, "mHandler");
            this.mHandler = mHandler;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(@NotNull Runnable r2, @NotNull ThreadPoolExecutor executor) {
            Intrinsics.checkNotNullParameter(r2, "r");
            Intrinsics.checkNotNullParameter(executor, "executor");
            if (r2 instanceof RejectCallback) {
                ((RejectCallback) r2).onReject(executor);
            }
            this.mHandler.rejectedExecution(r2, executor);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/ExecutorHelper$RejectStrategy;", "", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface RejectStrategy {
        public static final int ABORT = 2;
        public static final int CALLER_RUNS = 4;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int DISCARD = 0;
        public static final int DISCARD_OLDEST = 3;
        public static final int NEW_THREAD = 1;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/ExecutorHelper$RejectStrategy$Companion;", "", "<init>", "()V", "DISCARD", "", "NEW_THREAD", "ABORT", "DISCARD_OLDEST", "CALLER_RUNS", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ABORT = 2;
            public static final int CALLER_RUNS = 4;
            public static final int DISCARD = 0;
            public static final int DISCARD_OLDEST = 3;
            public static final int NEW_THREAD = 1;

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/ExecutorHelper$ScheduleStrategy;", "", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ScheduleStrategy {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int FIFO = 0;
        public static final int STACK = 1;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/ExecutorHelper$ScheduleStrategy$Companion;", "", "<init>", "()V", "FIFO", "", "STACK", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int FIFO = 0;
            public static final int STACK = 1;

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0004\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/ExecutorHelper$SlaveRunnable;", "Ljava/lang/Runnable;", "master", "", "run", "<init>", "(Ljava/lang/Object;Ljava/lang/Runnable;)V", "mMasterToken", "Ljava/lang/ref/WeakReference;", "changeMaster", "", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SlaveRunnable implements Runnable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final WeakReference<Object> mMasterToken;

        @NotNull
        private final Runnable run;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/ExecutorHelper$SlaveRunnable$Companion;", "", "<init>", "()V", "isActive", "", "obj", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final boolean isActive(Object obj) {
                if (obj instanceof View) {
                    if (!((View) obj).isAttachedToWindow()) {
                        return true;
                    }
                } else if (obj instanceof Activity) {
                    Activity activity = (Activity) obj;
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        return true;
                    }
                } else if (obj instanceof Fragment) {
                    Fragment fragment = (Fragment) obj;
                    if (fragment.isDetached() || fragment.isRemoving()) {
                        return true;
                    }
                }
                return false;
            }
        }

        public SlaveRunnable(@NotNull Object master, @NotNull Runnable run) {
            Intrinsics.checkNotNullParameter(master, "master");
            Intrinsics.checkNotNullParameter(run, "run");
            this.mMasterToken = new WeakReference<>(master);
            this.run = run;
        }

        public final void changeMaster(@Nullable Object master) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.run;
            Object obj = this.mMasterToken.get();
            if (obj != null && !INSTANCE.isActive(obj)) {
                runnable.run();
                return;
            }
            Logger.d(ExecutorHelper.TAG, "slave's master dead, Skip. " + obj + " -> " + runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (RomUtils.INSTANCE.isMiuiLite()) {
            iAvailableProcessors -= 2;
        }
        int i = iAvailableProcessors < 4 ? 3 : iAvailableProcessors - 1;
        KEEP_POOL_SIZE = i;
        int i2 = (i * 2) - 1;
        MAXIMUM_POOL_SIZE = i2;
        Logger.d(TAG, "cpu: " + iAvailableProcessors + ", size " + i + ", max " + i2);
    }

    private ExecutorHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_mainExecutor_$lambda$5$lambda$4(Runnable runnable) {
        if (runnable != null) {
            postInMain(runnable);
        }
    }

    private final Runnable createSlaveTaskIfNeed(Object master, Runnable run) {
        if (master == null) {
            Objects.requireNonNull(run);
            Intrinsics.checkNotNullExpressionValue(run, "requireNonNull(...)");
            return run;
        }
        if (!(run instanceof SlaveRunnable)) {
            return new SlaveRunnable(master, run);
        }
        SlaveRunnable slaveRunnable = (SlaveRunnable) run;
        slaveRunnable.changeMaster(master);
        return slaveRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadFactory createThreadFactory(final String factoryName, @Priority final int threadPriority) {
        return new ThreadFactory() { // from class: xf8
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ExecutorHelper.createThreadFactory$lambda$7(factoryName, threadPriority, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread createThreadFactory$lambda$7(String factoryName, int i, Runnable runnable) {
        Intrinsics.checkNotNullParameter(factoryName, "$factoryName");
        return new InnerThread(factoryName, runnable, i);
    }

    @NotNull
    public static final Executor getBackgroundPool() {
        if (sCacheThread != null) {
            ThreadPoolExecutor threadPoolExecutor = sCacheThread;
            Intrinsics.checkNotNull(threadPoolExecutor);
            return threadPoolExecutor;
        }
        synchronized (ExecutorHelper.class) {
            try {
                if (sCacheThread == null) {
                    sCacheThread = new ThreadPoolExecutor(KEEP_POOL_SIZE, MAXIMUM_POOL_SIZE, KEEP_ALIVE_SECONDS, TimeUnit.SECONDS, new LinkedBlockingQueue(256), INSTANCE.createThreadFactory(CACHE_POOL, 1), sDefaultRejectCallbackHandler);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        ThreadPoolExecutor threadPoolExecutor2 = sCacheThread;
        Intrinsics.checkNotNull(threadPoolExecutor2);
        return threadPoolExecutor2;
    }

    @JvmStatic
    public static /* synthetic */ void getBackgroundPool$annotations() {
    }

    @JvmStatic
    public static final void postInMain(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        INSTANCE.getMainHandler().post(TaskTrace.INSTANCE.getTask("main", task));
    }

    @JvmStatic
    @NotNull
    public static final Future<?> runInWorker(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Future<?> futureSubmit = INSTANCE.getWorker().submit(TaskTrace.INSTANCE.getTask(WORK_EXECUTOR, task));
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "submit(...)");
        return futureSubmit;
    }

    @NotNull
    public final Executor getIoThreadPool() {
        ExecutorService executorService = sIOThreadPool;
        if (executorService != null) {
            Intrinsics.checkNotNull(executorService);
            return executorService;
        }
        synchronized (ExecutorHelper.class) {
            try {
                if (sIOThreadPool == null) {
                    sIOThreadPool = new Builder(IO_POOL).setCoreSize(0).setMaxSize(1024).setThreadPriority(1).setBlockingQueue(new SynchronousQueue()).setRejectedExecutionHandler(sDefaultRejectCallbackHandler).build();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        ExecutorService executorService2 = sIOThreadPool;
        Intrinsics.checkNotNull(executorService2);
        return executorService2;
    }

    @NotNull
    public final Executor getMainExecutor() {
        Executor executor;
        if (sMainExecutor != null) {
            Executor executor2 = sMainExecutor;
            Intrinsics.checkNotNull(executor2);
            return executor2;
        }
        synchronized (ExecutorHelper.class) {
            sMainExecutor = new Executor() { // from class: wf8
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    ExecutorHelper._get_mainExecutor_$lambda$5$lambda$4(runnable);
                }
            };
            executor = sMainExecutor;
            Intrinsics.checkNotNull(executor);
        }
        return executor;
    }

    @NotNull
    public final Handler getMainHandler() {
        if (sMainHandler != null) {
            Handler handler = sMainHandler;
            Intrinsics.checkNotNull(handler);
            return handler;
        }
        synchronized (ExecutorHelper.class) {
            try {
                if (sMainHandler == null) {
                    sMainHandler = new Handler(Looper.getMainLooper());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Handler handler2 = sMainHandler;
        Intrinsics.checkNotNull(handler2);
        return handler2;
    }

    @NotNull
    public final ScheduledExecutorService getWorker() {
        if (sSingleWorkThread != null) {
            ScheduledExecutorService scheduledExecutorService = sSingleWorkThread;
            Intrinsics.checkNotNull(scheduledExecutorService);
            return scheduledExecutorService;
        }
        synchronized (ExecutorHelper.class) {
            try {
                if (sSingleWorkThread == null) {
                    sSingleWorkThread = new ScheduledThreadPoolExecutor(1, INSTANCE.createThreadFactory(WORK_EXECUTOR, 2), sDefaultRejectCallbackHandler);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScheduledExecutorService scheduledExecutorService2 = sSingleWorkThread;
        Intrinsics.checkNotNull(scheduledExecutorService2);
        return scheduledExecutorService2;
    }

    @NotNull
    public final ScheduledFuture<?> postInWorker(@NotNull Runnable task, long delay) {
        Intrinsics.checkNotNullParameter(task, "task");
        ScheduledFuture<?> scheduledFutureSchedule = getWorker().schedule(TaskTrace.INSTANCE.getTask(WORK_EXECUTOR, task), delay, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(scheduledFutureSchedule, "schedule(...)");
        return scheduledFutureSchedule;
    }

    public final void removeFromMain(@Nullable Runnable task) {
        if (task == null) {
            return;
        }
        getMainHandler().removeCallbacks(task);
    }

    @NotNull
    public final Future<?> runInBackground(@Nullable Object owner, @NotNull Runnable run) {
        Intrinsics.checkNotNullParameter(run, "run");
        Runnable runnableCreateSlaveTaskIfNeed = createSlaveTaskIfNeed(owner, run);
        Executor backgroundPool = getBackgroundPool();
        Intrinsics.checkNotNull(backgroundPool, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
        Future<?> futureSubmit = ((ThreadPoolExecutor) backgroundPool).submit(runnableCreateSlaveTaskIfNeed);
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "submit(...)");
        return futureSubmit;
    }

    public final void runInMain(@Nullable Runnable task) {
        if (task == null) {
            return;
        }
        if (UIUtils.INSTANCE.isInMainThread()) {
            task.run();
        } else {
            postInMain(task);
        }
    }

    @JvmStatic
    public static final void postInMain(@NotNull Runnable task, long millis) {
        Intrinsics.checkNotNullParameter(task, "task");
        INSTANCE.getMainHandler().postDelayed(TaskTrace.INSTANCE.getTask("main", task), millis);
    }

    @JvmStatic
    @NotNull
    public static final Future<?> runInBackground(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Executor backgroundPool = getBackgroundPool();
        Intrinsics.checkNotNull(backgroundPool, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
        Future<?> futureSubmit = ((ThreadPoolExecutor) backgroundPool).submit(task);
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "submit(...)");
        return futureSubmit;
    }
}
