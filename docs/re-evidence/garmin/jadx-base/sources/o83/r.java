package o83;

import rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes11.dex */
public final class r<T, R> implements j83.l.b<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83.l<T> f130952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n83.d<? super T, ? extends R> f130953b;

    public static final class a<T, R> extends j83.m<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j83.m<? super R> f130954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n83.d<? super T, ? extends R> f130955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f130956d;

        public a(j83.m<? super R> mVar, n83.d<? super T, ? extends R> dVar) {
            this.f130954b = mVar;
            this.f130955c = dVar;
        }

        @Override // j83.m
        public final void b(Throwable th3) {
            if (this.f130956d) {
                v83.s.a(th3);
            } else {
                this.f130956d = true;
                this.f130954b.b(th3);
            }
        }

        @Override // j83.m
        public final void c(T t7) {
            try {
                this.f130954b.c(this.f130955c.call(t7));
            } catch (Throwable th3) {
                m83.a.b(th3);
                f();
                b(OnErrorThrowable.addValueAsLastCause(th3, t7));
            }
        }
    }

    public r(j83.l<T> lVar, n83.d<? super T, ? extends R> dVar) {
        this.f130952a = lVar;
        this.f130953b = dVar;
    }

    @Override // n83.b
    public final void call(Object obj) {
        j83.m mVar = (j83.m) obj;
        a aVar = new a(mVar, this.f130953b);
        mVar.a(aVar);
        this.f130952a.c(aVar);
    }
}
