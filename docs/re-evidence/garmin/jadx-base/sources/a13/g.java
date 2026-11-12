package a13;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class g<T> extends a13.a<T, T> implements u03.d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u03.d<? super T> f436c;

    public static final class a<T> extends AtomicLong implements q03.h<T>, b83.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b83.b<? super T> f437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.d<? super T> f438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b83.c f439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f440d;

        public a(b83.b<? super T> bVar, u03.d<? super T> dVar) {
            this.f437a = bVar;
            this.f438b = dVar;
        }

        @Override // b83.c
        public final void b(long j8) {
            if (h13.e.d(j8)) {
                i13.c.a(this, j8);
            }
        }

        @Override // b83.b
        public final void c(T t7) {
            if (this.f440d) {
                return;
            }
            if (get() != 0) {
                this.f437a.c(t7);
                i13.c.b(this, 1L);
                return;
            }
            try {
                this.f438b.accept(t7);
            } catch (Throwable th3) {
                t03.a.a(th3);
                cancel();
                onError(th3);
            }
        }

        @Override // b83.c
        public final void cancel() {
            this.f439c.cancel();
        }

        @Override // b83.b
        public final void d(b83.c cVar) {
            if (h13.e.e(this.f439c, cVar)) {
                this.f439c = cVar;
                this.f437a.d(this);
                cVar.b(Long.MAX_VALUE);
            }
        }

        @Override // b83.b
        public final void onComplete() {
            if (this.f440d) {
                return;
            }
            this.f440d = true;
            this.f437a.onComplete();
        }

        @Override // b83.b
        public final void onError(Throwable th3) {
            if (this.f440d) {
                k13.a.b(th3);
            } else {
                this.f440d = true;
                this.f437a.onError(th3);
            }
        }
    }

    public g(q03.g<T> gVar) {
        super(gVar);
        this.f436c = this;
    }

    @Override // u03.d
    public final void accept(T t7) {
    }

    @Override // q03.g
    public final void c(q03.h hVar) {
        this.f413b.b(new a(hVar, this.f436c));
    }

    public g(q03.g<T> gVar, u03.d<? super T> dVar) {
        super(gVar);
        this.f436c = dVar;
    }
}
