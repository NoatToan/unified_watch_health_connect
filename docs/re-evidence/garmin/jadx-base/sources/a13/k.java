package a13;

import java.util.NoSuchElementException;
import q03.r;
import q03.t;

/* JADX INFO: loaded from: classes3.dex */
public final class k<T> extends r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.g<T> f453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f454b;

    public static final class a<T> implements q03.h<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t<? super T> f455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b83.c f457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f459e;

        public a(t<? super T> tVar, T t7) {
            this.f455a = tVar;
            this.f456b = t7;
        }

        @Override // s03.b
        public final boolean b() {
            return this.f457c == h13.e.CANCELLED;
        }

        @Override // b83.b
        public final void c(T t7) {
            if (this.f458d) {
                return;
            }
            if (this.f459e == null) {
                this.f459e = t7;
                return;
            }
            this.f458d = true;
            this.f457c.cancel();
            this.f457c = h13.e.CANCELLED;
            this.f455a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // b83.b
        public final void d(b83.c cVar) {
            if (h13.e.e(this.f457c, cVar)) {
                this.f457c = cVar;
                this.f455a.a(this);
                cVar.b(Long.MAX_VALUE);
            }
        }

        @Override // s03.b
        public final void dispose() {
            this.f457c.cancel();
            this.f457c = h13.e.CANCELLED;
        }

        @Override // b83.b
        public final void onComplete() {
            if (this.f458d) {
                return;
            }
            this.f458d = true;
            this.f457c = h13.e.CANCELLED;
            T t7 = this.f459e;
            this.f459e = null;
            if (t7 == null) {
                t7 = this.f456b;
            }
            t<? super T> tVar = this.f455a;
            if (t7 != null) {
                tVar.onSuccess(t7);
            } else {
                tVar.onError(new NoSuchElementException());
            }
        }

        @Override // b83.b
        public final void onError(Throwable th3) {
            if (this.f458d) {
                k13.a.b(th3);
                return;
            }
            this.f458d = true;
            this.f457c = h13.e.CANCELLED;
            this.f455a.onError(th3);
        }
    }

    public k(q03.g<T> gVar, T t7) {
        this.f453a = gVar;
        this.f454b = t7;
    }

    @Override // q03.r
    public final void i(t<? super T> tVar) {
        this.f453a.b(new a(tVar, this.f454b));
    }
}
