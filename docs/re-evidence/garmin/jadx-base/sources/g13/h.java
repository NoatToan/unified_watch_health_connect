package g13;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, s03.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f74983b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f74984c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f74985d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f74986e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f74987a;

    public h(Runnable runnable, v03.b bVar) {
        super(3);
        this.f74987a = runnable;
        lazySet(0, bVar);
    }

    public final void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f74986e) {
                return;
            }
            if (obj == f74984c) {
                future.cancel(false);
                return;
            } else if (obj == f74985d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // s03.b
    public final boolean b() {
        Object obj = get(0);
        return obj == f74983b || obj == f74986e;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // s03.b
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f74986e;
            if (obj6 == obj || obj6 == (obj4 = f74984c) || obj6 == (obj5 = f74985d)) {
                break;
            }
            boolean z14 = get(2) != Thread.currentThread();
            if (z14) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z14);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f74983b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((v03.b) obj2).d(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2 = f74985d;
        Object obj3 = f74984c;
        Object obj4 = f74983b;
        Object obj5 = f74986e;
        lazySet(2, Thread.currentThread());
        try {
            this.f74987a.run();
        } catch (Throwable th3) {
            try {
                k13.a.b(th3);
            } finally {
                lazySet(2, null);
                Object obj6 = get(0);
                if (obj6 != obj4 && compareAndSet(0, obj6, obj5) && obj6 != null) {
                    ((v03.b) obj6).d(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj3 || obj == obj2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj5));
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj4 && compareAndSet(0, obj7, obj5) && obj7 != null) {
            ((v03.b) obj7).d(this);
        }
        while (r2 != obj3 && r2 != obj2 && !compareAndSet(1, get(i), obj5)) {
        }
    }
}
