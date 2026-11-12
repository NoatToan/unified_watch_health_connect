package ohos.ace.adapter.capability.bridge;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes20.dex */
public class BridgeThreadExecutor {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final Object INSTANCE_LOCK;
    private static final long KEEP_ALIVE_TIME = 60000;
    private static final String LOG_TAG = "BridgeThreadExecutor";
    private static final int MAX_POOL_SIZE;
    private static final int QUEUE_CAPACITY = 256;
    private static final RejectedExecutionHandler REJECTED_HANDLER;
    private static volatile BridgeThreadExecutor instance;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final ExecutorService executor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256), new ThreadFactory() { // from class: ohos.ace.adapter.capability.bridge.BridgeThreadExecutor$$ExternalSyntheticLambda0
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return BridgeThreadExecutor.lambda$new$1(runnable);
        }
    }, REJECTED_HANDLER);

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int iMax = Math.max(1, iAvailableProcessors);
        CORE_POOL_SIZE = iMax;
        MAX_POOL_SIZE = Math.max(iMax, iAvailableProcessors * 2);
        REJECTED_HANDLER = new RejectedExecutionHandler() { // from class: ohos.ace.adapter.capability.bridge.BridgeThreadExecutor$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                BridgeThreadExecutor.lambda$static$0(runnable, threadPoolExecutor);
            }
        };
        INSTANCE_LOCK = new Object();
        instance = null;
    }

    static /* synthetic */ void lambda$static$0(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor.isShutdown()) {
            return;
        }
        runnable.run();
    }

    private BridgeThreadExecutor() {
    }

    static /* synthetic */ Thread lambda$new$1(Runnable runnable) {
        Thread thread = new Thread(runnable, "BridgeThread");
        thread.setDaemon(false);
        return thread;
    }

    public static BridgeThreadExecutor getInstance() {
        BridgeThreadExecutor bridgeThreadExecutor;
        if (instance != null) {
            return instance;
        }
        synchronized (INSTANCE_LOCK) {
            if (instance == null) {
                instance = new BridgeThreadExecutor();
            }
            bridgeThreadExecutor = instance;
        }
        return bridgeThreadExecutor;
    }

    public void execute(Runnable runnable) {
        if (runnable == null) {
            ALog.e(LOG_TAG, "Task is null, BridgeThread execute exits.");
        } else {
            this.executor.execute(runnable);
        }
    }

    public boolean isOnMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public void postToMainThreadSync(Runnable runnable) {
        if (runnable == null) {
            ALog.e(LOG_TAG, "Task is null, postToMainThreadSync exits.");
        } else if (isOnMainThread()) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }
}
