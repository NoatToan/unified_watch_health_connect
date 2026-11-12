package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class j5l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile bua<Callable<hfl>, hfl> f22444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile bua<hfl, hfl> f22445b;

    public static <T, R> R a(bua<T, R> buaVar, T t) {
        try {
            return buaVar.apply(t);
        } catch (Throwable th) {
            throw qf8.a(th);
        }
    }

    public static hfl b(bua<Callable<hfl>, hfl> buaVar, Callable<hfl> callable) {
        hfl hflVar = (hfl) a(buaVar, callable);
        if (hflVar != null) {
            return hflVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    public static hfl c(Callable<hfl> callable) {
        try {
            hfl hflVarCall = callable.call();
            if (hflVarCall != null) {
                return hflVarCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw qf8.a(th);
        }
    }

    public static hfl d(Callable<hfl> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        bua<Callable<hfl>, hfl> buaVar = f22444a;
        return buaVar == null ? c(callable) : b(buaVar, callable);
    }

    public static hfl e(hfl hflVar) {
        if (hflVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        bua<hfl, hfl> buaVar = f22445b;
        return buaVar == null ? hflVar : (hfl) a(buaVar, hflVar);
    }
}
