package a13;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class h<T> extends a13.a<T, T> {

    public static final class a<T> extends AtomicLong implements q03.h<T>, b83.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b83.b<? super T> f441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b83.c f442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f443c;

        public a(b83.b<? super T> bVar) {
            this.f441a = bVar;
        }

        @Override // b83.c
        public final void b(long j8) {
            if (h13.e.d(j8)) {
                i13.c.a(this, j8);
            }
        }

        @Override // b83.b
        public final void c(T t7) {
            if (this.f443c) {
                return;
            }
            if (get() != 0) {
                this.f441a.c(t7);
                i13.c.b(this, 1L);
            } else {
                this.f442b.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        @Override // b83.c
        public final void cancel() {
            this.f442b.cancel();
        }

        @Override // b83.b
        public final void d(b83.c cVar) {
            if (h13.e.e(this.f442b, cVar)) {
                this.f442b = cVar;
                this.f441a.d(this);
                cVar.b(Long.MAX_VALUE);
            }
        }

        @Override // b83.b
        public final void onComplete() {
            if (this.f443c) {
                return;
            }
            this.f443c = true;
            this.f441a.onComplete();
        }

        @Override // b83.b
        public final void onError(Throwable th3) {
            if (this.f443c) {
                k13.a.b(th3);
            } else {
                this.f443c = true;
                this.f441a.onError(th3);
            }
        }
    }

    public h(q03.g<T> gVar) {
        super(gVar);
    }

    @Override // q03.g
    public final void c(q03.h hVar) {
        this.f413b.b(new a(hVar));
    }
}
