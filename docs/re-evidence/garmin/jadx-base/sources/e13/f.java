package e13;

/* JADX INFO: loaded from: classes3.dex */
public final class f<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<T> f62311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.d<? super s03.b> f62312b;

    public static final class a<T> implements q03.t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f62313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.d<? super s03.b> f62314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f62315c;

        public a(q03.t<? super T> tVar, u03.d<? super s03.b> dVar) {
            this.f62313a = tVar;
            this.f62314b = dVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            q03.t<? super T> tVar = this.f62313a;
            try {
                this.f62314b.accept(bVar);
                tVar.a(bVar);
            } catch (Throwable th3) {
                t03.a.a(th3);
                this.f62315c = true;
                bVar.dispose();
                v03.d.f(th3, tVar);
            }
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            if (this.f62315c) {
                k13.a.b(th3);
            } else {
                this.f62313a.onError(th3);
            }
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            if (this.f62315c) {
                return;
            }
            this.f62313a.onSuccess(t7);
        }
    }

    public f(q03.v<T> vVar, u03.d<? super s03.b> dVar) {
        this.f62311a = vVar;
        this.f62312b = dVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        this.f62311a.a(new a(tVar, this.f62312b));
    }
}
