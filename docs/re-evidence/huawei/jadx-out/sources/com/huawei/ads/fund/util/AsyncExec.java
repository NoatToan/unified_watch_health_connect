package com.huawei.ads.fund.util;

import android.os.Looper;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.ayq;
import defpackage.ayr;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AsyncExec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<IThreadType, ExecutorService> f4781a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f4782b = new d();

    public enum a implements IThreadType {
        IO,
        NETWORK,
        CALCULATION,
        SEQUENCE,
        SYNC_CALL,
        SEQUENCE_IO
    }

    public static void submitSeqIO(Runnable runnable) {
        submit(runnable, a.SEQUENCE_IO);
    }

    public static void submitSeq(Runnable runnable) {
        submit(runnable, a.SEQUENCE);
    }

    public static void submitNet(Runnable runnable) {
        submit(runnable, a.NETWORK);
    }

    public static void submitIO(Runnable runnable) {
        submit(runnable, a.IO);
    }

    public static void submitCalc(Runnable runnable) {
        submit(runnable, a.CALCULATION);
    }

    public static void submit(Runnable runnable, IThreadType iThreadType, boolean z) {
        if (runnable == null) {
            return;
        }
        if (z && !a()) {
            new ayr(runnable).run();
            return;
        }
        ExecutorService executor = getExecutor(iThreadType);
        if (executor != null) {
            executor.execute(new ayr(runnable));
        } else {
            HiAdLog.w("AsyncExec", "no executor for type: %s", iThreadType);
        }
    }

    public static void submit(Runnable runnable, IThreadType iThreadType) {
        submit(runnable, iThreadType, false);
    }

    public static void setExecutorFactory(d dVar) {
        f4782b = dVar;
    }

    public static ExecutorService getExecutor(IThreadType iThreadType) {
        ExecutorService executorService = f4781a.get(iThreadType);
        if (executorService != null) {
            return executorService;
        }
        d dVar = f4782b;
        if (dVar == null) {
            HiAdLog.w("AsyncExec", "no executor factory found");
            return null;
        }
        ExecutorService executorServiceB = dVar.b(iThreadType);
        a(iThreadType, executorServiceB);
        return executorServiceB;
    }

    public static void clearExecutor(IThreadType iThreadType) {
        if (iThreadType != null) {
            f4781a.remove(iThreadType);
        }
    }

    public static void clearAllExecutors() {
        f4781a.clear();
    }

    private static boolean a() {
        Looper mainLooper = Looper.getMainLooper();
        return mainLooper != null && Thread.currentThread() == mainLooper.getThread();
    }

    public static class d {
        public ExecutorService e(IThreadType iThreadType) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ExecutorService b(IThreadType iThreadType) {
            ThreadPoolExecutor threadPoolExecutor;
            HiAdLog.i("ExecutorFactory", "createExecutorService for type %s", iThreadType);
            if (iThreadType == a.IO) {
                threadPoolExecutor = new ThreadPoolExecutor(3, 5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ayq("IO"));
            } else if (iThreadType == a.NETWORK) {
                threadPoolExecutor = new ThreadPoolExecutor(3, 5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ayq("Net"));
            } else {
                if (iThreadType != a.CALCULATION) {
                    if (iThreadType == a.SEQUENCE) {
                        return new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ayq("Seq"));
                    }
                    if (iThreadType == a.SYNC_CALL) {
                        return new ThreadPoolExecutor(3, 5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ayq("SyncCall", 10));
                    }
                    return iThreadType == a.SEQUENCE_IO ? new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ayq("SeqIO")) : e(iThreadType);
                }
                threadPoolExecutor = new ThreadPoolExecutor(3, 5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ayq("Cal"));
            }
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }
    }

    private static void a(IThreadType iThreadType, ExecutorService executorService) {
        if (iThreadType == null || executorService == null) {
            return;
        }
        f4781a.put(iThreadType, executorService);
    }

    static <V> Future<V> a(Callable<V> callable, IThreadType iThreadType) {
        ExecutorService executor = getExecutor(iThreadType);
        if (executor != null) {
            return executor.submit(callable);
        }
        HiAdLog.w("AsyncExec", "no executor for type: %s", iThreadType);
        return null;
    }
}
