package defpackage;

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
import rx.internal.schedulers.ScheduledAction;
import rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public class mlg extends ifl.a implements koo {
    public static final boolean c;
    public static volatile Object g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f26980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f26981b;
    public static final Object h = new Object();
    public static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> e = new ConcurrentHashMap<>();
    public static final AtomicReference<ScheduledExecutorService> f = new AtomicReference<>();
    public static final int d = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            mlg.d();
        }
    }

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int iA = j0i.a();
        c = !z && (iA == 0 || iA >= 21);
    }

    public mlg(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!i(scheduledExecutorServiceNewScheduledThreadPool) && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            e((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f26980a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static void b(ScheduledExecutorService scheduledExecutorService) {
        e.remove(scheduledExecutorService);
    }

    public static Method c(ScheduledExecutorService scheduledExecutorService) {
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

    public static void d() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = e.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (next.isShutdown()) {
                    it.remove();
                } else {
                    next.purge();
                }
            }
        } catch (Throwable th) {
            pf8.d(th);
            p5l.f(th);
        }
    }

    public static void e(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f;
            if (atomicReference.get() != null) {
                break;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge-"));
            if (d8i.a(atomicReference, null, scheduledExecutorServiceNewScheduledThreadPool)) {
                a aVar = new a();
                int i = d;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aVar, i, i, TimeUnit.MILLISECONDS);
                break;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
        e.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    public static boolean i(ScheduledExecutorService scheduledExecutorService) {
        Method methodC;
        if (c) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = g;
                Object obj2 = h;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    methodC = c(scheduledExecutorService);
                    if (methodC != null) {
                        obj2 = methodC;
                    }
                    g = obj2;
                } else {
                    methodC = (Method) obj;
                }
            } else {
                methodC = c(scheduledExecutorService);
            }
            if (methodC != null) {
                try {
                    methodC.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (IllegalAccessException e2) {
                    p5l.f(e2);
                } catch (IllegalArgumentException e3) {
                    p5l.f(e3);
                } catch (InvocationTargetException e4) {
                    p5l.f(e4);
                }
            }
        }
        return false;
    }

    @Override // ifl.a
    public koo a(sc0 sc0Var) {
        return f(sc0Var, 0L, null);
    }

    public koo f(sc0 sc0Var, long j, TimeUnit timeUnit) {
        return this.f26981b ? noo.b() : g(sc0Var, j, timeUnit);
    }

    public ScheduledAction g(sc0 sc0Var, long j, TimeUnit timeUnit) {
        ScheduledAction scheduledAction = new ScheduledAction(p5l.l(sc0Var));
        scheduledAction.add(j <= 0 ? this.f26980a.submit(scheduledAction) : this.f26980a.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    public ScheduledAction h(sc0 sc0Var, long j, TimeUnit timeUnit, moo mooVar) {
        ScheduledAction scheduledAction = new ScheduledAction(p5l.l(sc0Var), mooVar);
        mooVar.a(scheduledAction);
        scheduledAction.add(j <= 0 ? this.f26980a.submit(scheduledAction) : this.f26980a.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    @Override // defpackage.koo
    public boolean isUnsubscribed() {
        return this.f26981b;
    }

    @Override // defpackage.koo
    public void unsubscribe() {
        this.f26981b = true;
        this.f26980a.shutdownNow();
        b(this.f26980a);
    }
}
