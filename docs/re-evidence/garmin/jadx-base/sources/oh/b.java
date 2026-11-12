package oh;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    public static class a implements oh.a.InterfaceC2506a<Object, Boolean> {
        @Override // oh.a.InterfaceC2506a
        public final Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* JADX INFO: renamed from: oh.b$b, reason: collision with other inner class name */
    public static class CallableC2507b implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f132149a;

        public CallableC2507b(Context context) {
            this.f132149a = context;
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            Context context = this.f132149a;
            synchronized (ig.b.class) {
                if (context == null) {
                    throw new RuntimeException("Context is null");
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    throw new IllegalStateException("Cannot be called from the main thread");
                }
                if (ig.b.f93235a == null && !ig.b.f93236b) {
                    synchronized (ig.b.class) {
                        try {
                            if (ig.b.f93235a == null && !ig.b.f93236b) {
                                ig.b.f93235a = kg.a.a();
                                ig.b.f93236b = true;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                ig.a aVar = ig.b.f93235a;
                if (aVar != null) {
                    try {
                        return aVar.a(context);
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
        }
    }

    public static class c implements oh.a.InterfaceC2506a<Object, Boolean> {
        @Override // oh.a.InterfaceC2506a
        public final Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public static class d implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f132150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lh.a f132151b;

        public d(Context context, lh.a aVar) {
            this.f132150a = context;
            this.f132151b = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            dh.a aVarL;
            try {
                Context context = this.f132150a;
                synchronized (dh.b.class) {
                    try {
                        aVarL = dh.b.f59530a;
                        if (aVarL == null) {
                            if (context != null) {
                                aVarL = dh.b.l(context);
                                dh.b.f59530a = aVarL;
                            } else {
                                aVarL = null;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (aVarL != null && !zg.c.b(aVarL.f59528c)) {
                    return aVarL.f59528c;
                }
                return "ffffffffffffffffffffffff";
            } catch (Throwable th4) {
                wg.a.g(this.f132151b, "third", "GetUtdidEx", th4.getClass().getName());
                return "";
            }
        }
    }

    public static String a(Context context, lh.a aVar) {
        if (!ah.a.g().f3267w) {
            return "";
        }
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = oh.a.f132147a;
        return (String) oh.a.b(1, 1L, TimeUnit.DAYS, new a(), new CallableC2507b(context == null ? null : context.getApplicationContext()), true, 200L, TimeUnit.MILLISECONDS, aVar, true);
    }

    public static String b(Context context, lh.a aVar) {
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = oh.a.f132147a;
        return (String) oh.a.b(3, 1L, TimeUnit.DAYS, new c(), new d(context == null ? null : context.getApplicationContext(), aVar), true, 3L, TimeUnit.SECONDS, aVar, false);
    }
}
