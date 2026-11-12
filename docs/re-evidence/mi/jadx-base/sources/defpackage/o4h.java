package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o4h<T> implements o5h<T> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28730a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f28730a = iArr;
            try {
                iArr[BackpressureStrategy.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28730a[BackpressureStrategy.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28730a[BackpressureStrategy.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28730a[BackpressureStrategy.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static o4h<Long> A(long j, TimeUnit timeUnit) {
        return z(j, j, timeUnit, ofl.a());
    }

    public static o4h<Long> B(long j, TimeUnit timeUnit, hfl hflVar) {
        return z(j, j, timeUnit, hflVar);
    }

    public static o4h<Long> C(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return D(j, j2, j3, j4, timeUnit, ofl.a());
    }

    public static o4h<Long> D(long j, long j2, long j3, long j4, TimeUnit timeUnit, hfl hflVar) {
        if (j2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j2);
        }
        if (j2 == 0) {
            return o().h(j3, timeUnit, hflVar);
        }
        long j5 = j + (j2 - 1);
        if (j > 0 && j5 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        x3h.d(timeUnit, "unit is null");
        x3h.d(hflVar, "scheduler is null");
        return t5l.m(new g5h(j, j5, Math.max(0L, j3), Math.max(0L, j4), timeUnit, hflVar));
    }

    public static <T> o4h<T> E(T t) {
        x3h.d(t, "item is null");
        return t5l.m(new io.reactivex.internal.operators.observable.a(t));
    }

    public static <T> o4h<T> G(Iterable<? extends o5h<? extends T>> iterable) {
        return w(iterable).r(hua.b());
    }

    public static int b() {
        return zy9.a();
    }

    public static o4h<Long> b0(long j, TimeUnit timeUnit) {
        return c0(j, timeUnit, ofl.a());
    }

    public static o4h<Long> c0(long j, TimeUnit timeUnit, hfl hflVar) {
        x3h.d(timeUnit, "unit is null");
        x3h.d(hflVar, "scheduler is null");
        return t5l.m(new v5h(Math.max(j, 0L), timeUnit, hflVar));
    }

    public static <T> o4h<T> d(Iterable<? extends o5h<? extends T>> iterable) {
        x3h.d(iterable, "sources is null");
        return w(iterable).e(hua.b(), b(), false);
    }

    public static <T> o4h<T> f(j5h<T> j5hVar) {
        x3h.d(j5hVar, "source is null");
        return t5l.m(new r4h(j5hVar));
    }

    public static <T> o4h<T> f0(o5h<T> o5hVar) {
        x3h.d(o5hVar, "source is null");
        return o5hVar instanceof o4h ? t5l.m((o4h) o5hVar) : t5l.m(new b5h(o5hVar));
    }

    public static <T1, T2, R> o4h<R> g0(o5h<? extends T1> o5hVar, o5h<? extends T2> o5hVar2, oi2<? super T1, ? super T2, ? extends R> oi2Var) {
        x3h.d(o5hVar, "source1 is null");
        x3h.d(o5hVar2, "source2 is null");
        return i0(hua.d(oi2Var), false, b(), o5hVar, o5hVar2);
    }

    public static <T1, T2, T3, R> o4h<R> h0(o5h<? extends T1> o5hVar, o5h<? extends T2> o5hVar2, o5h<? extends T3> o5hVar3, cua<? super T1, ? super T2, ? super T3, ? extends R> cuaVar) {
        x3h.d(o5hVar, "source1 is null");
        x3h.d(o5hVar2, "source2 is null");
        x3h.d(o5hVar3, "source3 is null");
        return i0(hua.e(cuaVar), false, b(), o5hVar, o5hVar2, o5hVar3);
    }

    public static <T, R> o4h<R> i0(bua<? super Object[], ? extends R> buaVar, boolean z, int i, o5h<? extends T>... o5hVarArr) {
        if (o5hVarArr.length == 0) {
            return o();
        }
        x3h.d(buaVar, "zipper is null");
        x3h.e(i, "bufferSize");
        return t5l.m(new y5h(o5hVarArr, null, buaVar, i, z));
    }

    public static <T> o4h<T> o() {
        return t5l.m(w4h.f37610a);
    }

    public static <T> o4h<T> p(Throwable th) {
        x3h.d(th, "exception is null");
        return q(hua.c(th));
    }

    public static <T> o4h<T> q(Callable<? extends Throwable> callable) {
        x3h.d(callable, "errorSupplier is null");
        return t5l.m(new x4h(callable));
    }

    public static <T> o4h<T> v(Callable<? extends T> callable) {
        x3h.d(callable, "supplier is null");
        return t5l.m(new z4h(callable));
    }

    public static <T> o4h<T> w(Iterable<? extends T> iterable) {
        x3h.d(iterable, "source is null");
        return t5l.m(new a5h(iterable));
    }

    public static o4h<Long> y(long j, long j2, TimeUnit timeUnit) {
        return z(j, j2, timeUnit, ofl.a());
    }

    public static o4h<Long> z(long j, long j2, TimeUnit timeUnit, hfl hflVar) {
        x3h.d(timeUnit, "unit is null");
        x3h.d(hflVar, "scheduler is null");
        return t5l.m(new f5h(Math.max(0L, j), Math.max(0L, j2), timeUnit, hflVar));
    }

    public final <R> o4h<R> F(bua<? super T, ? extends R> buaVar) {
        x3h.d(buaVar, "mapper is null");
        return t5l.m(new h5h(this, buaVar));
    }

    public final o4h<T> H(hfl hflVar) {
        return I(hflVar, false, b());
    }

    public final o4h<T> I(hfl hflVar, boolean z, int i) {
        x3h.d(hflVar, "scheduler is null");
        x3h.e(i, "bufferSize");
        return t5l.m(new i5h(this, hflVar, z, i));
    }

    public final o4h<T> J(bua<? super o4h<Throwable>, ? extends o5h<?>> buaVar) {
        x3h.d(buaVar, "handler is null");
        return t5l.m(new l5h(this, buaVar));
    }

    public final r9f<T> K() {
        return t5l.l(new m5h(this));
    }

    public final ydm<T> L() {
        return t5l.n(new n5h(this, null));
    }

    public final jz6 M() {
        return Q(hua.a(), hua.f, hua.c, hua.a());
    }

    public final jz6 N(bg4<? super T> bg4Var) {
        return Q(bg4Var, hua.f, hua.c, hua.a());
    }

    public final jz6 O(bg4<? super T> bg4Var, bg4<? super Throwable> bg4Var2) {
        return Q(bg4Var, bg4Var2, hua.c, hua.a());
    }

    public final jz6 P(bg4<? super T> bg4Var, bg4<? super Throwable> bg4Var2, vc0 vc0Var) {
        return Q(bg4Var, bg4Var2, vc0Var, hua.a());
    }

    public final jz6 Q(bg4<? super T> bg4Var, bg4<? super Throwable> bg4Var2, vc0 vc0Var, bg4<? super jz6> bg4Var3) {
        x3h.d(bg4Var, "onNext is null");
        x3h.d(bg4Var2, "onError is null");
        x3h.d(vc0Var, "onComplete is null");
        x3h.d(bg4Var3, "onSubscribe is null");
        LambdaObserver lambdaObserver = new LambdaObserver(bg4Var, bg4Var2, vc0Var, bg4Var3);
        a(lambdaObserver);
        return lambdaObserver;
    }

    public abstract void R(z5h<? super T> z5hVar);

    public final o4h<T> S(hfl hflVar) {
        x3h.d(hflVar, "scheduler is null");
        return t5l.m(new p5h(this, hflVar));
    }

    public final <E extends z5h<? super T>> E T(E e) {
        a(e);
        return e;
    }

    public final o4h<T> U(long j) {
        if (j >= 0) {
            return t5l.m(new q5h(this, j));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j);
    }

    public final o4h<T> V(i6i<? super T> i6iVar) {
        x3h.d(i6iVar, "stopPredicate is null");
        return t5l.m(new r5h(this, i6iVar));
    }

    public final o4h<T> W(i6i<? super T> i6iVar) {
        x3h.d(i6iVar, "predicate is null");
        return t5l.m(new s5h(this, i6iVar));
    }

    public final o4h<T> X(long j, TimeUnit timeUnit) {
        return Y(j, timeUnit, ofl.a());
    }

    public final o4h<T> Y(long j, TimeUnit timeUnit, hfl hflVar) {
        x3h.d(timeUnit, "unit is null");
        x3h.d(hflVar, "scheduler is null");
        return t5l.m(new t5h(this, j, timeUnit, hflVar));
    }

    public final o4h<T> Z(long j, TimeUnit timeUnit) {
        return a0(j, timeUnit, null, ofl.a());
    }

    @Override // defpackage.o5h
    public final void a(z5h<? super T> z5hVar) {
        x3h.d(z5hVar, "observer is null");
        try {
            z5h<? super T> z5hVarT = t5l.t(this, z5hVar);
            x3h.d(z5hVarT, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            R(z5hVarT);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            qf8.b(th);
            t5l.p(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final o4h<T> a0(long j, TimeUnit timeUnit, o5h<? extends T> o5hVar, hfl hflVar) {
        x3h.d(timeUnit, "timeUnit is null");
        x3h.d(hflVar, "scheduler is null");
        return t5l.m(new u5h(this, j, timeUnit, hflVar, o5hVar));
    }

    public final <R> o4h<R> c(w5h<? super T, ? extends R> w5hVar) {
        return f0(((w5h) x3h.d(w5hVar, "composer is null")).a(this));
    }

    public final zy9<T> d0(BackpressureStrategy backpressureStrategy) {
        az9 az9Var = new az9(this);
        int i = a.f28730a[backpressureStrategy.ordinal()];
        if (i == 1) {
            return az9Var.d();
        }
        if (i == 2) {
            return az9Var.e();
        }
        if (i != 3) {
            return i != 4 ? az9Var.b() : t5l.k(new ez9(az9Var));
        }
        return az9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> o4h<R> e(bua<? super T, ? extends o5h<? extends R>> buaVar, int i, boolean z) {
        x3h.d(buaVar, "mapper is null");
        x3h.e(i, "prefetch");
        if (!(this instanceof w9l)) {
            return t5l.m(new q4h(this, buaVar, i, z ? ErrorMode.END : ErrorMode.BOUNDARY));
        }
        Object objCall = ((w9l) this).call();
        return objCall == null ? o() : ObservableScalarXMap.a(objCall, buaVar);
    }

    public final o4h<T> e0(hfl hflVar) {
        x3h.d(hflVar, "scheduler is null");
        return t5l.m(new x5h(this, hflVar));
    }

    public final o4h<T> g(long j, TimeUnit timeUnit) {
        return i(j, timeUnit, ofl.a(), false);
    }

    public final o4h<T> h(long j, TimeUnit timeUnit, hfl hflVar) {
        return i(j, timeUnit, hflVar, false);
    }

    public final o4h<T> i(long j, TimeUnit timeUnit, hfl hflVar, boolean z) {
        x3h.d(timeUnit, "unit is null");
        x3h.d(hflVar, "scheduler is null");
        return t5l.m(new s4h(this, j, timeUnit, hflVar, z));
    }

    public final o4h<T> j(bg4<? super T> bg4Var, bg4<? super Throwable> bg4Var2, vc0 vc0Var, vc0 vc0Var2) {
        x3h.d(bg4Var, "onNext is null");
        x3h.d(bg4Var2, "onError is null");
        x3h.d(vc0Var, "onComplete is null");
        x3h.d(vc0Var2, "onAfterTerminate is null");
        return t5l.m(new t4h(this, bg4Var, bg4Var2, vc0Var, vc0Var2));
    }

    public final o4h<T> k(bg4<? super Throwable> bg4Var) {
        bg4<? super T> bg4VarA = hua.a();
        vc0 vc0Var = hua.c;
        return j(bg4VarA, bg4Var, vc0Var, vc0Var);
    }

    public final o4h<T> l(bg4<? super jz6> bg4Var, vc0 vc0Var) {
        x3h.d(bg4Var, "onSubscribe is null");
        x3h.d(vc0Var, "onDispose is null");
        return t5l.m(new u4h(this, bg4Var, vc0Var));
    }

    public final o4h<T> m(bg4<? super T> bg4Var) {
        bg4<? super Throwable> bg4VarA = hua.a();
        vc0 vc0Var = hua.c;
        return j(bg4Var, bg4VarA, vc0Var, vc0Var);
    }

    public final o4h<T> n(bg4<? super jz6> bg4Var) {
        return l(bg4Var, hua.c);
    }

    public final <R> o4h<R> r(bua<? super T, ? extends o5h<? extends R>> buaVar) {
        return s(buaVar, false);
    }

    public final <R> o4h<R> s(bua<? super T, ? extends o5h<? extends R>> buaVar, boolean z) {
        return t(buaVar, z, Integer.MAX_VALUE);
    }

    public final <R> o4h<R> t(bua<? super T, ? extends o5h<? extends R>> buaVar, boolean z, int i) {
        return u(buaVar, z, i, b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> o4h<R> u(bua<? super T, ? extends o5h<? extends R>> buaVar, boolean z, int i, int i2) {
        x3h.d(buaVar, "mapper is null");
        x3h.e(i, "maxConcurrency");
        x3h.e(i2, "bufferSize");
        if (!(this instanceof w9l)) {
            return t5l.m(new y4h(this, buaVar, z, i, i2));
        }
        Object objCall = ((w9l) this).call();
        return objCall == null ? o() : ObservableScalarXMap.a(objCall, buaVar);
    }

    public final ba4 x() {
        return t5l.j(new e5h(this));
    }
}
