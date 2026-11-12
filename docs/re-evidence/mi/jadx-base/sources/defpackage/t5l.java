package defpackage;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class t5l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile bg4<? super Throwable> f34344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile bua<? super Runnable, ? extends Runnable> f34345b;
    public static volatile bua<? super Callable<hfl>, ? extends hfl> c;
    public static volatile bua<? super Callable<hfl>, ? extends hfl> d;
    public static volatile bua<? super Callable<hfl>, ? extends hfl> e;
    public static volatile bua<? super Callable<hfl>, ? extends hfl> f;
    public static volatile bua<? super hfl, ? extends hfl> g;
    public static volatile bua<? super hfl, ? extends hfl> h;
    public static volatile bua<? super hfl, ? extends hfl> i;
    public static volatile bua<? super zy9, ? extends zy9> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile bua<? super o4h, ? extends o4h> f34346k;
    public static volatile bua<? super r9f, ? extends r9f> l;
    public static volatile bua<? super ydm, ? extends ydm> m;
    public static volatile bua<? super ba4, ? extends ba4> n;
    public static volatile oi2<? super o4h, ? super z5h, ? extends z5h> o;
    public static volatile boolean p;

    public static <T, U, R> R a(oi2<T, U, R> oi2Var, T t, U u) {
        try {
            return oi2Var.apply(t, u);
        } catch (Throwable th) {
            throw jf8.d(th);
        }
    }

    public static <T, R> R b(bua<T, R> buaVar, T t) {
        try {
            return buaVar.apply(t);
        } catch (Throwable th) {
            throw jf8.d(th);
        }
    }

    public static hfl c(bua<? super Callable<hfl>, ? extends hfl> buaVar, Callable<hfl> callable) {
        return (hfl) x3h.d(b(buaVar, callable), "Scheduler Callable result can't be null");
    }

    public static hfl d(Callable<hfl> callable) {
        try {
            return (hfl) x3h.d(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw jf8.d(th);
        }
    }

    public static hfl e(Callable<hfl> callable) {
        x3h.d(callable, "Scheduler Callable can't be null");
        bua<? super Callable<hfl>, ? extends hfl> buaVar = c;
        return buaVar == null ? d(callable) : c(buaVar, callable);
    }

    public static hfl f(Callable<hfl> callable) {
        x3h.d(callable, "Scheduler Callable can't be null");
        bua<? super Callable<hfl>, ? extends hfl> buaVar = e;
        return buaVar == null ? d(callable) : c(buaVar, callable);
    }

    public static hfl g(Callable<hfl> callable) {
        x3h.d(callable, "Scheduler Callable can't be null");
        bua<? super Callable<hfl>, ? extends hfl> buaVar = f;
        return buaVar == null ? d(callable) : c(buaVar, callable);
    }

    public static hfl h(Callable<hfl> callable) {
        x3h.d(callable, "Scheduler Callable can't be null");
        bua<? super Callable<hfl>, ? extends hfl> buaVar = d;
        return buaVar == null ? d(callable) : c(buaVar, callable);
    }

    public static boolean i(Throwable th) {
        return (th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException);
    }

    public static ba4 j(ba4 ba4Var) {
        bua<? super ba4, ? extends ba4> buaVar = n;
        return buaVar != null ? (ba4) b(buaVar, ba4Var) : ba4Var;
    }

    public static <T> zy9<T> k(zy9<T> zy9Var) {
        bua<? super zy9, ? extends zy9> buaVar = j;
        return buaVar != null ? (zy9) b(buaVar, zy9Var) : zy9Var;
    }

    public static <T> r9f<T> l(r9f<T> r9fVar) {
        bua<? super r9f, ? extends r9f> buaVar = l;
        return buaVar != null ? (r9f) b(buaVar, r9fVar) : r9fVar;
    }

    public static <T> o4h<T> m(o4h<T> o4hVar) {
        bua<? super o4h, ? extends o4h> buaVar = f34346k;
        return buaVar != null ? (o4h) b(buaVar, o4hVar) : o4hVar;
    }

    public static <T> ydm<T> n(ydm<T> ydmVar) {
        bua<? super ydm, ? extends ydm> buaVar = m;
        return buaVar != null ? (ydm) b(buaVar, ydmVar) : ydmVar;
    }

    public static hfl o(hfl hflVar) {
        bua<? super hfl, ? extends hfl> buaVar = g;
        return buaVar == null ? hflVar : (hfl) b(buaVar, hflVar);
    }

    public static void p(Throwable th) {
        bg4<? super Throwable> bg4Var = f34344a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!i(th)) {
            th = new UndeliverableException(th);
        }
        if (bg4Var != null) {
            try {
                bg4Var.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                v(th2);
            }
        }
        th.printStackTrace();
        v(th);
    }

    public static hfl q(hfl hflVar) {
        bua<? super hfl, ? extends hfl> buaVar = i;
        return buaVar == null ? hflVar : (hfl) b(buaVar, hflVar);
    }

    public static Runnable r(Runnable runnable) {
        x3h.d(runnable, "run is null");
        bua<? super Runnable, ? extends Runnable> buaVar = f34345b;
        return buaVar == null ? runnable : (Runnable) b(buaVar, runnable);
    }

    public static hfl s(hfl hflVar) {
        bua<? super hfl, ? extends hfl> buaVar = h;
        return buaVar == null ? hflVar : (hfl) b(buaVar, hflVar);
    }

    public static <T> z5h<? super T> t(o4h<T> o4hVar, z5h<? super T> z5hVar) {
        oi2<? super o4h, ? super z5h, ? extends z5h> oi2Var = o;
        return oi2Var != null ? (z5h) a(oi2Var, o4hVar, z5hVar) : z5hVar;
    }

    public static void u(bg4<? super Throwable> bg4Var) {
        if (p) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f34344a = bg4Var;
    }

    public static void v(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
