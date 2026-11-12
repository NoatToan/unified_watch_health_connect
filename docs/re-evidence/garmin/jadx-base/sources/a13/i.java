package a13;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class i<T> extends a13.a<T, T> {

    public static final class a<T> extends AtomicInteger implements q03.h<T>, b83.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b83.b<? super T> f444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b83.c f445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Throwable f447d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f448e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicLong f449f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AtomicReference<T> f450g = new AtomicReference<>();

        public a(b83.b<? super T> bVar) {
            this.f444a = bVar;
        }

        public final boolean a(boolean z14, boolean z15, b83.b<?> bVar, AtomicReference<T> atomicReference) {
            if (this.f448e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z14) {
                return false;
            }
            Throwable th3 = this.f447d;
            if (th3 != null) {
                atomicReference.lazySet(null);
                bVar.onError(th3);
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
            if (h13.e.d(j8)) {
                i13.c.a(this.f449f, j8);
                e();
            }
        }

        @Override // b83.b
        public final void c(T t7) {
            this.f450g.lazySet(t7);
            e();
        }

        @Override // b83.c
        public final void cancel() {
            if (this.f448e) {
                return;
            }
            this.f448e = true;
            this.f445b.cancel();
            if (getAndIncrement() == 0) {
                this.f450g.lazySet(null);
            }
        }

        @Override // b83.b
        public final void d(b83.c cVar) {
            if (h13.e.e(this.f445b, cVar)) {
                this.f445b = cVar;
                this.f444a.d(this);
                cVar.b(Long.MAX_VALUE);
            }
        }

        public final void e() {
            if (getAndIncrement() != 0) {
                return;
            }
            b83.b<? super T> bVar = this.f444a;
            AtomicLong atomicLong = this.f449f;
            AtomicReference<T> atomicReference = this.f450g;
            int iAddAndGet = 1;
            do {
                long j8 = 0;
                while (true) {
                    if (j8 == atomicLong.get()) {
                        break;
                    }
                    boolean z14 = this.f446c;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z15 = andSet == null;
                    if (a(z14, z15, bVar, atomicReference)) {
                        return;
                    }
                    if (z15) {
                        break;
                    }
                    bVar.c(andSet);
                    j8++;
                }
                if (j8 == atomicLong.get()) {
                    if (a(this.f446c, atomicReference.get() == null, bVar, atomicReference)) {
                        return;
                    }
                }
                if (j8 != 0) {
                    i13.c.b(atomicLong, j8);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // b83.b
        public final void onComplete() {
            this.f446c = true;
            e();
        }

        @Override // b83.b
        public final void onError(Throwable th3) {
            this.f447d = th3;
            this.f446c = true;
            e();
        }
    }

    public i(q03.g<T> gVar) {
        super(gVar);
    }

    @Override // q03.g
    public final void c(q03.h hVar) {
        this.f413b.b(new a(hVar));
    }
}
