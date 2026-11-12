package rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import rx.functions.Func0;
import rx.internal.util.RxThreadFactory;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
enum a {
    ;

    public static final String THREAD_NAME_PREFIX = "RxScheduledExecutorPool-";
    public static final RxThreadFactory THREAD_FACTORY = new RxThreadFactory(THREAD_NAME_PREFIX);

    public static ScheduledExecutorService a() {
        Func0<? extends ScheduledExecutorService> onGenericScheduledExecutorService = RxJavaHooks.getOnGenericScheduledExecutorService();
        return onGenericScheduledExecutorService == null ? b() : onGenericScheduledExecutorService.call();
    }

    public static ScheduledExecutorService b() {
        return Executors.newScheduledThreadPool(1, c());
    }

    public static ThreadFactory c() {
        return THREAD_FACTORY;
    }
}
