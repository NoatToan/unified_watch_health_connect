package rx.internal.schedulers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.Scheduler;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.internal.util.PlatformDependent;
import rx.internal.util.RxThreadFactory;
import rx.internal.util.SubscriptionList;
import rx.internal.util.SuppressAnimalSniffer;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public class NewThreadWorker extends Scheduler.Worker implements Subscription {
    private static final String d = "rx.scheduler.jdk6.purge-force";
    private static final String e = "RxSchedulerPurge-";
    private static final boolean f;
    private static volatile Object i;
    private final ScheduledExecutorService a;
    public volatile boolean b;
    private static final Object j = new Object();
    private static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> g = new ConcurrentHashMap<>();
    private static final AtomicReference<ScheduledExecutorService> h = new AtomicReference<>();
    private static final String c = "rx.scheduler.jdk6.purge-frequency-millis";
    public static final int PURGE_FREQUENCY = Integer.getInteger(c, 1000).intValue();

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            NewThreadWorker.b();
        }
    }

    static {
        boolean z = Boolean.getBoolean(d);
        int androidApiVersion = PlatformDependent.getAndroidApiVersion();
        f = !z && (androidApiVersion == 0 || androidApiVersion >= 21);
    }

    public NewThreadWorker(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!tryEnableCancelPolicy(scheduledExecutorServiceNewScheduledThreadPool) && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            registerExecutor((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static Method a(ScheduledExecutorService scheduledExecutorService) {
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

    @SuppressAnimalSniffer
    public static void b() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it2 = g.keySet().iterator();
            while (it2.hasNext()) {
                ScheduledThreadPoolExecutor next = it2.next();
                if (next.isShutdown()) {
                    it2.remove();
                } else {
                    next.purge();
                }
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            RxJavaHooks.onError(th);
        }
    }

    public static void deregisterExecutor(ScheduledExecutorService scheduledExecutorService) {
        g.remove(scheduledExecutorService);
    }

    public static void registerExecutor(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = h;
            if (atomicReference.get() != null) {
                break;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory(e));
            if (atomicReference.compareAndSet(null, scheduledExecutorServiceNewScheduledThreadPool)) {
                a aVar = new a();
                int i2 = PURGE_FREQUENCY;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aVar, i2, i2, TimeUnit.MILLISECONDS);
                break;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
        g.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    public static boolean tryEnableCancelPolicy(ScheduledExecutorService scheduledExecutorService) {
        Method methodA;
        if (f) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = i;
                Object obj2 = j;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    methodA = a(scheduledExecutorService);
                    if (methodA != null) {
                        obj2 = methodA;
                    }
                    i = obj2;
                } else {
                    methodA = (Method) obj;
                }
            } else {
                methodA = a(scheduledExecutorService);
            }
            if (methodA != null) {
                try {
                    methodA.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (IllegalAccessException e2) {
                    RxJavaHooks.onError(e2);
                } catch (IllegalArgumentException e3) {
                    RxJavaHooks.onError(e3);
                } catch (InvocationTargetException e4) {
                    RxJavaHooks.onError(e4);
                }
            }
        }
        return false;
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.b;
    }

    @Override // rx.Scheduler.Worker
    public Subscription schedule(Action0 action0) {
        return schedule(action0, 0L, null);
    }

    public ScheduledAction scheduleActual(Action0 action0, long j2, TimeUnit timeUnit) {
        ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0));
        scheduledAction.add(j2 <= 0 ? this.a.submit(scheduledAction) : this.a.schedule(scheduledAction, j2, timeUnit));
        return scheduledAction;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.b = true;
        this.a.shutdownNow();
        deregisterExecutor(this.a);
    }

    @Override // rx.Scheduler.Worker
    public Subscription schedule(Action0 action0, long j2, TimeUnit timeUnit) {
        return this.b ? Subscriptions.unsubscribed() : scheduleActual(action0, j2, timeUnit);
    }

    public ScheduledAction scheduleActual(Action0 action0, long j2, TimeUnit timeUnit, CompositeSubscription compositeSubscription) {
        Future<?> futureSchedule;
        ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0), compositeSubscription);
        compositeSubscription.add(scheduledAction);
        if (j2 <= 0) {
            futureSchedule = this.a.submit(scheduledAction);
        } else {
            futureSchedule = this.a.schedule(scheduledAction, j2, timeUnit);
        }
        scheduledAction.add(futureSchedule);
        return scheduledAction;
    }

    public ScheduledAction scheduleActual(Action0 action0, long j2, TimeUnit timeUnit, SubscriptionList subscriptionList) {
        Future<?> futureSchedule;
        ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0), subscriptionList);
        subscriptionList.add(scheduledAction);
        if (j2 <= 0) {
            futureSchedule = this.a.submit(scheduledAction);
        } else {
            futureSchedule = this.a.schedule(scheduledAction, j2, timeUnit);
        }
        scheduledAction.add(futureSchedule);
        return scheduledAction;
    }
}
