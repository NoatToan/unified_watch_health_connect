package fa;

import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.c f70018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f70019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<T> f70020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T>> f70021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque<Runnable> f70022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque<Runnable> f70023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f70024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f70025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f70026i;

    public interface a<T> {
        void invoke(T t7);
    }

    public interface b<T> {
        void c(T t7, androidx.media3.common.o oVar);
    }

    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f70027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.media3.common.o.b f70028b = new androidx.media3.common.o.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f70029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f70030d;

        public c(T t7) {
            this.f70027a = t7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f70027a.equals(((c) obj).f70027a);
        }

        public final int hashCode() {
            return this.f70027a.hashCode();
        }
    }

    private j(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, fa.c cVar, b<T> bVar, boolean z14) {
        this.f70018a = cVar;
        this.f70021d = copyOnWriteArraySet;
        this.f70020c = bVar;
        this.f70024g = new Object();
        this.f70022e = new ArrayDeque<>();
        this.f70023f = new ArrayDeque<>();
        this.f70019b = cVar.createHandler(looper, new com.google.android.exoplayer2.util.a(this, 1));
        this.f70026i = z14;
    }

    public final void a(T t7) {
        t7.getClass();
        synchronized (this.f70024g) {
            try {
                if (this.f70025h) {
                    return;
                }
                this.f70021d.add(new c<>(t7));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final j b(Looper looper, hc0.c cVar) {
        return new j(this.f70021d, looper, this.f70018a, cVar, this.f70026i);
    }

    public final void c() {
        g();
        ArrayDeque<Runnable> arrayDeque = this.f70023f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        i iVar = this.f70019b;
        if (!iVar.c()) {
            iVar.d(iVar.obtainMessage(1));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.f70022e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                arrayDeque2.peekFirst().run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void d(int i14, a<T> aVar) {
        g();
        this.f70023f.add(new androidx.camera.camera2.internal.compat.j(new CopyOnWriteArraySet(this.f70021d), i14, aVar, 8));
    }

    public final void e() {
        g();
        synchronized (this.f70024g) {
            this.f70025h = true;
        }
        for (c<T> cVar : this.f70021d) {
            b<T> bVar = this.f70020c;
            cVar.f70030d = true;
            if (cVar.f70029c) {
                cVar.f70029c = false;
                bVar.c(cVar.f70027a, cVar.f70028b.b());
            }
        }
        this.f70021d.clear();
    }

    public final void f(int i14, a<T> aVar) {
        d(i14, aVar);
        c();
    }

    public final void g() {
        if (this.f70026i) {
            fa.a.d(Thread.currentThread() == this.f70019b.getLooper().getThread());
        }
    }

    public j(Looper looper, fa.c cVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, cVar, bVar, true);
    }
}
