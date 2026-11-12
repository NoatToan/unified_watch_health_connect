package q83;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import q83.j.a;
import v83.s;

/* JADX INFO: loaded from: classes11.dex */
public class i extends j83.h.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f143414c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile Object f143418g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f143420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f143421b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f143419h = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f143416e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReference<ScheduledExecutorService> f143417f = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f143415d = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                Iterator<ScheduledThreadPoolExecutor> it = i.f143416e.keySet().iterator();
                while (it.hasNext()) {
                    ScheduledThreadPoolExecutor next = it.next();
                    if (next.isShutdown()) {
                        it.remove();
                    } else {
                        next.purge();
                    }
                }
            } catch (Throwable th3) {
                m83.a.b(th3);
                s.a(th3);
            }
        }
    }

    static {
        boolean z14 = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int i14 = s83.b.f157954a;
        f143414c = !z14 && (i14 == 0 || i14 >= 21);
    }

    public i(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!h(scheduledExecutorServiceNewScheduledThreadPool) && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            c((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f143420a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static Method b(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    public static void c(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        loop0: while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f143417f;
            if (atomicReference.get() != null) {
                break;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new s83.d("RxSchedulerPurge-"));
            do {
                if (atomicReference.compareAndSet(null, scheduledExecutorServiceNewScheduledThreadPool)) {
                    a aVar = new a();
                    long j8 = f143415d;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aVar, j8, j8, TimeUnit.MILLISECONDS);
                    break loop0;
                }
            } while (atomicReference.get() == null);
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
        f143416e.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    public static boolean h(ScheduledExecutorService scheduledExecutorService) {
        Method methodB;
        if (f143414c) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f143418g;
                Object obj2 = f143419h;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    methodB = b(scheduledExecutorService);
                    if (methodB != null) {
                        obj2 = methodB;
                    }
                    f143418g = obj2;
                } else {
                    methodB = (Method) obj;
                }
            } else {
                methodB = b(scheduledExecutorService);
            }
            if (methodB != null) {
                try {
                    methodB.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (IllegalAccessException e4) {
                    s.a(e4);
                } catch (IllegalArgumentException e14) {
                    s.a(e14);
                } catch (InvocationTargetException e15) {
                    s.a(e15);
                }
            }
        }
        return false;
    }

    @Override // j83.h.a
    public final j83.o a(n83.a aVar) {
        return this.f143421b ? y83.d.f195249a : g(aVar, 0L, null);
    }

    @Override // j83.o
    public final boolean e() {
        return this.f143421b;
    }

    @Override // j83.o
    public final void f() {
        this.f143421b = true;
        this.f143420a.shutdownNow();
        f143416e.remove(this.f143420a);
    }

    public final j g(n83.a aVar, long j8, TimeUnit timeUnit) {
        j jVar = new j(s.c(aVar));
        ScheduledExecutorService scheduledExecutorService = this.f143420a;
        jVar.f143422a.a(jVar.new a(j8 <= 0 ? scheduledExecutorService.submit(jVar) : scheduledExecutorService.schedule(jVar, j8, timeUnit)));
        return jVar;
    }
}
