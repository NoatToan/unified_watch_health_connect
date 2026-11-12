package z03;

import java.util.concurrent.Callable;
import q03.t;

/* JADX INFO: loaded from: classes3.dex */
public final class s<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.f f200818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends T> f200819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f200820c;

    public final class a implements q03.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t<? super T> f200821a;

        public a(t<? super T> tVar) {
            this.f200821a = tVar;
        }

        @Override // q03.d
        public final void a(s03.b bVar) {
            this.f200821a.a(bVar);
        }

        @Override // q03.d
        public final void onComplete() {
            T tCall;
            s sVar = s.this;
            Callable<? extends T> callable = sVar.f200819b;
            t<? super T> tVar = this.f200821a;
            if (callable != null) {
                try {
                    tCall = callable.call();
                } catch (Throwable th3) {
                    t03.a.a(th3);
                    tVar.onError(th3);
                    return;
                }
            } else {
                tCall = sVar.f200820c;
            }
            if (tCall == null) {
                tVar.onError(new NullPointerException("The value supplied is null"));
            } else {
                tVar.onSuccess(tCall);
            }
        }

        @Override // q03.d
        public final void onError(Throwable th3) {
            this.f200821a.onError(th3);
        }
    }

    public s(q03.f fVar, Callable<? extends T> callable, T t7) {
        this.f200818a = fVar;
        this.f200820c = t7;
        this.f200819b = callable;
    }

    @Override // q03.r
    public final void i(t<? super T> tVar) {
        this.f200818a.a(new a(tVar));
    }
}
