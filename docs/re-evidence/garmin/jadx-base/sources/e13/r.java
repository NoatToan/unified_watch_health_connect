package e13;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class r<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<? extends T> f62358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.f<? super Throwable, ? extends q03.v<? extends T>> f62359b;

    public static final class a<T> extends AtomicReference<s03.b> implements q03.t<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f62360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.f<? super Throwable, ? extends q03.v<? extends T>> f62361b;

        public a(q03.t<? super T> tVar, u03.f<? super Throwable, ? extends q03.v<? extends T>> fVar) {
            this.f62360a = tVar;
            this.f62361b = fVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            if (v03.c.f(this, bVar)) {
                this.f62360a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(get());
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this);
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            q03.t<? super T> tVar = this.f62360a;
            try {
                q03.v<? extends T> vVarMo330apply = this.f62361b.mo330apply(th3);
                w03.b.a(vVarMo330apply, "The nextFunction returned a null SingleSource.");
                vVarMo330apply.a(new y03.j(this, tVar));
            } catch (Throwable th4) {
                t03.a.a(th4);
                tVar.onError(new CompositeException(th3, th4));
            }
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            this.f62360a.onSuccess(t7);
        }
    }

    public r(q03.v<? extends T> vVar, u03.f<? super Throwable, ? extends q03.v<? extends T>> fVar) {
        this.f62358a = vVar;
        this.f62359b = fVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        this.f62358a.a(new a(tVar, this.f62359b));
    }
}
