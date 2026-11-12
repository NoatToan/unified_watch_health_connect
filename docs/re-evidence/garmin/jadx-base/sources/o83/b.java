package o83;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class b<T> extends x83.b<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f130863d = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T> f130864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f130865c;

    public static class a implements j83.f {
        @Override // j83.f
        public final void a() {
        }

        @Override // j83.f
        public final void c(Object obj) {
        }

        @Override // j83.f
        public final void onError(Throwable th3) {
        }
    }

    /* JADX INFO: renamed from: o83.b$b, reason: collision with other inner class name */
    public static final class C2485b<T> implements j83.e.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c<T> f130866a;

        public C2485b(c<T> cVar) {
            this.f130866a = cVar;
        }

        @Override // n83.b
        public final void call(Object obj) {
            boolean z14;
            j83.n nVar = (j83.n) obj;
            if (!this.f130866a.compareAndSet(null, nVar)) {
                nVar.onError(new IllegalStateException("Only one subscriber allowed!"));
                return;
            }
            o83.c cVar = new o83.c(this);
            y83.d.a aVar = y83.d.f195249a;
            nVar.b(y83.a.a(cVar));
            synchronized (this.f130866a.f130867a) {
                try {
                    c<T> cVar2 = this.f130866a;
                    if (cVar2.f130868b) {
                        z14 = false;
                    } else {
                        z14 = true;
                        cVar2.f130868b = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (!z14) {
                return;
            }
            while (true) {
                Object objPoll = this.f130866a.f130869c.poll();
                c<T> cVar3 = this.f130866a;
                if (objPoll != null) {
                    e.a(cVar3.get(), objPoll);
                } else {
                    synchronized (cVar3.f130867a) {
                        try {
                            if (this.f130866a.f130869c.isEmpty()) {
                                this.f130866a.f130868b = false;
                                return;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
        }
    }

    public static final class c<T> extends AtomicReference<j83.f<? super T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f130868b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f130867a = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConcurrentLinkedQueue<Object> f130869c = new ConcurrentLinkedQueue<>();
    }

    private b(c<T> cVar) {
        super(new C2485b(cVar));
        this.f130864b = cVar;
    }

    public static <T> b<T> g() {
        return new b<>(new c());
    }

    @Override // j83.f
    public final void a() {
        if (this.f130865c) {
            this.f130864b.get().a();
        } else {
            h(e.f130873a);
        }
    }

    @Override // j83.f
    public final void c(T t7) {
        if (this.f130865c) {
            this.f130864b.get().c(t7);
            return;
        }
        if (t7 == null) {
            t7 = (T) e.f130874b;
        } else {
            e.a aVar = e.f130873a;
        }
        h(t7);
    }

    public final void h(Object obj) {
        synchronized (this.f130864b.f130867a) {
            try {
                this.f130864b.f130869c.add(obj);
                if (this.f130864b.get() != null) {
                    c<T> cVar = this.f130864b;
                    if (!cVar.f130868b) {
                        this.f130865c = true;
                        cVar.f130868b = true;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!this.f130865c) {
            return;
        }
        while (true) {
            Object objPoll = this.f130864b.f130869c.poll();
            if (objPoll == null) {
                return;
            } else {
                e.a(this.f130864b.get(), objPoll);
            }
        }
    }

    @Override // j83.f
    public final void onError(Throwable th3) {
        if (this.f130865c) {
            this.f130864b.get().onError(th3);
        } else {
            e.a aVar = e.f130873a;
            h(new e.c(th3));
        }
    }
}
