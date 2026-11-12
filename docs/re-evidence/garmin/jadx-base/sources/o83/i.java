package o83;

import rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes11.dex */
public final class i<T, R> implements j83.e.a<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83.e<T> f130882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n83.d<? super T, ? extends R> f130883b;

    public static final class a<T, R> extends j83.n<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j83.n<? super R> f130884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final n83.d<? super T, ? extends R> f130885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f130886g;

        public a(j83.n<? super R> nVar, n83.d<? super T, ? extends R> dVar) {
            this.f130884e = nVar;
            this.f130885f = dVar;
        }

        @Override // j83.f
        public final void a() {
            if (this.f130886g) {
                return;
            }
            this.f130884e.a();
        }

        @Override // j83.f
        public final void c(T t7) {
            try {
                this.f130884e.c(this.f130885f.call(t7));
            } catch (Throwable th3) {
                m83.a.b(th3);
                f();
                onError(OnErrorThrowable.addValueAsLastCause(th3, t7));
            }
        }

        @Override // j83.n
        public final void i(j83.g gVar) {
            this.f130884e.i(gVar);
        }

        @Override // j83.f
        public final void onError(Throwable th3) {
            if (this.f130886g) {
                v83.s.a(th3);
            } else {
                this.f130886g = true;
                this.f130884e.onError(th3);
            }
        }
    }

    public i(j83.e<T> eVar, n83.d<? super T, ? extends R> dVar) {
        this.f130882a = eVar;
        this.f130883b = dVar;
    }

    @Override // n83.b
    public final void call(Object obj) {
        j83.n nVar = (j83.n) obj;
        a aVar = new a(nVar, this.f130883b);
        nVar.b(aVar);
        this.f130882a.f(aVar);
    }
}
