package androidx.camera.core.impl;

import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class p2<T> implements z1<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<Object> f5685b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5684a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5686c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5687d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f5688e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet<b<T>> f5689f = new CopyOnWriteArraySet<>();

    @AutoValue
    public static abstract class a {
        public abstract Throwable a();
    }

    public static final class b<T> implements Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f5690h = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f5691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z1.a<? super T> f5692b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference<Object> f5694d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f5693c = new AtomicBoolean(true);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f5695e = f5690h;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5696f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f5697g = false;

        public b(AtomicReference<Object> atomicReference, Executor executor, z1.a<? super T> aVar) {
            this.f5694d = atomicReference;
            this.f5691a = executor;
            this.f5692b = aVar;
        }

        public final void a(int i14) {
            synchronized (this) {
                try {
                    if (this.f5693c.get()) {
                        if (i14 <= this.f5696f) {
                            return;
                        }
                        this.f5696f = i14;
                        if (this.f5697g) {
                            return;
                        }
                        this.f5697g = true;
                        try {
                            this.f5691a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f5697g = false;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                try {
                    if (!this.f5693c.get()) {
                        this.f5697g = false;
                        return;
                    }
                    Object obj = this.f5694d.get();
                    int i14 = this.f5696f;
                    while (true) {
                        if (!Objects.equals(this.f5695e, obj)) {
                            this.f5695e = obj;
                            boolean z14 = obj instanceof a;
                            z1.a<? super T> aVar = this.f5692b;
                            if (z14) {
                                aVar.onError(((a) obj).a());
                            } else {
                                aVar.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i14 == this.f5696f || !this.f5693c.get()) {
                                    break;
                                    break;
                                } else {
                                    obj = this.f5694d.get();
                                    i14 = this.f5696f;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    this.f5697g = false;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public p2(Object obj, boolean z14) {
        if (!z14) {
            this.f5685b = new AtomicReference<>(obj);
        } else {
            k7.h.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f5685b = new AtomicReference<>(new p((Throwable) obj));
        }
    }

    public final void a(z1.a<? super T> aVar) {
        b bVar = (b) this.f5688e.remove(aVar);
        if (bVar != null) {
            bVar.f5693c.set(false);
            this.f5689f.remove(bVar);
        }
    }

    @Override // androidx.camera.core.impl.z1
    public final ListenableFuture<T> b() {
        Object obj = this.f5685b.get();
        if (!(obj instanceof a)) {
            return l0.j.e(obj);
        }
        Throwable thA = ((a) obj).a();
        l0.j.a aVar = l0.j.f107810a;
        return new l0.m.a(thA);
    }

    @Override // androidx.camera.core.impl.z1
    public final void c(z1.a<? super T> aVar) {
        synchronized (this.f5684a) {
            a(aVar);
        }
    }

    @Override // androidx.camera.core.impl.z1
    public final void d(Executor executor, z1.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.f5684a) {
            a(aVar);
            bVar = new b<>(this.f5685b, executor, aVar);
            this.f5688e.put(aVar, bVar);
            this.f5689f.add(bVar);
        }
        bVar.a(0);
    }

    public final void f(Object obj) {
        Iterator<b<T>> it;
        int i14;
        synchronized (this.f5684a) {
            try {
                if (Objects.equals(this.f5685b.getAndSet(obj), obj)) {
                    return;
                }
                int i15 = this.f5686c + 1;
                this.f5686c = i15;
                if (this.f5687d) {
                    return;
                }
                this.f5687d = true;
                Iterator<b<T>> it3 = this.f5689f.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        it3.next().a(i15);
                    } else {
                        synchronized (this.f5684a) {
                            try {
                                if (this.f5686c == i15) {
                                    this.f5687d = false;
                                    return;
                                } else {
                                    it = this.f5689f.iterator();
                                    i14 = this.f5686c;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        it3 = it;
                        i15 = i14;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
