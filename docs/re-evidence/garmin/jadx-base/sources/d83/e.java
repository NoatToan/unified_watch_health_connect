package d83;

import c83.a0;
import io.reactivex.exceptions.CompositeException;
import q03.l;
import q03.p;

/* JADX INFO: loaded from: classes11.dex */
public final class e<T> extends l<d<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<a0<T>> f58398a;

    public static class a<R> implements p<a0<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p<? super d<R>> f58399a;

        public a(p<? super d<R>> pVar) {
            this.f58399a = pVar;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            this.f58399a.a(bVar);
        }

        @Override // q03.p
        public final void c(Object obj) {
            this.f58399a.c(d.b((a0) obj));
        }

        @Override // q03.p
        public final void onComplete() {
            this.f58399a.onComplete();
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            p<? super d<R>> pVar = this.f58399a;
            try {
                pVar.c(d.a(th3));
                pVar.onComplete();
            } catch (Throwable th4) {
                try {
                    pVar.onError(th4);
                } catch (Throwable th5) {
                    t03.a.a(th5);
                    k13.a.b(new CompositeException(th4, th5));
                }
            }
        }
    }

    public e(l<a0<T>> lVar) {
        this.f58398a = lVar;
    }

    @Override // q03.l
    public final void f(p<? super d<T>> pVar) {
        this.f58398a.b(new a(pVar));
    }
}
