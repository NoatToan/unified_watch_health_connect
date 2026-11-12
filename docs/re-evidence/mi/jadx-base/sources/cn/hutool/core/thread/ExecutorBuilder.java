package cn.hutool.core.thread;

import cn.hutool.core.builder.Builder;
import defpackage.en9;
import defpackage.g4h;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorBuilder implements Builder<ThreadPoolExecutor> {
    public static final int DEFAULT_QUEUE_CAPACITY = 1024;
    private static final long serialVersionUID = 1;
    private Boolean allowCoreThreadTimeOut;
    private int corePoolSize;
    private RejectedExecutionHandler handler;
    private ThreadFactory threadFactory;
    private BlockingQueue<Runnable> workQueue;
    private int maxPoolSize = Integer.MAX_VALUE;
    private long keepAliveTime = TimeUnit.SECONDS.toNanos(60);

    public static ExecutorBuilder create() {
        return new ExecutorBuilder();
    }

    public ExecutorService buildFinalizable() {
        return new en9(build());
    }

    public ExecutorBuilder setAllowCoreThreadTimeOut(boolean z) {
        this.allowCoreThreadTimeOut = Boolean.valueOf(z);
        return this;
    }

    public ExecutorBuilder setCorePoolSize(int i) {
        this.corePoolSize = i;
        return this;
    }

    public ExecutorBuilder setHandler(RejectedExecutionHandler rejectedExecutionHandler) {
        this.handler = rejectedExecutionHandler;
        return this;
    }

    public ExecutorBuilder setKeepAliveTime(long j, TimeUnit timeUnit) {
        return setKeepAliveTime(timeUnit.toNanos(j));
    }

    public ExecutorBuilder setMaxPoolSize(int i) {
        this.maxPoolSize = i;
        return this;
    }

    public ExecutorBuilder setThreadFactory(ThreadFactory threadFactory) {
        this.threadFactory = threadFactory;
        return this;
    }

    public ExecutorBuilder setWorkQueue(BlockingQueue<Runnable> blockingQueue) {
        this.workQueue = blockingQueue;
        return this;
    }

    public ExecutorBuilder useArrayBlockingQueue(int i) {
        return setWorkQueue(new ArrayBlockingQueue(i));
    }

    public ExecutorBuilder useSynchronousQueue() {
        return useSynchronousQueue(false);
    }

    @Override // cn.hutool.core.builder.Builder
    public ThreadPoolExecutor build() {
        return build(this);
    }

    public ExecutorBuilder setKeepAliveTime(long j) {
        this.keepAliveTime = j;
        return this;
    }

    public ExecutorBuilder useSynchronousQueue(boolean z) {
        return setWorkQueue(new SynchronousQueue(z));
    }

    private static ThreadPoolExecutor build(ExecutorBuilder executorBuilder) {
        int i = executorBuilder.corePoolSize;
        int i2 = executorBuilder.maxPoolSize;
        long j = executorBuilder.keepAliveTime;
        BlockingQueue synchronousQueue = executorBuilder.workQueue;
        if (synchronousQueue == null) {
            synchronousQueue = i <= 0 ? new SynchronousQueue() : new LinkedBlockingQueue(1024);
        }
        BlockingQueue blockingQueue = synchronousQueue;
        ThreadFactory threadFactoryDefaultThreadFactory = executorBuilder.threadFactory;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, j, TimeUnit.NANOSECONDS, blockingQueue, threadFactoryDefaultThreadFactory, (RejectedExecutionHandler) g4h.e(executorBuilder.handler, new ThreadPoolExecutor.AbortPolicy()));
        Boolean bool = executorBuilder.allowCoreThreadTimeOut;
        if (bool != null) {
            threadPoolExecutor.allowCoreThreadTimeOut(bool.booleanValue());
        }
        return threadPoolExecutor;
    }
}
