package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CommonPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b6\u0010\u001aJ&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0082\b¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J#\u0010\u0012\u001a\u00020\u000f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0004\u001a\u00060\u0015j\u0002`\u0016H\u0016J\u000f\u0010\u001b\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0017H\u0000¢\u0006\u0004\b!\u0010\u001aJ\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u0017H\u0016R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u001b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020)8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u0010\u000e\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lkotlinx/coroutines/CommonPool;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, GoogleApiAvailabilityLight.a, "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutorService;", "g", "e", "Ljava/util/concurrent/Executor;", "h", "Ljava/lang/Class;", "fjpClass", "executor", "", "isGoodCommonPool$kotlinx_coroutines_core", "(Ljava/lang/Class;Ljava/util/concurrent/ExecutorService;)Z", "isGoodCommonPool", "Lkotlin/coroutines/CoroutineContext;", DbUtils.Const.Table.CONTEXT, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "dispatch", "usePrivatePool$kotlinx_coroutines_core", "()V", "usePrivatePool", "", "timeout", "shutdown$kotlinx_coroutines_core", "(J)V", "shutdown", "restore$kotlinx_coroutines_core", "restore", "", "toString", "close", "a", "Ljava/lang/String;", "DEFAULT_PARALLELISM_PROPERTY_NAME", "", "b", LogUtil.I, "requestedParallelism", "c", "Z", "pool", "Ljava/util/concurrent/Executor;", "i", "()I", "parallelism", "getExecutor", "()Ljava/util/concurrent/Executor;", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class CommonPool extends ExecutorCoroutineDispatcher {

    @NotNull
    public static final CommonPool INSTANCE = new CommonPool();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String DEFAULT_PARALLELISM_PROPERTY_NAME = "kotlinx.coroutines.default.parallelism";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int requestedParallelism;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static boolean usePrivatePool;

    @Nullable
    private static volatile Executor pool;

    static {
        String property;
        int iIntValue;
        try {
            property = System.getProperty(DEFAULT_PARALLELISM_PROPERTY_NAME);
        } catch (Throwable unused) {
            property = null;
        }
        if (property == null) {
            iIntValue = -1;
        } else {
            Integer intOrNull = kotlin.text.l.toIntOrNull(property);
            if (intOrNull == null || intOrNull.intValue() < 1) {
                throw new IllegalStateException(Intrinsics.stringPlus("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", property).toString());
            }
            iIntValue = intOrNull.intValue();
        }
        requestedParallelism = iIntValue;
    }

    private CommonPool() {
    }

    private final <T> T d(Function0<? extends T> block) {
        try {
            return block.invoke();
        } catch (Throwable unused) {
            return null;
        }
    }

    private final ExecutorService e() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        return Executors.newFixedThreadPool(i(), new ThreadFactory() { // from class: hx0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return CommonPool.f(atomicInteger, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread f(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, Intrinsics.stringPlus("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    private final ExecutorService g() {
        Class<?> cls;
        ExecutorService executorService;
        if (System.getSecurityManager() != null) {
            return e();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return e();
        }
        if (!usePrivatePool && requestedParallelism < 0) {
            try {
                Object objInvoke = cls.getMethod("commonPool", new Class[0]).invoke(null, new Object[0]);
                executorService = objInvoke instanceof ExecutorService ? (ExecutorService) objInvoke : null;
            } catch (Throwable unused2) {
            }
            if (executorService != null) {
                if (!INSTANCE.isGoodCommonPool$kotlinx_coroutines_core(cls, executorService)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(INSTANCE.i()));
            if (objNewInstance instanceof ExecutorService) {
                executorService2 = (ExecutorService) objNewInstance;
            }
        } catch (Throwable unused3) {
        }
        return executorService2 == null ? e() : executorService2;
    }

    private final synchronized Executor h() {
        Executor executorG;
        executorG = pool;
        if (executorG == null) {
            executorG = g();
            pool = executorG;
        }
        return executorG;
    }

    private final int i() {
        Integer numValueOf = Integer.valueOf(requestedParallelism);
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        return numValueOf == null ? kotlin.ranges.e.coerceAtLeast(Runtime.getRuntime().availableProcessors() - 1, 1) : numValueOf.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Runnable runnable) {
        throw new RejectedExecutionException("CommonPool was shutdown");
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        try {
            Executor executorH = pool;
            if (executorH == null) {
                executorH = h();
            }
            AbstractTimeSource timeSource = AbstractTimeSourceKt.getTimeSource();
            executorH.execute(timeSource == null ? block : timeSource.wrapTask(block));
        } catch (RejectedExecutionException unused) {
            AbstractTimeSource timeSource2 = AbstractTimeSourceKt.getTimeSource();
            if (timeSource2 != null) {
                timeSource2.unTrackTask();
            }
            DefaultExecutor.INSTANCE.enqueue(block);
        }
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor getExecutor() {
        Executor executor = pool;
        return executor == null ? h() : executor;
    }

    public final boolean isGoodCommonPool$kotlinx_coroutines_core(@NotNull Class<?> fjpClass, @NotNull ExecutorService executor) {
        executor.submit(new Runnable() { // from class: fx0
            @Override // java.lang.Runnable
            public final void run() {
                CommonPool.j();
            }
        });
        Integer num = null;
        try {
            Object objInvoke = fjpClass.getMethod("getPoolSize", new Class[0]).invoke(executor, new Object[0]);
            if (objInvoke instanceof Integer) {
                num = (Integer) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }

    public final synchronized void restore$kotlinx_coroutines_core() {
        shutdown$kotlinx_coroutines_core(0L);
        usePrivatePool = false;
        pool = null;
    }

    public final synchronized void shutdown$kotlinx_coroutines_core(long timeout) {
        Executor executor = pool;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
            if (timeout > 0) {
                executorService.awaitTermination(timeout, TimeUnit.MILLISECONDS);
            }
            Iterator<T> it2 = executorService.shutdownNow().iterator();
            while (it2.hasNext()) {
                DefaultExecutor.INSTANCE.enqueue((Runnable) it2.next());
            }
        }
        pool = new Executor() { // from class: gx0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                CommonPool.k(runnable);
            }
        };
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return "CommonPool";
    }

    public final synchronized void usePrivatePool$kotlinx_coroutines_core() {
        shutdown$kotlinx_coroutines_core(0L);
        usePrivatePool = true;
        pool = null;
    }
}
