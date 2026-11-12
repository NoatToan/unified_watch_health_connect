package o83;

import java.util.AbstractQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.MissingBackpressureException;

/* JADX INFO: loaded from: classes11.dex */
public final class l<T> implements j83.e.b<T, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83.h f130916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f130917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f130918c;

    public static final class a<T> extends j83.n<T> implements n83.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j83.n<? super T> f130919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final j83.h.a f130920f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f130921g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AbstractQueue f130922h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f130923i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f130924j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AtomicLong f130925k = new AtomicLong();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AtomicLong f130926l = new AtomicLong();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Throwable f130927m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f130928n;

        public a(j83.h hVar, j83.n<? super T> nVar, boolean z14, int i14) {
            this.f130919e = nVar;
            this.f130920f = hVar.createWorker();
            this.f130921g = z14;
            i14 = i14 <= 0 ? s83.c.f157956b : i14;
            this.f130923i = i14 - (i14 >> 2);
            if (rx.internal.util.unsafe.s.f154926a == null || rx.internal.util.unsafe.s.f154927b) {
                this.f130922h = new t83.b(i14);
            } else {
                this.f130922h = new rx.internal.util.unsafe.l(i14);
            }
            h(i14);
        }

        @Override // j83.f
        public final void a() {
            if (this.f97758a.f157986b || this.f130924j) {
                return;
            }
            this.f130924j = true;
            k();
        }

        @Override // j83.f
        public final void c(T t7) {
            if (this.f97758a.f157986b || this.f130924j) {
                return;
            }
            AbstractQueue abstractQueue = this.f130922h;
            if (t7 == null) {
                t7 = (T) e.f130874b;
            } else {
                e.a aVar = e.f130873a;
            }
            if (abstractQueue.offer(t7)) {
                k();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // n83.a
        public final void d() {
            long j8 = this.f130928n;
            AbstractQueue abstractQueue = this.f130922h;
            j83.n<? super T> nVar = this.f130919e;
            long jAddAndGet = 1;
            do {
                long j14 = this.f130925k.get();
                while (j14 != j8) {
                    boolean z14 = this.f130924j;
                    e.b bVar = (Object) abstractQueue.poll();
                    boolean z15 = bVar == null;
                    if (j(z14, z15, nVar, abstractQueue)) {
                        return;
                    }
                    if (z15) {
                        break;
                    }
                    if (bVar == e.f130874b) {
                        bVar = null;
                    }
                    nVar.c(bVar);
                    j8++;
                    if (j8 == this.f130923i) {
                        long jA = o83.a.a(this.f130925k, j8);
                        h(j8);
                        j14 = jA;
                        j8 = 0;
                    }
                }
                if (j14 == j8 && j(this.f130924j, abstractQueue.isEmpty(), nVar, abstractQueue)) {
                    return;
                }
                this.f130928n = j8;
                jAddAndGet = this.f130926l.addAndGet(-jAddAndGet);
            } while (jAddAndGet != 0);
        }

        public final boolean j(boolean z14, boolean z15, j83.n nVar, AbstractQueue abstractQueue) {
            if (nVar.f97758a.f157986b) {
                abstractQueue.clear();
                return true;
            }
            if (!z14) {
                return false;
            }
            if (this.f130921g) {
                if (!z15) {
                    return false;
                }
                Throwable th3 = this.f130927m;
                try {
                    if (th3 != null) {
                        nVar.onError(th3);
                    } else {
                        nVar.a();
                    }
                    this.f130920f.f();
                    return false;
                } catch (Throwable th4) {
                    this.f130920f.f();
                    throw th4;
                }
            }
            Throwable th5 = this.f130927m;
            if (th5 != null) {
                abstractQueue.clear();
                try {
                    nVar.onError(th5);
                    return true;
                } finally {
                    this.f130920f.f();
                }
            }
            if (!z15) {
                return false;
            }
            try {
                nVar.a();
                return true;
            } finally {
                this.f130920f.f();
            }
        }

        public final void k() {
            if (this.f130926l.getAndIncrement() == 0) {
                this.f130920f.a(this);
            }
        }

        @Override // j83.f
        public final void onError(Throwable th3) {
            if (this.f97758a.f157986b || this.f130924j) {
                v83.s.a(th3);
                return;
            }
            this.f130927m = th3;
            this.f130924j = true;
            k();
        }
    }

    public l(j83.h hVar, boolean z14, int i14) {
        this.f130916a = hVar;
        this.f130917b = z14;
        this.f130918c = i14 <= 0 ? s83.c.f157956b : i14;
    }

    @Override // n83.d
    public final Object call(Object obj) {
        j83.n nVar = (j83.n) obj;
        j83.h hVar = this.f130916a;
        if ((hVar instanceof q83.g) || (hVar instanceof q83.o)) {
            return nVar;
        }
        a aVar = new a(hVar, nVar, this.f130917b, this.f130918c);
        k kVar = new k(aVar);
        j83.n<? super T> nVar2 = aVar.f130919e;
        nVar2.i(kVar);
        nVar2.b(aVar.f130920f);
        nVar2.b(aVar);
        return aVar;
    }

    public l(j83.h hVar, boolean z14) {
        this(hVar, z14, s83.c.f157956b);
    }
}
