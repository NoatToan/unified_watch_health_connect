package defpackage;

import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes10.dex */
public class lqw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ScheduledExecutorService f40697c = Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: lqz
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return lqw.e(runnable);
        }
    });

    static /* synthetic */ Thread e(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        return thread;
    }

    public static <T> CompletableFuture<T> c(final T t, long j, TimeUnit timeUnit, CompletableFuture<T> completableFuture) {
        final CompletableFuture<T> completableFuture2 = new CompletableFuture<>();
        final ScheduledFuture scheduledFutureSchedule = f40697c.schedule(new Callable() { // from class: lqy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(completableFuture2.complete(t));
            }
        }, j, timeUnit);
        completableFuture.whenComplete((BiConsumer) new BiConsumer() { // from class: lrc
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                lqw.d(completableFuture2, scheduledFutureSchedule, obj, (Throwable) obj2);
            }
        });
        return completableFuture2;
    }

    static /* synthetic */ void d(CompletableFuture completableFuture, ScheduledFuture scheduledFuture, Object obj, Throwable th) {
        if (th != null) {
            if (!completableFuture.completeExceptionally(th)) {
                e("CompletableFutureUtils", "completeOnTimeout whenComplete", th);
            }
        } else {
            completableFuture.complete(obj);
        }
        scheduledFuture.cancel(false);
    }

    public static void e(String str, String str2, Throwable th) {
        if (LogUtil.e()) {
            ReleaseLogUtil.e("R_CFUG_" + str, str2, ", ExpMsg:", CommonUtil.n(th.getMessage()));
        } else {
            LogUtil.j("R_CFUG_" + str, "queryBacklogEvent failed, throwable:", DfxUtils.d(Thread.currentThread(), th));
        }
    }
}
