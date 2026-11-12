package com.facebook.bolts;

import android.os.Handler;
import android.os.Looper;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.tekartik.sqflite.Constant;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0002\b\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/facebook/bolts/AndroidExecutors;", "", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "uiThread", "<init>", "()V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidExecutors {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final AndroidExecutors b = new AndroidExecutors();
    private static final int c;
    private static final int d;
    private static final int e;
    private static final long f = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Executor uiThread = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/facebook/bolts/AndroidExecutors$Companion;", "", "Ljava/util/concurrent/ExecutorService;", "newCachedThreadPool", "Ljava/util/concurrent/Executor;", "uiThread", "", "CORE_POOL_SIZE", LogUtil.I, "CPU_COUNT", "Lcom/facebook/bolts/AndroidExecutors;", "INSTANCE", "Lcom/facebook/bolts/AndroidExecutors;", "", "KEEP_ALIVE_TIME", "J", "MAX_POOL_SIZE", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final ExecutorService newCachedThreadPool() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(AndroidExecutors.d, AndroidExecutors.e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }

        @JvmStatic
        @NotNull
        public final Executor uiThread() {
            return AndroidExecutors.b.uiThread;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/facebook/bolts/AndroidExecutors$a", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "", Constant.METHOD_EXECUTE, "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable command) {
            new Handler(Looper.getMainLooper()).post(command);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        c = iAvailableProcessors;
        d = iAvailableProcessors + 1;
        e = (iAvailableProcessors * 2) + 1;
    }

    private AndroidExecutors() {
    }

    @JvmStatic
    @NotNull
    public static final ExecutorService newCachedThreadPool() {
        return INSTANCE.newCachedThreadPool();
    }

    @JvmStatic
    @NotNull
    public static final Executor uiThread() {
        return INSTANCE.uiThread();
    }
}
