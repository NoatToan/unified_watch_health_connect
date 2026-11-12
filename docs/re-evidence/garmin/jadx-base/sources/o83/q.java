package o83;

/* JADX INFO: loaded from: classes11.dex */
public final class q<T> implements j83.l.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83.l.b<T> f130946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j83.h f130947b;

    public static final class a<T> extends j83.m<T> implements n83.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j83.m<? super T> f130948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j83.h.a f130949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f130950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Throwable f130951e;

        public a(j83.m<? super T> mVar, j83.h.a aVar) {
            this.f130948b = mVar;
            this.f130949c = aVar;
        }

        @Override // j83.m
        public final void b(Throwable th3) {
            this.f130951e = th3;
            this.f130949c.a(this);
        }

        @Override // j83.m
        public final void c(T t7) {
            this.f130950d = t7;
            this.f130949c.a(this);
        }

        @Override // n83.a
        public final void d() {
            j83.h.a aVar = this.f130949c;
            try {
                Throwable th3 = this.f130951e;
                j83.m<? super T> mVar = this.f130948b;
                if (th3 != null) {
                    this.f130951e = null;
                    mVar.b(th3);
                } else {
                    T t7 = this.f130950d;
                    this.f130950d = null;
                    mVar.c(t7);
                }
            } finally {
                aVar.f();
            }
        }
    }

    public q(j83.l.b<T> bVar, j83.h hVar) {
        this.f130946a = bVar;
        this.f130947b = hVar;
    }

    @Override // n83.b
    public final void call(Object obj) {
        j83.m mVar = (j83.m) obj;
        j83.h.a aVarCreateWorker = this.f130947b.createWorker();
        a aVar = new a(mVar, aVarCreateWorker);
        mVar.a(aVarCreateWorker);
        mVar.a(aVar);
        this.f130946a.call(aVar);
    }
}
