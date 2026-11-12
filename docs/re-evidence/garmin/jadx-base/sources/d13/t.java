package d13;

/* JADX INFO: loaded from: classes3.dex */
public final class t<T> extends q03.i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.o<T> f57230a;

    public static final class a<T> implements q03.p<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.j<? super T> f57231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s03.b f57232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f57233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f57234d;

        public a(q03.j<? super T> jVar) {
            this.f57231a = jVar;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            if (v03.c.g(this.f57232b, bVar)) {
                this.f57232b = bVar;
                this.f57231a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f57232b.b();
        }

        @Override // q03.p
        public final void c(T t7) {
            if (this.f57234d) {
                return;
            }
            if (this.f57233c == null) {
                this.f57233c = t7;
                return;
            }
            this.f57234d = true;
            this.f57232b.dispose();
            this.f57231a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // s03.b
        public final void dispose() {
            this.f57232b.dispose();
        }

        @Override // q03.p
        public final void onComplete() {
            if (this.f57234d) {
                return;
            }
            this.f57234d = true;
            T t7 = this.f57233c;
            this.f57233c = null;
            q03.j<? super T> jVar = this.f57231a;
            if (t7 == null) {
                jVar.onComplete();
            } else {
                jVar.onSuccess(t7);
            }
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            if (this.f57234d) {
                k13.a.b(th3);
            } else {
                this.f57234d = true;
                this.f57231a.onError(th3);
            }
        }
    }

    public t(q03.o<T> oVar) {
        this.f57230a = oVar;
    }

    @Override // q03.i
    public final void c(q03.j<? super T> jVar) {
        this.f57230a.b(new a(jVar));
    }
}
