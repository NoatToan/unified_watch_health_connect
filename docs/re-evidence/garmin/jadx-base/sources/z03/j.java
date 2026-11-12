package z03;

import q03.t;
import q03.v;

/* JADX INFO: loaded from: classes3.dex */
public final class j<T> extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<T> f200769a;

    public static final class a<T> implements t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.d f200770a;

        public a(q03.d dVar) {
            this.f200770a = dVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            this.f200770a.a(bVar);
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            this.f200770a.onError(th3);
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            this.f200770a.onComplete();
        }
    }

    public j(v<T> vVar) {
        this.f200769a = vVar;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        this.f200769a.a(new a(dVar));
    }
}
