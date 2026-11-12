package a13;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class l<T, R> extends a13.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u03.f<? super T, ? extends b83.a<? extends R>> f460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f462e;

    public static final class a<T, R> extends AtomicReference<b83.c> implements q03.h<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b<T, R> f463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile x03.h<R> f466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f468f;

        public a(b<T, R> bVar, long j8, int i14) {
            this.f463a = bVar;
            this.f464b = j8;
            this.f465c = i14;
        }

        @Override // b83.b
        public final void c(R r14) {
            b<T, R> bVar = this.f463a;
            if (this.f464b == bVar.f480k) {
                if (this.f468f != 0 || this.f466d.offer(r14)) {
                    bVar.e();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        @Override // b83.b
        public final void d(b83.c cVar) {
            if (h13.e.c(this, cVar)) {
                if (cVar instanceof x03.e) {
                    x03.e eVar = (x03.e) cVar;
                    int iE = eVar.e();
                    if (iE == 1) {
                        this.f468f = iE;
                        this.f466d = eVar;
                        this.f467e = true;
                        this.f463a.e();
                        return;
                    }
                    if (iE == 2) {
                        this.f468f = iE;
                        this.f466d = eVar;
                        cVar.b(this.f465c);
                        return;
                    }
                }
                this.f466d = new f13.a(this.f465c);
                cVar.b(this.f465c);
            }
        }

        @Override // b83.b
        public final void onComplete() {
            b<T, R> bVar = this.f463a;
            if (this.f464b == bVar.f480k) {
                this.f467e = true;
                bVar.e();
            }
        }

        @Override // b83.b
        public final void onError(Throwable th3) {
            b<T, R> bVar = this.f463a;
            if (this.f464b != bVar.f480k || !bVar.f475f.a(th3)) {
                k13.a.b(th3);
                return;
            }
            if (!bVar.f473d) {
                bVar.f477h.cancel();
                bVar.f474e = true;
            }
            this.f467e = true;
            bVar.e();
        }
    }

    public static final class b<T, R> extends AtomicInteger implements q03.h<T>, b83.c {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a<Object, Object> f469l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b83.b<? super R> f470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.f<? super T, ? extends b83.a<? extends R>> f471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f474e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f476g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b83.c f477h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile long f480k;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AtomicReference<a<T, R>> f478i = new AtomicReference<>();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicLong f479j = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final i13.b f475f = new i13.b();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            f469l = aVar;
            h13.e.a(aVar);
        }

        public b(b83.b<? super R> bVar, u03.f<? super T, ? extends b83.a<? extends R>> fVar, int i14, boolean z14) {
            this.f470a = bVar;
            this.f471b = fVar;
            this.f472c = i14;
            this.f473d = z14;
        }

        public final void a() {
            a<T, R> andSet;
            AtomicReference<a<T, R>> atomicReference = this.f478i;
            a<T, R> aVar = atomicReference.get();
            a<Object, Object> aVar2 = f469l;
            if (aVar == aVar2 || (andSet = atomicReference.getAndSet((a<T, R>) aVar2)) == aVar2 || andSet == null) {
                return;
            }
            h13.e.a(andSet);
        }

        @Override // b83.c
        public final void b(long j8) {
            if (h13.e.d(j8)) {
                i13.c.a(this.f479j, j8);
                if (this.f480k == 0) {
                    this.f477h.b(Long.MAX_VALUE);
                } else {
                    e();
                }
            }
        }

        @Override // b83.b
        public final void c(T t7) {
            if (this.f474e) {
                return;
            }
            long j8 = this.f480k + 1;
            this.f480k = j8;
            a<T, R> aVar = this.f478i.get();
            if (aVar != null) {
                h13.e.a(aVar);
            }
            try {
                b83.a<? extends R> aVarMo330apply = this.f471b.mo330apply(t7);
                w03.b.a(aVarMo330apply, "The publisher returned is null");
                b83.a<? extends R> aVar2 = aVarMo330apply;
                a<T, R> aVar3 = new a<>(this, j8, this.f472c);
                while (true) {
                    a<T, R> aVar4 = this.f478i.get();
                    if (aVar4 == f469l) {
                        return;
                    }
                    AtomicReference<a<T, R>> atomicReference = this.f478i;
                    do {
                        if (atomicReference.compareAndSet(aVar4, aVar3)) {
                            aVar2.a(aVar3);
                            return;
                        }
                    } while (atomicReference.get() == aVar4);
                }
            } catch (Throwable th3) {
                t03.a.a(th3);
                this.f477h.cancel();
                onError(th3);
            }
        }

        @Override // b83.c
        public final void cancel() {
            if (this.f476g) {
                return;
            }
            this.f476g = true;
            this.f477h.cancel();
            a();
        }

        @Override // b83.b
        public final void d(b83.c cVar) {
            if (h13.e.e(this.f477h, cVar)) {
                this.f477h = cVar;
                this.f470a.d(this);
            }
        }

        public final void e() {
            boolean z14;
            long j8;
            a0.g gVarPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            b83.b<? super R> bVar = this.f470a;
            int iAddAndGet = 1;
            while (!this.f476g) {
                if (this.f474e) {
                    if (this.f473d) {
                        if (this.f478i.get() == null) {
                            if (this.f475f.get() != null) {
                                bVar.onError(this.f475f.b());
                                return;
                            } else {
                                bVar.onComplete();
                                return;
                            }
                        }
                    } else if (this.f475f.get() != null) {
                        a();
                        bVar.onError(this.f475f.b());
                        return;
                    } else if (this.f478i.get() == null) {
                        bVar.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = this.f478i.get();
                x03.h<R> hVar = aVar != null ? aVar.f466d : null;
                if (hVar != null) {
                    if (aVar.f467e) {
                        if (this.f473d) {
                            if (hVar.isEmpty()) {
                                AtomicReference<a<T, R>> atomicReference = this.f478i;
                                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                                }
                            }
                        } else if (this.f475f.get() != null) {
                            a();
                            bVar.onError(this.f475f.b());
                            return;
                        } else if (hVar.isEmpty()) {
                            AtomicReference<a<T, R>> atomicReference2 = this.f478i;
                            while (!atomicReference2.compareAndSet(aVar, null) && atomicReference2.get() == aVar) {
                            }
                        }
                    }
                    long j14 = this.f479j.get();
                    long j15 = 0;
                    while (true) {
                        z14 = false;
                        if (j15 == j14) {
                            j8 = 0;
                            break;
                        }
                        if (!this.f476g) {
                            boolean z15 = aVar.f467e;
                            try {
                                gVarPoll = hVar.poll();
                            } catch (Throwable th3) {
                                t03.a.a(th3);
                                h13.e.a(aVar);
                                this.f475f.a(th3);
                                z15 = true;
                                gVarPoll = null;
                            }
                            boolean z16 = gVarPoll == null;
                            j8 = 0;
                            if (aVar == this.f478i.get()) {
                                if (z15) {
                                    if (this.f473d) {
                                        if (z16) {
                                            AtomicReference<a<T, R>> atomicReference3 = this.f478i;
                                            while (!atomicReference3.compareAndSet(aVar, null) && atomicReference3.get() == aVar) {
                                            }
                                        }
                                    } else if (this.f475f.get() != null) {
                                        bVar.onError(this.f475f.b());
                                        return;
                                    } else if (z16) {
                                        AtomicReference<a<T, R>> atomicReference4 = this.f478i;
                                        while (!atomicReference4.compareAndSet(aVar, null) && atomicReference4.get() == aVar) {
                                        }
                                    }
                                }
                                if (z16) {
                                    break;
                                }
                                bVar.c(gVarPoll);
                                j15++;
                            }
                            z14 = true;
                            break;
                        }
                        return;
                    }
                    if (j15 != j8 && !this.f476g) {
                        if (j14 != Long.MAX_VALUE) {
                            this.f479j.addAndGet(-j15);
                        }
                        if (aVar.f468f != 1) {
                            aVar.get().b(j15);
                        }
                    }
                    if (z14) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // b83.b
        public final void onComplete() {
            if (this.f474e) {
                return;
            }
            this.f474e = true;
            e();
        }

        @Override // b83.b
        public final void onError(Throwable th3) {
            if (this.f474e || !this.f475f.a(th3)) {
                k13.a.b(th3);
                return;
            }
            if (!this.f473d) {
                a();
            }
            this.f474e = true;
            e();
        }
    }

    public l(q03.g<T> gVar, u03.f<? super T, ? extends b83.a<? extends R>> fVar, int i14, boolean z14) {
        super(gVar);
        this.f460c = fVar;
        this.f461d = i14;
        this.f462e = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // q03.g
    public final void c(q03.h hVar) {
        q03.g<T> gVar = this.f413b;
        boolean z14 = gVar instanceof Callable;
        u03.f<? super T, ? extends b83.a<? extends R>> fVar = this.f460c;
        if (!z14) {
            gVar.b(new b(hVar, fVar, this.f461d, this.f462e));
            return;
        }
        try {
            a0.f fVar2 = (Object) ((Callable) gVar).call();
            if (fVar2 == null) {
                hVar.d(h13.c.INSTANCE);
                hVar.onComplete();
                return;
            }
            try {
                b83.a<? extends R> aVarMo330apply = fVar.mo330apply(fVar2);
                w03.b.a(aVarMo330apply, "The mapper returned a null Publisher");
                b83.a<? extends R> aVar = aVarMo330apply;
                if (!(aVar instanceof Callable)) {
                    aVar.a(hVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) aVar).call();
                    if (objCall != null) {
                        hVar.d(new h13.d(hVar, objCall));
                    } else {
                        hVar.d(h13.c.INSTANCE);
                        hVar.onComplete();
                    }
                } catch (Throwable th3) {
                    t03.a.a(th3);
                    hVar.d(h13.c.INSTANCE);
                    hVar.onError(th3);
                }
            } catch (Throwable th4) {
                t03.a.a(th4);
                hVar.d(h13.c.INSTANCE);
                hVar.onError(th4);
            }
        } catch (Throwable th5) {
            t03.a.a(th5);
            hVar.d(h13.c.INSTANCE);
            hVar.onError(th5);
        }
    }
}
