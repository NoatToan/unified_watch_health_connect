package com.xiaomi.hm.health.baseutil;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class SmartExecutor {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE_SECONDS = 30;
    private static final int MAXIMUM_POOL_SIZE;
    private static final BlockingQueue<Runnable> POOL_WORK_QUEUE;
    private static final Executor SERIAL_EXECUTOR;
    private static final ThreadFactory THREAD_FACTORY;
    public static final Executor THREAD_POOL_EXECUTOR;
    private static volatile Executor sDefaultExecutor;

    public static class SerialExecutor implements Executor {
        public Runnable mActive;
        public final ArrayDeque<Runnable> mTasks;

        private SerialExecutor() {
            this.mTasks = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$execute$0(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                scheduleNext();
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.mTasks.offer(new Runnable() { // from class: com.xiaomi.hm.health.baseutil.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13472a.lambda$execute$0(runnable);
                }
            });
            if (this.mActive == null) {
                scheduleNext();
            }
        }

        public synchronized void scheduleNext() {
            Runnable runnablePoll = this.mTasks.poll();
            this.mActive = runnablePoll;
            if (runnablePoll != null) {
                SmartExecutor.THREAD_POOL_EXECUTOR.execute(runnablePoll);
            }
        }
    }

    static {
        SerialExecutor serialExecutor = new SerialExecutor();
        SERIAL_EXECUTOR = serialExecutor;
        sDefaultExecutor = serialExecutor;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int iMax = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        CORE_POOL_SIZE = iMax;
        int i = (iAvailableProcessors * 2) + 1;
        MAXIMUM_POOL_SIZE = i;
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.xiaomi.hm.health.baseutil.SmartExecutor.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "SmartExecutorPool #" + this.mCount.getAndIncrement());
            }
        };
        THREAD_FACTORY = threadFactory;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        POOL_WORK_QUEUE = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, i, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        THREAD_POOL_EXECUTOR = threadPoolExecutor;
    }

    public static Executor getExecutor() {
        return THREAD_POOL_EXECUTOR;
    }

    public static Executor getSerialExecutor() {
        return sDefaultExecutor;
    }
}
