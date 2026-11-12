package a13;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class f<T> extends a13.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u03.a f425f;

    public static final class a<T> extends h13.a<T> implements q03.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b83.b<? super T> f426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x03.g<T> f427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final u03.a f429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b83.c f430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f431f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f432g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Throwable f433h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AtomicLong f434i = new AtomicLong();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f435j;

        public a(b83.b<? super T> bVar, int i14, boolean z14, boolean z15, u03.a aVar) {
            this.f426a = bVar;
            this.f429d = aVar;
            this.f428c = z15;
            this.f427b = z14 ? new f13.b<>(i14) : new f13.a<>(i14);
        }

        public final boolean a(boolean z14, boolean z15, b83.b<? super T> bVar) {
            if (this.f431f) {
                this.f427b.clear();
                return true;
            }
            if (!z14) {
                return false;
            }
            if (this.f428c) {
                if (!z15) {
                    return false;
                }
                Throwable th3 = this.f433h;
                if (th3 != null) {
                    bVar.onError(th3);
                    return true;
                }
                bVar.onComplete();
                return true;
            }
            Throwable th4 = this.f433h;
            if (th4 != null) {
                this.f427b.clear();
                bVar.onError(th4);
                return true;
            }
            if (!z15) {
                return false;
            }
            bVar.onComplete();
            return true;
        }

        @Override // b83.c
        public final void b(long j8) {
            if (this.f435j || !h13.e.d(j8)) {
                return;
            }
            i13.c.a(this.f434i, j8);
            f();
        }

        @Override // b83.b
        public final void c(T t7) {
            if (this.f427b.offer(t7)) {
                if (this.f435j) {
                    this.f426a.c(null);
                    return;
                } else {
                    f();
                    return;
                }
            }
            this.f430e.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f429d.run();
            } catch (Throwable th3) {
                t03.a.a(th3);
                missingBackpressureException.initCause(th3);
            }
            onError(missingBackpressureException);
        }

        @Override // b83.c
        public final void cancel() {
            if (this.f431f) {
                return;
            }
            this.f431f = true;
            this.f430e.cancel();
            if (this.f435j || getAndIncrement() != 0) {
                return;
            }
            this.f427b.clear();
        }

        @Override // x03.h
        public final void clear() {
            this.f427b.clear();
        }

        @Override // b83.b
        public final void d(b83.c cVar) {
            if (h13.e.e(this.f430e, cVar)) {
                this.f430e = cVar;
                this.f426a.d(this);
                cVar.b(Long.MAX_VALUE);
            }
        }

        @Override // x03.d
        public final int e() {
            this.f435j = true;
            return 2;
        }

        public final void f() {
            if (getAndIncrement() == 0) {
                x03.g<T> gVar = this.f427b;
                b83.b<? super T> bVar = this.f426a;
                int iAddAndGet = 1;
                while (!a(this.f432g, gVar.isEmpty(), bVar)) {
                    long j8 = this.f434i.get();
                    long j14 = 0;
                    while (j14 != j8) {
                        boolean z14 = this.f432g;
                        T tPoll = gVar.poll();
                        boolean z15 = tPoll == null;
                        if (a(z14, z15, bVar)) {
                            return;
                        }
                        if (z15) {
                            break;
                        }
                        bVar.c(tPoll);
                        j14++;
                    }
                    if (j14 == j8 && a(this.f432g, gVar.isEmpty(), bVar)) {
                        return;
                    }
                    if (j14 != 0 && j8 != Long.MAX_VALUE) {
                        this.f434i.addAndGet(-j14);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // x03.h
        public final boolean isEmpty() {
            return this.f427b.isEmpty();
        }

        @Override // b83.b
        public final void onComplete() {
            this.f432g = true;
            if (this.f435j) {
                this.f426a.onComplete();
            } else {
                f();
            }
        }

        @Override // b83.b
        public final void onError(Throwable th3) {
            this.f433h = th3;
            this.f432g = true;
            if (this.f435j) {
                this.f426a.onError(th3);
            } else {
                f();
            }
        }

        @Override // x03.h
        public final T poll() {
            return this.f427b.poll();
        }
    }

    public f(q03.g<T> gVar, int i14, boolean z14, boolean z15, u03.a aVar) {
        super(gVar);
        this.f422c = i14;
        this.f423d = z14;
        this.f424e = z15;
        this.f425f = aVar;
    }

    @Override // q03.g
    public final void c(q03.h hVar) {
        this.f413b.b(new a(hVar, this.f422c, this.f423d, this.f424e, this.f425f));
    }
}
