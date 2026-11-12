package d83;

import c83.a0;
import io.reactivex.exceptions.CompositeException;
import q03.l;
import q03.p;
import retrofit2.adapter.rxjava2.HttpException;

/* JADX INFO: loaded from: classes11.dex */
public final class a<T> extends l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<a0<T>> f58387a;

    /* JADX INFO: renamed from: d83.a$a, reason: collision with other inner class name */
    public static class C1243a<R> implements p<a0<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p<? super R> f58388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f58389b;

        public C1243a(p<? super R> pVar) {
            this.f58388a = pVar;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            this.f58388a.a(bVar);
        }

        @Override // q03.p
        public final void c(Object obj) {
            a0 a0Var = (a0) obj;
            boolean zIsSuccessful = a0Var.f25745a.isSuccessful();
            p<? super R> pVar = this.f58388a;
            if (zIsSuccessful) {
                pVar.c(a0Var.f25746b);
                return;
            }
            this.f58389b = true;
            HttpException httpException = new HttpException(a0Var);
            try {
                pVar.onError(httpException);
            } catch (Throwable th3) {
                t03.a.a(th3);
                k13.a.b(new CompositeException(httpException, th3));
            }
        }

        @Override // q03.p
        public final void onComplete() {
            if (this.f58389b) {
                return;
            }
            this.f58388a.onComplete();
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            if (!this.f58389b) {
                this.f58388a.onError(th3);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th3);
            k13.a.b(assertionError);
        }
    }

    public a(l<a0<T>> lVar) {
        this.f58387a = lVar;
    }

    @Override // q03.l
    public final void f(p<? super T> pVar) {
        this.f58387a.b(new C1243a(pVar));
    }
}
