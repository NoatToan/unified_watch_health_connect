package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import rx.exceptions.OnErrorFailedException;
import rx.internal.operators.EmptyObservableHolder;
import rx.internal.util.InternalObservableUtils;

/* JADX INFO: loaded from: classes3.dex */
public class p4h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<T> f29990a;

    public interface a<T> extends tc0<xno<? super T>> {
    }

    public interface b<R, T> extends zta<xno<? super R>, xno<? super T>> {
    }

    public p4h(a<T> aVar) {
        this.f29990a = aVar;
    }

    public static <T> p4h<T> A(a<T> aVar) {
        return new p4h<>(p5l.e(aVar));
    }

    @Deprecated
    public static <T> p4h<T> a(a<T> aVar) {
        return new p4h<>(p5l.e(aVar));
    }

    public static <T> p4h<T> c() {
        return EmptyObservableHolder.instance();
    }

    public static <T> p4h<T> f(Iterable<? extends T> iterable) {
        return A(new aah(iterable));
    }

    public static <T> p4h<T> g(Callable<? extends T> callable) {
        return A(new z9h(callable));
    }

    public static <T> p4h<T> h(T t) {
        return hal.C(t);
    }

    public static <T> p4h<T> k(p4h<? extends p4h<? extends T>> p4hVar) {
        return p4hVar.getClass() == hal.class ? ((hal) p4hVar).F(dmq.b()) : (p4h<T>) p4hVar.i(kbh.b(false));
    }

    public static <T> koo x(xno<? super T> xnoVar, p4h<T> p4hVar) {
        if (xnoVar == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        }
        if (p4hVar.f29990a == null) {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
        xnoVar.onStart();
        if (!(xnoVar instanceof g9l)) {
            xnoVar = new g9l(xnoVar);
        }
        try {
            p5l.k(p4hVar, p4hVar.f29990a).call(xnoVar);
            return p5l.j(xnoVar);
        } catch (Throwable th) {
            pf8.d(th);
            if (xnoVar.isUnsubscribed()) {
                p5l.f(p5l.h(th));
            } else {
                try {
                    xnoVar.onError(p5l.h(th));
                } catch (Throwable th2) {
                    pf8.d(th2);
                    OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                    p5l.h(onErrorFailedException);
                    throw onErrorFailedException;
                }
            }
            return noo.b();
        }
    }

    public final koo B(xno<? super T> xnoVar) {
        try {
            xnoVar.onStart();
            p5l.k(this, this.f29990a).call(xnoVar);
            return p5l.j(xnoVar);
        } catch (Throwable th) {
            pf8.d(th);
            try {
                xnoVar.onError(p5l.h(th));
                return noo.b();
            } catch (Throwable th2) {
                pf8.d(th2);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                p5l.h(onErrorFailedException);
                throw onErrorFailedException;
            }
        }
    }

    public final p4h<T> b(tc0<? super T> tc0Var) {
        return A(new x9h(this, new ne0(tc0Var, re0.a(), re0.a())));
    }

    public final p4h<T> d(zta<? super T, Boolean> ztaVar) {
        return A(new y9h(this, ztaVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> p4h<R> e(zta<? super T, ? extends p4h<? extends R>> ztaVar) {
        return getClass() == hal.class ? ((hal) this).F(ztaVar) : k(j(ztaVar));
    }

    public final <R> p4h<R> i(b<? extends R, ? super T> bVar) {
        return A(new bah(this.f29990a, bVar));
    }

    public final <R> p4h<R> j(zta<? super T, ? extends R> ztaVar) {
        return A(new cah(this, ztaVar));
    }

    public final p4h<T> l(ifl iflVar) {
        return m(iflVar, x5l.d);
    }

    public final p4h<T> m(ifl iflVar, int i) {
        return n(iflVar, false, i);
    }

    public final p4h<T> n(ifl iflVar, boolean z, int i) {
        return this instanceof hal ? ((hal) this).G(iflVar) : (p4h<T>) i(new pbh(iflVar, z, i));
    }

    public final qe4<T> o() {
        return qbh.D(this);
    }

    public final qe4<T> p(int i) {
        return qbh.E(this, i);
    }

    public final qe4<T> q(int i, long j, TimeUnit timeUnit, ifl iflVar) {
        if (i >= 0) {
            return qbh.G(this, j, timeUnit, iflVar, i);
        }
        throw new IllegalArgumentException("bufferSize < 0");
    }

    public final qe4<T> r(long j, TimeUnit timeUnit, ifl iflVar) {
        return qbh.F(this, j, timeUnit, iflVar);
    }

    public final koo s() {
        return w(new qe0(re0.a(), InternalObservableUtils.ERROR_NOT_IMPLEMENTED, re0.a()));
    }

    public final koo t(tc0<? super T> tc0Var) {
        if (tc0Var != null) {
            return w(new qe0(tc0Var, InternalObservableUtils.ERROR_NOT_IMPLEMENTED, re0.a()));
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public final koo u(tc0<? super T> tc0Var, tc0<Throwable> tc0Var2) {
        if (tc0Var == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (tc0Var2 != null) {
            return w(new qe0(tc0Var, tc0Var2, re0.a()));
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public final koo v(a6h<? super T> a6hVar) {
        if (a6hVar instanceof xno) {
            return w((xno) a6hVar);
        }
        if (a6hVar != null) {
            return w(new c6h(a6hVar));
        }
        throw new NullPointerException("observer is null");
    }

    public final koo w(xno<? super T> xnoVar) {
        return x(xnoVar, this);
    }

    public final p4h<T> y(ifl iflVar) {
        return z(iflVar, true);
    }

    public final p4h<T> z(ifl iflVar, boolean z) {
        return this instanceof hal ? ((hal) this).G(iflVar) : A(new rbh(this, iflVar, z));
    }
}
