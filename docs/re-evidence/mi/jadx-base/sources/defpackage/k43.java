package defpackage;

import io.reactivex.exceptions.CompositeException;
import retrofit2.adapter.rxjava2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class k43<T> extends o4h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4h<prk<T>> f23410a;

    public static class a<R> implements z5h<prk<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super R> f23411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23412b;

        public a(z5h<? super R> z5hVar) {
            this.f23411a = z5hVar;
        }

        @Override // defpackage.z5h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(prk<R> prkVar) {
            if (prkVar.e()) {
                this.f23411a.onNext(prkVar.a());
                return;
            }
            this.f23412b = true;
            HttpException httpException = new HttpException(prkVar);
            try {
                this.f23411a.onError(httpException);
            } catch (Throwable th) {
                qf8.b(th);
                t5l.p(new CompositeException(httpException, th));
            }
        }

        @Override // defpackage.z5h
        public void onComplete() {
            if (this.f23412b) {
                return;
            }
            this.f23411a.onComplete();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (!this.f23412b) {
                this.f23411a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            t5l.p(assertionError);
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            this.f23411a.onSubscribe(jz6Var);
        }
    }

    public k43(o4h<prk<T>> o4hVar) {
        this.f23410a = o4hVar;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        this.f23410a.a(new a(z5hVar));
    }
}
