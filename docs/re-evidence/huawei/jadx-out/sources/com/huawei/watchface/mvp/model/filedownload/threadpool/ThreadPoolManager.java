package com.huawei.watchface.mvp.model.filedownload.threadpool;

import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.utils.HwLog;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes20.dex */
public final class ThreadPoolManager {
    private static final int MAX_CORE_THREAD_NUM = 5;
    private static final int MAX_POOL_THREAD_NUM = 10;
    private static final int MAX_UI_CORE_THREAD_NUM = 10;
    private static final int MAX_UI_POOL_THREAD_NUM = 30;
    private static final String TAG = "ThreadPoolManager";
    private static volatile ThreadPoolManager sInstance;
    private WatchFaceThreadPoolExecutor mThreadPoolExecutor;

    public static class WatchFaceRunnable implements Runnable {
        private final Runnable mRunnable;

        public WatchFaceRunnable(Runnable runnable) {
            if (runnable == null) {
                throw new IllegalArgumentException("runnable == null");
            }
            this.mRunnable = runnable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof WatchFaceRunnable) {
                return this.mRunnable.equals(((WatchFaceRunnable) obj).mRunnable);
            }
            return false;
        }

        public Runnable getRunnable() {
            return this.mRunnable;
        }

        public int hashCode() {
            return this.mRunnable.hashCode() + super.hashCode();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mRunnable.run();
        }

        public String toString() {
            if (!this.mRunnable.getClass().isAnonymousClass()) {
                return this.mRunnable.toString();
            }
            String string = this.mRunnable.toString();
            return string.lastIndexOf(".") > 0 ? SafeString.substring(string, string.lastIndexOf(".") + 1) : string;
        }
    }

    public static final class WatchFaceThreadFactory implements ThreadFactory {
        private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);
        private final ThreadGroup mGroup;
        private final String mNamePrefix;
        private final AtomicInteger mThreadNumber = new AtomicInteger(1);

        public WatchFaceThreadFactory() {
            SecurityManager securityManager = System.getSecurityManager();
            this.mGroup = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.mNamePrefix = "health-" + POOL_NUMBER.getAndIncrement() + "-th-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.mGroup, runnable, this.mNamePrefix + this.mThreadNumber.getAndIncrement(), 0L);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager$WatchFaceThreadFactory$$ExternalSyntheticLambda0
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread2, Throwable th) {
                    HwLog.w(ThreadPoolManager.TAG, "task rejected:" + thread2.getName() + ", e:" + HwLog.printException(th));
                }
            });
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            return thread;
        }

        public String toString() {
            return this.mNamePrefix + this.mGroup.getName();
        }
    }

    public static final class WatchFaceThreadPoolExecutor extends ThreadPoolExecutor {
        private static final long ALL_TASK_RUN_LOG_PRINT_TIME_INTERVAL = 300000;
        private static final int MIN_BLOCKING_QUEUE_LEN = 1;
        private static final int SHIFT_OPERATOR_ONE = 1;
        private static final long TASK_EXECUTED_ABOVE_10 = 10000;
        private static final long TASK_EXECUTED_ABOVE_20 = 20000;
        private static final long TASK_EXECUTED_ABOVE_30 = 30000;
        private static final long THREAD_KEEP_ALIVE_TIME = 20;
        private final AtomicLong mCompletedTaskCostTimes;
        private final AtomicLong mCompletedTaskCount;
        private final AtomicLong mLastLogPrintTime;
        private final WatchFaceSerialExecutionHandler mSerialExecutionHandler;
        private final ThreadLocal<Long> mStartTime;
        private final HealthWrapExecutionHandler mSwapExecutionHandler;
        private final AtomicLong mTaskMaxCostTime;
        private final AtomicInteger mTaskRunNum;

        public WatchFaceThreadPoolExecutor(int i, int i2) {
            this(i, i2, 20L);
        }

        private void afterExecuteStatistical(Runnable runnable, Throwable th) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = jCurrentTimeMillis - this.mStartTime.get().longValue();
            long jAddAndGet = this.mCompletedTaskCostTimes.addAndGet(jLongValue);
            long jIncrementAndGet = this.mCompletedTaskCount.incrementAndGet();
            if (jLongValue > this.mTaskMaxCostTime.get()) {
                this.mTaskMaxCostTime.set(jLongValue);
            }
            int maximumPoolSize = getMaximumPoolSize();
            if (jIncrementAndGet != 0 && maximumPoolSize != 0 && jIncrementAndGet % ((long) maximumPoolSize) == 0 && jCurrentTimeMillis - this.mLastLogPrintTime.get() > 300000) {
                this.mLastLogPrintTime.set(jCurrentTimeMillis);
                HwLog.i(ThreadPoolManager.TAG, "taskCmpNum=" + jIncrementAndGet + ", avgRunTime=" + (jAddAndGet / jIncrementAndGet) + ", maxRunTime=" + this.mTaskMaxCostTime.get() + ", activeCount=" + getActiveCount() + ", taskRunNum=" + getTaskRunNum() + ", taskWaitNum=" + getTaskWaitRunNum());
            }
            if (jLongValue >= 30000) {
                HwLog.w(ThreadPoolManager.TAG, getThreadFactory().toString() + ", " + runnable.toString() + ", runTime=" + jLongValue);
            } else if (jLongValue >= 20000) {
                HwLog.i(ThreadPoolManager.TAG, getThreadFactory().toString() + ", " + runnable.toString() + ", runTime=" + jLongValue);
            } else if (jLongValue >= 10000) {
                HwLog.d(ThreadPoolManager.TAG, getThreadFactory().toString() + ", " + runnable.toString() + ", runTime=" + jLongValue);
            }
            if (th != null) {
                HwLog.w(ThreadPoolManager.TAG, "afterExecuteStatistical: " + runnable.toString() + ", throwable=" + HwLog.printException(th));
            }
        }

        private static int calcQueueSize(int i) {
            return (i << 1) + 1;
        }

        private int getTaskRunNum() {
            return this.mTaskRunNum.intValue();
        }

        private int getTaskWaitRunNum() {
            return this.mSwapExecutionHandler.wrapQueueSize(this) + this.mSerialExecutionHandler.serialQueueSize();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            afterExecuteStatistical(runnable, th);
            this.mTaskRunNum.getAndDecrement();
            this.mSerialExecutionHandler.trySerialExecute(runnable, th, this.mSwapExecutionHandler);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void beforeExecute(Thread thread, Runnable runnable) {
            this.mSwapExecutionHandler.wrapExecute(null, this);
            this.mTaskRunNum.getAndIncrement();
            this.mStartTime.set(Long.valueOf(System.currentTimeMillis()));
            super.beforeExecute(thread, runnable);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if ((runnable instanceof WatchFaceSerialRunnable) && !isShutdown() && this.mSerialExecutionHandler.putSerialTask((WatchFaceSerialRunnable) runnable)) {
                return;
            }
            this.mSwapExecutionHandler.wrapExecute(runnable, this);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public long getCompletedTaskCount() {
            return this.mCompletedTaskCount.get();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public long getTaskCount() {
            return getTaskRunNum() + getTaskWaitRunNum();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public boolean remove(Runnable runnable) {
            return runnable instanceof WatchFaceSerialRunnable ? this.mSerialExecutionHandler.removeSerialTask((WatchFaceSerialRunnable) runnable, this.mSwapExecutionHandler) : this.mSwapExecutionHandler.wrapRemove(runnable, this);
        }

        public int removeSerialTask(String str) {
            return this.mSerialExecutionHandler.removeSerialTask(str, this.mSwapExecutionHandler);
        }

        public int removeTagTask(String str) {
            return this.mSwapExecutionHandler.wrapRemoveTagTask(str, this);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void setRejectedExecutionHandler(RejectedExecutionHandler rejectedExecutionHandler) {
            throw new UnsupportedOperationException("Unsupported setRejectedExecutionHandler");
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
        public void shutdown() {
            this.mSwapExecutionHandler.wrapShutdown(this);
            this.mSerialExecutionHandler.removeAllSerialTask(null);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            List<Runnable> listWrapShutdownNow = this.mSwapExecutionHandler.wrapShutdownNow(this);
            this.mSerialExecutionHandler.removeAllSerialTask(listWrapShutdownNow);
            return listWrapShutdownNow;
        }

        public void swapExecute(WatchFaceRunnable watchFaceRunnable) {
            super.execute(watchFaceRunnable);
        }

        public boolean swapRemove(WatchFaceRunnable watchFaceRunnable) {
            return super.remove(watchFaceRunnable);
        }

        public void swapShutdown() {
            super.shutdown();
        }

        public List<Runnable> swapShutdownNow() {
            return super.shutdownNow();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void terminated() {
            super.terminated();
            HwLog.i(ThreadPoolManager.TAG, "terminated() thread pool terminated, " + getThreadFactory().toString());
        }

        public WatchFaceThreadPoolExecutor(int i, int i2, long j) {
            this(i, i2, j, calcQueueSize(i), new HealthWrapExecutionHandler());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private WatchFaceThreadPoolExecutor(int i, int i2, long j, int i3, HealthWrapExecutionHandler healthWrapExecutionHandler) {
            int i4 = i3;
            super(i, i2, j, TimeUnit.SECONDS, new ArrayBlockingQueue(i4 < 1 ? 1 : i4), new WatchFaceThreadFactory(), healthWrapExecutionHandler);
            this.mCompletedTaskCount = new AtomicLong(0L);
            this.mCompletedTaskCostTimes = new AtomicLong(0L);
            this.mTaskMaxCostTime = new AtomicLong(0L);
            this.mLastLogPrintTime = new AtomicLong(0L);
            this.mTaskRunNum = new AtomicInteger(0);
            this.mStartTime = new ThreadLocal<>();
            this.mSwapExecutionHandler = healthWrapExecutionHandler;
            this.mSerialExecutionHandler = new WatchFaceSerialExecutionHandler(this);
            allowCoreThreadTimeOut(true);
        }
    }

    private ThreadPoolManager(int i, int i2) {
        this.mThreadPoolExecutor = new WatchFaceThreadPoolExecutor(i, i2);
    }

    public static ThreadPoolManager getInstance() {
        if (sInstance == null) {
            synchronized (ThreadPoolManager.class) {
                if (sInstance == null) {
                    sInstance = make(10, 30);
                }
            }
        }
        return sInstance;
    }

    public static ThreadPoolManager make(int i, int i2) {
        return new ThreadPoolManager(i, i2);
    }

    public void execute(Runnable runnable) {
        if (runnable instanceof WatchFaceRunnable) {
            this.mThreadPoolExecutor.execute(runnable);
        } else if (runnable != null) {
            this.mThreadPoolExecutor.execute(new WatchFaceRunnable(runnable));
        }
    }

    public boolean remove(Runnable runnable) {
        if (runnable instanceof WatchFaceRunnable) {
            return this.mThreadPoolExecutor.remove(runnable);
        }
        if (runnable != null) {
            return this.mThreadPoolExecutor.remove(new WatchFaceRunnable(runnable));
        }
        return false;
    }

    public int removeSerialTask(String str, Runnable runnable) {
        if (str != null) {
            return runnable != null ? this.mThreadPoolExecutor.remove(new WatchFaceSerialRunnable(str, runnable)) ? 1 : 0 : this.mThreadPoolExecutor.removeSerialTask(str);
        }
        throw new IllegalArgumentException("serialTag is null");
    }

    public int removeTagTask(String str, Runnable runnable) {
        if (str != null) {
            return runnable != null ? this.mThreadPoolExecutor.remove(new WatchFaceTagRunnable(str, runnable)) ? 1 : 0 : this.mThreadPoolExecutor.removeTagTask(str);
        }
        throw new IllegalArgumentException("tag is null");
    }

    public void serialExecute(String str, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("serialTag is null");
        }
        execute(new WatchFaceSerialRunnable(str, runnable));
    }

    public void shutdown() {
        if (this != getInstance()) {
            this.mThreadPoolExecutor.shutdown();
        } else {
            HwLog.w(TAG, "shutdown");
            throw new UnsupportedOperationException("Unsupported shutdown default thread pool");
        }
    }

    public List<Runnable> shutdownNow() {
        if (this == getInstance()) {
            HwLog.w(TAG, "shutdownNow");
            throw new UnsupportedOperationException("Unsupported shutdownNow default thread pool");
        }
        List<Runnable> listShutdownNow = this.mThreadPoolExecutor.shutdownNow();
        for (int i = 0; i < listShutdownNow.size(); i++) {
            Runnable runnable = listShutdownNow.get(i);
            if (runnable instanceof WatchFaceRunnable) {
                listShutdownNow.set(i, ((WatchFaceRunnable) runnable).getRunnable());
            }
        }
        return listShutdownNow;
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.mThreadPoolExecutor.submit(callable);
    }

    public void tagExecute(String str, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("tag is null");
        }
        execute(new WatchFaceTagRunnable(str, runnable));
    }

    public static ThreadPoolManager make(int i, int i2, long j) {
        return new ThreadPoolManager(i, i2, j);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.mThreadPoolExecutor.submit(runnable, t);
    }

    private ThreadPoolManager(int i, int i2, long j) {
        this.mThreadPoolExecutor = new WatchFaceThreadPoolExecutor(i, i2, j);
    }

    public Future<?> submit(Runnable runnable) {
        return this.mThreadPoolExecutor.submit(runnable);
    }

    public static class WatchFaceTagRunnable extends WatchFaceRunnable {
        private static final Runnable MATCH_RUNNABLE = new Runnable() { // from class: com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager.WatchFaceTagRunnable.1
            @Override // java.lang.Runnable
            public void run() {
            }
        };
        private final String mTag;

        public WatchFaceTagRunnable(String str, Runnable runnable) {
            super(runnable);
            if (str == null) {
                throw new IllegalArgumentException("tag == null");
            }
            this.mTag = str;
        }

        @Override // com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager.WatchFaceRunnable
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WatchFaceTagRunnable)) {
                return false;
            }
            WatchFaceTagRunnable watchFaceTagRunnable = (WatchFaceTagRunnable) obj;
            if (!this.mTag.equals(watchFaceTagRunnable.mTag)) {
                return false;
            }
            Runnable runnable = getRunnable();
            Runnable runnable2 = MATCH_RUNNABLE;
            if (runnable == runnable2 || watchFaceTagRunnable.getRunnable() == runnable2) {
                return true;
            }
            return super.equals(obj);
        }

        @Override // com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager.WatchFaceRunnable
        public int hashCode() {
            return this.mTag.hashCode() + super.hashCode();
        }

        @Override // com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager.WatchFaceRunnable
        public String toString() {
            return "tag=(" + this.mTag + "), " + super.toString();
        }

        public WatchFaceTagRunnable(String str) {
            super(MATCH_RUNNABLE);
            if (str != null) {
                this.mTag = str;
                return;
            }
            throw new IllegalArgumentException("tag == null");
        }
    }

    public static class HealthWrapExecutionHandler implements RejectedExecutionHandler {
        private volatile boolean mIsExecuteFullFlag;
        private final BlockingQueue<WatchFaceRunnable> mQueue;

        private HealthWrapExecutionHandler() {
            this.mQueue = new LinkedBlockingQueue();
            this.mIsExecuteFullFlag = true;
        }

        private WatchFaceRunnable wrapRunnable(Runnable runnable) {
            return runnable instanceof WatchFaceRunnable ? (WatchFaceRunnable) runnable : new WatchFaceRunnable(runnable);
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            this.mIsExecuteFullFlag = true;
        }

        public void wrapExecute(Runnable runnable, WatchFaceThreadPoolExecutor watchFaceThreadPoolExecutor) {
            if ((runnable == null && this.mQueue.isEmpty()) || watchFaceThreadPoolExecutor.isShutdown()) {
                return;
            }
            if (runnable != null && !this.mQueue.offer(wrapRunnable(runnable))) {
                HwLog.w(ThreadPoolManager.TAG, "task rejected:" + runnable.toString());
            }
            if (this.mIsExecuteFullFlag) {
                wrapExecute(watchFaceThreadPoolExecutor);
            }
        }

        public int wrapQueueSize(WatchFaceThreadPoolExecutor watchFaceThreadPoolExecutor) {
            int size;
            int size2;
            synchronized (this) {
                size = watchFaceThreadPoolExecutor.getQueue().size();
                size2 = this.mQueue.size();
            }
            return size + size2;
        }

        public boolean wrapRemove(Runnable runnable, WatchFaceThreadPoolExecutor watchFaceThreadPoolExecutor) {
            boolean z;
            synchronized (this) {
                WatchFaceRunnable watchFaceRunnableWrapRunnable = wrapRunnable(runnable);
                z = watchFaceThreadPoolExecutor.swapRemove(watchFaceRunnableWrapRunnable) || this.mQueue.remove(watchFaceRunnableWrapRunnable);
            }
            return z;
        }

        public int wrapRemoveTagTask(String str, WatchFaceThreadPoolExecutor watchFaceThreadPoolExecutor) {
            int i;
            synchronized (this) {
                WatchFaceTagRunnable watchFaceTagRunnable = new WatchFaceTagRunnable(str);
                BlockingQueue<Runnable> queue = watchFaceThreadPoolExecutor.getQueue();
                i = 0;
                while (queue.remove(watchFaceTagRunnable)) {
                    i++;
                }
                while (this.mQueue.remove(watchFaceTagRunnable)) {
                    i++;
                }
            }
            return i;
        }

        public void wrapShutdown(WatchFaceThreadPoolExecutor watchFaceThreadPoolExecutor) {
            synchronized (this) {
                watchFaceThreadPoolExecutor.swapShutdown();
                this.mQueue.clear();
            }
        }

        public List<Runnable> wrapShutdownNow(WatchFaceThreadPoolExecutor watchFaceThreadPoolExecutor) {
            List<Runnable> listSwapShutdownNow;
            synchronized (this) {
                listSwapShutdownNow = watchFaceThreadPoolExecutor.swapShutdownNow();
                listSwapShutdownNow.addAll(this.mQueue);
                this.mQueue.clear();
            }
            return listSwapShutdownNow;
        }

        private void wrapExecute(WatchFaceThreadPoolExecutor watchFaceThreadPoolExecutor) {
            synchronized (this) {
                try {
                    this.mIsExecuteFullFlag = false;
                    WatchFaceRunnable watchFaceRunnablePeek = this.mQueue.peek();
                    while (watchFaceRunnablePeek != null) {
                        watchFaceThreadPoolExecutor.swapExecute(watchFaceRunnablePeek);
                        if (this.mIsExecuteFullFlag) {
                            break;
                        }
                        this.mQueue.poll();
                        watchFaceRunnablePeek = this.mQueue.peek();
                    }
                    this.mIsExecuteFullFlag = true;
                } catch (Throwable th) {
                    this.mIsExecuteFullFlag = true;
                    throw th;
                }
            }
        }
    }

    public static final class WatchFaceSerialExecutionHandler {
        private final WatchFaceThreadPoolExecutor mExecutor;
        private final HashMap<String, WatchFaceSerialRunnable> mSerialTaskMap = new HashMap<>();
        private final AtomicInteger mWaitRunSerialTaskNum = new AtomicInteger(0);
        private final ThreadLocal<Boolean> mIsInSerialExecute = new ThreadLocal<>();

        public WatchFaceSerialExecutionHandler(WatchFaceThreadPoolExecutor watchFaceThreadPoolExecutor) {
            this.mExecutor = watchFaceThreadPoolExecutor;
        }

        private WatchFaceSerialRunnable getNextSerialTask(String str) {
            WatchFaceSerialRunnable watchFaceSerialRunnableRemove = this.mSerialTaskMap.remove(str);
            if (watchFaceSerialRunnableRemove == null) {
                return null;
            }
            WatchFaceSerialRunnable watchFaceSerialRunnable = watchFaceSerialRunnableRemove.mNextTask;
            if (watchFaceSerialRunnable != null) {
                this.mSerialTaskMap.put(watchFaceSerialRunnable.mSerialTag, watchFaceSerialRunnable);
                this.mWaitRunSerialTaskNum.getAndDecrement();
            }
            return watchFaceSerialRunnable;
        }

        private WatchFaceSerialRunnable getNextSerialTaskSafe(String str) {
            WatchFaceSerialRunnable nextSerialTask;
            synchronized (this.mSerialTaskMap) {
                nextSerialTask = getNextSerialTask(str);
            }
            return nextSerialTask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAllSerialTask(List<Runnable> list) {
            synchronized (this.mSerialTaskMap) {
                if (this.mSerialTaskMap.isEmpty()) {
                    return;
                }
                for (String str : (String[]) this.mSerialTaskMap.keySet().toArray(new String[this.mSerialTaskMap.size()])) {
                    WatchFaceSerialRunnable nextSerialTask = getNextSerialTask(str);
                    while (nextSerialTask != null) {
                        if (list != null) {
                            list.add(nextSerialTask);
                        }
                        nextSerialTask = getNextSerialTask(str);
                    }
                }
            }
        }

        private void runSerialTask(Thread thread, Runnable runnable) {
            this.mExecutor.beforeExecute(thread, runnable);
            try {
                runnable.run();
                this.mExecutor.afterExecute(runnable, null);
            } catch (Throwable th) {
                this.mExecutor.afterExecute(runnable, th);
            }
        }

        private void serialExecute(WatchFaceSerialRunnable watchFaceSerialRunnable) {
            WatchFaceSerialRunnable nextSerialTaskSafe = getNextSerialTaskSafe(watchFaceSerialRunnable.mSerialTag);
            while (nextSerialTaskSafe != null) {
                runSerialTask(Thread.currentThread(), nextSerialTaskSafe);
                nextSerialTaskSafe = getNextSerialTaskSafe(nextSerialTaskSafe.mSerialTag);
            }
        }

        public boolean putSerialTask(WatchFaceSerialRunnable watchFaceSerialRunnable) {
            synchronized (this.mSerialTaskMap) {
                WatchFaceSerialRunnable watchFaceSerialRunnable2 = this.mSerialTaskMap.get(watchFaceSerialRunnable.mSerialTag);
                if (watchFaceSerialRunnable2 == null) {
                    this.mSerialTaskMap.put(watchFaceSerialRunnable.mSerialTag, watchFaceSerialRunnable);
                    return false;
                }
                while (true) {
                    WatchFaceSerialRunnable watchFaceSerialRunnable3 = watchFaceSerialRunnable2.mNextTask;
                    if (watchFaceSerialRunnable3 == null) {
                        watchFaceSerialRunnable2.mNextTask = watchFaceSerialRunnable;
                        this.mWaitRunSerialTaskNum.getAndIncrement();
                        return true;
                    }
                    watchFaceSerialRunnable2 = watchFaceSerialRunnable3;
                }
            }
        }

        public boolean removeSerialTask(WatchFaceSerialRunnable watchFaceSerialRunnable, HealthWrapExecutionHandler healthWrapExecutionHandler) {
            WatchFaceSerialRunnable nextSerialTask;
            synchronized (this.mSerialTaskMap) {
                boolean zWrapRemove = healthWrapExecutionHandler.wrapRemove(watchFaceSerialRunnable, this.mExecutor);
                WatchFaceSerialRunnable watchFaceSerialRunnable2 = this.mSerialTaskMap.get(watchFaceSerialRunnable.mSerialTag);
                if (watchFaceSerialRunnable2 == null) {
                    return zWrapRemove;
                }
                if (zWrapRemove) {
                    if (watchFaceSerialRunnable2.equals(watchFaceSerialRunnable) && (nextSerialTask = getNextSerialTask(watchFaceSerialRunnable2.mSerialTag)) != null) {
                        healthWrapExecutionHandler.wrapExecute(nextSerialTask, this.mExecutor);
                    }
                    return true;
                }
                while (true) {
                    WatchFaceSerialRunnable watchFaceSerialRunnable3 = watchFaceSerialRunnable2.mNextTask;
                    if (watchFaceSerialRunnable3 == null) {
                        return false;
                    }
                    if (watchFaceSerialRunnable3.equals(watchFaceSerialRunnable)) {
                        watchFaceSerialRunnable2.mNextTask = watchFaceSerialRunnable2.mNextTask.mNextTask;
                        this.mWaitRunSerialTaskNum.getAndDecrement();
                        return true;
                    }
                    watchFaceSerialRunnable2 = watchFaceSerialRunnable2.mNextTask;
                }
            }
        }

        public int serialQueueSize() {
            return this.mWaitRunSerialTaskNum.intValue();
        }

        public void trySerialExecute(Runnable runnable, Throwable th, HealthWrapExecutionHandler healthWrapExecutionHandler) {
            if (runnable instanceof WatchFaceSerialRunnable) {
                if (th != null) {
                    WatchFaceSerialRunnable nextSerialTaskSafe = getNextSerialTaskSafe(((WatchFaceSerialRunnable) runnable).mSerialTag);
                    if (nextSerialTaskSafe != null) {
                        healthWrapExecutionHandler.wrapExecute(nextSerialTaskSafe, this.mExecutor);
                        return;
                    }
                    return;
                }
                Boolean bool = this.mIsInSerialExecute.get();
                if (bool == null || !bool.booleanValue()) {
                    this.mIsInSerialExecute.set(Boolean.TRUE);
                    try {
                        serialExecute((WatchFaceSerialRunnable) runnable);
                    } finally {
                        this.mIsInSerialExecute.set(Boolean.FALSE);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int removeSerialTask(String str, HealthWrapExecutionHandler healthWrapExecutionHandler) {
            int i;
            synchronized (this.mSerialTaskMap) {
                WatchFaceSerialRunnable watchFaceSerialRunnable = this.mSerialTaskMap.get(str);
                if (watchFaceSerialRunnable == null) {
                    return 0;
                }
                boolean zWrapRemove = healthWrapExecutionHandler.wrapRemove(watchFaceSerialRunnable, this.mExecutor);
                WatchFaceSerialRunnable nextSerialTask = getNextSerialTask(str);
                while (nextSerialTask != null) {
                    i = zWrapRemove;
                    nextSerialTask = getNextSerialTask(str);
                    i++;
                }
                i = zWrapRemove;
                return i;
            }
        }
    }

    public static class WatchFaceSerialRunnable extends WatchFaceRunnable {
        private WatchFaceSerialRunnable mNextTask;
        private final String mSerialTag;

        public WatchFaceSerialRunnable(String str, Runnable runnable) {
            super(runnable);
            if (str == null) {
                throw new IllegalArgumentException("serialTag == null");
            }
            this.mSerialTag = str;
        }

        @Override // com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager.WatchFaceRunnable
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof WatchFaceSerialRunnable) && this.mSerialTag.equals(((WatchFaceSerialRunnable) obj).mSerialTag)) {
                return super.equals(obj);
            }
            return false;
        }

        @Override // com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager.WatchFaceRunnable
        public int hashCode() {
            return this.mSerialTag.hashCode() + super.hashCode();
        }

        @Override // com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager.WatchFaceRunnable
        public String toString() {
            return "serialTag=(" + this.mSerialTag + "), " + super.toString();
        }
    }
}
